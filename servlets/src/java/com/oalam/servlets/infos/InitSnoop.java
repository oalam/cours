package com.oalam.servlets.infos;

import java.io.*;
import java.util.*;
import javax.servlet.*;

/**
 * This servlet prints the name and value for all of its init parameters.
 * 
 * @author bailett
 */
public class InitSnoop extends GenericServlet {

    // No init() method needed
    @Override
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/plain");
        PrintWriter out = res.getWriter();

        out.println("Init Parameters:");
        Enumeration myEnum = getInitParameterNames();
        while (myEnum.hasMoreElements()) {
            String name = (String) myEnum.nextElement();
            out.println(name + ": " + getInitParameter(name));
        }
    }
}
