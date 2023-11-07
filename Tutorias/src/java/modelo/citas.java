package modelo;


public class citas {
    int idalumno;
    int idprofesor;
    String nomalumno;
    String dia;
    String hora;
    String asunto;

    public citas(int idalumno, int idprofesor, String dia, String hora, String asunto) {
        this.idalumno = idalumno;
        this.idprofesor = idprofesor;
        this.dia = dia;
        this.hora = hora;
        this.asunto = asunto;
    }

    
    public citas() {
    }

    public citas(String dia, String hora, String asunto) {
        this.dia = dia;
        this.hora = hora;
        this.asunto = asunto;
    }

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public int getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(int idprofesor) {
        this.idprofesor = idprofesor;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getNomalumno() {
        return nomalumno;
    }

    public void setNomalumno(String nombrealumno) {
        this.nomalumno = nombrealumno;
    }
    
    
}
