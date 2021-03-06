/*
 * File:           HowtoHandler.java
 * Date:           February 25, 2011  3:10 PM
 *
 * @author  bailett
 * @version generated by NetBeans XML module
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oalam.formations.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 *
 * @author bailett
 */
public interface HowtoHandler {

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_topic(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_topic() throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_title(final String data, final Attributes meta) throws SAXException;

    /**
     *
     * A container element start event handling method.
     * @param meta attributes
     */
    public void start_howto(final Attributes meta) throws SAXException;

    /**
     *
     * A container element end event handling method.
     */
    public void end_howto() throws SAXException;

    /**
     *
     * A data element event handling method.
     * @param data value or null
     * @param meta attributes
     */
    public void handle_url(final String data, final Attributes meta) throws SAXException;

}
