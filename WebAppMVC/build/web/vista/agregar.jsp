<%-- 
    Document   : agregar
    Created on : 13/09/2023, 09:36:31 AM
    Author     : 52444
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Agregar nuevos usuarios</h1>
        <hr>
        <form action="Servlet" method="POST">
           <label>nombre usuario:</label><br> <input type="text" name="txtusu" value="" /><br>
            <label>contraseña:</label><br> <input type="password" name="txtpass" value="" /><br>
            <label>confirmar contraseña:</label><br> <input type="password" name="txtconfirmapass" value="" /><br><br>
            <input type="submit" name="accion" value="agregar" />
        </form>
        <hr>
      </center>
    </body>
</html>
