/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author bailett
 */
public class XmlUserDao implements UserDao{

    @Override
    public User createUser(String name) {
        
        // xml stuff
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean canCreateUser(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
