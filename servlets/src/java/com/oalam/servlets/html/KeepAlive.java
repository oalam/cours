package com.oalam.servlets.html;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * This servlet enables persistent connections (keep-alive) 
 * using the new built-in servlet ability to buffer its output.
 * 
 * @author bailett
 */
public class KeepAlive extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");

        // Ask for a 16K byte response buffer; do not set the content length
        res.setBufferSize(16 * 1024);

        PrintWriter out = res.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("<BIG>Less than 16K of response body</BIG>");
        out.println("</BODY></HTML>");
    }
}
