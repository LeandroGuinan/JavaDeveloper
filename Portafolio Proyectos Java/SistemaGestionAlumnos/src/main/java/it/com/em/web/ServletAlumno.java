package it.com.em.web;

import it.com.em.domain.Alumno;
import it.com.em.service.SgaService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AlumnoServlet")
public class ServletAlumno extends HttpServlet{
    
    @Inject
    SgaService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Alumno> alumnos = service.listarAlumnos();
        req.setAttribute("alumnos", alumnos);
        req.getRequestDispatcher("/listaAlumnos.jsp").forward(req, resp);
    }
    
    
    
}
