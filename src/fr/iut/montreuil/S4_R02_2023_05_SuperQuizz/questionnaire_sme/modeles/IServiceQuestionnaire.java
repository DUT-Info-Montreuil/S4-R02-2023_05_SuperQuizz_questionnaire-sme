package fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.modeles;

import fr.iut.montreuil.S4_R02_2023_05_SuperQuizz.questionnaire_sme.entities.dto.QuestionnaireDTO;

import java.util.List;

public interface IServiceQuestionnaire {
    /*
    4 cas possibles :
        - fichier correcte renvoie une liste de QuestionnaireDTO
        - fichier incorrecte renvoie exception fichierIncorrecteException
        - fichier vide renvoie exception fichierVideException
        - fichier pas trouvé renvoie exception fichierPasTrouveException
    */
    public List<QuestionnaireDTO> chargerListeQuestionnaire(String nomFichier);

    /*
    3 cas possibles :
        - questionnaire trouvé
        - questionnaire pas trouvé
        - retourne un mauvais questionnaire
     */
    public QuestionnaireDTO fournirUnQuestionnaire(int indiceQuestionnaire);
}
