/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oalam.formations.xml;



import java.io.IOException;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 *
 * @author bailett
 */
public class SaxParser {



        /**
         * Contructeur.
         */
        public SaxParser(String uri) throws SAXException, IOException {
                        XMLReader saxReader = XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
                        saxReader.setContentHandler(new HowtoParser(null, null));
                        saxReader.parse(uri);
        }

        public static void main(String[] args) {

                String uri = "howto.xml";

                String parserName = null;
                if (2 == args.length) {
                        parserName = args[1];
                }

                try {
                        SaxParser parser = new SaxParser(uri);
                } catch (Throwable t) {
                        t.printStackTrace();
                }
        }
}
