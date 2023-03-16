package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto;

import java.util.List;

public class QuestionnaireDTO {
    private int idQuestionnaire;
    private List<QuestionDTO> listeQuestions;

    public QuestionnaireDTO(int idQuestionnaire, List<QuestionDTO> listeQuestions) {
        this.idQuestionnaire = idQuestionnaire;
        this.listeQuestions = listeQuestions;
    }

    public List<QuestionDTO> getListeQuestions() {
        return listeQuestions;
    }

    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }

    @Override
    public String toString() {
        return "QuestionnaireDTO{" +
                "idQuestionnaire=" + idQuestionnaire +
                ", listeQuestions=" + listeQuestions +
                '}';
    }
}
