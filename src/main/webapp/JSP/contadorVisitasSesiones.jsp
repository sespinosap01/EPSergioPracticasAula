<%-- 
    Document   : contadorVisitasSesiones
    Created on : 11-oct-2022, 17:02:48
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contador visitas sesiones</title>
    </head>
    <body>
        
       <%
         Integer visitas = (Integer)application.getAttribute("contador");
         if( visitas ==null || visitas == 0 ) {
            visitas = 1;
         } else {
            visitas += 1;
         }
         application.setAttribute("contador", visitas);
        %>
      <form action="./contadorVisitasSesiones.jsp">
          <p>Total de visitas: <%= visitas%></p>
          <input type="submit" value="Sumar visita" name="boton">
          <input type="submit" value="Borrar" name="boton">
      </form>                      
    </body>
</html>
