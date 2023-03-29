package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto;

public class StatsQuestionsDTO {


    private int numQuestion;
    private int nbDeFoisJoueQuestion;
    private int nbDeReussiteQuestion;

    public StatsQuestionsDTO(int numQuestion,int nbDeFoisJoueQuestion,int nbDeReussiteQuestion) {
        this.numQuestion = numQuestion;
        this.nbDeFoisJoueQuestion = nbDeFoisJoueQuestion;
        this.nbDeReussiteQuestion = nbDeReussiteQuestion;
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

    public int getNumQuestion() {
        return numQuestion;
    }

    public void setNumQuestion(int numQuestion) {
        this.numQuestion = numQuestion;
    }

    @Override
    public String toString() {
        return "StatsQuestionsDTO{" +
                "nbDeFoisJoueQuestion=" + nbDeFoisJoueQuestion +
                ", nbDeReussiteQuestion=" + nbDeReussiteQuestion +
                '}';
    }
}
