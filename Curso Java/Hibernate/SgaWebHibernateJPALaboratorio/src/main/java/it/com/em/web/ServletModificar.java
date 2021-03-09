package it.com.em.web;

import it.com.em.domain.Alumno;
import it.com.em.domain.Contacto;
import it.com.em.domain.Domicilio;
import it.com.em.servicio.ServicioAlumno;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletModificar")
public class ServletModificar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String idAlumnoS = req.getParameter("idAlumno");

        Integer idAlumno = Integer.parseInt(idAlumnoS);

        Alumno alumno = new Alumno();
        alumno.setIdAlumno(idAlumno);

        ServicioAlumno servicioAlumno = new ServicioAlumno();
        alumno = servicioAlumno.encontrarAlumno(alumno);
        HttpSession sesion = req.getSession();
        sesion.setAttribute("alumno", alumno);
        req.getRequestDispatcher("/WEB-INF/modificarAlumno.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        ServicioAlumno servicioAl = new ServicioAlumno();
        String modificar = req.getParameter("Modificar");

        if (modificar != null) {

            String nombre = req.getParameter("nombre");
            String apellido = req.getParameter("apellido");
            String calle = req.getParameter("calle");
            String noCalle = req.getParameter("noCalle");
            String pais = req.getParameter("pais");
            String email = req.getParameter("email");
            String telefono = req.getParameter("telefono");

            HttpSession session = req.getSession();

            Alumno alumno = (Alumno) session.getAttribute("alumno");
            alumno.setNombre(nombre);
            alumno.setApellido(apellido);
            alumno.getIdDomicilio().setCalle(calle);
            alumno.getIdDomicilio().setNoCalle(noCalle);
            alumno.getIdDomicilio().setPais(pais);
            alumno.getIdContacto().setEmail(email);
            alumno.getIdContacto().setTelefono(telefono);

            
            servicioAl.guardarAlumno(alumno);

            session.removeAttribute("alumno");
        } else {
            String idAlumnoS = req.getParameter("idAlumno");
            Integer idAlumno = Integer.parseInt(idAlumnoS);
            Alumno alumno = new Alumno(idAlumno);
            servicioAl.elimnarAlumno(alumno);
        }
        req.getRequestDispatcher("/index.jsp").forward(req, res);
    }
}
