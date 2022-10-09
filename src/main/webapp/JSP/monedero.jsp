<%-- 
    Document   : monedero
    Created on : 06-oct-2022, 19:43:48
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Monedero</title>
        <link rel="stylesheet" href="../Styles/styleMonederoConCambio.css">

    </head>
    <body>
        <h1>Gestor de cambio al pagar</h1>
        <%
            //informacion necesaria
            double fentregado = Double.parseDouble(request.getParameter("entregado"));
            double fprecio =  Double.parseDouble(request.getParameter("precio"));
            double cambioTotal = fentregado - fprecio;            
            double cambio = cambioTotal;          
            cambioTotal = (double)Math.round(cambio * 100f) / 100f;         //redondeo a 2 cifras


            
            //logica billetes y monedas
            int contador500=0,contador200=0,contador100=0,contador50=0,contador20=0,contador10=0,
                    contador5=0,contador2=0,contador1=0,contador50cts=0,contador20cts=0,contador10cts=0,
                    contador5cts=0,contador2cts=0,contador1cts=0;
             
            if (cambio>0){      //condicion general                    
                while(cambio>=500) {
			cambio-=500;
			contador500++;
		}
		while(cambio>=200) {
			cambio-=200;
			contador200++;
		}
		while(cambio>=100) {
			cambio-=100;
			contador100++;
		}
		while(cambio>=50) {
			cambio-=50;
			contador50++;
		}
		while(cambio>=20) {
			cambio-=20;
			contador20++;
		}
		while(cambio>=10) {
			cambio-=10;
			contador10++;
		}
		while(cambio>=5) {
			cambio-=5;
			contador5++;
		}
		while(cambio>=2) {
			cambio-=2;
			contador2++;
		}
		while(cambio>=1) {
			cambio-=1;
			contador1++;
		}
		while(cambio>=0.50) {
			cambio-=0.50;
			contador50cts++;
		}
		while(cambio>=0.20) {
			cambio-=0.20;
			contador20cts++;
		}
		while(cambio>=0.10) {
			cambio-=0.10;
			contador10cts++;
		}
		while(cambio>=0.05) {
			cambio-=0.05;
			contador5cts++;
		}
		while(cambio>=0.02) {
			cambio-=0.02;
			contador2cts++;
		}
		while(cambio>=0.01) {
			cambio-=0.01;
			contador1cts++;
		}
                //logica billetes y monedas
%>


        <table>
        <tr>
            <%
                if (contador500>=1){
                    %>
                    <td> <img src="../IMG/500euros.png">
                        <p><%=contador500%></p>
                    </td> 
                    <%
                }
            %>
            <%
                if (contador200>=1){
                    %>
                    <td> <img src="../IMG/200euros.png">
                        <p><%=contador200%></p>
                    </td> 
                    <%
                }
            %>
            <%
                if (contador100>=1){
                    %>
                    <td> <img src="../IMG/100euros.png">
                        <p><%=contador100%></p>
                    </td> 
                    <%
                }
            %>
            <%
                if (contador50>=1){
                    %>
                    <td> <img src="../IMG/50euros.png">
                        <p><%=contador50%></p>
                    </td> 
                    <%
                }
            %>
            <%
                if (contador20>=1){
                    %>
                    <td> <img src="../IMG/20euros.png">
                        <p><%=contador20%></p>
                    </td> 
                    <%
                }
            %>
            <%
                if (contador10>=1){
                    %>
                    <td> <img src="../IMG/10euros.png">
                        <p><%=contador10%></p>
                    </td> 
                    <%
                }
            %>
            <%
                if (contador5>=1){
                    %>
                    <td> <img src="../IMG/5euros.png">
                        <p><%=contador5%></p>
                    </td> 
                    <%
                }
            %>
        </tr>    
        <tr> 
            <%
                if (contador2>=1){
                    %>
                    <td> <img src="../IMG/2euros.png">
                        <p><%=contador2%></p>
                    </td> 
                    <%
                }
            %>     
            <%
                if (contador1>=1){
                    %>
                    <td> <img src="../IMG/1euro.png">
                        <p><%=contador1%></p>
                    </td> 
                    <%
                }
            %>  
            <%
                if (contador50cts>=1){
                    %>
                    <td> <img src="../IMG/50cts.png">
                        <p><%=contador50cts%></p>
                    </td> 
                    <%
                }
            %>  
            <%
                if (contador20cts>=1){
                    %>
                    <td> <img src="../IMG/20cts.png">
                        <p><%=contador20cts%></p>
                    </td> 
                    <%
                }
            %>  
            <%
                if (contador10cts>=1){
                    %>
                    <td> <img src="../IMG/10cts.png">
                        <p><%=contador10cts%></p>
                    </td> 
                    <%
                }
            %>  
            <%
                if (contador5cts>=1){
                    %>
                    <td> <img src="../IMG/5cts.png">
                        <p><%=contador5cts%></p>
                    </td> 
                    <%
                }
            %>  
            <%
                if (contador2cts>=1){
                    %>
                    <td> <img src="../IMG/2cts.png">
                        <p><%=contador2cts%></p>
                    </td> 
                    <%
                }
            %> 
            <%
                if (contador1cts>=1){
                    %>
                    <td> <img src="../IMG/1cts.png">
                        <p><%=contador1cts%></p>
                    </td> 
                    <%
                }
            %>      
        </tr>  
    </table>
        <br><br>
                <h3>Total a devolver: <%=cambioTotal%>€</h3>
                     
        <% 
            }else{          //else general
            if(cambio<0){
                %>
                <h3>Vaya, parece que falta dinero...</h3>
                <%
            }else if(cambio==0){
                %>
                <h3>Has pagado exacto</h3>
                <%
            }
        }                   //cierre else general
        %>
        
        <a href="../HTML/monedero.html">Volver a la aplicacion</a>
        <br>
        <a href="../index.html">Volver al menú principal</a>
    </body>
</html>