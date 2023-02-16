package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto;

import java.util.List;

public class QuestionnaireDTO {
    private List<QuestionDTO> listeQuestions;

    public QuestionnaireDTO(List<QuestionDTO> listeQuestions) {
        this.listeQuestions = listeQuestions;
    }

    public List<QuestionDTO> getListeQuestions() {
        return listeQuestions;
    }

    @Override
    public String toString() {
        return "QuestionnaireDTO{" +
                "listeQuestions=" + listeQuestions +
                '}';
    }
}
