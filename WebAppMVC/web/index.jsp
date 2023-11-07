<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> 
    <center>
        <h1>Autenticación</h1>
        <hr>
   
        <form action="Servlet" method="POST">
         <label>correo:</label><br>
            <input type="text" name="txtusu" value="" /><br>
            <label>contraseña:</label><br>
            <input type="password" name="txtpass" value="" /><br>
            <br>
            <input type="submit" name="accion" value="registrar" />
            <input type="submit" name="accion" value="entrar" />
        </form>
        <hr>
    </center>
    </body>
</html>
