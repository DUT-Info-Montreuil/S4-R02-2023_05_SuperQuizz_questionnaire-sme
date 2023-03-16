package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.modeles;

import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.BilanStatsDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionnaireDTO;

public interface IServiceStatsQuestionnaire {

    public BilanStatsDTO fournirStatsQuestions(QuestionnaireDTO questionnaire);
}
