/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.templatemethod2;

/**
 *
 * @author Administrateur
 */
public class RsaTest {
    public static void main(String[] args){
        
        RsaCalculator r = new Rmi();
        RsaCalculator r2 = new Rmi2();
        
        r.TemplateMethod();
        r2.TemplateMethod();
    }
}
