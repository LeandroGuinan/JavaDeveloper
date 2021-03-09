package it.com.em.data;

import it.com.em.domain.Departamentos;
import org.springframework.data.repository.CrudRepository;

public interface DepartamentosDao extends CrudRepository<Departamentos,Long>{
    
}
