/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.observer1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adminl
 */
public class Product {
    List<Observer> observers = new ArrayList<>();
    
    public void attach(Observer o){
        observers.add(o);
    }
    
    public void detach(Observer o){
        observers.remove(o);
    }
    

    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
    
    double price;

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public double getPrice() {
        return price;
    }
    
    
    
}
