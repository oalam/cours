/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jmx;

import java.lang.management.ManagementFactory;
import javax.management.ObjectName;
import javax.management.JMException;
import serialization.User;

/**
 *
 * @author bailett
 */
public class NewClass {

    public     void init() {
        try { // Register MBean in Platform MBeanServer
            ManagementFactory.getPlatformMBeanServer().
                    // TODO Replace NewFrom Constructor parameters with valid values
                    registerMBean(new NewFrom(new User()),
                    new ObjectName("com.oalam.demos.jmx:type=NewFrom"));
        } catch (JMException ex) {
            // TODO handle exception
        }

    }
}
