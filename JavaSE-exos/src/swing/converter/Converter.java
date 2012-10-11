/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.converter;

/**
 *
 * @author adminl
 */
public class Converter {

    public enum CURRENCY {

        EURO_TO_FRANC,
        FRANC_TO_EURO,
        EURO_TO_USDOLLAR,
        USDOLLAR_TO_EURO
    }

    public static double convert(double value, CURRENCY currency) {
        double rate = 1.0;
        switch (currency) {
            case EURO_TO_USDOLLAR:
                rate = 1.2859;
                break;
            case USDOLLAR_TO_EURO:
                rate = 0.7777;
                break;
            case EURO_TO_FRANC:
                rate = 6.55957;
                break;
            case FRANC_TO_EURO:
                rate = 0.15245;
                break;
        }

        System.out.println("convert " + value + " " + currency);
        return value * rate;
    }
}
