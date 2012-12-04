/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objetcs;

/**
 *
 * @author formation
 */
public class Day {
    
    public static final int MONDAY = 0;
    public static final int THUESDAY = 1;    
    
    
    enum DAY{
        MONDAY,
        THUESDAY,
        WENESDAY,
    }
    
    public static void main(String[] args) {
        
        DAY d = DAY.THUESDAY;
        
        switch(d){
            case MONDAY:
                break;
            case THUESDAY:
                break;
                
        }
        
    }
    
}
