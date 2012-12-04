/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jaxb;

import generated.Catalog;
import generated.Category;
import generated.Product;
import java.io.File;
import java.util.List;
import javax.xml.bind.*;

/**
 *
 * @author HumanBooster
 */
public class JaxbTest {

    public static void main(String[] args) throws JAXBException {

        // load object graph from wml file
        JAXBContext jc = JAXBContext.newInstance("generated");
        Unmarshaller unmarshaller = jc.createUnmarshaller();


        Catalog catalog = (Catalog) ((JAXBElement) unmarshaller.unmarshal(
                new File("src/ressources/catalog.xml"))).getValue();

        List<Category> cats = catalog.getCategory();


        // modify graph
        catalog.getCategory().add(new Category("plok", 18L));


        // dump the object graph into the std output stream
        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(catalog, System.out);



    }
}
