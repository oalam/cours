package com.oalam.servlets.html;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * This servlet performs a random redirect, sending a client to a random site
 * selected from its site list. Depending on the site list, a servlet like
 * this could have many uses. As it stands now, 
 * it's just a jump-off point to a selection of cool servlet sites. 
 * With a site list containing advertising images, it can be used to select
 * the next ad banner.
 * 
 * @author bailett
 */
public class SiteSelector extends HttpServlet {

    List<String> sites = new ArrayList<String>();
    Random random = new Random();

    @Override
    public void init() throws ServletException {
        sites.add("http://www.oreilly.com/catalog/jservlet");
        sites.add("http://www.servlets.com");
        sites.add("http://java.sun.com/products/servlet");
        sites.add("http://www.newInstance.com");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        int siteIndex = Math.abs(random.nextInt()) % sites.size();
        String site = sites.get(siteIndex);

        res.setStatus(res.SC_MOVED_TEMPORARILY);
        res.setHeader("Location", site);
    }
}
