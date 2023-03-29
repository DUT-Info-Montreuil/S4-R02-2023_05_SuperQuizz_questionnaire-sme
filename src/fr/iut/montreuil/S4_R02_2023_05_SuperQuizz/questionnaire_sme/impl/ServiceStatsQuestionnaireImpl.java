package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.impl;

import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.BilanStatsDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.StatsQuestionsDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.modeles.IServiceStatsQuestionnaire;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.IdQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.NbDeFoisJoueQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.StatsQuestionsIncorrectExeptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceStatsQuestionnaireImpl implements IServiceStatsQuestionnaire {
    @Override
    public BilanStatsDTO fournirStatsQuestions(QuestionnaireDTO questionnaire) throws IdQuestionnaireIncorrectExeptions, NbDeFoisJoueQuestionnaireIncorrectExeptions, StatsQuestionsIncorrectExeptions {

        int idQuestionnaire = questionnaire.getIdQuestionnaire();
        if (idQuestionnaire <= 0) {
            throw new IdQuestionnaireIncorrectExeptions();
        }


        int nbDeFoisJoueQuestionnaire = questionnaire.getNbDeFoisJoueQuestionnaire();
        if (nbDeFoisJoueQuestionnaire < 0) {
            throw new NbDeFoisJoueQuestionnaireIncorrectExeptions();
        }


        List<QuestionDTO> questions = questionnaire.getListeQuestions();
        if (questions == null || questions.isEmpty()) {
            throw new StatsQuestionsIncorrectExeptions();
        }


        List<StatsQuestionsDTO> statsQuestions = new ArrayList<>();
        StatsQuestionsDTO statsQuestion = new StatsQuestionsDTO(-1,0,0);
        for (QuestionDTO question : questions) {

            int idQuestion = question.getNumQuestion();
            statsQuestion.setNumQuestion(idQuestion);
            if (idQuestion <= 0) {
                throw new StatsQuestionsIncorrectExeptions();
            }

            int nbDeFoisJoueQuestion = statsQuestion.getNbDeFoisJoueQuestion();
            if (nbDeFoisJoueQuestion < 0) {
                throw new StatsQuestionsIncorrectExeptions();
            }

            int nbDeFoisReponseCorrecte = statsQuestion.getNbDeReussiteQuestion();
            if (nbDeFoisReponseCorrecte < 0) {
                throw new StatsQuestionsIncorrectExeptions();
            }

            StatsQuestionsDTO statsQuestion2 = new StatsQuestionsDTO(idQuestion,nbDeFoisJoueQuestion,nbDeFoisReponseCorrecte);
            statsQuestions.add(statsQuestion);
        }


        BilanStatsDTO bilanStats = new BilanStatsDTO(idQuestionnaire, nbDeFoisJoueQuestionnaire, statsQuestions);
        return bilanStats;
    }
}
