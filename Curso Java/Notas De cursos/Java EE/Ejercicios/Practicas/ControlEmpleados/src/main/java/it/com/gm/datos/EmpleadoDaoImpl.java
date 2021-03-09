package it.com.gm.datos;

import it.com.gm.domain.Empleado;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EmpleadoDaoImpl implements EmpleadoDao{
    
    @PersistenceContext(name="ControlClientes")
    EntityManager em;

    @Override
    public List<Empleado> findAllEmpleado() {
        return em.createNamedQuery("Empleado.findAll").getResultList();
    }

    @Override
    public Empleado findEmpleadoById(Empleado empleado) {
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
        em.remove(empleado);
    }
    
    
}
