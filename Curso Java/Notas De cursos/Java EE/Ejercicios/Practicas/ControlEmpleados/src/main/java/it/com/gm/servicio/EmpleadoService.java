package it.com.gm.servicio;

import it.com.gm.domain.Empleado;
import java.util.List;
import javax.ejb.Local;

@Local
public interface EmpleadoService {
    
    public List<Empleado> encontrarEmpleados();
    
    public Empleado encontrarEmpleadoPorId(Empleado empleado);
    
    public void insertarEmpleado(Empleado empleado);
    
    public void updateEmpleado(Empleado empleado);
    
    public void eliminarEmpleado(Empleado empleado);
}
