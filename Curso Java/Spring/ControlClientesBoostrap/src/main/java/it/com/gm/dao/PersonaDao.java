package it.com.gm.dao;

import it.com.gm.domain.Persona;
import org.springframework.data.repository.CrudRepository;



public interface PersonaDao extends CrudRepository<Persona,Long>{
    
    
}
