/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.abstractFactory2;

import creational.factoryMethod2.Account;
import creational.factoryMethod2.BusinessObject;

/**
 *
 * @author Administrateur
 */
public class MockAccountDao extends AccountDao {
    
  

    @Override
    public boolean find(Account a)  {
        if (a.getId().equals("tom")) {
            return true;
        } else {
            return false;
        }
    }
}
