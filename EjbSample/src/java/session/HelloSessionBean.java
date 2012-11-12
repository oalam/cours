/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import javax.ejb.Stateless;

@Stateless
public class HelloSessionBean {
    
    
    public String hello(String name){
        return "hello " + name;
    }
}
