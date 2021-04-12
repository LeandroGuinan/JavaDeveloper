package mx.com.datos;

import java.util.List;
import javax.persistence.*;
import mx.com.domain.Empleado;

public class EmpleadoDao {

    EntityManagerFactory emf;
    EntityManager em;

    public EmpleadoDao() {
        this.emf = Persistence.createEntityManagerFactory("PU");
        this.em = emf.createEntityManager();
    }

    public List<Empleado> listarEmpleados() {
        List<Empleado> empleados = em.createNamedQuery("Empleado.findAll").getResultList();
        return empleados;
    }
    
    public void insertarEmpleado(Empleado empleado){
        try{
            em.getTransaction().begin();
            em.persist(empleado);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("Error en eliminar empleado");
        }
    }
    
    public void modificarEmpleado(Empleado empleado){
        try{
            em.getTransaction().begin();
            em.merge(empleado);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("Error en eliminar empleado");
        }
    }
    
    public void eliminarEmpleado(Empleado empleado){
        try{
            em.getTransaction().begin();
            em.remove(em.merge(empleado));
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("Error en eliminar empleado");
        }
    }
}
