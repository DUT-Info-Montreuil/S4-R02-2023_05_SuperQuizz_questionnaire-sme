package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.tests.impl.chargement.mock;

import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.modeles.IServiceQuestionnaire;
import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.utils.exceptions.FichierIncorrectExceptions;

import java.util.ArrayList;
import java.util.List;

public class ServiceQuestionnaireMockIncorrect implements IServiceQuestionnaire {


    @Override
    public List<QuestionnaireDTO> chargerListeQuestionnaire(String nomFichier) {
        QuestionDTO questionIncorrect = new QuestionDTO("De quel petit objet se munit le golfeur pour surelever sa balle avant de la frapper ",null);
        List<QuestionDTO> listQuestionsIncorrect = new ArrayList<QuestionDTO>();
        listQuestionsIncorrect.add(questionIncorrect);
        QuestionnaireDTO leQuestionnaireIncorrect = new QuestionnaireDTO(listQuestionsIncorrect);
        List<QuestionnaireDTO> reponseIncorrect = new ArrayList<QuestionnaireDTO>();
        reponseIncorrect.add(leQuestionnaireIncorrect);
        return reponseIncorrect;
    }

    @Override
    public QuestionnaireDTO fournirUnQuestionnaire(int indiceQuestionnaire) {
        return null;
    }
}

