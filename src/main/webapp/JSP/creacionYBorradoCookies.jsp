<%-- 
    Document   : creacionYBorradoCookies
    Created on : 11-oct-2022, 11:30:35
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestion de Cookies</title>
    <link rel="stylesheet" href="../Styles/styleGestionCookies.css">
</head>

<body>
    <h3>Gestion de Cookies</h3>
    <form action="./creacionYBorradoCookiesBack.jsp">
        <fieldset>
            <br>
            <label for="nombre">Nombre de la Cookie: </label>
            <input type="text" name="nombre" id="nombre">
            <br><br>
            <label for="valor">Valor de la Cookie: </label>
            <input type="text" name="valor" id="valor">
            <br><br>

            <input type="submit" value="Crear" name="accion">
            <input type="submit" value="Eliminar" name="accion">
            <input type="submit" value="Modificar" name="accion">
            <input type="submit" value="Visualizar" name="accion">
            
            <%
                String mensajes;
            %>

        </fieldset>
    </form>
</body>
</html>
