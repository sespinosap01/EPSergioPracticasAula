<%-- 
    Document   : creacionYBorradoCookiesBack
    Created on : 10-oct-2022, 17:49:04
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
                    if (cookies[i].getName().equals(request.getParameter("nombre"))) {
                        cookie = cookies[i];
                        break;
                    }
                }
            }
            
            switch(request.getParameter("accion")){
                case "Crear":
                    if(cookie==null){
                        cookie = new Cookie(request.getParameter("nombre"), URLEncoder.encode(request.getParameter("valor"), "UTF-8"));
                        response.addCookie(cookie);
                    }else{
                        %>
                        <p>La cookie ya existe</p>
                        <%        
                        response.sendRedirect(request.getContextPath() + "/jsp/creacionYBorradoCookies");
                    }
                    break;
                    
                case "Borrar":
                    if(cookie==null){
                    %>
                        <p>La cookie no existe</p>
                    <%
                    }else if(request.getParameter("nombre").length()>0){
                        cookie.setMaxAge(0);
                        response.addCookie(cookie);

                    }else{
                    %>
                        <p>Debes introducir un nombre para eliminar la cookie</p>
                    <%
                    }
                    break;
                                   
                case "Modificar":
                     if(cookie==null){
                    %>
                        <p>La cookie no existe</p>
                    <%
                    }else if(request.getParameter("nombre").length()>0){
                    cookie.setValue(URLEncoder.encode(request.getParameter("valor"), "UTF-8"));
                    response.addCookie(cookie);

                    }else{
                    %>
                        <p>Debes introducir un nombre para modifiar la cookie</p>
                    <%
                    }
                    break;

                    case "Visualizar":
                     if(cookie==null){
                    %>
                        <p>La cookie no existe</p>
                    <%
                    }else if(request.getParameter("nombre").length()>0){
                    //mensaje para visualizarla
                    }else{
                    %>
                        <p>Debes introducir un nombre para visualizar la cookie</p>
                    <%
                    }
                    break;
            }
           
            
            
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cookies</title>
    </head>
    <body>
        <h1></h1>
    </body>
</html>
