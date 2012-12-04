/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xmljava;

import com.sun.org.apache.xpath.internal.XPathAPI;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author formation
 */
public class ConfReader {

    //init from conf.xml
    String daotype;

    public void setup() {
        
        Document doc = BasicDom.parseXmlFile("src/xml/ressources/conf.xml", false);

        NodeList nodelist2 = doc.getElementsByTagName("dao_type");
        for (int i = 0; i < nodelist2.getLength(); i++) {
            Element elem = (Element) nodelist2.item(i);
            daotype = elem.getTextContent().toLowerCase();
        }

        Element e = doc.getElementById("type");
        daotype = e.getTextContent().toLowerCase();
    }
}
