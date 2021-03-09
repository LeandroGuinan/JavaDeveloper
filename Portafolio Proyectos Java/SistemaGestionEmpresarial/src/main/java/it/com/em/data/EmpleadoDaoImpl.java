package it.com.em.data;

import it.com.em.domain.Empleado;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EmpleadoDaoImpl implements EmpleadoDao{
    
    @PersistenceContext(name="SGEPU")
    EntityManager em;

    @Override
    public List<Empleado> findAllEmpleado() {
        return em.createNamedQuery("Empleado.findAll").getResultList();
    }

    @Override
    public Empleado findEmpleadoByID(Empleado empleado) {
        return em.find(Empleado.class, empleado.getIdEmpleado());
    }

    @Override
    public void insertEmpleado(Empleado empleado) {
        em.persist(empleado);
    }

    @Override
    public void updateEmpleado(Empleado empleado) {
        em.merge(empleado);
    }

    @Override
    public void deleteEmpleado(Empleado empleado) {
        em.remove(em.merge(empleado));
    }
}
