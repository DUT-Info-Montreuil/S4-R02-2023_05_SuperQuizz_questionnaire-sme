package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.tests.impl.chargement.mock;

import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.modeles.IServiceQuestionnaire;

import java.util.ArrayList;
import java.util.List;

public class ServiceQuestionnaireMockVide implements IServiceQuestionnaire {
    @Override
    public List<QuestionnaireDTO> chargerListeQuestionnaire(String nomFichier) {
        QuestionDTO questionVide = new QuestionDTO(null,null);
        List<QuestionDTO> listQuestionsVide = new ArrayList<QuestionDTO>();
        listQuestionsVide.add(questionVide);
        QuestionnaireDTO leQuestionnaireVide = new QuestionnaireDTO(listQuestionsVide);
        List<QuestionnaireDTO> reponseVide = new ArrayList<QuestionnaireDTO>();
        reponseVide.add(leQuestionnaireVide);
        return reponseVide;
    }

    @Override
    public QuestionnaireDTO fournirUnQuestionnaire(int indiceQuestionnaire) {
        return null;
    }
}
