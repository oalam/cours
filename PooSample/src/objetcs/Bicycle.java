/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objetcs;

/**
 *
 * @author formation
 */
public class Bicycle {

    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;
    protected int tireWidth;


    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    
    // the Bicycle class has four methods
    public void setCadence(double newValue) {
        cadence = (int)newValue;
    }
    
    
    
    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "cadence=" + cadence + ", gear=" + gear + ", speed=" + speed + '}';
    }

    public void printDescription() {
        System.out.println("\nBike is in gear " + this.gear + " with a cadence of "
                + this.cadence + " and travelling at a speed of " + this.speed + ". ");
    }
}
