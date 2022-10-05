/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sergio
 */
@WebServlet(name = "FormularioValidado", urlPatterns = {"/FormularioValidado"})
public class FormularioValidado extends HttpServlet {

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
           
            /*
            //PRUEBAS
            //creacion de mapa para guardar la info introducida
            HashMap <String, String> verInfoIntroducida = new HashMap <String, String>();                       
            Map <String, String[]> datos = request.getParameterMap();                
            for(Map.Entry<String, String[]> entrada: datos.entrySet()){ 
                 if(!entrada.getKey().startsWith("envi")){
                      for (String info: entrada.getValue()) {
                        verInfoIntroducida.put(entrada.getKey(), info);        //guardando info introducida en mi mapa
                    } 
                 }                                                   
            }            
            //probar datos introducidos
            out.println(verInfoIntroducida); 
            out.println("<br><br>");
            //probar datos introducidos
            //PRUEBAS
            */
            
                 
            //condicion para entrar en la pagina de mostrar los datos
            if(request.getParameter("nombre").length()==0 || request.getParameter("usuario").length()==0 || request.getParameter("contrasena").length()<6){

             
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"es\">");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");           
            out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");           
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");           
            out.println("<title>Formulario Validado</title>");            
            out.println("<link rel=\"stylesheet\" href=\"Styles/styleFormularioValidado.css\">");                      
            out.println("</head>");
            out.println("<body>");
            out.println("<form id=\"formulario\" action=\"./FormularioValidado\" method=\"post\">");
                       
            
            //logica de recuento de errores
                        //obligatorios
            if(request.getParameter("nombre").length()==0){               
            out.println("<p>Debes introcudir un Nombre</p>");
            }
            if(request.getParameter("usuario").length()==0){
            out.println("<p>Debes introcudir un Usuario</p>");
            }        
            if(request.getParameter("contrasena").length()<6){
            out.println("<p>Contraseña no valida</p>");
            } 
                         //obligatorios

                         
                        //validar meses
            if (request.getParameter("mes").equals("2")) {      //validacion febrero
                if (request.getParameter("dia").equals("31")) {
                    out.println("<p>Fecha incorrecta(mes)</p>");
                }               
            }
             if (request.getParameter("mes").equals("2")) {      //validacion febrero
                if (request.getParameter("dia").equals("30")) {
                    out.println("<p>Fecha incorrecta(mes)</p>");
                }               
            }
            if (request.getParameter("mes").equals("4")) {      //validacion abril
                if (request.getParameter("dia").equals("31")) {
                    out.println("<p>Fecha incorrecta(mes)</p>");
                }                                                                           //ninguno de estos meses tiene 31 dias
            }
            if (request.getParameter("mes").equals("6")) {      //validacion junio
                if (request.getParameter("dia").equals("31")) {
                    out.println("<p>Fecha incorrecta(mes)</p>");
                }               
            }
            if (request.getParameter("mes").equals("9")) {      //validacion septiembre
                if (request.getParameter("dia").equals("31")) {
                    out.println("<p>Fecha incorrecta(mes)</p>");
                }               
            }
            if (request.getParameter("mes").equals("11")) {     //validacion noviembre
                if (request.getParameter("dia").equals("31")) {
                    out.println("<p>Fecha incorrecta(mes)</p>");
                }               
            }
            
            
                        //validacion bisiestos
            
