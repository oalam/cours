/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import java.io.IOException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



/**
 *
 * @author HumanBooster
 */
public class DomParser {

    public static void main(String[] args) throws SAXException, IOException {
       
        
        
        DOMParser parser = new DOMParser();
       
        parser.parse("src/ressources/messages.xml");
        
        Document doc = parser.getDocument();
        
       
     
        NodeList list = doc.getElementsByTagName("body");
        
        for (int i = 0; i < list.getLength(); i++) {
            Node n = list.item(i);
            String value = n.getTextContent();
            
            System.out.println("value = " + value);
            value = n.getParentNode().getTextContent();
            System.out.println("parent value = " + value);
        }
        
    }
}
