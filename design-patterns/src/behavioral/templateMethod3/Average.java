package behavioral.templateMethod3;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author formation
 */
public abstract class Average {

    private List<Double> sample = new ArrayList<Double>();    
    private final int sampleSize = 1000;
    
    public double compute(){
        double result = 0.0;
        
        sample.clear();
        
        // echantilloner f sur n points
        for (int i = 0; i < sampleSize; i++) {
            
            double x = (double)i/sampleSize;
            double y = f(x);
            result += y;
            
            sample.add(y);            
        }        
        
        return result/sampleSize;
    }
    
    public List<Double> getSample(){
        return sample;
    }
    
    protected abstract double f(double x);

    public static void main(String[] args){
        double a = 5.2, b = -3.2;
                
        Average avg1 = new LinearAverage(a, b);
        Average avg2 = new QuadraticAverage(a, b);
        Average avg3 = new SigmoidAverage();
        
        System.out.println( "LinearAverage " + avg1.compute());
        System.out.println( "QuadraticAverage " + avg2.compute());
        System.out.println( "SigmoidAverage " + avg3.compute());
    }
}
