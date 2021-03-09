package it.com.em.web;

import it.com.em.domain.Empleado;
import it.com.em.service.GestionEmpleado;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getEmp")
public class EntradaEmpleadoServlet extends HttpServlet{
    
    @Inject
    GestionEmpleado emp;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        List<Empleado> empleados = emp.listarEmpleados();
        req.setAttribute("emps", empleados);
        req.getRequestDispatcher("/WEB-INF/empleados.jsp").forward(req, res);
    }
}
