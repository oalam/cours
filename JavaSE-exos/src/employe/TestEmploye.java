/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

import java.util.Arrays;

/**
 *
 * @author adminl
 */
public class TestEmploye {

    public static void main(String[] args) {

        // Creation de tous les emploes
        Employe e1 = new Commercial("Bailet", "Thomas", 36, 1500.0, 450.0, 5);
        Employe e2 = new Commercial("Diagne", "Mouhamadou", 27, 2500.0, 450.0, 3);
        Employe e3 = new Salarie("Jegou", "Mathieu", 27, 4300.0);
        Employe e4 = (Employe) ((Salarie)e3).clone();
        Employe e5 = e3;
        
        
        System.out.println( e3 == e4 );
        System.out.println( e3.equals(e4) );
        System.out.println( e3 == e5 );
        
        System.out.println( e3.hashCode() );
        System.out.println( e4.hashCode() );
        
        Employe[] airial = {e1, e2, e3};
        
        // affichage des employes
        System.out.println("------------- non triée");
        for (Employe employe : airial) {
            System.out.println( employe );
            
        }

        // tri en fonction du salaire
        Arrays.sort(airial);
        
        // affichage des employes
        System.out.println("------------- triée");
        for (Employe employe : airial) {
            System.out.println( employe );
        }
        
        
        

    }
}
