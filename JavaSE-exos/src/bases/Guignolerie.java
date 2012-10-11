/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bases;

/**
 *
 * @author adminl
 */
public class Guignolerie {

    enum STATUT_CANDIDAT {
        ELU,
        BATTU,
        BALLOTAGE_FAVORABLE,
        BALLOTAGE_DEFAVORABLE
    }

    public static void main(String[] args) {
        
        float score = 52.5f;
        float[] scores = {score, 12.0f, 12.5f, 10.0f};
        
        STATUT_CANDIDAT statut;
        if (score > 50) {
            statut = STATUT_CANDIDAT.ELU;
        } else if (score > 12.5) {
            for (int i = 1; i < scores.length; i++) {
                if (scores[i] > scores[0]) {
                    statut = STATUT_CANDIDAT.BALLOTAGE_DEFAVORABLE;
                    break;
                }
            }
            statut = STATUT_CANDIDAT.BALLOTAGE_FAVORABLE;
        } else {
            statut = STATUT_CANDIDAT.BATTU;
        }

        switch (statut) {
            case ELU:
                System.out.println(statut);
                break;
            case BALLOTAGE_FAVORABLE:
                System.out.println("ballotage favorable");
                break;
        }
        

    }
}
