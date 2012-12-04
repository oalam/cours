/*
 * NewFromMBean.java
 *
 * Created on July 13, 2011, 9:21 PM
 */
package jmx;

import java.util.Date;

/**
 * Interface NewFromMBean
 *
 * @author bailett
 */
public interface NewFromMBean {

    /**
     * Get Attribute exposed for management
     */
    public Date getDateCreation();

    /**
     * Set Attribute exposed for management
     */
    public void setDateCreation(Date value);

    /**
     * Get Attribute exposed for management
     */
    public String getName();

    /**
     * Set Attribute exposed for management
     */
    public void setName(String value);

    /**
     * Get Attribute exposed for management
     */
    public String getPwd();

    /**
     * Set Attribute exposed for management
     */
    public void setPwd(String value);

    /**
     * Operation exposed for management
     * @return java.lang.String
     */
    public String toString();
    
}
