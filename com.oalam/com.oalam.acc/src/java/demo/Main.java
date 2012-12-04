package demo;



import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

public class Main {
    @Resource(mappedName = "jms/theQueue")
    private static Queue theQueue;
    @Resource(mappedName = "jms/theQueueFactory")
    private static ConnectionFactory theQueueFactory;


    // ======================================
    // =             Attributes             =
    // ======================================

    @EJB
    private static BookEJBRemote bookEJB;

    // ======================================
    // =           Public Methods           =
    // ======================================

    public static void main(String[] args) throws JMSException {

        // Creates an instance of book
        Book book = new Book();
        book.setTitle("The Hitchhiker's Guide to the Galaxy");
        book.setPrice(12.5F);
        book.setDescription("Science fiction comedy series created by Douglas Adams.");
        book.setIsbn("1-84023-742-2");
        book.setNbOfPage(354);
        book.setIllustrations(false);

        bookEJB.createBook(book);

        book.setTitle("H2G2");
        bookEJB.updateBook(book);
        
        bookEJB.deleteBook(book);
	
sendJMSMessageToTheQueue("oups");
	
    }

    private static Message createJMSMessageForjmsTheQueue(Session session, Object messageData) throws JMSException {
	// TODO create and populate message to send
	TextMessage tm = session.createTextMessage();
	tm.setText(messageData.toString());
	return tm;
    }

    private static void sendJMSMessageToTheQueue(Object messageData) throws JMSException {
	Connection connection = null;
	Session session = null;
	try {
	    connection = theQueueFactory.createConnection();
	    session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
	    MessageProducer messageProducer = session.createProducer(theQueue);
	    messageProducer.send(createJMSMessageForjmsTheQueue(session, messageData));
	} finally {
	    if (session != null) {
		try {
		    session.close();
		} catch (JMSException e) {
		  //  Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Cannot close session", e);
		}
	    }
	    if (connection != null) {
		connection.close();
	    }
	}
    }



}