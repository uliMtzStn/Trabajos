/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;

import java.sql.Connection;
import java.sql.DriverManager;


public class conexion { 
    
    Connection con;
    public conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_tutorias","root","");    
        }
        catch(Exception e){
            System.err.println("Error"+e);
                    }
        }
    public Connection getConnection(){
        return con;
    }
}  