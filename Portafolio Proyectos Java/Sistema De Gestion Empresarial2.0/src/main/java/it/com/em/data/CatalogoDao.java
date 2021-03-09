package it.com.em.data;

import it.com.em.domain.Catalogo;
import org.springframework.data.repository.CrudRepository;


public interface CatalogoDao extends CrudRepository<Catalogo,Long>{
    
}
