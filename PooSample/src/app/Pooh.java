/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import objetcs.*;

/**
 *
 * @author formation
 */
public class Pooh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        
        Bicycle bike = new Bicycle(20, 0, 1);
        bike.speedUp(2);
        bike.applyBrake(8);
        
        Bicycle bike2 = new MountainBike(50, 1, 2, 3);
        MountainBike bike3 = new MountainBike(50, 1, 2, 3);
        
        bike2.speedUp(5);
        //bike2.setHeight(45);
        
        bike3.setHeight(45);
        
        
        System.out.println(bike.toString());
        System.out.println(bike2.toString());
        System.out.println(bike3.toString());*/



        Bicycle bike01, bike02, bike03;
        Bicycle bikes[] = new Bicycle[3];


        bike01 = new Bicycle(20, 10, 1);
        bike02 = new MountainBike(20, 10, 5, "Dual");
        bike03 = new RoadBike(40, 20, 8, 23);

        bikes[0] = bike01;
        bikes[1] = bike02;
        bikes[2] = bike03;

        
        for (Bicycle bicycle : bikes) {
            bicycle.printDescription();
        }
        
        /*
        bike01.printDescription();
        bike02.printDescription();
        bike03.printDescription();
*/

    }
}
