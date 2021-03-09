package it.com.em.service;

import it.com.em.domain.Departamentos;
import java.util.List;
import javax.ejb.Local;

@Local
public interface GestionDepartamento {
    
    public List<Departamentos> listarDepartamentos();
    
    public void modificarDepartamento(Departamentos departamentos);
    
}
