package behavioral.templateMethod3;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * f(x) = a*x^2 + b
 * @author formation
 */
public class QuadraticAverage extends Average{

    private double a = -5.2;
    private double b = 89.23;

    public QuadraticAverage(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    protected double f(double x) {
        return a * x * x + b;
    }
}