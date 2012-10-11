/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decorator;

/**
 *
 * @author adminl
 */
public class DecoratorTest {
    public static void main(String[] args) {
        
        // Prix classique 
        Buyable p = new Product(15.99);
        double initialPrice = p.getPrice();
        System.out.println("initialPrice = " + initialPrice);
        
        
        // Decoration
        PercentDiscount discountP = new PercentDiscount(p);
        discountP.setRate(0.15);
        double discountedPrice = discountP.getPrice();
        System.out.println("discountedPrice = " + discountedPrice);
        
        
        // Decoration
        FixedAmountDiscount discount2P = new FixedAmountDiscount(discountP);
        discount2P.setAmount(10.0);
        double discountedPrice2 = discount2P.getPrice();
        System.out.println("discountedPrice2 = " + discountedPrice2);
        
        new FixedAmountDiscount(new PercentDiscount(new Product(initialPrice)));
    }
}
