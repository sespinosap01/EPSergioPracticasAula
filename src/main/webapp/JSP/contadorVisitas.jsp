<%-- 
    Document   : contadorVisitas
    Created on : 10-oct-2022, 16:50:03
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URLDecoder"%>

<%
            Cookie cookie = null;

            Cookie[] cookies = request.getCookies();

            if (cookies != null) {
                for (int i = 0; i < cookies.length; i++) {
                    if (cookies[i].getName().equals("contador")) {
                        cookie = cookies[i];
                        break;
                    }
                }
            }

            if (cookie == null) {
                cookie = new Cookie("contador", "0");
            } else {
                cookie.setValue("0");
            }

            int contador = Integer.parseInt(cookie.getValue());
            cookie.setValue(Integer.toString(contador + 1));
            cookie.setMaxAge(3600);
            response.addCookie(cookie);
        %>
        
        


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contador de visitas</title>
    </head>
    <body>
        <%
            if (cookie.getValue().equals("1")) {
        %>
            <h1>Info de la cookie</h1>
            <%=contador%>
            <br><br>
        <%
            }
        %>

        
        
        <button value="Recargar" name="recargar"><a href="./contadorVisitas.jsp">Recargar</a></button>
        
    </body>
</html>
