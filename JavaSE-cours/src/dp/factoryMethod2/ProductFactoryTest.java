/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factoryMethod2;

import dp.factoryMethod.Product;

/**
 *
 * @author adminl
 */
public class ProductFactoryTest {
    public static void main(String[] args) {
        
        
        ProductFactory factory = new ProductFactory();
        
        Product p = factory.createProduct("55");
        
        
    }
}
