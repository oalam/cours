/*
 * File:           BookstoreHandlerImpl.java
 * Date:           July 30, 2011  8:12 PM
 *
 * @author  bailett
 * @version generated by NetBeans XML module
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.steria.bookstore.xml;

import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/**
 *
 * @author bailett
 */
public class BookstoreHandlerImpl implements BookstoreHandler {
    public static final boolean DEBUG = true;

    public void handle_author(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_author: " + meta);
        }
    }

    public void handle_editor(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_editor: " + meta);
        }
    }

    public void handle_title(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_title: " + meta);
        }
    }

    public void handle_userComment(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_userComment: " + meta);
        }
    }

    public void handle_price(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_price: " + meta);
        }
    }

    public void start_bookstore(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_bookstore: " + meta);
        }
    }

    public void end_bookstore() throws SAXException {
        if (DEBUG) {
            System.err.println("end_bookstore()");
        }
    }

    public void start_book(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_book: " + meta);
        }
    }

    public void end_book() throws SAXException {
        if (DEBUG) {
            System.err.println("end_book()");
        }
    }

    public void handle_year(final String data, final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("handle_year: " + meta);
        }
    }

    public void start_comments(final Attributes meta) throws SAXException {
        if (DEBUG) {
            System.err.println("start_comments: " + meta);
        }
    }

    public void end_comments() throws SAXException {
        if (DEBUG) {
            System.err.println("end_comments()");
        }
    }

    public void setDocumentLocator(Locator lctr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void startDocument() throws SAXException {
      System.out.println("start");
    }

    public void endDocument() throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void startPrefixMapping(String string, String string1) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void endPrefixMapping(String string) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void startElement(String string, String string1, String string2, Attributes atrbts) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void endElement(String string, String string1, String string2) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void characters(char[] chars, int i, int i1) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void ignorableWhitespace(char[] chars, int i, int i1) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void processingInstruction(String string, String string1) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void skippedEntity(String string) throws SAXException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

  
}
