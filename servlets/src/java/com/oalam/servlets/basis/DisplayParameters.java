package com.oalam.servlets.basis;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.awt.Toolkit;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "DisplayParameters", urlPatterns = {"/DisplayParameters"})
public class DisplayParameters extends HttpServlet {

    private static final String CONTENT_TYPE = "text/html";
    String path;

    /**Initialize global variables*/
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        ServletContext con = config.getServletContext();
        //Get the full path for the src directory 
        path = con.getRealPath("/");
        
        

    }

    /**Process the HTTP Get request*/
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Javaside.com : Servlet samples</title></head>");
        out.println("<body>");
        out.println("<p align=\"center\"><table bgcolor=\"#D0F0FF\"><tr><td>");
        out.println("<p>The servlet has received a GET. This is the reply.</p>");
        out.println(printData(request));
        out.println("</td></tr></table></p>");
        out.println("</body></html>");
        request.setAttribute("user", out);
        /*request.getRequestDispatcher("/header.jsp").include(request, response);
        request.getRequestDispatcher("/createUser.jsp").forward(request, response);*/
    }

    /**Process the HTTP Post request*/
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Javaside.com : Servlet samples</title></head>");
        out.println("<body>");
        out.println("<p align=\"center\"><table bgcolor=\"#D0F0FF\"><tr><td>");
        out.println("<p>The servlet has received a POST. This is the reply.</p>");
        out.println(printData(request));
        out.println("</td></tr></table></p>");
        out.println("</body></html>");
    }

    public String printData(HttpServletRequest request) {
        String str =
                "--> Path : " + path + "<br>"
                + "--> queryString : " + request.getQueryString() + "<br>"
                + "--> ContentType : " + request.getContentType() + "<br>"
                + "--> RemoteUser  : " + request.getRemoteUser() + "<br>"
                + "--> ServerName  : " + request.getServerName() + "<br>";

        // Headers Liste 
        str = str + "<table width=\"100%\" border=\"1\" bgcolor=\"#F0F0FF\">"
                + "<tr><th colspan=\"2\">Headers</th></tr>";
        Enumeration e = request.getHeaderNames();
        while (e.hasMoreElements()) {
            String s = (String) e.nextElement();
            str = str + "<tr><td>" + s + "</td><td>" + request.getHeader(s) + "</td></tr>";
        }
        str = str + "</table><br>";


        // Parameters Liste 
        str = str + "<table width=\"100%\" border=\"1\" bgcolor=\"#F0FFF0\">"
                + "<tr><th colspan=\"2\">Parameters</th></tr>";
        e = request.getParameterNames();
        while (e.hasMoreElements()) {
            String s = (String) e.nextElement();
            str = str + "<tr><td>" + s + "</td><td>" + request.getParameter(s) + "</td></tr>";
        }
        str = str + "</table><br>";


        // Fonts Liste 
        String[] arFont = Toolkit.getDefaultToolkit().getFontList();
        str = str + "<table width=\"100%\" border=\"1\" bgcolor=\"#F0FFF0\">"
                + "<tr><th>Fonts</th></tr>";
        for (int i = 0; i < arFont.length; i++) {
            str = str + "<tr><td>" + arFont[i] + "</td></tr>";
        }
        str = str + "</table><br>";

        return str;

    }

    /**Clean up resources*/
    @Override
    public void destroy() {
    }
}
