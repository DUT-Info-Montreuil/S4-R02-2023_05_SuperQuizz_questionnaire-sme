package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.tests.impl.chargement.service;

import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.modeles.IServiceQuestionnaire;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.tests.impl.chargement.mock.ServiceQuestionnaireMockCorrect;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.tests.impl.chargement.mock.ServiceQuestionnaireMockIncorrect;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.tests.impl.chargement.mock.ServiceQuestionnaireMockVide;
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
        QuestionDTO questionCorrect = new QuestionDTO("De quel petit objet se munit le golfeur pour surelever sa balle avant de la frapper ","Tee");
        List<QuestionDTO> listQuestionsCorrect = new ArrayList<QuestionDTO>();
        listQuestionsCorrect.add(questionCorrect);
        QuestionnaireDTO leQuestionnaireCorrect = new QuestionnaireDTO(listQuestionsCorrect);
        List<QuestionnaireDTO> reponseCorrect = new ArrayList<QuestionnaireDTO>();
        reponseCorrect.add(leQuestionnaireCorrect);
        List<QuestionnaireDTO> bonnereponse = serviceQuestionnaireTest.chargerListeQuestionnaire("chargementCorrect.csv");
        Assertions.assertEquals(leQuestionnaireCorrect.getListeQuestions().get(0).getReponse(),bonnereponse.get(0).getListeQuestions().get(0).getReponse());
        Assertions.assertEquals(leQuestionnaireCorrect.getListeQuestions().get(0).getLibelle(),bonnereponse.get(0).getListeQuestions().get(0).getLibelle());

    }

    @Test
    public void chargementQuestionnaireIncorrect() throws FichierIncorrectExceptions, FichierPasTrouveExceptions, FichierVideExceptions {
        serviceQuestionnaireTest = new ServiceQuestionnaireMockIncorrect();
        QuestionDTO questionIncorrect = new QuestionDTO("De quel petit objet se munit le golfeur pour surelever sa balle avant de la frapper ",null);
        List<QuestionDTO> listQuestionsIncorrect = new ArrayList<QuestionDTO>();
        listQuestionsIncorrect.add(questionIncorrect);
        QuestionnaireDTO leQuestionnaireIncorrect = new QuestionnaireDTO(listQuestionsIncorrect);
        List<QuestionnaireDTO> reponseIncorrect = new ArrayList<QuestionnaireDTO>();
        reponseIncorrect.add(leQuestionnaireIncorrect);
        List<QuestionnaireDTO> mauvaisereponse = serviceQuestionnaireTest.chargerListeQuestionnaire("chargementIncorrect.csv");
        Assertions.assertEquals(leQuestionnaireIncorrect.getListeQuestions().get(0).getReponse(),mauvaisereponse.get(0).getListeQuestions().get(0).getReponse());
        Assertions.assertEquals(leQuestionnaireIncorrect.getListeQuestions().get(0).getLibelle(),mauvaisereponse.get(0).getListeQuestions().get(0).getLibelle());

    }

    @Test
    public void chargementQuestionnaireVide() throws FichierIncorrectExceptions, FichierPasTrouveExceptions, FichierVideExceptions {
        serviceQuestionnaireTest = new ServiceQuestionnaireMockVide();
        QuestionDTO questionVide = new QuestionDTO("De quel petit objet se munit le golfeur pour surelever sa balle avant de la frapper ",null);
        List<QuestionDTO> listQuestionsVide = new ArrayList<QuestionDTO>();
        listQuestionsVide.add(questionVide);
        QuestionnaireDTO leQuestionnaireVide = new QuestionnaireDTO(listQuestionsVide);
        List<QuestionnaireDTO> reponseVide = new ArrayList<QuestionnaireDTO>();
        reponseVide.add(leQuestionnaireVide);
        List<QuestionnaireDTO> reponsevide = serviceQuestionnaireTest.chargerListeQuestionnaire("chargementVide.csv");
        Assertions.assertEquals(leQuestionnaireVide.getListeQuestions().get(0).getReponse(),reponsevide.get(0).getListeQuestions().get(0).getReponse());
        Assertions.assertEquals(leQuestionnaireVide.getListeQuestions().get(0).getLibelle(),reponsevide.get(0).getListeQuestions().get(0).getLibelle());

    }


}
