/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oalam.servlets.filtering;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

/**
 *
 * @author bailett
 */
@WebFilter(filterName = "TimerFilter", urlPatterns = {"/*"})
public class TimerFilter implements javax.servlet.Filter {

    private FilterConfig filterConfig;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws java.io.IOException, javax.servlet.ServletException {
        long start = System.currentTimeMillis();
        System.out.println("Milliseconds in: " + start);
        chain.doFilter(request, response);
        long end = System.currentTimeMillis();
        System.out.println("Milliseconds out: " + end);
    }

    @Override
    public void init(final FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

    @Override
    public void destroy() {
        filterConfig = null;
    }
}