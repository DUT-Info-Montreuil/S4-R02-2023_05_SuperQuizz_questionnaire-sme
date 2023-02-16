package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.tests.impl.chargement.service;

import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.modeles.IServiceQuestionnaire;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.tests.impl.chargement.mock.ServiceQuestionnaireMockCorrect;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.FichierIncorrectExceptions;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.FichierPasTrouveExceptions;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.FichierVideExceptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ServiceQuestionnaireChargementTest {

    private IServiceQuestionnaire serviceQuestionnaireTest;
    @Test
    public void chargementQuestionnaireCorrect() throws FichierPasTrouveExceptions, FichierVideExceptions, FichierIncorrectExceptions {
        serviceQuestionnaireTest = new ServiceQuestionnaireMockCorrect();
        QuestionDTO questionCorrect = new QuestionDTO("De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee");
        List<QuestionDTO> listQuestionsCorrect = new ArrayList<QuestionDTO>();
        listQuestionsCorrect.add(questionCorrect);
        QuestionnaireDTO leQuestionnaireCorrect = new QuestionnaireDTO(listQuestionsCorrect);
        List<QuestionnaireDTO> reponseCorrect = new ArrayList<QuestionnaireDTO>();
        reponseCorrect.add(leQuestionnaireCorrect);
        Assertions.assertEquals(reponseCorrect,serviceQuestionnaireTest.chargerListeQuestionnaire("chargementCorrect.csv"));
    }


}
