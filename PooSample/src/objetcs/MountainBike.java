/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objetcs;

/**
 *
 * @author formation
 */
public class MountainBike extends Bicycle {
    private String suspension;

    public MountainBike(int startCadence, int startSpeed, int startGear, String suspensionType) {
        super(startCadence, startSpeed, startGear);
        this.setSuspension(suspensionType);
    }

    public String getSuspension() {
        return this.suspension;
    }

    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("The MountainBike has a " + getSuspension()
                + " suspension.");
    }
    
    // the Bicycle class has four methods
    @Override
    public void setCadence(int newValue) {
        cadence = newValue;
    }
}