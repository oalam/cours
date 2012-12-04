/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jmx;

/**
 *
 * @author bailett
 */

public interface PremierMBean {
  
  public String getNom(); 

  public int getValeur(); 
  public void setValeur(int valeur); 

  public void rafraichir();

}
