/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olam.ws.test;

import service.CreditCard;

/**
 *
 * @author tom
 */
public class ComOlamWsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	CreditCard cc = new CreditCard();
	cc.setNumber("4");
	cc.setExpiryDate("11/2012");
	cc.setType("VISA");
	cc.setControlNumber(455);

	boolean isValid = validate(cc);

	System.out.println("isValid = " + isValid);
    }

    private static boolean validate(service.CreditCard arg0) {
	service.CardValidator_Service service = new service.CardValidator_Service();
	service.CardValidator port = service.getCardValidatorPort();
	return port.validate(arg0);
    }
}
