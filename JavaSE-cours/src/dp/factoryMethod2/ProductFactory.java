/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factoryMethod2;

import dp.factoryMethod.Product;
import dp.factoryMethod.Product55;
import dp.factoryMethod.Product77;

/**
 *
 * @author adminl
 */
public class ProductFactory {

    public Product createProduct(String productType) {

        if (productType.equals("55")) {
            return new Product55();
        } else {
            return new Product77();
        }
    }
}
