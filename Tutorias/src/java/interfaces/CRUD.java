package interfaces;

import java.util.List;
import modelo.citas;


public interface CRUD {
    public boolean buscarUsuario(String nom, String pass);
    public List listarProfesores();
    public List listaCitas(String profesor);
    public boolean buscarProfesor(String usu, String pass);
    public int buscaId(String alumno);
    public void agregarCita(citas objcita);
}
