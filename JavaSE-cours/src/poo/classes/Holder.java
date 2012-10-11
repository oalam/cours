/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.classes;

/**
 *
 * @author adminl
 */
public class Holder {

    public void print() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Holder h = new Holder();
        
        System.out.println(h);  // affiche l'adresse de h
        h.print(); // System.out.println(this);   h==this
    }
}
