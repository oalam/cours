package com.oalam.servlets.infos;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * This servlet prints the extra path information it receives 
 * and the resulting translation to a real path. 
 * 
 * @author bailett
 */
public class FileLocation extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/plain");
        PrintWriter out = res.getWriter();

        if (req.getPathInfo() != null) {
            out.println("The file \"" + req.getPathInfo() + "\"");
            out.println("Is stored at \"" + req.getPathTranslated() + "\"");
        } else {
            out.println("Path info is null, no file to lookup");
        }
    }
}
