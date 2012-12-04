package creational.abstractFactory2;

import creational.factoryMethod2.AccountFactory;
import creational.factoryMethod2.BusinessObject;
import creational.factoryMethod2.BusinessObjectFactory;
import java.lang.management.ManagementFactory;
import javax.management.ObjectName;
import javax.management.JMException;
import creational.abstractFactory2.plok;

/**
 * This class uses only interfaces declared by AbstractFactory and AbstractProduct
 * classes.
 * @version 1.0
 * @created 03-ao�t-2011 16:45:20
 */
public class Client {

    public BookDao m_BookDao;
    public AccountDao m_AccountDao;
    public DaoFactory m_DaoFactory;



    public static void main(String[] args) {
        // factory method DP
        BusinessObjectFactory bofactory = new AccountFactory();
        BusinessObject a = bofactory.createBusinessObject("tom");

        // abstract factory DP
       // AccountDao accountDao = new XmlAccountDao();
        //AccountDao dao = new dp2.FileAccountDao();
        
        AccountDao accountDao = new MockAccountDao();
        try { // Register MBean in Platform MBeanServer
            ManagementFactory.getPlatformMBeanServer().
                    registerMBean(new plok(),
                    new ObjectName("dp.abstractFactory:type=plok"));
        }catch(JMException ex) {
            // TODO handle exception
        }
     

    }
}