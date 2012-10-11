/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

/**
 *
 * @author adminl
 */
public class Commercial extends Employe {

    private double partVariable;
    private double numItemVendus;

    public Commercial(String nom, String prenom, int age, double salaireFixe,
            double partVariable, double numItemVendus) {

        super(nom, prenom, age, salaireFixe);
        this.partVariable = partVariable;
        this.numItemVendus = numItemVendus;
    }

    @Override
    public double calculSalaire() {
        return salaireFixe + partVariable * numItemVendus;
    }

    @Override
    public String toString() {
        return "Commercial : " + super.toString();
    }

    @Override
    public Object clone() {
        Commercial c = new Commercial(nom, prenom, age, salaireFixe, partVariable, numItemVendus);
        return c;
    }
}
