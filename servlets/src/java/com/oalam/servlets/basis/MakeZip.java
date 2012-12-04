/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oalam.servlets.basis;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bailett
 */
@WebServlet(name = "ZipServlet", urlPatterns = {"/ZipServlet"})
public class MakeZip extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            byte b[] = new byte[300000];

            URL url;
            String temp;

            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            ZipOutputStream zout = new ZipOutputStream(bout);
            //ServletOutputStream out = response.getOutputStream(); 
            ServletContext servletContext = getServletContext();

            if ((temp = request.getParameter("url")) != null) {
                try {
                    url = new URL(temp);
                    URLConnection uc = url.openConnection();

                    DataInputStream input = new DataInputStream(uc.getInputStream());

                    int numRead = 0;
                    int size = 0;

                    while (numRead != -1) {
                        numRead = input.read(b, size, 20000);
                        size += numRead;
                    }

                    zout.putNextEntry(new ZipEntry("file.html"));
                    zout.write(b, 0, size);
                    zout.closeEntry();
                    zout.finish();
                    String zip = bout.toString();

                    response.setContentType("application/zip");
                    response.setHeader("Content-Disposition", "inline; filename=output.zip;");

                    out.println(zip);
                    out.flush();

                } catch (Exception e) {
                    response.setContentType("text/html");
                    out.println("<html><head><title>Error</title></head>");
                    out.println("<body><b>");
                    out.println("An error has occured while processing " + temp + "<br>");
                    out.println("Here is the exception: <br>" + e + "<br>");
                    e.printStackTrace(new PrintWriter(out));
                    out.println("</body>");
                    out.println("</html>");
                }
            }
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
