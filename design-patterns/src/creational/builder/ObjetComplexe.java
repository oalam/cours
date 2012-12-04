/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

/**
 * L'objet complexe
 * Dans l'exemple, on pourrait considérer 
 * l'attribut1 comme un libellé
 * et l'attribut2 comme une dimension
 * La classe de l'attribut2 peut varier selon le "Monteur"
 */
public class ObjetComplexe {

    // Les attributs de l'objet complexe
    private String attribut1;
    private Number attribut2;
    
    // Les méthodes permettant de fixes les attributs
    public void setAttribut1(String pAttribut1) {
        attribut1 = pAttribut1;
    }
    
    public void setAttribut2(Number pAttribut2) {
    	attribut2 = pAttribut2;
    }
    
    /**
     * Méthode permettant d'afficher l'état de l'objet
     * afin de permettre de mettre en évidence
     * les différences de "montage". 
     */
    public void afficher() {
        System.out.println("Objet Complexe : ");
        System.out.println("\t- attribut1 : " + attribut1);
        System.out.println("\t- attribut2 : " + attribut2);
        System.out.println("\t- classe de l'attribut2 : " + attribut2.getClass());
    }
}

