/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package introspection;

import java.lang.reflect.Method;

/**
 *
 * @author bailett
 */
public class TestIntro {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Test t = new Test();


        Class cl;
        cl = Class.forName("introspection.Test");


        Object o = cl.newInstance();

 
        

        for (Method met : cl.getMethods()) {
            System.out.println(met.getName());
        }

        
        System.out.println("The class of " + o +
                            " is " + o.getClass().getName());

    }
}
