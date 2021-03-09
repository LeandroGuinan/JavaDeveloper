package it.com.em.service;

import it.com.em.domain.Empleado;
import java.util.List;
import javax.ejb.Local;

@Local
public interface EmpleadoService {
    
    
    public List<Empleado> getListaDeEmpleados();
}
