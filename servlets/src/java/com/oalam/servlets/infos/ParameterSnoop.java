package com.oalam.servlets.infos;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * This servlet prints its query string, 
 * then prints the name and value for all its parameters.
 * 
 * @author bailett
 */
public class ParameterSnoop extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/plain");
        PrintWriter out = res.getWriter();

        out.println("Query String:");
        out.println(req.getQueryString());
        out.println();

        out.println("Request Parameters:");
        Enumeration myEnum = req.getParameterNames();
        while (myEnum.hasMoreElements()) {
            String name = (String) myEnum.nextElement();
            String values[] = req.getParameterValues(name);
            if (values != null) {
                for (int i = 0; i < values.length; i++) {
                    out.println(name + " (" + i + "): " + values[i]);
                }
            }
        }
    }
}
