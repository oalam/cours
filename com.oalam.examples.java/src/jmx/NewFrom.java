/*
 * NewFrom.java
 *
 * Created on July 13, 2011, 9:21 PM
 */
package jmx;

import java.util.Date;
import javax.management.*;
import java.util.Arrays;
import serialization.User;

/**
 * Class NewFrom
 *
 * @author bailett
 */
public class NewFrom extends StandardMBean implements NewFromMBean {
    private User theRef;

    public NewFrom(User theRef) throws NotCompliantMBeanException {
        //WARNING Uncomment the following call to super() to make this class compile (see BUG ID 122377)
        
        super(NewFromMBean.class);
        this.theRef = theRef;
    }
    
    @Override
    public MBeanInfo getMBeanInfo() {
        MBeanInfo mbinfo = super.getMBeanInfo();
        return new MBeanInfo(mbinfo.getClassName(),
                mbinfo.getDescription(),
                mbinfo.getAttributes(),
                mbinfo.getConstructors(),
                mbinfo.getOperations(),
                getNotificationInfo());
    }
    
    public MBeanNotificationInfo[] getNotificationInfo() {
        return new MBeanNotificationInfo[]{};
    }

    /**
     * Override customization hook:
     * You can supply a customized description for MBeanInfo.getDescription()
     */
    @Override
    protected String getDescription(MBeanInfo info) {
        return "NewFrom Description";
    }

    /**
     * Override customization hook:
     * You can supply a customized description for MBeanAttributeInfo.getDescription()
     */
    @Override
    protected String getDescription(MBeanAttributeInfo info) {
        String description = null;
        if (info.getName().equals("DateCreation")) {
            description = "Attribute exposed for management";
        } else if (info.getName().equals("Name")) {
            description = "Attribute exposed for management";
        } else if (info.getName().equals("Pwd")) {
            description = "Attribute exposed for management";
        }
        return description;
    }

    /**
     * Override customization hook:
     * You can supply a customized description for MBeanParameterInfo.getDescription()
     */
    @Override
    protected String getDescription(MBeanOperationInfo op, MBeanParameterInfo param, int sequence) {
        if (op.getName().equals("toString")) {
            switch (sequence) {
                default:
                    return null;
            }
        }
        return null;
    }

    /**
     * Override customization hook:
     * You can supply a customized description for MBeanParameterInfo.getName()
     */
    @Override
    protected String getParameterName(MBeanOperationInfo op, MBeanParameterInfo param, int sequence) {
        if (op.getName().equals("toString")) {
            switch (sequence) {
                default:
                    return null;
            }
        }
        return null;
    }

    /**
     * Override customization hook:
     * You can supply a customized description for MBeanOperationInfo.getDescription()
     */
    @Override
    protected String getDescription(MBeanOperationInfo info) {
        String description = null;
        MBeanParameterInfo[] params = info.getSignature();
        String[] signature = new String[params.length];
        for (int i = 0; i < params.length; i++) {
            signature[i] = params[i].getType();
        }
        String[] methodSignature;
        methodSignature = new String[]{};
        if (info.getName().equals("toString") && Arrays.equals(signature, methodSignature)) {
            description = "Operation exposed for management";
        }
        return description;
    }

    /**
     * Get Attribute exposed for management
     */
    public Date getDateCreation() {
        return theRef.getDateCreation();
    }

    /**
     * Set Attribute exposed for management
     */
    public void setDateCreation(Date value) {
        theRef.setDateCreation(value);
    }

    /**
     * Get Attribute exposed for management
     */
    public String getName() {
        return theRef.getName();
    }

    /**
     * Set Attribute exposed for management
     */
    public void setName(String value) {
        theRef.setName(value);
    }

    /**
     * Get Attribute exposed for management
     */
    public String getPwd() {
        return theRef.getPwd();
    }

    /**
     * Set Attribute exposed for management
     */
    public void setPwd(String value) {
        theRef.setPwd(value);
    }

    /**
     * Operation exposed for management
     * @return java.lang.String
     */
    public String toString() {
        return theRef.toString();
    }
}
