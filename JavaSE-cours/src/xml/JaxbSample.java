/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import haricot.Haricot;
import haricot.Haricot.Category;
import haricot.Product;
import java.io.File;
import java.util.List;
import javax.xml.bind.*;

/**
 *
 * @author adminl
 */
public class JaxbSample {

    public static void main(String[] args) throws JAXBException {

        // load object graph from wml file
        JAXBContext jc = JAXBContext.newInstance("haricot");
        Unmarshaller unmarshaller = jc.createUnmarshaller();

        Haricot catalog = (Haricot) unmarshaller.unmarshal(
                new File("src/xml/haricot.xml"));

        List<Category> cats = catalog.getCategory();

        for (Category category : cats) {
            System.out.println("--------------");


         /*  org.w3c.dom.Element elem = (org.w3c.dom.Element) category.getName();
            String name = elem.getFirstChild().getNodeValue();

*/
            System.out.println(category.getName());
            System.out.println("--------------");
            for (Product prod : category.getProduct()) {
                System.out.println("- " + prod.getName());
            }
        }


    }
}
