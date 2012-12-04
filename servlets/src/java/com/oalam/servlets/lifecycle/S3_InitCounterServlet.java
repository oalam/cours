package com.oalam.servlets.lifecycle;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * This servlet counts and displays the number of times it has been accessed,
 * and reads an init parameter to know what at what number to begin counting.
 * 
 * @author bailett
 */
public class S3_InitCounterServlet extends HttpServlet {

    int count;

    @Override
    public void init() throws ServletException {
        String initial = getInitParameter("initial");
        try {
            count = Integer.parseInt(initial);
        } catch (NumberFormatException e) {
            count = 0;
        }
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/plain");
        PrintWriter out = res.getWriter();
        count++;
        out.println("Since loading (and with a possible initialization");
        out.println("parameter figured in), this servlet has been accessed");
        out.println(count + " times.");
    }
}
