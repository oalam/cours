/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

/**
 *
 * @author adminl
 */
public class Salarie extends Employe {

    public Salarie(String nom, String prenom, int age, double salaireFixe) {
        super(nom, prenom, age, salaireFixe);
    }

    @Override
    public double calculSalaire() {
        return salaireFixe;
    }

    @Override
    public String toString() {
        return "Salarié : " + super.toString();
    }

    @Override
    public Object clone() {
        Salarie s = new Salarie(nom, prenom, age, salaireFixe);
        return s;
    }
}
