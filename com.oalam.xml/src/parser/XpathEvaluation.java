/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import com.sun.org.apache.xpath.internal.XPathAPI;
import com.sun.org.apache.xpath.internal.objects.XObject;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author HumanBooster
 */
public class XpathEvaluation {

    public static void main(String[] args) 
            throws ParserConfigurationException, 
            SAXException, IOException, TransformerException {


        // Create a builder factory 
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(false);

        // Create the builder and parse the file
        Document doc = factory.newDocumentBuilder().parse(
                new File("src/ressources/books.xml"));

        // Get the matching elements
        String xpath = "/bookstore/book[position()<3]";
        NodeList nodelist = XPathAPI.selectNodeList(doc, xpath);


        // Process the elements in the nodelist
        for (int i = 0; i < nodelist.getLength(); i++) {
            // Get element
            Element elem = (Element) nodelist.item(i);
            System.out.println("elem = " + elem.getTextContent());
        }


        xpath = "count(//book)";
        XObject count = XPathAPI.eval(doc, xpath);
        System.out.println("count books = " + (int)count.num());
        
        
        
        
        
        // bigfile test C:\Users\HumanBooster
        
        Document doc2 = factory.newDocumentBuilder().parse(
                new File("C:\\Users\\HumanBooster\\test.xml"));

        // Get the matching elements
        xpath = "//name";
         nodelist = XPathAPI.selectNodeList(doc2, xpath);
    }
}
