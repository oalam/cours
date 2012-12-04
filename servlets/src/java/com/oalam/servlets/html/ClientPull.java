package com.oalam.servlets.html;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * This servlet shows a servlet that uses client pull
 * to display the current time, updated every 10 seconds.
 * 
 * @author bailett
 */
public class ClientPull extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/plain");
        PrintWriter out = res.getWriter();

        res.setHeader("Refresh", "10");
        out.println(new Date().toString());
    }
}
