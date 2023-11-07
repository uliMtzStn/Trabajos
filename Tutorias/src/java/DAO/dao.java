
package DAO;

import configuracion.conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.citas;
import modelo.usuario;

public class dao implements CRUD{
    conexion cn= new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
 
    @Override
    public boolean buscarUsuario(String nom, String pass) {
        boolean existe=false;
        usuario objusuario= new usuario();
     String sql="select * from alumnos where alumno='"+nom+"'and pass=MD5('"+pass+"')";
     
     try{
         con=cn.getConnection();
         ps=con.prepareStatement(sql);
         rs=ps.executeQuery();
         while(rs.next()){
             objusuario.setIdusuario(rs.getInt("idalumno"));
             objusuario.setNombreusuario(rs.getString("alumno"));
             existe=true;
         }
     }
    catch(Exception e){}
    return existe;
    }

    @Override
    public List listarProfesores() {
        ArrayList<usuario>lista=new ArrayList();
        String sql="select * from profesores";
     
        try{
         con=cn.getConnection();
         ps=con.prepareStatement(sql);
         rs=ps.executeQuery();
         while(rs.next()){
             usuario usu=new usuario();
             usu.setIdusuario(rs.getInt("idprofesor"));
             usu.setNombreusuario(rs.getString("profesor"));
             lista.add(usu); 
    }
}
        catch(Exception e){}
    return lista;
    }

    @Override
    public List listaCitas(String profesor) {
        ArrayList<citas>lista=new ArrayList<>();
        String sql="select * from profesores,citas,alumnos where profesor='"+profesor+"' and profesores.idprofesor=citas.idprofesor and alumnos.idalumno=citas.idalumno;";
     
        try{
         con=cn.getConnection();
         ps=con.prepareStatement(sql);
         rs=ps.executeQuery();
         while(rs.next()){
             citas objcita=new citas();
             objcita.setIdalumno(rs.getInt("idalumno"));
             objcita.setNomalumno(rs.getString("alumno"));
             objcita.setDia(rs.getString("dia"));
             objcita.setHora(rs.getString("hora"));
             objcita.setAsunto(rs.getString("asunto"));
             lista.add(objcita); 
    }
}
        catch(Exception e){}
    return lista;
    }

    @Override
    public boolean buscarProfesor(String usu, String pass) {
    boolean existe=false;
    usuario objusuario=new usuario();
    String sql="select* from profesores where profesor='"+usu+"' and pass=MD5("+pass+")";
   try{
         con=cn.getConnection();
         ps=con.prepareStatement(sql);
         rs=ps.executeQuery();
         while(rs.next()){
             objusuario.setIdusuario(rs.getInt("idprofesor"));
             objusuario.setNombreusuario(rs.getString("profesor"));
             existe=true; 
    }
}
        catch(Exception e){}
    return existe;
    }

    @Override
    public int buscaId(String alumno) {
    int id=0;
    String sql="select* from alumnos where alumno='"+alumno+"'";
    try{
         con=cn.getConnection();
         ps=con.prepareStatement(sql);
         rs=ps.executeQuery();
         while(rs.next()){
             id=rs.getInt("idalumno");
    }
}
        catch(Exception e){}
    return id;
    }

    @Override
    public void agregarCita(citas objcita) {
    String sql="insert into citas (idalumno, idprofesor, dia, hora, asunto) values ("+objcita.getIdalumno()+","+objcita.getIdprofesor()+",'"+objcita.getDia()+"','"+objcita.getHora()+"','"+objcita.getAsunto()+"')";    
    try{
         con=cn.getConnection();
         ps=con.prepareStatement(sql);
         ps.executeUpdate();
        
    }
    catch(Exception e){}
    }
    }