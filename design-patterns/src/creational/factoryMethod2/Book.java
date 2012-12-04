package creational.factoryMethod2;

/**
 * @author Administrateur
 * @version 1.0
 * @created 03-ao�t-2011 14:43:44
 */
public class Book implements BusinessObject {

    private String id;

    Book(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + '}';
    }


}