            int castingDia = Integer.parseInt(request.getParameter("dia"));
            if (request.getParameter("anio").equals("2001")) {     
                if (request.getParameter("mes").equals("2")) {
                    if (castingDia >= 29) {
                      out.println("<p>Fecha incorrecta(año)</p>");                    
                    }                    
                }               
            }
            if (request.getParameter("anio").equals("2002")) {     
                if (request.getParameter("mes").equals("2")) {
                    if (castingDia >= 29) {
                      out.println("<p>Fecha incorrecta(año)</p>");
                    }                    
                }               
            }
            if (request.getParameter("anio").equals("2003")) {     
                if (request.getParameter("mes").equals("2")) {
                    if (castingDia >= 29) {
                      out.println("<p>Fecha incorrecta(año)</p>");
                    }                    
                }               
            }            
            if (request.getParameter("anio").equals("2005")) {     
                if (request.getParameter("mes").equals("2")) {
                    if (castingDia >= 29) {
                      out.println("<p>Fecha incorrecta(año)</p>");
                    }                    
                }               
            }
            if (request.getParameter("anio").equals("2006")) {     
                if (request.getParameter("mes").equals("2")) {
                    if (castingDia >= 29) {
                      out.println("<p>Fecha incorrecta(año)</p>");
                    }                    
                }               
            }
            if (request.getParameter("anio").equals("2007")) {     
                if (request.getParameter("mes").equals("2")) {
                    if (castingDia >= 29) {
                      out.println("<p>Fecha incorrecta(año)</p>");
                    }                    
                }               
            }
            if (request.getParameter("anio").equals("2009")) {     
                if (request.getParameter("mes").equals("2")) {
                    if (castingDia >= 29) {
                      out.println("<p>Fecha incorrecta(año)</p>");
                    }                    
                }               
            }
            if (request.getParameter("anio").equals("2010")) {     
                if (request.getParameter("mes").equals("2")) {
                    if (castingDia >= 29) {
                      out.println("<p>Fecha incorrecta(año)</p>");
                    }                    
                }               
            }
            if (request.getParameter("anio").equals("2011")) {     
                if (request.getParameter("mes").equals("2")) {
                    if (castingDia >= 29) {
                      out.println("<p>Fecha incorrecta(año)</p>");
                    }                    
                }               
            }
            if (request.getParameter("anio").equals("2013")) {     
                if (request.getParameter("mes").equals("2")) {
                    if (castingDia >= 29) {
                      out.println("<p>Fecha incorrecta(año)</p>");
                    }                    
                }               
            }
            if (request.getParameter("anio").equals("2014")) {     
                if (request.getParameter("mes").equals("2")) {
                    if (castingDia >= 29) {
                      out.println("<p>Fecha incorrecta(año)</p>");
                    }                    
                }               
            }
            if (request.getParameter("anio").equals("2015")) {     
                if (request.getParameter("mes").equals("2")) {
                    if (castingDia >= 29) {
                      out.println("<p>Fecha incorrecta(año)</p>");
                    }                    
                }               
            }
            if (request.getParameter("anio").equals("2017")) {     
                if (request.getParameter("mes").equals("2")) {
                    if (castingDia >= 29) {
                      out.println("<p>Fecha incorrecta(año)</p>");
                    }                    
                }               
            }
            if (request.getParameter("anio").equals("2018")) {     
                if (request.getParameter("mes").equals("2")) {
                    if (castingDia >= 29) {
                      out.println("<p>Fecha incorrecta(año)</p>");
                    }                    
                }               
            }
            if (request.getParameter("anio").equals("2019")) {     
                if (request.getParameter("mes").equals("2")) {
                    if (castingDia >= 29) {
                      out.println("<p>Fecha incorrecta(año)</p>");
                    }                    
                }               
            }
            if (request.getParameter("anio").equals("2021")) {     
                if (request.getParameter("mes").equals("2")) {
                    if (castingDia >= 29) {
                      out.println("<p>Fecha incorrecta(año)</p>");
                    }                    
                }               
            }
            if (request.getParameter("anio").equals("2022")) {     
                if (request.getParameter("mes").equals("2")) {
                    if (castingDia >= 29) {
                      out.println("<p>Fecha incorrecta(año)</p>");
                    }                    
                }               
            }
            //logica de recuento de errores
                         
            
            //Informacion Personal
            out.println("<fieldset>");           
            out.println("<h3>Informacion Personal</h3>");           
            out.println("<label for=\"nombre\">*Nombre</label>");           
            out.println("<input type=\"text\" id=\"nombre\" name=\"nombre\" value=\"" + request.getParameter("nombre") + "\" >");           
            out.println("<br><br>");           
            out.println("<label for=\"apellidos\">Apellidos</label>");           
            out.println("<input type=\"text\" id=\"apellidos\" name=\"apellidos\" value=\"" + request.getParameter("apellidos") + "\">");           
            out.println("<p> Sexo:");     
                
             
            //logica radio sexo
            if(request.getParameter("sexo").equals("hombre")){
            out.println("<input type=\"radio\" id=\"hombre\" name=\"sexo\" checked=\"checked\" value=\"hombre\" >");
            out.println("<label for=\"hombre\">Hombre</label>");
            
            out.println("<input type=\"radio\" id=\"mujer\" name=\"sexo\" value=\"mujer\" >");           
            out.println("<label for=\"mujer\">Mujer</label>");           
            }else{
                out.println("<input type=\"radio\" id=\"hombre\" name=\"sexo\" value=\"hombre\">");
                out.println("<label for=\"hombre\">Hombre</label>");
            
                out.println("<input type=\"radio\" id=\"mujer\" name=\"sexo\" checked=\"checked\" value=\"mujer\">");
                out.println("<label for=\"mujer\">Mujer</label>");
            }
            //logica radio sexo
         
            
            out.println("</p>");           
            out.println("<p>");           
            out.println("<label for=\"fechaNac\">Fecha de nacimiento: </label>");           
            out.println("<select name=\"dia\" id=\"dia\">");              
            out.println("<option value="+request.getParameter("dia")+">"+request.getParameter("dia")+"</option>");           
            out.println("<option value=\"1\">1</option>");           
            out.println("<option value=\"2\">2</option>");           
            out.println("<option value=\"3\">3</option>");           
            out.println("<option value=\"4\">4</option>");           
            out.println("<option value=\"5\">5</option>");           
            out.println("<option value=\"6\">6</option>");           
            out.println("<option value=\"7\">7</option>");           
            out.println("<option value=\"8\">8</option>");           
            out.println("<option value=\"9\">9</option>");           
            out.println("<option value=\"10\">10</option>");           
            out.println("<option value=\"11\">11</option>");           
            out.println("<option value=\"12\">12</option>");           
            out.println("<option value=\"13\">13</option>");           
            out.println("<option value=\"14\">14</option>");           
            out.println("<option value=\"15\">15</option>");           
            out.println("<option value=\"16\">16</option>");           
            out.println("<option value=\"17\">17</option>");           
            out.println("<option value=\"18\">18</option>");           
            out.println("<option value=\"19\">19</option>");           
            out.println("<option value=\"20\">20</option>");           
            out.println("<option value=\"21\">21</option>");           
            out.println("<option value=\"22\">22</option>");           
            out.println("<option value=\"23\">23</option>");           
            out.println("<option value=\"24\">24</option>");           
            out.println("<option value=\"25\">25</option>");           
            out.println("<option value=\"26\">26</option>");           
            out.println("<option value=\"27\">27</option>");           
            out.println("<option value=\"28\">28</option>");           
            out.println("<option value=\"29\">29</option>");           
            out.println("<option value=\"30\">30</option>");           
            out.println("<option value=\"31\">31</option>");           
            out.println("</select>");           
            out.println("/");           
            out.println("<select name=\"mes\" id=\"mes\">");    
            out.println("<option value="+request.getParameter("mes")+">"+request.getParameter("mes")+"</option>");
            out.println("<option value=\"1\">1</option>");           
            out.println("<option value=\"2\">2</option>");           
            out.println("<option value=\"3\">3</option>");           
            out.println("<option value=\"4\">4</option>");           
            out.println("<option value=\"5\">5</option>");           
            out.println("<option value=\"6\">6</option>");           
            out.println("<option value=\"7\">7</option>");           
            out.println("<option value=\"8\">8</option>");           
            out.println("<option value=\"9\">9</option>");           
            out.println("<option value=\"10\">10</option>");           
            out.println("<option value=\"11\">11</option>");           
            out.println("<option value=\"12\">12</option>");           
            out.println("</select>");      
            out.println("/");           
            out.println("<select name=\"anio\" id=\"anio\">");                            
            out.println("<option value="+request.getParameter("anio")+">"+request.getParameter("anio")+"</option>");
            out.println("<option value=\"2000\">2000</option>");           
            out.println("<option value=\"2001\">2001</option>");           
            out.println("<option value=\"2002\">2002</option>");           
            out.println("<option value=\"2003\">2003</option>");           
            out.println("<option value=\"2004\">2004</option>");           
            out.println("<option value=\"2005\">2005</option>");           
            out.println("<option value=\"2006\">2006</option>");           
            out.println("<option value=\"2007\">2007</option>");           
            out.println("<option value=\"2008\">2008</option>");           
            out.println("<option value=\"2009\">2009</option>");           
            out.println("<option value=\"2010\">2010</option>");           
            out.println("<option value=\"2011\">2011</option>");           
            out.println("<option value=\"2012\">2012</option>");           
            out.println("<option value=\"2013\">2013</option>");           
            out.println("<option value=\"2014\">2014</option>");           
            out.println("<option value=\"2015\">2015</option>");           
            out.println("<option value=\"2016\">2016</option>");           
            out.println("<option value=\"2017\">2017</option>");           
            out.println("<option value=\"2018\">2018</option>");           
            out.println("<option value=\"2019\">2019</option>");           
            out.println("<option value=\"2020\">2020</option>");           
            out.println("<option value=\"2021\">2021</option>");           
            out.println("<option value=\"2022\">2022</option>");           
            out.println("</select>");           
            out.println("</p>");           
            out.println("<br>");     
            
            
                    //Datos de acceso                                               
            out.println("<h3>Datos de acceso</h3>");           
            out.println("<label for=\"usuario\">*Usuario</label>");          
            out.println("<input type=\"text\" id=\"usuario\" name=\"usuario\" placeholder=\"Ej: CRosado_07\" value=\"" + request.getParameter("usuario") + "\">");           
            out.println("<br><br>");           
            out.println("<label for=\"contrasena\">*Contraseña</label>");           
            out.println("<input type=\"password\" id=\"contrasena\" name=\"contrasena\" value=\"" + request.getParameter("contrasena") + "\">");           
            out.println("<br><br><br>");
            
            
                    //Informacion general
            out.println("<h3>Informacion general</h3>");           
            out.println("<p>Preferencias:</p>");
           
