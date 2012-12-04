/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import org.hibernate.validator.constraints.impl.EmailValidator;

/**
 *
 * @author tom
 */
@WebService(serviceName = "EmailValdiator")
public class EmailValdiator {

    /** This is a sample web service operation */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
	
	

	
	return "Hello " + txt + " !";
    }
    
    
    public static boolean isValidEmailAddress(String email) {
   boolean result = true;
   try {
      InternetAddress emailAddr = new InternetAddress(email);
      emailAddr.validate();
   } catch (AddressException ex) {
      result = false;
   }
   return result;
}
}
