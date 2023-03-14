package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.impl;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.bo.QuestionnaireBO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.modeles.IServiceQuestionnaire;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.FichierIncorrectExceptions;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.FichierPasTrouveExceptions;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.FichierVideExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceQuestionnaireImpl implements IServiceQuestionnaire {

    private QuestionnaireBO questionnaireBO;

    public static void main(String[] args) {
        ServiceQuestionnaireImpl s = new ServiceQuestionnaireImpl();
        try {
            s.chargerListeQuestionnaire("src/fr/iut/montreuil/S4_R02_2023_05_SuperQuizz/questionnaire_sme/ressources/questionsQuizz_V1.1.csv");
        } catch (FichierIncorrectExceptions e) {
            System.out.println("FichierIncorrectExceptions");
        } catch (FichierVideExceptions e) {
            System.out.println("FichierVideExceptions");
        } catch (FichierPasTrouveExceptions e) {
            System.out.println("FichierPasTrouveExceptions");
        }
    }

    @Override
    public List<QuestionnaireDTO> chargerListeQuestionnaire(String nomFichier) throws FichierIncorrectExceptions, FichierVideExceptions, FichierPasTrouveExceptions {
        try {
            questionnaireBO = new QuestionnaireBO();
            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
            CSVReader reader = new CSVReaderBuilder(new FileReader(nomFichier)).withCSVParser(parser).build();
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                questionnaireBO.getIdQuestionnaires().add(Integer.valueOf(nextLine[0].replace('\uFEFF',' ').trim()));
                questionnaireBO.getNumQuestions().add(Integer.valueOf(nextLine[1]));
                questionnaireBO.getLangues().add(nextLine[2]);
                questionnaireBO.getLibelles().add(nextLine[3]);
                questionnaireBO.getReponses().add(nextLine[4]);
                questionnaireBO.getDifficultes().add(Integer.valueOf(nextLine[5]));
                questionnaireBO.getDetails().add(nextLine[6]);
                questionnaireBO.getSources().add(nextLine[7]);
            }
            if (questionnaireBO.getIdQuestionnaires().size() == 0)
                throw new FichierVideExceptions();
        } catch (FileNotFoundException e) {
            throw new FichierPasTrouveExceptions();
        } catch (NumberFormatException e) {
            throw new FichierIncorrectExceptions();
        }  catch (ArrayIndexOutOfBoundsException e) {
            throw new FichierIncorrectExceptions();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<QuestionnaireDTO> listQuestionnaireDTO = new ArrayList<>();
        int i = 0;
        int idQuestionnaire;
        List<QuestionDTO> listQuestionDTO;

        while (i < questionnaireBO.getIdQuestionnaires().size()) {
            listQuestionDTO = new ArrayList<>();
            idQuestionnaire = questionnaireBO.getIdQuestionnaires().get(i);
            while (i < questionnaireBO.getIdQuestionnaires().size() && questionnaireBO.getIdQuestionnaires().get(i) == idQuestionnaire) {
                listQuestionDTO.add(new QuestionDTO(questionnaireBO.getLibelles().get(i), questionnaireBO.getReponses().get(i)));
                i++;
            }
            listQuestionnaireDTO.add(new QuestionnaireDTO(listQuestionDTO));
        }
        return listQuestionnaireDTO;
    }

    @Override
    public QuestionnaireDTO fournirUnQuestionnaire(int indiceQuestionnaire) {
        return null;
    }
}