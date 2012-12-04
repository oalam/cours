/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author bailett
 */
public class TestInterface {
    
    
    
    public static void main(String[] args){
    
        
        Redimensionnable r1 = new Cercle( 2, 4, 4);
        Redimensionnable r2 = new Page(21, 29.7);
        grossissement( r1 , r2);
        
    }

    private static void grossissement(Redimensionnable r1, Redimensionnable r2) {
        r1.grossir(12);
        r2.grossir(34);
        
        
        System.out.println( r1 );
        System.out.println( r2 );
        
     //   Redimensionnable tab[] = new Redimensionnable
    }
    
    
}
