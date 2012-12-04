/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atos.poo;

/**
 *  cette classe peut contenir n Point sous forme de tableau
 * @author formation
 */
public class PointCollection {

    private Point[] collection;
    private int nbPointsInserted;

    /**
     * 
     * @param nbPoint max de points de la collection
     */
    public PointCollection(int nbPoint) {
        collection = new Point[nbPoint];
    }

    public void add(Point p) {
        if (nbPointsInserted == collection.length) {
            System.out.println("tableau plein");
        } else {
            for (int i = 0; i < collection.length; i++) {
                if (collection[i] == null) {
                    collection[i] = p;
                    nbPointsInserted++;
                    break;
                }
            }
        }
    }

    public void delete(int index) {
        collection[index] = null;
        nbPointsInserted--;
    }

    public void delete(Point p) {
        for (int i = 0; i < collection.length; i++) {
         
            if(collection[i] != null && collection[i].equals(p)) {
                collection[i] = null;
                
            }
            
            
            if(collection[i] == p){
                collection[i] = null;
                break;
            }
        }
        
    }

}
