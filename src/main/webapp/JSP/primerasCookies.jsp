<%-- 
    Document   : primerasCookies
    Created on : 10-oct-2022, 16:23:00
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URLDecoder"%>


<%
            Cookie cookie = null;
            Boolean existe = false;
            
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (int i = 0; i < cookies.length; i++) {
                    if (cookies[i].getName().equals("nombreConCookie")) {
                        cookie = cookies[i];
                        break;
                    }
                }
               
             
            if (cookie == null) {
                cookie = new Cookie("nombreConCookie", URLEncoder.encode("Sergio Espinosa", "UTF-8"));
            } else {
                existe = true;
            }
            
            
            cookie.setMaxAge(3600); //Un dia en segundos
            response.addCookie(cookie);
            
            
            String persona = "";
            if (existe) {
                persona = "Hola " + URLDecoder.decode(cookie.getValue(), "UTF-8");
            } else {
                persona = "Todavia no tenemo datos tuyos";
            }

%>




<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Primeras Cookies</title>
    </head>
    <body>
        <h1><%=persona%></h1>
    </body>
</html>
