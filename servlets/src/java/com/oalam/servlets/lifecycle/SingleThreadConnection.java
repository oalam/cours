package com.oalam.servlets.lifecycle;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SingleThreadConnection extends HttpServlet
        implements SingleThreadModel {

    Connection con = null;  // database connection, one per pooled instance

    @Override
    public void init() throws ServletException {
        // Establish the connection for this instance
        try {
            con = establishConnection();
            con.setAutoCommit(false);
        } catch (SQLException e) {
            throw new ServletException(e.getMessage());
        }
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/plain");
        PrintWriter out = res.getWriter();

        try {
            // Use the connection uniquely assigned to this instance
            Statement stmt = con.createStatement();

            // Update the database any number of ways

            // Commit the transaction
            con.commit();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ignored) {
            }
        }
    }

    @Override
    public void destroy() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ignored) {
            }
        }
    }

    private Connection establishConnection() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
