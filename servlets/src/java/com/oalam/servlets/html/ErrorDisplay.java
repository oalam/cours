package com.oalam.servlets.html;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * This servlet acts as a general error display resource
 * supporting the display of both error status codes and exceptions. 
 * Note that under Microsoft Internet Explorer the error page from the server
 * will be replaced by IE's own error message, losing the information 
 * the server is trying to provide you.
 * 
 * @author bailett
 */
public class ErrorDisplay extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String code = null, message = null, type = null;
        Object codeObj, messageObj, typeObj;

        // Retrieve the three possible error attributes, some may be null
        codeObj = req.getAttribute("javax.servlet.error.status_code");
        messageObj = req.getAttribute("javax.servlet.error.message");
        typeObj = req.getAttribute("javax.servlet.error.exception_type");

        // Convert the attributes to string values
        if (codeObj != null) {
            code = codeObj.toString();
        }
        if (messageObj != null) {
            message = messageObj.toString();
        }
        if (typeObj != null) {
            type = typeObj.toString();
        }

        // The error reason is either the status code or exception type
        String reason = (code != null ? code : type);

        out.println("<HTML>");
        out.println("<HEAD><TITLE>" + reason + ": " + message + "</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("<H1>" + reason + "</H1>");
        out.println("<H2>" + message + "</H2>");
        out.println("<HR>");
        out.println("<I>Error accessing " + req.getRequestURI() + "</I>");
        out.println("</BODY></HTML>");
    }
}
