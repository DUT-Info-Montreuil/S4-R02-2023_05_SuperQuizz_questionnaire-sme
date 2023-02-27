package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.impl;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.bo.QuestionnaireBO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.modeles.IServiceQuestionnaire;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.FichierIncorrectExceptions;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.FichierPasTrouveExceptions;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.FichierVideExceptions;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ServiceQuestionnaireImpl implements IServiceQuestionnaire {

    private QuestionnaireBO questionnaireBO;

    public static void main(String[] args) {
        ServiceQuestionnaireImpl s = new ServiceQuestionnaireImpl();
        try {
            s.chargerListeQuestionnaire("src/fr/iut/montreuil/S4_R02_2023_05_SuperQuizz/questionnaire_sme/ressources/questionsQuizz_V1.1.csv");
        } catch (FichierIncorrectExceptions e) {
            e.printStackTrace();
        } catch (FichierVideExceptions e) {
            e.printStackTrace();
        } catch (FichierPasTrouveExceptions e) {
            e.printStackTrace();
        }
    }

    private List<Integer> idQuestionnaires;
    private List<Integer> numQuestions;
    private List<String> langues;
    private List<String> libelles;
    private List<String> reponses;
    private List<Integer> difficultes;
    private List<String> details;
    private List<String> sources;
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
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public QuestionnaireDTO fournirUnQuestionnaire(int indiceQuestionnaire) {
        return null;
    }
}