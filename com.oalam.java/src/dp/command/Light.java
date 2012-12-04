/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.command;

import java.util.ArrayList;
import java.util.List;

/*
 * the Receiver class
 */
public class Light {

    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }
    
    
    public Light() {
    }

    public void turnOn() {
        isOn = true;
        System.out.println("The light is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("The light is off");
    }
    
    
}
