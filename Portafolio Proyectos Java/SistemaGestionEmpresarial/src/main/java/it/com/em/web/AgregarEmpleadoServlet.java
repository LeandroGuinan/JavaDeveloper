package it.com.em.web;

import it.com.em.domain.Contacto;
import it.com.em.domain.Departamentos;
import it.com.em.domain.Direccion;
import it.com.em.domain.Empleado;
import it.com.em.service.GestionEmpleado;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submitEmp")
public class AgregarEmpleadoServlet extends HttpServlet{
    
    @Inject
    GestionEmpleado ge;
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        String idDepS = req.getParameter("idDep");
        Integer idDep = Integer.parseInt(idDepS);
        Departamentos dep = new Departamentos(idDep);
        
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String sueldoS = req.getParameter("sueldo");
        Double sueldo = Double.parseDouble(sueldoS);
        
        String telefono = req.getParameter("telefono");
        String email = req.getParameter("email");
        Contacto cn = new Contacto(telefono,email);
        
        String calle = req.getParameter("calle");
        String pais = req.getParameter("pais");
        Direccion dir = new Direccion(calle,pais);
        Empleado emp = new Empleado(nombre,apellido,sueldo,cn,dep,dir);
        
        ge.insertarEmpleado(emp);
        req.getRequestDispatcher("/WEB-INF/empleado.jsp").forward(req, res);
        
    }
}
