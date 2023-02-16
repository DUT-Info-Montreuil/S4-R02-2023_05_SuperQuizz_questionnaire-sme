package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.impl;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
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


    @Override
    public List<QuestionnaireDTO> chargerListeQuestionnaire(String nomFichier) throws FichierIncorrectExceptions, FichierVideExceptions, FichierPasTrouveExceptions {
        try {
            CSVReader reader = new CSVReader(new FileReader(nomFichier));
            String[] nextline;
            while ((nextline = reader.readNext()) != null) {
                String[] tab = nextline[0].split(";");
                System.out.println(Arrays.toString(tab));
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