/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

/**
 *
 * @author tom
 */
@WebService(name = "CreditCardValidator",
portName = "ValidatorPort")
public class CardValidator {

    @WebMethod(operationName = "ValidateCreditCard")
    @WebResult(name = "IsValid")
    public boolean validate(@WebParam(name = "CreditCard") CreditCard creditCard) {
	String lastDigit = creditCard.getNumber().substring(
		creditCard.getNumber().length() - 1,
		creditCard.getNumber().length());
	if (Integer.parseInt(lastDigit) % 2 != 0) {
	    return true;
	} else {
	    return false;
	}
    }

    @WebMethod(exclude = true)
    public void validate(String ccNumber) {
	// Logique métier
    }
}