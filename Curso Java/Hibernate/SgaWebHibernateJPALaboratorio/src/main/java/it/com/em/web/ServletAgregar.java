package it.com.em.web;

import it.com.em.domain.Alumno;
import it.com.em.domain.Contacto;
import it.com.em.domain.Domicilio;
import it.com.em.servicio.ServicioAlumno;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletAgregar")
public class ServletAgregar extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String calle = req.getParameter("calle");
        String noCalle = req.getParameter("noCalle");
        String pais = req.getParameter("pais");
        String email = req.getParameter("email");
        String telefono = req.getParameter("telefono");
        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle(calle);
        domicilio.setNoCalle(noCalle);
        domicilio.setPais(pais);
        
        Contacto contacto = new Contacto();
        contacto.setEmail(email);
        contacto.setTelefono(telefono);
        
        Alumno alumno = new Alumno(nombre,apellido,contacto,domicilio);
        ServicioAlumno servicioAl = new ServicioAlumno();
        servicioAl.guardarAlumno(alumno);
        
        req.getRequestDispatcher("/index.jsp").forward(req, res);
    }
}
