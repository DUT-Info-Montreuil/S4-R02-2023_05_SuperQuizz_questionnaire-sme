package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionnaireDTO {
    private int idQuestionnaire;
    private List<QuestionDTO> listeQuestions;
    private int nbDeFoisJoueQuestionnaire;


    public QuestionnaireDTO(int idQuestionnaire, List<QuestionDTO> listeQuestions) {
        this.idQuestionnaire = idQuestionnaire;
        this.listeQuestions = listeQuestions;
        this.nbDeFoisJoueQuestionnaire = 0;

    }

    public List<QuestionDTO> getListeQuestions() {
        return listeQuestions;
    }

    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public int getNbDeFoisJoueQuestionnaire() {
        return nbDeFoisJoueQuestionnaire;
    }

    public void setNbDeFoisJoueQuestionnaire(int nbDeFoisJoueQuestionnaire) {
        this.nbDeFoisJoueQuestionnaire = nbDeFoisJoueQuestionnaire;
    }


    @Override
    public String toString() {
        return "QuestionnaireDTO{" +
                "idQuestionnaire=" + idQuestionnaire +
                ", listeQuestions=" + listeQuestions +
                ", nbDeFoisJoueQuestionnaire=" + nbDeFoisJoueQuestionnaire +
                '}';
    }
}
