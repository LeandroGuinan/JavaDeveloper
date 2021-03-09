package it.com.em.service;

import it.com.em.data.DepartamentosDao;
import it.com.em.domain.Departamentos;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class GestionDepartamentoImpl implements GestionDepartamento{
    
    @Inject
    DepartamentosDao dep;

    @Override
    public List<Departamentos> listarDepartamentos() {
        return dep.findAllDepartamentos();
    }

    @Override
    public void modificarDepartamento(Departamentos departamentos) {
        dep.updateDepartamentos(departamentos);
    }
}
