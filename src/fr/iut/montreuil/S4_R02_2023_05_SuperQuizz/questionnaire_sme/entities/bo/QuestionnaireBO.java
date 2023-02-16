package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.bo;

import java.util.List;

public class QuestionnaireBO {
    private List<Integer> idQuestionnaires;
    private List<Integer> numQuestions;
    private List<String> langues;
    private List<String> libelles;
    private List<String> reponse;
    private List<Integer> difficultes;
    private List<String> details;
    private List<String> sources;

    public QuestionnaireBO() {
    }

    public void setIdQuestionnaires(List<Integer> idQuestionnaires) {
        this.idQuestionnaires = idQuestionnaires;
    }

    public void setNumQuestions(List<Integer> numQuestions) {
        this.numQuestions = numQuestions;
    }

    public void setLangues(List<String> langues) {
        this.langues = langues;
    }

    public void setLibelles(List<String> libelles) {
        this.libelles = libelles;
    }

    public void setReponse(List<String> reponse) {
        this.reponse = reponse;
    }

    public void setDifficultes(List<Integer> difficultes) {
        this.difficultes = difficultes;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }
}