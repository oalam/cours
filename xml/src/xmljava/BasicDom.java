/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xmljava;

import com.sun.org.apache.xpath.internal.XPathAPI;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

public class BasicDom {

    public static void main(String[] args) {
        Document doc = parseXmlFile("src/xml/ressources/books.xml", false);
        
        
        String xpath = "(//author | //title)[parent::book[@category='WEB']]";

        try {
            // Get the matching elements
            NodeList nodelist = XPathAPI.selectNodeList(doc, xpath);

            // Process the elements in the nodelist
            for (int i = 0; i < nodelist.getLength(); i++) {
                // Get element
                Element elem = (Element) nodelist.item(i);

            
                System.out.println(elem.getNodeName() + " - " + elem.getTextContent());
            }
            
            System.out.println("--");

            // Retrieve the element using id
            NodeList nodelist2 = doc.getElementsByTagName("title");
            
            
            // Process the elements in the nodelist
            for (int i = 0; i < nodelist2.getLength(); i++) {
                // Get element
                Element elem = (Element) nodelist2.item(i);

                
                System.out.println(elem.getNodeName() + " - " + elem.getTextContent() + "- " + elem.getAttribute("lang"));
            }




        } catch (javax.xml.transform.TransformerException e) {
        }
    }

    // Parses an XML file and returns a DOM document.
    // If validating is true, the contents is validated against the DTD
    // specified in the file.
    public static Document parseXmlFile(String filename, boolean validating) {
        try {
            // Create a builder factory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setValidating(validating);

            // Create the builder and parse the file
            Document doc = factory.newDocumentBuilder().parse(new File(filename));
            return doc;


        } catch (SAXException ex) {
            Logger.getLogger(BasicDom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BasicDom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(BasicDom.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}