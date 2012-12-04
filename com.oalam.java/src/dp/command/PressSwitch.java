/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.command;

/**
 *
 * @author HumanBooster
 */
/*The test class or client*/
public class PressSwitch {
 
   public static void main(String[] args){
      Light lamp = new Light();
      Command switchUp = new FlipUpCommand(lamp);
      Command switchDown = new FlipDownCommand(lamp);
 
      Switch s = new Switch();
 
      try {
         if (args[0].equalsIgnoreCase("ON")) {
            s.storeAndExecute(switchUp);
            System.exit(0);
         }
         if (args[0].equalsIgnoreCase("OFF")) {
            s.storeAndExecute(switchDown);
            System.exit(0);
         }
         System.out.println("Argument \"ON\" or \"OFF\" is required.");
      } catch (Exception e) {
         System.out.println("Argument's required.");
      }
   }
 
}
