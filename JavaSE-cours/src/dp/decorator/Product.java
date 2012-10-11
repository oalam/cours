/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decorator;

/**
 *
 * @author adminl
 */
public class Product implements Buyable{
    private double price;

    @Override
    public double getPrice() {
        return price;
    }

    public Product(double price) {
        this.price = price;
    }
    
    
    
}
