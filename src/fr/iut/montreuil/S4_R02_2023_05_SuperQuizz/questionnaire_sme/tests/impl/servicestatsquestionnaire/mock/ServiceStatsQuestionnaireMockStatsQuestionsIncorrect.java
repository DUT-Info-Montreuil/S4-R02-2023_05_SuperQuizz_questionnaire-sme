package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.tests.impl.servicestatsquestionnaire.mock;

import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.BilanStatsDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.modeles.IServiceStatsQuestionnaire;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.IdQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.NbDeFoisJoueQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.StatsQuestionsIncorrectExeptions;

public class ServiceStatsQuestionnaireMockStatsQuestionsIncorrect implements IServiceStatsQuestionnaire {
    @Override
    public BilanStatsDTO fournirStatsQuestions(QuestionnaireDTO questionnaire) throws IdQuestionnaireIncorrectExeptions, NbDeFoisJoueQuestionnaireIncorrectExeptions, StatsQuestionsIncorrectExeptions {
        throw new StatsQuestionsIncorrectExeptions();
    }
}
