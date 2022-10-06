<%-- 
    Document   : saludoUsuario
    Created on : 04-oct-2022, 23:10:30
    Author     : Sergio
--%>

<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.time.LocalTime"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%-- Condicion para enviar formulario --%>
        <% 
        if(request.getParameter("enviar") == null){
        %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Saludo a usuario</title>
        <link rel="stylesheet" href="../Styles/styleFormularioValidado.css">
    </head>
    <body>
         
        <h3>Saludo a usuario</h3>
        <form action="./saludoUsuario.jsp">
        <fieldset>
        <br>
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" id="nombre">
        <p> Sexo:
            <input type="radio" id="hombre" name="sexo" value="hombre" checked="">
            <label for="hombre">Hombre</label>

            <input type="radio" id="mujer" name="sexo" value="mujer">
            <label for="mujer">Mujer</label>
        </p>
        <input type="submit" name="enviar" value="Enviar">
        <input type="reset" name="limpiar" value="Limpiar">
        </fieldset>

        </form>
    </body>
</html>

        <%
        }else {               
        %>
<!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Saludo a usuario</title>
            <link rel="stylesheet" href="../Styles/styleFormularioValidado.css">
        </head>
    <body>
        <br><br>
        <%
            String valorNombre = request.getParameter("nombre");
            String valorSexo = request.getParameter("sexo");
            
        Calendar calendario = Calendar.getInstance();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);      
        switch (valorSexo){
            case "hombre":
                if (hora >= 6 && hora < 12){
                %>
                <h1>Buenos dias señor <%=valorNombre%></h1>
                    <%                 
                }
                if (hora >= 12 && hora < 20){
                %>
                <h1>Buenas tardes señor <%=valorNombre%></h1>
                    <%                 
                }
                if (hora >= 20 && hora <=24 && hora <6 ){
                %>
                <h1>Buenas noches señor <%=valorNombre%></h1>
                    <% 
                }
                break;

            case "mujer":
                if (hora >= 6 && hora < 12){
                %>
                <h1>Buenos dias señora <%=valorNombre%></h1>
                    <%
                }
                if (hora >= 12 && hora < 20){
                %>
                <h1>Buenas tardes señora <%=valorNombre%></h1>
                    <%
                }
                if (hora >= 20 && hora <=24 && hora <6 ){
                %>
                <h1>Buenas noches señora <%=valorNombre%></h1>
                    <%                 
                }
                break;
            default:
        }         
        %>
    </body>
    </html>
        <%
        }              
        %> <%-- Cierre de condicion para mandar formulario --%>      