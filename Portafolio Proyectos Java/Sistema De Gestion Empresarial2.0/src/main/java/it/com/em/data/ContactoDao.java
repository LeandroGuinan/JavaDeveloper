package it.com.em.data;

import it.com.em.domain.Contacto;
import org.springframework.data.repository.CrudRepository;


public interface ContactoDao extends CrudRepository<Contacto,Long>{
    
}
