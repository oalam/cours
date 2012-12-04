/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.interfaces;

/**
 *
 * @author bailett
 */
public interface UserDao {
    
    
    public User createUser(String name) throws UserAlreadyExistsException;
    
    public boolean  canCreateUser(String name);
}
