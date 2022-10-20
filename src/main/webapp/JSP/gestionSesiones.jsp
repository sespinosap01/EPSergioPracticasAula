

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestion de Sesiones</title>
    <link rel="stylesheet" href="../Styles/styleGestionCookies.css">
</head>

<body>
    <h3>Gestion de Sesiones</h3>
    <form action="./gestionSesionesBack.jsp">
        <fieldset>
            <br>
            <label for="nombre">Nombre de la Sesion </label>
            <input type="text" name="nombre" id="nombre">
            <br><br>
            <label for="valor">Valor de la Sesion </label>
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
