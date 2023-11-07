/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.crud;

import Modelo.usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author monse
 */
public class usuarioDAO implements crud {
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public boolean buscaUsuario(String nom, String pass) {
        boolean existe=false;
        usuario objusuario= new usuario();
        String sql="select * from usuario where nombre='"+nom+"'and pass=MD5('"+pass+"')";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                objusuario.setIdusuario(rs.getInt("id_usuario"));
                objusuario.setNomusuario(rs.getString("nombre"));
                existe=true;
                
            }
        }
        catch(Exception e){}
        return existe;
   
      
        
    }

    @Override
    public void AgregarUsuario(String nom, String pass) {
       String sql="insert into usuario (nombre,pass) values('"+nom+"', MD5('"+pass+"'))";
       
	try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
             
              
        }
        catch(Exception e){}
    }

    @Override
    public List listar() {
        ArrayList<usuario>list=new ArrayList<>();
        String sql="select * from usuario";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                usuario usu=new usuario();
                usu.setIdusuario(rs.getInt("id_usuario"));
                usu.setNomusuario(rs.getString("nombre"));
                
                list.add(usu);
            
            }
        }
        catch(Exception e){}
        return list;
    }

    
    
}
