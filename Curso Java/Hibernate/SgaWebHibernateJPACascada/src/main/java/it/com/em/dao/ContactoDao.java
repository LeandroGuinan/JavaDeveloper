package it.com.em.dao;

import it.com.em.domain.Contacto;
import java.util.List;
import javax.persistence.*;

public class ContactoDao {

    EntityManagerFactory emf;
    EntityManager em;

    public ContactoDao() {
        emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        em = emf.createEntityManager();
    }
    
    public List<Contacto> listarContacto(){
        return em.createNamedQuery("Contacto.findAll").getResultList();
    }
    
    public void insertarContacto(Contacto contacto){
        try{
            em.getTransaction().begin();
            em.persist(contacto);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
    }
    
    public void modificarContacto(Contacto contacto){
        try{
            em.getTransaction().begin();
            em.merge(contacto);
            em.getTransaction().commit();
            
        }catch(Exception ex){
            em.getTransaction().rollback();
            ex.printStackTrace();
        }
    }
    
    public void eliminarContacto(Contacto contacto){
        try{
            em.getTransaction().begin();
            em.remove(em.merge(contacto));
            em.getTransaction().commit();
        }catch(Exception ex){
            em.getTransaction().rollback();
            ex.printStackTrace();
        }
    }
    
}
