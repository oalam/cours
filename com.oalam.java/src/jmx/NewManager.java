/*
 * NewManager.java
 *
 * Created on July 13, 2011, 9:23 PM
 */
package jmx;

import javax.management.MBeanServerConnection;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

/**
 * JMX manager class
 * @author bailett
 */
public class NewManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        //Manager instantiation and connection to the remote agent
        NewManager manager = NewManager.getDefault();
        // SAMPLE MBEAN NAME DISCOVERY. Uncomment following code.
        /*
         * Set resultSet =
         * manager.getMBeanServerConnection().queryNames(null, null);
         * for(Iterator i = resultSet.iterator(); i.hasNext();) {
         * System.out.println("MBean name: " + i.next());
         * } */
        // Close connection
        manager.close();
        System.out.println("Connection closed.");
    }

    /**
     * JMX Agent connection
     * This method is called automatically when <CODE>getDefault()</CODE>
     * is called
     */
    public void connect() throws Exception {
        // Create JMX Agent URL
        JMXServiceURL url = new JMXServiceURL("service:jmx:rmi://localhost:1099/jndi/rmi://localhost:1099/jmxrmi");
        /*
         * SAMPLE CREDENTIALS. Uncomment following code.
         * Replace userName and userPassword with your parameters.
         * Provide env parameter when calling JMXConnectorFactory.connect(url, env)
         *  */
        /*
         * Map env = new HashMap();
         * env.put(JMXConnector.CREDENTIALS, new String[]{"userName", "userPassword"}); */
        // Connect the JMXConnector
        connector = JMXConnectorFactory.connect(url, null);
        // Get the MBeanServerConnection
        mbsc = connector.getMBeanServerConnection();
    }

    /**
     * Returns a manager singleton.
     */
    public synchronized static NewManager getDefault() throws Exception {
        if (singleton == null) {
            singleton = new NewManager();
            singleton.connect();
        }
        return singleton;
    }
    
    public MBeanServerConnection getMBeanServerConnection() {
        return mbsc;
    }
    
    public void close() throws Exception {

        //Close the connection
        connector.close();
    }
    //MBeanServerConnection definition
    private MBeanServerConnection mbsc;
    //The JMX Connector definition
    private JMXConnector connector;
    //Singleton instance
    private static NewManager singleton;
}
