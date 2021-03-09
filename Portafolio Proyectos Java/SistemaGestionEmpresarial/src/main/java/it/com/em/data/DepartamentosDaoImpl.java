package it.com.em.data;

import it.com.em.domain.Departamentos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DepartamentosDaoImpl implements DepartamentosDao{
    
    @PersistenceContext(name="SGEPU")
    EntityManager em;

    @Override
    public List<Departamentos> findAllDepartamentos() {
        return em.createNamedQuery("Departamentos.findAll").getResultList();
    }

    @Override
    public Departamentos findDepartamentosByID(Departamentos departamento) {
        return em.find(Departamentos.class, departamento.getIdDepartamentos());
    }

    @Override
    public void updateDepartamentos(Departamentos departamentos) {
        em.merge(departamentos);
    }

    @Override
    public void deleteDepartamento(Departamentos departamento) {
        em.remove(em.merge(departamento));
    }
    
}