            out.println("<input type=\"checkbox\" id=\"deportes\" name=\"preferencias\" value=\"deportes\">");           
            out.println("<label for=\"deportes\">Deportes</label>");           
            out.println("<input type=\"checkbox\" id=\"lectura\" name=\"preferencias\" value=\"lectura\">");           
            out.println("<label for=\"lectura\">Lectura</label>");           
            out.println("<input type=\"checkbox\" id=\"cine\" name=\"preferencias\" value=\"cine\">");            
            out.println("<label for=\"cine\">Cine</label>");
            out.println("<input type=\"checkbox\" id=\"viajes\" name=\"preferencias\"value=\" viajes\">");
            out.println("<label for=\"viajes\">Viajes</label>");

                    //Botones de enviar y limpiar
            out.println("<br><br>");
            out.println("<input type=\"submit\" name=\"enviar\" value=\"Enviar\">");
            out.println("<input type=\"reset\" name=\"limpiar\" value=\"Limpiar\">");
            out.println("</fieldset>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
            
            
        }else{//cierre de la condicion de los campos obligatorios
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"es\">");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");           
            out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");           
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");           
            out.println("<title>Datos correctos</title>");            
            out.println("<link rel=\"stylesheet\" href=\"Styles/styleFormularioValidado.css\">");                      
            out.println("</head>");
            out.println("<body>");           
            out.println("<h3>Datos correctamente enviados</h3>");
                      
            Enumeration<String> parametros = request.getParameterNames();
                while (parametros.hasMoreElements()) {
                    String nombre = parametros.nextElement();
                    if (!nombre.startsWith("env")) {
                        if (!nombre.startsWith("preferencias")) {
                            out.println(nombre + "-<b>" + request.getParameter(nombre) + "</b> </br>");
                        } else {
                            String[] valores = request.getParameterValues(nombre);
                            for (String datosMostrar : valores) {
                                out.println(nombre + "-<b>" + datosMostrar + "</b> </br>");
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
        processRequest(request, response);
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
        processRequest(request, response);
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