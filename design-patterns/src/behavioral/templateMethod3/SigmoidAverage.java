package behavioral.templateMethod3;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 1/ ( 1 + e ^-x )
 * @author formation
 */
public class SigmoidAverage extends Average{

    @Override
    protected double f(double x) {
        return 1.0 / ( 1.0 + Math.exp(-x));
    }
    
}
