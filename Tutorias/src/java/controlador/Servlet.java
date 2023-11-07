package controlador;

import DAO.dao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.citas;
import modelo.usuario;


@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {
    dao objDAO= new dao();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("regresar")){
            acceso="index.jsp";
        }
        RequestDispatcher vista= request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso="";
        boolean encontrado=false;
       String action=request.getParameter("accion");
       //processRequest(request, response);
       if(action.equalsIgnoreCase("entrar")){
       String usu=request.getParameter("txtusu");
       String pass=request.getParameter("txtpass");
       String tipo=request.getParameter("tipo");
       
       if(tipo.equalsIgnoreCase("Alumno")){
           encontrado=objDAO.buscarUsuario(usu, pass);
           if(encontrado){acceso="vista/tutorias.jsp";}
           else{acceso="index.jsp";}
       }
       else if(tipo.equalsIgnoreCase("Profesor")){
           encontrado=objDAO.buscarProfesor(usu, pass);
           if(encontrado){acceso="vista/conscitas.jsp";}
           else{acceso="index.jsp";}
       }
       }
       else if(action.equalsIgnoreCase("agendar")){
       int idalumno=Integer.parseInt(request.getParameter("idalumno"));
       int idprofesor=Integer.parseInt(request.getParameter("idprofesor"));
       String dia=request.getParameter("dia");
       String hora=request.getParameter("hora");
       String asunto=request.getParameter("asunto");
       citas objcita=new citas(idalumno, idprofesor, dia, hora, asunto);
       objDAO.agregarCita(objcita);
       acceso="index.jsp";
       
       
    }
       RequestDispatcher vista= request.getRequestDispatcher(acceso);
       vista.forward(request, response);
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
