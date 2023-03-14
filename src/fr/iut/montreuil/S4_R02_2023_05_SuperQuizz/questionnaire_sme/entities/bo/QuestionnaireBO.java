package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.bo;

import java.util.ArrayList;
import java.util.List;

public class QuestionnaireBO {
    private List<Integer> idQuestionnaires;
    private List<Integer> numQuestions;
    private List<String> langues;
    private List<String> libelles;
    private List<String> reponses;
    private List<Integer> difficultes;
    private List<String> details;
    private List<String> sources;

    public QuestionnaireBO() {
        idQuestionnaires = new ArrayList<>();
        numQuestions = new ArrayList<>();
        langues = new ArrayList<>();
        libelles = new ArrayList<>();
        reponses = new ArrayList<>();
        difficultes = new ArrayList<>();
        details = new ArrayList<>();
        sources = new ArrayList<>();
    }

    public List<Integer> getIdQuestionnaires() {
        return idQuestionnaires;
    }

    public List<Integer> getNumQuestions() {
        return numQuestions;
    }

    public List<String> getLangues() {
        return langues;
    }

    public List<String> getLibelles() {
        return libelles;
    }

    public List<String> getReponses() {
        return reponses;
    }

    public List<Integer> getDifficultes() {
        return difficultes;
    }

    public List<String> getDetails() {
        return details;
    }

    public List<String> getSources() {
        return sources;
    }
}