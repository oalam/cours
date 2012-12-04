package com.oalam.servlets.html;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

/**
 * This servlet shows how to use the reset() method to write and 
 * then clear content. It prints the default buffer size but to the log 
 * instead of the client so that it won’t be reset() away.
 * 
 * @author bailett
 */
public class Buffering extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setBufferSize(8 * 1024); // 8K buffer
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        int size = res.getBufferSize(); // returns 8096 or greater

        // Record the default size, in the log
        log("The default buffer size is " + size);

        out.println("The client won't see this");
        res.reset();
        out.println("Nor will the client see this!");
        res.reset();
        out.println("And this won't be seen if sendError() is called");
        if (req.getParameter("important_parameter") == null) {
            res.sendError(res.SC_BAD_REQUEST, "important_parameter needed");
        }
    }
}
