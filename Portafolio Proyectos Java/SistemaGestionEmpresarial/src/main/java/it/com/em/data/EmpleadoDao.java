package it.com.em.data;

import it.com.em.domain.Empleado;
import java.util.List;

public interface EmpleadoDao {

    public List<Empleado> findAllEmpleado();
    
    public Empleado findEmpleadoByID(Empleado empleado);
    
    public void insertEmpleado(Empleado empleado);
    
    public void updateEmpleado(Empleado empleado);
    
    public void deleteEmpleado(Empleado empleado);
}
