/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bailett
 */
public class TestUserDao {
    
    public static void main(String[] args){
     
        User tom = null;
        UserDao dao = UserDaoFactory.createDao(UserDaoFactory.Type.SQL_DAO);
        
        
        try {
            dao.createUser("tomy");
            dao.createUser("tom");

        } catch (UserAlreadyExistsException ex) {
        }
       
    }
    
    
    
    static void divTab() { 
        try {
            
            /*int index = 10;
            int div = tab[index];
            for (int j = 0; j < tab.length; j++) {
                tab[j] /= div;
            }*/
            
            
            int div = 1/1;
        } catch (NullPointerException e) {
            System.err.println("tab==null");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("index incorrect");
        }    
        catch (ArithmeticException e) {
            System.err.println("index incorrect");
        } 
         finally{
            System.out.println("finnally");
        }
        
           
            
            
            
            System.out.println("on passe");


    }
    
}
