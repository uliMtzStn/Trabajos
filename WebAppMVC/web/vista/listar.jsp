<%-- 
    Document   : listar
    Created on : 18/09/2023, 11:06:18 PM
    Author     : 52444
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.usuario"%>
<%@page import="ModeloDAO.usuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Usuarios en el sistema</h1>
          <table border="1" width="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NOMBRE</th>
                    </tr>
                </thead>
                <%
                    usuarioDAO dao=new usuarioDAO();
                    List<usuario>list=dao.listar();
                    Iterator<usuario>iter=list.iterator();
                    usuario usu=null;
                    while(iter.hasNext()){
                        usu=iter.next();
                   
                    
                
                %>
                <tbody>
                    <tr>
                        <td><%=usu.getIdusuario()%></td>
                        <td><%=usu.getNomusuario()%></td>
                       
                    </tr>
                   <% }%>
                </tbody>
            </table>
    </body>
</html>
