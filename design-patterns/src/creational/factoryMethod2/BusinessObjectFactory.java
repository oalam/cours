package creational.factoryMethod2;

/**
 * This class (a) declares the factory method, which returns an object of type
 * Product. Creator may also define a default implementation of the factory method
 * that returns a default ConcreteProduct object, and (b) may call the factory
 * method to create a Product object.
 * @version 1.0
 * @created 03-ao�t-2011 14:43:44
 */
public abstract class BusinessObjectFactory {
    
    private final BusinessObjectDao dao = new BusinessObjectDao();

    public boolean checkExistance(String id) {
        // factory method pattern here !!
        BusinessObject bo = createBusinessObject(id);
 
        return dao.find(bo);
    }


    public abstract BusinessObject createBusinessObject(String id);
    
    public static void main(String[] args){
        
        BusinessObjectFactory cdFactory = new CdFactory();
 
        //factory method
        BusinessObjectFactory bookFactory = new BookFactory();
        BusinessObjectFactory accountFactory = new AccountFactory();
        BusinessObject book1 = bookFactory.createBusinessObject("zer");
        BusinessObject account1 = accountFactory.createBusinessObject("zer");
        
        
        
        
        bookFactory.checkExistance("book1");
        accountFactory.checkExistance("QAccount1");
    }
}