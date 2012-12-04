/*
 * File:           HowtoHandlerImpl.java
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
public class HowtoHandlerImpl implements HowtoHandler {
    public static final boolean DEBUG = false;

    public void start_topic(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_topic: " + meta);
        }
    }

    public void end_topic() throws SAXException {
        if (DEBUG) {
            System.err.println("end_topic()");
        }
    }

    public void handle_title(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_title: " + meta);
        }
    }

    public void start_howto(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_howto: " + meta);
        }
    }

    public void end_howto() throws SAXException {
        if (DEBUG) {
            System.err.println("end_howto()");
        }
    }

    public void handle_url(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_url: " + meta);
        }
    }

}