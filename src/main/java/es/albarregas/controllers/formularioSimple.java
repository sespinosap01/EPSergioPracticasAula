/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sergio
 */
@WebServlet(name = "FormularioSimple", urlPatterns = {"/FormularioSimple"})
public class FormularioSimple extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, boolean correcto)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Formulario Simple</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Formulario Simple</h1>");
            out.println("<h2>Datos introducidos en el formulario</h2>");
            if (!correcto) {
                out.println("<p>No se han introducido datos</p>");
            } else{
                Enumeration<String> parametros = request.getParameterNames();
                while (parametros.hasMoreElements()) {
                    String nombre = parametros.nextElement();
                    if (!nombre.startsWith("env")) {
                        if (!nombre.startsWith("marca")) {
                            out.println(nombre + "-<strong>" + request.getParameter(nombre) + "</strong> </br>");
                        } else {
                            String[] valores = request.getParameterValues(nombre);
                            for (String valor : valores) {
                                out.println(nombre + "-<strong>" + valor + "</strong> </br>");
                            }
                        }
                    }
                }
                out.println("</body>");
                out.println("</html>");
            }
        }
    }

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean correcto = false;
        processRequest(request, response, correcto);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean correcto = true;
        processRequest(request, response, correcto);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
