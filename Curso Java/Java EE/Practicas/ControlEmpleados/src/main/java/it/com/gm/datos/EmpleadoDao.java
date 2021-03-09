package it.com.gm.datos;

import it.com.gm.domain.Empleado;
import java.util.List;

public interface EmpleadoDao {

    public List<Empleado> findAllEmpleado();
    
    public Empleado findEmpleadoById(Empleado empleado);
    
    public void insertEmpleado(Empleado empleado);
    
    public void updateEmpleado(Empleado empleado);
    
    public void deleteEmpleado(Empleado empleado);
}
