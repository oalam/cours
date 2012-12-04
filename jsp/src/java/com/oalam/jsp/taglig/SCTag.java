/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oalam.jsp.taglig;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import nl.bitwalker.useragentutils.BrowserType;
import nl.bitwalker.useragentutils.UserAgent;

/**
 *
 * @author bailett
 */
public class SCTag extends TagSupport {

    /**
     * Called by the container to invoke this tag. 
     * The implementation of this method is provided by the tag library developer,
     * and handles all tag processing, body iteration, etc.
     */
    @Override
    public int doStartTag() throws JspException {
        try {
            //  JspWriter out = getJspContext().getOut();
            HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
            String agent = request.getHeader("User-Agent");

            Map<String, Object> requestParameters = new HashMap<String, Object>();
            UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));

            pageContext.getOut().println("<h1>plik</h1>");
            
            if(userAgent.getBrowser().getBrowserType() == BrowserType.WEB_BROWSER)
                pageContext.getOut().println("<p>web browser</p>");
            
            pageContext.getOut().println("<p>browser " + userAgent.getBrowser().getName() + "</p>");
            pageContext.getOut().println("<p>os " + userAgent.getOperatingSystem().getName() + "</p>");




        } catch (IOException ex) {
            Logger.getLogger(SCTag.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SKIP_BODY;
    }
}
