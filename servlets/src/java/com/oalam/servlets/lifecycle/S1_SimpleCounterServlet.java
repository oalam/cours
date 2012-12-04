package com.oalam.servlets.lifecycle;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


/**
 * This servlet counts and displays the number of times 
 * it has been accessed since the last server reboot.
 * 
 * @author bailett
 */
public class S1_SimpleCounterServlet extends HttpServlet {

    int count = 0;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/plain");
        PrintWriter out = res.getWriter();
        count++;
        out.println("Since loading, this servlet has been accessed "
                + count + " times.");
    }
}
