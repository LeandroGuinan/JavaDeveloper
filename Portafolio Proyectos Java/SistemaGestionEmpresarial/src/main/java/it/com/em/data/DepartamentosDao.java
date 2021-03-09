package it.com.em.data;

import it.com.em.domain.Departamentos;
import java.util.List;

public interface DepartamentosDao {

    public List<Departamentos> findAllDepartamentos();
    
    public Departamentos findDepartamentosByID(Departamentos departamento);
    
    public void updateDepartamentos(Departamentos departamento);
    
    public void deleteDepartamento(Departamentos departamento);
}
