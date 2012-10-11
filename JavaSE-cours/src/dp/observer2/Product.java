/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.observer2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author adminl
 */
public class Product extends Observable {

    double price;

    public void setPrice(double price) {
        this.price = price;
        setChanged();
        notifyObservers("oups");
        clearChanged();
    }

    public double getPrice() {
        return price;
    }
}
