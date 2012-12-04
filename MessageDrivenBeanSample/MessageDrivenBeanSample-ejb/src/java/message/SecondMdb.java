/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 *
 * @author formation
 */
@MessageDriven(mappedName = "jms/myQueue2", activationConfig = {
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class SecondMdb implements MessageListener {

    
    public SecondMdb() {
    }
    
    @Override
    public void onMessage(Message message) {
        TextMessage txt = null;
        if(message instanceof TextMessage){
            txt = (TextMessage)message;
            try {
                
                System.out.println("got the message ! " + txt.getText());
                
              //  sendJMSMessageToMyQueue2( "your turn now " +txt.getText() );
                
                
            } catch (JMSException ex) {
                Logger.getLogger(FirstMDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


  
}
