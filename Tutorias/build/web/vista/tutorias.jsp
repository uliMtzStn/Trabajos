

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="modelo.usuario"%>
<%@page import="DAO.dao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Servlet" method="POST">
        <%
            String usu=request.getParameter("txtusu");
            usuario objusu=new usuario();
            dao objdao=new dao();
            int id=objdao.buscaId(usu);
            List<usuario>list=objdao.listarProfesores();
            Iterator<usuario>iter=list.iterator();
            usuario profesor=null;
            %>
        <h1>Tutorias</h1>
        <hr>
        
        <label>Alumno tutorado</label><br>
        <input type="text" name="txtalumno" value="<%=usu%>" readonly="readonly">
        <input type="text" name="idalumno" value="<%=id%>">
        <br><br>
        <label>Profesor tutor</label>
        <select name="idprofesor">
            <%
                while(iter.hasNext()){
                    profesor=iter.next();
                %>
                <option value="<%=profesor.getIdusuario()%>"><%=profesor.getIdusuario()%><%=profesor.getNombreusuario()%></option>
            <%}%>
            <option></option>
        </select><br><br>
        <label>Dia</label><br>
        <select name="dia">
            <option>Lunes</option>
            <option>Martes</option>
            <option>Miercoles</option>
        </select><br><br>
        <label>Hora</label><br>
        <input type="radio" name="hora" value="10" checked="true"><label>10</label>
        <input type="radio" name="hora" value="12"><label>12</label>
        <input type="radio" name="hora" value="14"><label>14</label>
        <input type="radio" name="hora" value="10"><label>16</label>
        <br>
        <label>Asunto</label><br>
        <textarea name="asunto" tows="5" cols="40"></textarea>
        <br>
        <br>
        <hr>
        <input type="submit" name="accion" value="agendar"/>
        <hr>
        </form>
    </body>
</html>
