package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto;

public class StatsQuestionsDTO {
    private int nbDeFoisJoueQuestion;
    private int nbDeReussiteQuestion;

    public StatsQuestionsDTO() {
        this.nbDeFoisJoueQuestion = 0;
        this.nbDeReussiteQuestion = 0;
    }

    public int getNbDeFoisJoueQuestion() {
        return nbDeFoisJoueQuestion;
    }

    public void setNbDeFoisJoueQuestion(int nbDeFoisJoueQuestion) {
        this.nbDeFoisJoueQuestion = nbDeFoisJoueQuestion;
    }

    public int getNbDeReussiteQuestion() {
        return nbDeReussiteQuestion;
    }

    public void setNbDeReussiteQuestion(int nbDeReussiteQuestion) {
        this.nbDeReussiteQuestion = nbDeReussiteQuestion;
    }

    @Override
    public String toString() {
        return "StatsQuestionsDTO{" +
                "nbDeFoisJoueQuestion=" + nbDeFoisJoueQuestion +
                ", nbDeReussiteQuestion=" + nbDeReussiteQuestion +
                '}';
    }
}
