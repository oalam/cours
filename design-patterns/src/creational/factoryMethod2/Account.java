package creational.factoryMethod2;

/**
 * @author Administrateur
 * @version 1.0
 * @created 03-ao�t-2011 14:43:44
 */
public class Account implements BusinessObject {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    Account(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + '}';
    }
    
    
}