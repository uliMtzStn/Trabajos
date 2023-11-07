package modelo;


public class usuario {
    int idusuario;
    String nombreusuario;
    String password;  
    
    public usuario() {
    } 
    
    public usuario(int idusuario, String nombreusuario, String password) {
        this.idusuario = idusuario;
        this.nombreusuario = nombreusuario;
        this.password = password;
    }
    
    public int getIdusuario() {
        return idusuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public String getPassword() {
        return password;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public void setPassword(String password) {
        this.password = password;
    } 
}