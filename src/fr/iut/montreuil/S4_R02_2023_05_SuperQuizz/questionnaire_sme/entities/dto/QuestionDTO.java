package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto;

import java.util.List;

public class QuestionDTO {
    private String libelle;
    private String reponse;

    public QuestionDTO(String libelle, String reponse) {
        this.libelle = libelle;
        this.reponse = reponse;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getReponse() {
        return reponse;
    }

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "libelle='" + libelle + '\'' +
                ", reponse='" + reponse + '\'' +
                '}';
    }
}
