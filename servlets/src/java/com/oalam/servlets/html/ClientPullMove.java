package com.oalam.servlets.html;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * This servlet redirects requests for one host to another host, 
 * giving an explanation to the client before the redirection.
 * 
 * @author bailett
 */
public class ClientPullMove extends HttpServlet {

    static final String NEW_HOST = "http://www.oreilly.com";

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String newLocation = NEW_HOST + req.getRequestURI();

        res.setHeader("Refresh", "10; URL=" + newLocation);

        out.println("The requested URI has been moved to a different host.<BR>");
        out.println("Its new location is " + newLocation + "<BR>");
        out.println("Your browser will take you there in 10 seconds.");
    }
}
