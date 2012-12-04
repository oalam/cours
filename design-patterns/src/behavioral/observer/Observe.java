/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Interface d'objet observé
 */
public class Observe {

    // Liste des observateurs
    private List<Observateur> listeObservateurs = 
            new LinkedList<Observateur>();
    
    /**
     * Ajouter un observateur de la liste
     * @param pObservateur
     */
    public void ajouterObs(Observateur pObservateur) {
        listeObservateurs.add(pObservateur);
    }
    
    /**
     * Supprimer un observateur de la liste
     * @param pObservateur
     */
    public void supprimerObs(Observateur pObservateur) {
        listeObservateurs.remove(pObservateur);
    }
    
    /**
     * Notifier à tous les observateurs de la liste
     * que l'objet à été mis à jour.
     */
    protected void notifier() {
        for(Observateur lObservateur : listeObservateurs) {
            lObservateur.miseAJour();
        }
    }
}

