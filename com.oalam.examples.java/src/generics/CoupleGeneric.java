/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author bailett
 */
public class CoupleGeneric<T> {
    private T t1;
    private T t2;
    private String name;

    public CoupleGeneric(T t1, T t2, String name) {
        this.t1 = t1;
        this.t2 = t2;
        this.name = name;
    }

    /**
     * @return the t1
     */
    public T getT1() {
        return t1;
    }

    /**
     * @return the t2
     */
    public T getT2() {
        return t2;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    
    
    

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public static void main(String[] args){
        CoupleGeneric<String> cg = new CoupleGeneric<String>( "name", "t1", "t2") ;
        String t1 = cg.getT1(); 
    }
    
}
