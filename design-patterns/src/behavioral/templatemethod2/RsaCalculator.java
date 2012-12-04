package behavioral.templatemethod2;

/**
 * This class (a) defines abstract primitive operations that concrete subclasses
 * define to implement steps of an algorithm, and (b) implements a template method
 * defining the skeleton of an algorithm.
 * @version 1.0
 * @created 04-ao�t-2011 16:18:41
 */
public abstract class RsaCalculator {

    public abstract double calculeIndeminte();

    public final void TemplateMethod() {
        
        
        String str = "montant à payer : " + 30*calculeIndeminte();
        System.out.println(str);

    }
}