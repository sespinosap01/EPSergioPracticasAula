<%-- 
    Document   : numerosPrimos
    Created on : 04-oct-2022, 17:12:03
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Numeros Primos</title>
    </head>
    <body>
        <h1>Numeros primos del 1 al 100</h1>       
       <%
      for(int i=1;i<=100;i++){
			int contador=0;
			for(int x=1;x<=i;x++){
				if(i%x==0){
					contador++;
				}
			}
			if(contador==2){
        %>
        <span><%=i%></span>
        <%
			}
		}
        %>      
    </body>
</html>
