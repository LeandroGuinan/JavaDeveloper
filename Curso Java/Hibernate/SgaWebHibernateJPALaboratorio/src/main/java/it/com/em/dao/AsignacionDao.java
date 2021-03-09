package it.com.em.dao;

import it.com.em.domain.Asignacion;
import java.util.List;
import javax.persistence.*;

public class AsignacionDao {

    EntityManagerFactory emf;
    EntityManager em;

    public AsignacionDao() {
        emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        em = emf.createEntityManager();
    }

    public List<Asignacion> listarAsignaciones() {
        return em.createNamedQuery("Asignacion.findAll").getResultList();
    }

    public void insertarAsignacion(Asignacion asignacion) {
        try{
            em.getTransaction().begin();
            em.persist(asignacion);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }

    }

    public void modificarAsignacion(Asignacion asignacion) {
        try {
            em.getTransaction().begin();
            em.merge(asignacion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        }
    }
    
    public void eliminarAsignacion(Asignacion asignacion){
        try{
            em.getTransaction().begin();
            em.remove(em.merge(asignacion));
            
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
    }
    
    public Asignacion encontrarPorID(Asignacion asignacion){
        return em.find(Asignacion.class, asignacion.getIdAsignacion());
    }
}
