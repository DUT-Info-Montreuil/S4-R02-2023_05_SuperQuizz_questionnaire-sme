package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.tests.impl.servicestatsquestionnaire.service;

import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.BilanStatsDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.StatsQuestionsDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.impl.ServiceStatsQuestionnaireImpl;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.modeles.IServiceStatsQuestionnaire;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.tests.impl.servicestatsquestionnaire.mock.ServiceStatsQuestionnaireMockCorrect;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.tests.impl.servicestatsquestionnaire.mock.ServiceStatsQuestionnaireMockIdQuestionnaireInccorect;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.tests.impl.servicestatsquestionnaire.mock.ServiceStatsQuestionnaireMockNbDeFoisJoueQuestionnaireIncorrect;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.tests.impl.servicestatsquestionnaire.mock.ServiceStatsQuestionnaireMockStatsQuestionsIncorrect;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.IdQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.NbDeFoisJoueQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.StatsQuestionsIncorrectExeptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ServiceStatsQuestionnaireTest {

    private IServiceStatsQuestionnaire serviceStatsQuestionnaireTest;

    @BeforeEach
    public void init(){
         serviceStatsQuestionnaireTest = new ServiceStatsQuestionnaireImpl();
    }

    @Test
    public void statsQuestionnaireCorrect() throws StatsQuestionsIncorrectExeptions, NbDeFoisJoueQuestionnaireIncorrectExeptions, IdQuestionnaireIncorrectExeptions {
        //serviceStatsQuestionnaireTest = new ServiceStatsQuestionnaireMockCorrect();

        //creation d'un BilanStatsDTO
        List<StatsQuestionsDTO> statsQuestions = new ArrayList<>();
        StatsQuestionsDTO statsQuestionsDTO = new StatsQuestionsDTO(1, 5,2);
        statsQuestions.add(statsQuestionsDTO);
        statsQuestions.add(new StatsQuestionsDTO(2,0,0));
        statsQuestions.add(new StatsQuestionsDTO(3,0,0));
        BilanStatsDTO bilanStatsDTO = new BilanStatsDTO(1, 5, statsQuestions);

        //creation d'un QuestionnaireDTO
        List<QuestionDTO> listeQuestions = new ArrayList<>();
        QuestionDTO questionDTO = new QuestionDTO(1,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1);
        questionDTO.getStatsQuestions().setNbDeReussiteQuestion(2);
        questionDTO.getStatsQuestions().setNbDeFoisJoueQuestion(5);
        listeQuestions.add(questionDTO);
        listeQuestions.add(new QuestionDTO(2,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
        listeQuestions.add(new QuestionDTO(3,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO(1, listeQuestions);
        questionnaireDTO.setNbDeFoisJoueQuestionnaire(5);

        Assertions.assertEquals(bilanStatsDTO.toString(), serviceStatsQuestionnaireTest.fournirStatsQuestions(questionnaireDTO).toString());
    }

    @Test
    public void idQuestionnaireIncorrect() throws StatsQuestionsIncorrectExeptions, NbDeFoisJoueQuestionnaireIncorrectExeptions, IdQuestionnaireIncorrectExeptions {
        //serviceStatsQuestionnaireTest = new ServiceStatsQuestionnaireMockIdQuestionnaireInccorect();

        List<QuestionDTO> listeQuestions = new ArrayList<>();
        QuestionDTO questionDTO = new QuestionDTO(1,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1);
        questionDTO.getStatsQuestions().setNbDeReussiteQuestion(2);
        questionDTO.getStatsQuestions().setNbDeFoisJoueQuestion(5);
        listeQuestions.add(questionDTO);
        listeQuestions.add(new QuestionDTO(2,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
        listeQuestions.add(new QuestionDTO(3,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO(-1, listeQuestions);
        questionnaireDTO.setNbDeFoisJoueQuestionnaire(5);

        Assertions.assertThrows(IdQuestionnaireIncorrectExeptions.class, () -> serviceStatsQuestionnaireTest.fournirStatsQuestions(questionnaireDTO));
    }

    @Test
    public void nbDeFoisJoueQuestionnaireIncorrect() throws StatsQuestionsIncorrectExeptions, NbDeFoisJoueQuestionnaireIncorrectExeptions, IdQuestionnaireIncorrectExeptions {
        //serviceStatsQuestionnaireTest = new ServiceStatsQuestionnaireMockNbDeFoisJoueQuestionnaireIncorrect();

        //creation d'un QuestionnaireDTO
        List<QuestionDTO> listeQuestions = new ArrayList<>();
        QuestionDTO questionDTO = new QuestionDTO(1,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1);
        questionDTO.getStatsQuestions().setNbDeReussiteQuestion(2);
        questionDTO.getStatsQuestions().setNbDeFoisJoueQuestion(5);
        listeQuestions.add(questionDTO);
        listeQuestions.add(new QuestionDTO(2,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
        listeQuestions.add(new QuestionDTO(3,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO(1, listeQuestions);
        questionnaireDTO.setNbDeFoisJoueQuestionnaire(-5);

        Assertions.assertThrows(NbDeFoisJoueQuestionnaireIncorrectExeptions.class, () -> serviceStatsQuestionnaireTest.fournirStatsQuestions(questionnaireDTO));
    }

    @Test
    public void statsQuestionsIncorrectIncorrect() throws StatsQuestionsIncorrectExeptions, NbDeFoisJoueQuestionnaireIncorrectExeptions, IdQuestionnaireIncorrectExeptions {
        //serviceStatsQuestionnaireTest = new ServiceStatsQuestionnaireMockStatsQuestionsIncorrect();

        //NbDeFoisJoueQuestion supérieur à NbDeFoisJoueQuestionnaire
        List<QuestionDTO> listeQuestions = new ArrayList<>();
        QuestionDTO questionDTO = new QuestionDTO(1,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1);
        questionDTO.getStatsQuestions().setNbDeReussiteQuestion(2);
        questionDTO.getStatsQuestions().setNbDeFoisJoueQuestion(5);
        listeQuestions.add(questionDTO);
        listeQuestions.add(new QuestionDTO(2,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
        listeQuestions.add(new QuestionDTO(3,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO(1, listeQuestions);
        questionnaireDTO.setNbDeFoisJoueQuestionnaire(1);
        Assertions.assertThrows(StatsQuestionsIncorrectExeptions.class, () -> serviceStatsQuestionnaireTest.fournirStatsQuestions(questionnaireDTO));

        //NbDeReussiteQuestion supérieur à NbDeFoisJoueQuestion
        List<QuestionDTO> listeQuestions2 = new ArrayList<>();
        QuestionDTO questionDTO2 = new QuestionDTO(1,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1);
        questionDTO2.getStatsQuestions().setNbDeReussiteQuestion(4);
        questionDTO2.getStatsQuestions().setNbDeFoisJoueQuestion(2);
        listeQuestions2.add(questionDTO2);
        listeQuestions2.add(new QuestionDTO(2,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
        listeQuestions2.add(new QuestionDTO(3,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
        QuestionnaireDTO questionnaireDTO2 = new QuestionnaireDTO(1, listeQuestions2);
        questionnaireDTO2.setNbDeFoisJoueQuestionnaire(5);
        Assertions.assertThrows(StatsQuestionsIncorrectExeptions.class, () -> serviceStatsQuestionnaireTest.fournirStatsQuestions(questionnaireDTO2));

        //NbDeReussiteQuestion négatif
        List<QuestionDTO> listeQuestions3 = new ArrayList<>();
        QuestionDTO questionDTO3 = new QuestionDTO(1,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1);
        questionDTO3.getStatsQuestions().setNbDeReussiteQuestion(-1);
        questionDTO3.getStatsQuestions().setNbDeFoisJoueQuestion(2);
        listeQuestions3.add(questionDTO3);
        listeQuestions3.add(new QuestionDTO(2,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
        listeQuestions3.add(new QuestionDTO(3,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
        QuestionnaireDTO questionnaireDTO3 = new QuestionnaireDTO(1, listeQuestions3);
        questionnaireDTO3.setNbDeFoisJoueQuestionnaire(5);
        Assertions.assertThrows(StatsQuestionsIncorrectExeptions.class, () -> serviceStatsQuestionnaireTest.fournirStatsQuestions(questionnaireDTO3));

        //idQuestion négatif
        List<QuestionDTO> listeQuestions4 = new ArrayList<>();
        QuestionDTO questionDTO4 = new QuestionDTO(-1,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1);
        questionDTO4.getStatsQuestions().setNbDeReussiteQuestion(1);
        questionDTO4.getStatsQuestions().setNbDeFoisJoueQuestion(2);
        listeQuestions4.add(questionDTO4);
        listeQuestions4.add(new QuestionDTO(2,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
        listeQuestions4.add(new QuestionDTO(3,"fr","De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1));
        QuestionnaireDTO questionnaireDTO4 = new QuestionnaireDTO(1, listeQuestions4);
        questionnaireDTO4.setNbDeFoisJoueQuestionnaire(5);
        Assertions.assertThrows(StatsQuestionsIncorrectExeptions.class, () -> serviceStatsQuestionnaireTest.fournirStatsQuestions(questionnaireDTO4));

        //Pas de questions
        QuestionnaireDTO questionnaireDTO5 = new QuestionnaireDTO(1, null);
        questionnaireDTO4.setNbDeFoisJoueQuestionnaire(5);
        Assertions.assertThrows(StatsQuestionsIncorrectExeptions.class, () -> serviceStatsQuestionnaireTest.fournirStatsQuestions(questionnaireDTO5));
    }
}
