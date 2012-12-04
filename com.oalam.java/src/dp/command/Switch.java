/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.command;

/**
 *
 * @author HumanBooster
 */

/*the Invoker class*/
import java.util.List;
import java.util.ArrayList;
 
public class Switch {
 
   private List<Command> history = new ArrayList<Command>();
 
   public Switch() {
   }
 
   public void storeAndExecute(Command cmd) {
      this.history.add(cmd); // optional 
      cmd.execute();        
   }
 
}
 
