/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.factoryMethod2;

/**
 *
 * @author Administrateur
 */
public class CdFactory extends BusinessObjectFactory{

    @Override
    public BusinessObject createBusinessObject(String id) {
        return new Cd();
    }
    
}
