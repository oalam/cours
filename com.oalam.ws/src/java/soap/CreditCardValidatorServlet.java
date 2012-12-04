/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soap;

import soap.CreditCard;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import stubs.CardValidator_Service;

/**
 *
 * @author tom
 */
@WebServlet(name = "CreditCardValidatorServlet", urlPatterns = {"/validate"})
public class CreditCardValidatorServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/web/CardValidator.wsdl")
    private CardValidator_Service service;

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	stubs.CreditCard cc = new stubs.CreditCard();
	cc.setNumber("4111 1111 1111 1111");
	cc.setExpiryDate("11/2012");
	cc.setType("VISA");
	cc.setControlNumber(455);

	boolean isValid = validate(cc);


	response.setContentType("text/html;charset=UTF-8");
	PrintWriter out = response.getWriter();
	try {

	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Servlet CreditCardValidatorServlet</title>");
	    out.println("</head>");
	    out.println("<body>");
	    if (isValid) {
		out.println("valid credit card");
	    } else {
		out.println("invalid credit card");
	    }
	    out.println("</body>");
	    out.println("</html>");

	} finally {
	    out.close();
	}
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
	return "Short description";
    }// </editor-fold>

    private boolean validate(stubs.CreditCard arg0) {
	stubs.CardValidator port = service.getCardValidatorPort();
	return port.validate(arg0);
    }
}
