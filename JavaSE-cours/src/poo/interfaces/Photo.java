/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.interfaces;

/**
 *
 * @author adminl
 */
public class Photo implements Imprimable {

    @Override
    public void imprimer() {
        System.out.println("impression d'une photo");
    }
    
}
