package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.tests.impl.chargement.mock;

import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.modeles.IServiceQuestionnaire;

import java.util.List;

public class ServiceQuestionnaireMockIncorrect implements IServiceQuestionnaire {


    @Override
    public List<QuestionnaireDTO> chargerListeQuestionnaire(String nomFichier) {
        return null;
    }

    @Override
    public QuestionnaireDTO fournirUnQuestionnaire(int indiceQuestionnaire) {
        return null;
    }
}
