<%-- 
    Document   : calcularEdad
    Created on : 05-oct-2022, 20:19:46
    Author     : Sergio
--%>

<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    if(request.getParameter("enviar")==null){
        
    
%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calcular Edad</title>
    <link rel="stylesheet" href="../Styles/styleCalcularEdad.css">
</head>

<body>
    <form action="./calcularEdad.jsp">
        <fieldset>
            <h3>Calcular Edad</h3>
            <label for="nombre">Nombre: </label>
            <input type="text" name="nombre" id="nombre">
            <br><br>
            <label for="fechaNac">Fecha de nacimiento: </label>
            <input type="date" name="fechaNac" id="fechaNac">
            <br><br>
            <input type="submit" name="enviar" value="Enviar">
            <input type="reset" name="limpiar" value="limpiar">
        </fieldset>
    </form>

</body>
</html>
<% 
} else{
%>                                     <%-- else de la condicion para enviar el formulario--%>
<html>
    <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mostrar Edad</title>
    <link rel="stylesheet" href="../Styles/styleCalcularEdad.css">
</head>

<body>
    <h3>Mostrando datos introducidos</h3>
    <%
        LocalDate fechaLocal = LocalDate.now();
        String fechaNacimiento = request.getParameter("fechaNac");
        
    %> 
    <p><%=fechaNacimiento%></p>
    <p><%=fechaLocal%></p>


</body>
</html>



<%
    }
%>                                                 <%-- cierre else general--%>