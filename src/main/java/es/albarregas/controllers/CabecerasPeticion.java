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
@WebServlet(name = "CabecerasPeticion", urlPatterns = {"/CabecerasPeticion"})
public class CabecerasPeticion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CabecerasPeticion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CabecerasPeticion at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
          Enumeration<String> cabeceras = request.getHeaderNames();
          String [] traduccion = {"Anfitrion de la pagina", "Estado de la conexion ", "Version del navegador", "Version Movil", "Plataforma ", "Solicitudes inseguras de actualización", "Identificador de usuario", "Accept", "Origen Solicitud", "Modo Solicutud", "Usuarios Solicitud", "Destino Solicutud", "Referencia", "Codificación", "Idioma"};
         try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Cabeceras</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Cabeceras de petición</h1>");          
            for (int i = 0; i < traduccion.length; i++) {
                    String nombreEspanol = traduccion[i];
                    String nombre = cabeceras.nextElement();
                    out.println("<p><b>" + nombreEspanol + "</b> ---> " + request.getHeader(nombre) + "</p>");
                }
            
            //arreglar
            //String nombre= request.getParameter("nombre");
            out.println("<p>" + request.getParameter("nombre") + "</p>");           
            out.println("<p><a href=\".\">Volver</a></p>");
            out.println("</body>");
            out.println("</html>");
        }
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
