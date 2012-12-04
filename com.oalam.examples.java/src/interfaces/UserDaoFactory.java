/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author bailett
 */
public class UserDaoFactory {
    
    
    enum Type{
        SQL_DAO,
        XML_DAO
    }
    
    public static UserDao createDao(UserDaoFactory.Type daoType){
        UserDao result = null;
        
        /*switch(daoType){
            
            case :
        }*/
        
        switch(daoType){
            case SQL_DAO: result = new SqlUserDao();break;
            case XML_DAO: result = new XmlUserDao();break;  
            //default: throws new Exception();
                
        }
        
        
        
        
        return result;
        
    }
}
