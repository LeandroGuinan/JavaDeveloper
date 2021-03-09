package it.com.em.web;

import it.com.em.dao.AlumnoDao;
import it.com.em.domain.Alumno;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alumnos")
public class ServletAlumno extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AlumnoDao alumnoDao = new AlumnoDao();
        List<Alumno> alumnos = alumnoDao.listarAlumnos();
        req.setAttribute("alumnos", alumnos);
        req.getRequestDispatcher("/alumnos.jsp").forward(req, resp);
    }
    
    
}
