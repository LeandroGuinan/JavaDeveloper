package it.com.em.service;

import it.com.em.domain.Empleado;
import java.util.List;
import javax.ejb.Local;

@Local
public interface GestionEmpleado {
    
    public List<Empleado> listarEmpleados();
    
    public void insertarEmpleado(Empleado empleado);
    
    public void eliminarEmpleado(Empleado empleado);
}
