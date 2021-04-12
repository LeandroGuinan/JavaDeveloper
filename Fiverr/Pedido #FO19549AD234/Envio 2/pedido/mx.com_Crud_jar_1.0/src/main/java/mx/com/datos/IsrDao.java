package mx.com.datos;

import java.util.List;
import javax.persistence.*;
import mx.com.domain.Isr;

public class IsrDao {

    EntityManagerFactory emf;
    EntityManager em;
    
    public IsrDao(){
        this.emf = Persistence.createEntityManagerFactory("PU");
        this.em = emf.createEntityManager();
    }
    
    public List<Isr> listarIsr(){
        List<Isr> isrs= em.createNamedQuery("Isr.findAll").getResultList();
        return isrs;
    }
    
    public void insertarIsr(Isr isr){
        try{
            em.getTransaction().begin();
            em.persist(isr);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("Error en insertar Isr");
        }
    }
    
    public void modificarIsr(Isr isr){
        try{
            em.getTransaction().begin();
            em.merge(isr);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("Error en modificar Isr");
        }
    }
}
