package com.oalam.servlets.basis;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "HelloFormServlet", urlPatterns = {"/HelloFormServlet", "/x" })
public class HelloForm extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("name");
        out.println("<HTML>");
        out.println("<HEAD><TITLE>Hello, " + name + "</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("Hello, " + name);
        
        String path = req.getServletPath();
        out.println("<p>" + path + "</p>");
        
        out.println("</BODY></HTML>");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        doGet(req, res);
    }

    @Override
    public String getServletInfo() {
        return "A servlet that knows the name of the person to whom it's"
                + "saying hello";
    }
}
