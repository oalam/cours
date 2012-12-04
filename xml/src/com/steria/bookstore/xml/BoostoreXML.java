/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.steria.bookstore.xml;


import java.io.*;
import java.util.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import com.sun.org.apache.xpath.internal.XPathAPI;
import jaxb.Book;
import jaxb.Book.Title;
import jaxb.Bookstore;
import jaxb.ObjectFactory;


/**
 *
 * @author bailett
 */
public class BoostoreXML {

    public static void main(String[] args) {

        try {
            JAXBContext jc = JAXBContext.newInstance("jaxb");
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            //unmarshaller.setValidating(true);

            Bookstore bibliotheque = (Bookstore) unmarshaller.unmarshal(new File("src/com/steria/bookstore/xml/bookstore.xml"));

            List livres = bibliotheque.getBook();
            for (int i = 0; i < livres.size(); i++) {
                Book livre = (Book) livres.get(i);
                System.out.println("Livre ");
                System.out.println("Titre   : " + livre.getTitle().getContent());
                System.out.println("Auteur  : " + livre.getAuthor());
                System.out.println("Editeur : " + livre.getEditor());
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {

            ObjectFactory objFactory = new ObjectFactory();

            Bookstore bibliotheque = (Bookstore) objFactory.createBookstore();
            List livres = bibliotheque.getBook();
            for (int i = 1; i < 4; i++) {
                Book livreType = objFactory.createBook();
                //    LivreType livre = objFactory.createLivreType();
                livreType.getAuthor().add("Auteur" + i);
                livreType.setEditor("Editeur" + i);

                Title t = (Title) objFactory.createBookTitle();
                t.setContent("title" + i);
                livreType.setTitle(t);

                livres.add(livreType);
            }
            JAXBContext jaxbContext = JAXBContext.newInstance("jaxb");
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));


            marshaller.marshal(bibliotheque, System.out);
            marshaller.marshal(bibliotheque, new File("src/com/steria/bookstore/xml/bookstore3.xml"));

        } catch (Exception e) {
        }

        /*
        try {
        BookstoreHandler handler = new BookstoreHandlerImpl();
        XMLReader parseur = XMLReaderFactory.createXMLReader();
        parseur.setContentHandler(handler);
        
        parseur.parse("src/com/steria/bookstore/xml/bookstore.xml");
        
        
        
        } catch (Exception e) {
        System.out.println(e);
        }*/

      

        try {

        

            Document doc = parseXmlFile("src/com/steria/bookstore/xml/bookstore3.xml", false);

            String xpath = "//book";
            // Get the matching elements
            NodeList nodelist = XPathAPI.selectNodeList(doc, xpath);

            
            // Process the elements in the nodelist
            for (int i = 0; i < nodelist.getLength(); i++) {
                // Get element
                Element elem = (Element) nodelist.item(i);
                System.out.println(elem.getTextContent());
            }

        } catch (Exception e) {

            e.printStackTrace();

        }





    }
    public static Document parseXmlFile(String filename, boolean validating) throws ParserConfigurationException {
        try {
            // Create a builder factory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setValidating(validating);

            // Create the builder and parse the file
            Document doc = factory.newDocumentBuilder().parse(new File(filename));
            return doc;
        } catch (SAXException e) {
            // A parsing error occurred; the xml input is not valid
        } catch (ParserConfigurationException e) {
        } catch (IOException e) {
        }
        return null;
    }
}
