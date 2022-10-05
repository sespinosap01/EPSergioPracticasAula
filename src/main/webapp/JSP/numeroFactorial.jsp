<%-- 
    Document   : numeroFactorial
    Created on : 04-oct-2022, 17:40:49
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Numero Factorial</title>
    </head>
    <body>
        <h1>Numero Factorial</h1>
         <%
            long numero = 4;
            int factorial = 1;
            for( int i = 1; i <= numero; i++ ) {
            factorial *= i;
            }
        %>
        <span>El factorial de <%=numero%> es: <%=factorial%></span>
    </body>
</html>
