/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factoryMethod;

/**
 *
 * @author adminl
 */
public class CreatorTest {
    public static void main(String[] args) {
        
        Creator c55 = new Creator55();
        Creator c77 = new Creator77();
        
        c55.computeInvoice();
        c77.computeInvoice();
    }
}
