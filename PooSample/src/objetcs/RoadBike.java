/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objetcs;

/**
 *
 * @author formation
 */
public class RoadBike extends Bicycle {

 

    public RoadBike(int startCadence, int startSpeed, int startGear, int newTireWidth) {
        super(startCadence, startSpeed, startGear);
        this.setTireWidth(newTireWidth);
    }

    public int getTireWidth() {
        return this.tireWidth;
    }

    public void setTireWidth(int newTireWidth) {
        this.tireWidth = newTireWidth;
    }


    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("The RoadBike has " + getTireWidth()
                + " MM tires.");
    }
}