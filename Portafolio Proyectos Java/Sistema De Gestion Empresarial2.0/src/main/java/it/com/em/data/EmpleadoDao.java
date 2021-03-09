package it.com.em.data;

import it.com.em.domain.Empleado;
import org.springframework.data.repository.CrudRepository;


public interface EmpleadoDao extends CrudRepository<Empleado,Long>{
    
}
