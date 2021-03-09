package it.com.em.dao;

import it.com.em.domain.Alumno;
import java.util.List;
import javax.persistence.*;

public class AlumnoDao {

    EntityManagerFactory emf;
    EntityManager em;

    public AlumnoDao() {
        this.emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        this.em = emf.createEntityManager();
    }

    public List<Alumno> listarAlumnos() {
        List<Alumno> alumnos = em.createNamedQuery("Alumno.findAll").getResultList();
        return alumnos;
    }

    public void insertarAlumno(Alumno alumno) {
        try {
            em.getTransaction().begin();
            em.persist(alumno);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
    }
    
    public void modificarAlumno(Alumno alumno){
        try{
            em.getTransaction().begin();
            em.merge(encontrarPorID(alumno));
            em.getTransaction().commit();
            
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
        
    }
    
    public void eliminarAlumno(Alumno alumno){
        try{
            em.getTransaction().begin();
            em.remove(em.merge(encontrarPorID(alumno)));
            em.getTransaction().commit();
        }catch(Exception ex){
            em.getTransaction().rollback();
        }
    }
    
    public Alumno encontrarPorID(Alumno alumno){
        return em.find(Alumno.class, alumno.getIdAlumno());
    }
}
