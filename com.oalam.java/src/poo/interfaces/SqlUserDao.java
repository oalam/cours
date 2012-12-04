/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.interfaces;

/**
 *
 * @author bailett
 */
public class SqlUserDao implements UserDao{

    @Override
    public User createUser(String name)  {
        
        if(name.equals("tom"))
            throw new RuntimeException("tom allready exists");
            
        return null;
    }

    @Override
    public boolean canCreateUser(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
