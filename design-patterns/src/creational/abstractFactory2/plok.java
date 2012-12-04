/*
 * plok.java
 *
 * Created on 11 août 2011, 12:35
 */
package creational.abstractFactory2;

import javax.management.*;

/**
 * Class plok
 *
 * @author Administrateur
 */
public class plok implements plokMBean, NotificationEmitter {
    private NotificationBroadcasterSupport broadcaster = new NotificationBroadcasterSupport();
    /**
     * Attribute : NewAttribute0
     */
    private String newAttribute0;
    
    public plok() {
    }

    /**
     * Get NewAttribute0 Description
     */
    public String getNewAttribute0() {
        return newAttribute0;
    }

    /**
     * Set NewAttribute0 Description
     */
    public void setNewAttribute0(String value) {
        newAttribute0 = value;
    }

    public void addNotificationListener(NotificationListener listener, NotificationFilter filter, Object handback) throws IllegalArgumentException {
        broadcaster.addNotificationListener(listener, filter, handback);
    }

    public MBeanNotificationInfo[] getNotificationInfo() {
        return new MBeanNotificationInfo[]{new MBeanNotificationInfo(new String[]{AttributeChangeNotification.ATTRIBUTE_CHANGE}, javax.management.AttributeChangeNotification.class.getName(), "NewNotification Description")};
    }

    public void removeNotificationListener(NotificationListener listener) throws ListenerNotFoundException {
        broadcaster.removeNotificationListener(listener);
    }

    public void removeNotificationListener(NotificationListener listener, NotificationFilter filter, Object handback) throws ListenerNotFoundException {
        broadcaster.removeNotificationListener(listener, filter, handback);
    }
}
