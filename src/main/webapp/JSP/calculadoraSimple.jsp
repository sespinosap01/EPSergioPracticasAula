<%-- 
    Document   : calculadoraSimple
    Created on : 06-oct-2022, 12:03:03
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    if(request.getParameter("enviar")==null){           
%>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora Simple</title>
    <link rel="stylesheet" href="../Styles/styleCalculadoraSimple.css">
</head>

<body>
    <form action="./calculadoraSimple.jsp">
        <fieldset>
            <h3>Calculadora Simple</h3>
            <label for="num1">Numero 1: </label>
            <input type="text" name="num1" id="num1"><br><br>
            <label for="num2">Numero 2: </label>
            <input type="text" name="num2" id="num2"> 

            <br><br>
            <input type="radio" id="sumar" name="calculo" value="sumar" checked="checked">
            <label for="sumar">Sumar</label>

            <input type="radio" id="restar" name="calculo" value="restar">
            <label for="sumar">Restar</label>

            <input type="radio" id="multiplicar" name="calculo" value="multiplicar">
            <label for="sumar">Multiplicar</label>

            <input type="radio" id="dividir" name="calculo" value="dividir">
            <label for="sumar">Dividir</label>
            <br><br>

            <input type="submit" name="enviar" value="Enviar">
            <input type="reset" name="limpiar" value="Limpiar">
            <br><br>
            <a href="#">Volver al menu</a>
        </fieldset>
    </form>

</body>

</html>
<%
    }else{
%>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora Simple</title>
    <link rel="stylesheet" href="../Styles/styleCalculadoraSimple.css">
</head>

<body>
    <h1>He llegado</h1>
    
</body>

</html>


<%
    }
%>