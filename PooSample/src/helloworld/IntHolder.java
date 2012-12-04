/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author formation
 */
public class IntHolder {

    private  String nom ="ert";
    private  int i=2;

    public final void setNom(String nom) {
        this.nom = nom.toLowerCase();
        helper();
    }

    private void helper() {
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void print() {
        System.out.println(this);
    }
    
    public static void staticPrint() {
        System.out.println("static holder");
    }
    
    
    public static int count;
    
}
