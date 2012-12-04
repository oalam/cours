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
@MessageDriven(mappedName = "jms/myQueue", activationConfig = {
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class FirstMDB implements MessageListener {
    @Resource(mappedName = "jms/myQueue2")
    private Queue myQueue2;
    @Resource(mappedName = "jms/myQueueConnectionFactory")
    private ConnectionFactory myQueueFactory;

  
    public FirstMDB() {
    }
    
    @Override
    public void onMessage(Message message) {
        TextMessage txt =null;
        
        if(message instanceof TextMessage){
            txt = (TextMessage)message;
            try {
                
                System.out.println("got the message ! " + txt.getText());
                
                sendJMSMessageToMyQueue2( "your turn now " +txt.getText() );
                
                
            } catch (JMSException ex) {
                Logger.getLogger(FirstMDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private Message createJMSMessageForjmsMyQueue2(Session session, Object messageData) throws JMSException {
        // TODO create and populate message to send
        TextMessage tm = session.createTextMessage();
        tm.setText(messageData.toString());
        return tm;
    }

    private void sendJMSMessageToMyQueue2(Object messageData) throws JMSException {
        Connection connection = null;
        Session session = null;
        try {
            connection = myQueueFactory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(myQueue2);
            messageProducer.send(createJMSMessageForjmsMyQueue2(session, messageData));
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (JMSException e) {
                    Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Cannot close session", e);
                }
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

   


}
