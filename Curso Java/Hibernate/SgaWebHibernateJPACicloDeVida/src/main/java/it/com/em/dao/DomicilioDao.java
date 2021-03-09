package it.com.em.dao;

import it.com.em.domain.Domicilio;
import java.util.List;
import javax.persistence.*;

public class DomicilioDao {

    EntityManagerFactory emf;
    EntityManager em;

    public DomicilioDao() {
        emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        em = emf.createEntityManager();
    }
    
    public List<Domicilio> listarDomicilio(){
        return em.createNamedQuery("Domicilio.findAll").getResultList();
    }
    
    public void insertarDomicilio(Domicilio domicilio){
        try{
            em.getTransaction().begin();
            em.persist(domicilio);
            em.getTransaction().commit();
            
        }catch(Exception ex){
            em.getTransaction().rollback();
            ex.printStackTrace();
        }
    }
    
    public void modificarDomicilio(Domicilio domicilio){
        try{
            em.getTransaction().begin();
            em.merge(domicilio);
            em.getTransaction().commit();
            
        }catch(Exception ex){
            em.getTransaction().rollback();
            ex.printStackTrace();
        }
    }
    
    public void eliminarDomicilio(Domicilio domicilio){
        try{
            em.getTransaction().begin();
            em.remove(em.merge(domicilio));
            em.getTransaction().commit();
            
        }catch(Exception ex){
            em.getTransaction().rollback();
            ex.printStackTrace(System.out);
        }
    }
}
