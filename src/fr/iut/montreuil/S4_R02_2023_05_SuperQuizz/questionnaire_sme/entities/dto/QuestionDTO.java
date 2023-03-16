package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto;

import java.util.List;

public class QuestionDTO {

    private int numQuestion;
    private String libelle;
    private String reponse;
    private String langues;
    private int difficultes;
    private StatsQuestionsDTO statsQuestions;

    public QuestionDTO(int numQuestion, String libelle, String reponse, String langues, int difficultes) {
        this.numQuestion = numQuestion;
        this.libelle = libelle;
        this.reponse = reponse;
        this.langues = langues;
        this.difficultes = difficultes;
        this.statsQuestions = new StatsQuestionsDTO();


    }

    public int getNumQuestion() {
        return numQuestion;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getReponse() {
        return reponse;
    }

    public String getLangues() {
        return langues;
    }

    public int getDifficultes() {
        return difficultes;
    }

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "numQuestion=" + numQuestion +
                ", libelle='" + libelle + '\'' +
                ", reponse='" + reponse + '\'' +
                ", langues='" + langues + '\'' +
                ", difficultes=" + difficultes +
                '}';
    }
}
