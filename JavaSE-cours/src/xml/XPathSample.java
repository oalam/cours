/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author adminl
 */
public class XPathSample {

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
        } catch (IOException | ParserConfigurationException ex) {
            Logger.getLogger(XPathSample.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException e) {
            // A parsing error occurred; the xml input is not valid
        } 
        return null;
    }

    public static void main(String[] args) {
        try {
            Document doc = parseXmlFile("src/xml/haricot.xml", false);

            String xpath = "//product[price<2]/price";
            // Get the matching elements
            NodeList nodelist = org.apache.xpath.XPathAPI.selectNodeList(doc, xpath);

            // Process the elements in the nodelist
            for (int i = 0; i < nodelist.getLength(); i++) {
                // Get element
                Element elem = (Element) nodelist.item(i);
                String name = elem.getFirstChild().getNodeValue();
                
                System.out.println(name );
            }
        } catch (TransformerException ex) {
            Logger.getLogger(XPathSample.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
