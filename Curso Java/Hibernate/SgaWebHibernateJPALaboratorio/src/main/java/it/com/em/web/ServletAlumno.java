package it.com.em.web;

import it.com.em.domain.Alumno;
import it.com.em.servicio.ServicioAlumno;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/alumnos")
public class ServletAlumno extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServicioAlumno servicioAlumno = new ServicioAlumno();
        List<Alumno> alumnos = servicioAlumno.listarAlumnos();
        req.setAttribute("alumnos", alumnos);
        req.getRequestDispatcher("/WEB-INF/alumnos.jsp").forward(req, resp);
    }
    
    
}
