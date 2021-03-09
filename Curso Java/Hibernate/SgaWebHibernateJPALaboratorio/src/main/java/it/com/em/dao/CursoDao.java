package it.com.em.dao;

import it.com.em.domain.Curso;
import java.util.List;
import javax.persistence.*;

public class CursoDao {

    EntityManagerFactory emf;
    EntityManager em;

    public CursoDao() {
        emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        em = emf.createEntityManager();
    }
    
    public List<Curso> listarCursos(){
        return em.createNamedQuery("Curso.findAll").getResultList();
    }
    
    public void intertarCurso(Curso curso){
        try{
            em.getTransaction().begin();
            em.persist(curso);
            em.getTransaction().commit();
            
        }catch(Exception ex){
            em.getTransaction().rollback();
            ex.printStackTrace();
        }
    }
    
    public void modificarCurso(Curso curso){
        try{
            em.getTransaction().begin();
            em.merge(curso);
            em.getTransaction().commit();
            
        }catch(Exception ex){
            ex.printStackTrace();
            em.getTransaction().rollback();
        }
    }
    
    public void eliminarCurso(Curso curso){
        try{
            em.getTransaction().begin();
            em.remove(em.merge(curso));
            em.getTransaction().commit();
        }catch(Exception ex){
            em.getTransaction().rollback();
            ex.printStackTrace(System.out);
        }
    }
    
    public Curso encontrarCursoPorID(Curso curso){
        return em.find(Curso.class, curso.getIdCurso());
    }
}
