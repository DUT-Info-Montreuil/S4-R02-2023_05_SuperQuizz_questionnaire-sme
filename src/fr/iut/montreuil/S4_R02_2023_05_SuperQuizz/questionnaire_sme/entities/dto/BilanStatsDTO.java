package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto;

import java.util.ArrayList;
import java.util.List;

public class BilanStatsDTO {
    private int idQuestionnaire;
    private int nbDeFoisJoueQuestionnaire;
    private List<StatsQuestionsDTO> statsQuestions;

    public BilanStatsDTO(int idQuestionnaire, int nbDeFoisJoueQuestionnaire, List<StatsQuestionsDTO> statsQuestions) {
        this.idQuestionnaire = idQuestionnaire;
        this.nbDeFoisJoueQuestionnaire = nbDeFoisJoueQuestionnaire;
        this.statsQuestions = statsQuestions;
    }

    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(int idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }

    public int getNbDeFoisJoueQuestionnaire() {
        return nbDeFoisJoueQuestionnaire;
    }

    public void setNbDeFoisJoueQuestionnaire(int nbDeFoisJoueQuestionnaire) {
        this.nbDeFoisJoueQuestionnaire = nbDeFoisJoueQuestionnaire;
    }

    public List<StatsQuestionsDTO> getStatsQuestions() {
        return statsQuestions;
    }

    public void setStatsQuestions(List<StatsQuestionsDTO> statsQuestions) {
        this.statsQuestions = statsQuestions;
    }
}
