package it.com.em.web;

import it.com.em.service.GestionEmpleado;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/goEmp")
public class RedireccionarServlet extends HttpServlet{
    
    @Inject
    GestionEmpleado emp;
    
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
        req.getRequestDispatcher("/WEB-INF/agregarEmpleado.jsp").forward(req, res);
    }
}
