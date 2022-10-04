<%-- 
    Document   : holaMundo
    Created on : 04-oct-2022, 16:55:17
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola Mundo</title>
    </head>
    <body>
        <%
            String var= "HolaMundo";    
        %>
                
        <h1><%=var%></h1>
        
        <%
            for (int i = 0 ; i<100 ; i+=2){
        %>
        <span><%=i%></span>
        <%
            }
        %>
    </body>
</html>
