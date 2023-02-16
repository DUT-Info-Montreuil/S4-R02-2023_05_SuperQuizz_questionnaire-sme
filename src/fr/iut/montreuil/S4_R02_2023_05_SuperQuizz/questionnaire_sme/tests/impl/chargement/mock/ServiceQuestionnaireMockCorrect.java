package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.tests.impl.chargement.mock;

import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.modeles.IServiceQuestionnaire;

import java.util.ArrayList;
import java.util.List;

public class ServiceQuestionnaireMockCorrect implements IServiceQuestionnaire {

    @Override
    public List<QuestionnaireDTO> chargerListeQuestionnaire(String nomFichier) {
        QuestionDTO questionCorrect = new QuestionDTO("De quel petit objet se munit le golfeur pour surelever sa balle avant de la frapper ","Tee");
        List<QuestionDTO> listQuestionsCorrect = new ArrayList<QuestionDTO>();
        listQuestionsCorrect.add(questionCorrect);
        QuestionnaireDTO leQuestionnaireCorrect = new QuestionnaireDTO(listQuestionsCorrect);
        List<QuestionnaireDTO> reponseCorrect = new ArrayList<QuestionnaireDTO>();
        reponseCorrect.add(leQuestionnaireCorrect);
        return reponseCorrect;
    }

    @Override
    public QuestionnaireDTO fournirUnQuestionnaire(int indiceQuestionnaire) {
        return null;
    }
}
