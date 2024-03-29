package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.tests.impl.servicestatsquestionnaire.mock;

import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.BilanStatsDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.StatsQuestionsDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.modeles.IServiceQuestionnaire;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.modeles.IServiceStatsQuestionnaire;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.IdQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.NbDeFoisJoueQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.StatsQuestionsIncorrectExeptions;

import java.util.ArrayList;
import java.util.List;

public class ServiceStatsQuestionnaireMockCorrect implements IServiceStatsQuestionnaire {
    @Override
    public BilanStatsDTO fournirStatsQuestions(QuestionnaireDTO questionnaire) throws IdQuestionnaireIncorrectExeptions, NbDeFoisJoueQuestionnaireIncorrectExeptions, StatsQuestionsIncorrectExeptions {
        List<StatsQuestionsDTO> statsQuestions = new ArrayList<>();
        StatsQuestionsDTO statsQuestionsDTO = new StatsQuestionsDTO(1, 2,5);
        statsQuestions.add(statsQuestionsDTO);
        statsQuestions.add(new StatsQuestionsDTO(2,0,0));
        statsQuestions.add(new StatsQuestionsDTO(3,0,0));
        BilanStatsDTO bilanStatsDTO = new BilanStatsDTO(1, 5, statsQuestions);
        return new BilanStatsDTO(1, 5, statsQuestions);
    }
}
