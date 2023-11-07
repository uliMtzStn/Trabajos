<%-- 
    Document   : sistema
    Created on : 7/09/2023, 01:14:44 AM
    Author     : 52444
--%>

<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido al sistema!
        <% 
           
            String usu=request.getParameter("txtusu");
            out.println(usu);%>
        </h1>    
        <%
            HttpSession sesion = request.getSession();
            out.println("Creación: "+sesion.getCreationTime()+"<br>"); 
            Date momento=new Date(sesion.getCreationTime()); 
            out.println("Creación: "+momento+"<br>");
            Date acceso=new Date(sesion.getLastAccessedTime()); 
            out.println("Último acceso: "+acceso+"<br>"); 
            sesion.setAttribute("txtusu",usu);
            
        %>
        
        <div>
            <h2>
            <a href="Servlet?accion=listar">listar usuarios</a></h2>
        </div>
       
    </body>
</html>
