
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
    <h1>Tutorias</h1>
    <hr>
    <form action="Servlet" method="POST">
        <label >Usuario</label><br>
        <input type="text" name="txtusu" value=""><br>
        <label >Password</label><br>
        <input type="password" name="txtpass" value=""><br><br>
            <select name="tipo">
                <option>Profesor</option>
                <option>Alumno</option>
            </select><br><br>
        <input type="submit" name="accion" value="entrar">
        
   <hr>
    </form>
    </center>
    </body>
</html>
