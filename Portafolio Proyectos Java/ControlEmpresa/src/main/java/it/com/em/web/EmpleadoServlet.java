package it.com.em.web;

import it.com.em.domain.Empleado;
import it.com.em.service.EmpleadoService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/empleados")
public class EmpleadoServlet extends HttpServlet{
    
    @Inject
    EmpleadoService empleadoService;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Empleado> empleados = new ArrayList<>();
        
        empleados = empleadoService.getListaDeEmpleados();
        
        req.setAttribute("empleados", empleados);
        req.getRequestDispatcher("/listaEmpleados.jsp").forward(req, resp);
    }
    
    
}
