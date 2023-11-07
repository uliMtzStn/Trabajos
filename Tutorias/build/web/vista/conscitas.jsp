

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modelo.usuario"%>
<%@page import="modelo.citas"%>
<%@page import="DAO.dao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%String tutor=request.getParameter("txtusu");%>
        <h1>Citas</h1>
        <hr>
        <label>Tutor:</label>
        <input type="text" name="txtTutor" value="<%=tutor%>" readonly="readonly" />
        <h2>Agendas</h2>
        <table border="1">
            <thead>
                <tr>
                    <th>N°</th>
                    <th>Tutorado</th>
                    <th>Dia</th>
                    <th>Hora</th>
                    <th>Asunto</th> 
                </tr>
            </thead>  
                <%
                dao objdao=new dao();
                usuario objusu=new usuario();
                List <citas> list=objdao.listaCitas(tutor);
                Iterator<citas>iter=list.iterator();
                citas objcita=null;
                while(iter.hasNext()){
                    objcita=iter.next();
%>
<tbody>
                <tr>
                    <td><%=objcita.getIdalumno()%></td>
                    <td><%=objcita.getNomalumno()%></td>
                    <td><%=objcita.getDia()%></td>  
                    <td><%=objcita.getHora()%></td>  
                    <td><%=objcita.getAsunto()%></td>  
                </tr>
                <% }%>
</tbody>
        </table>
        <hr>
    </body>
</html>
