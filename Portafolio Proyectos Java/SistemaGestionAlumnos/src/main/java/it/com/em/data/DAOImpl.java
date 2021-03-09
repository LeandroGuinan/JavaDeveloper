
package it.com.em.data;

import it.com.em.domain.*;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;

@Stateless
public class DAOImpl implements DAO{
    
    @PersistenceContext(name="SGAPU")
    EntityManager em;
    
    @Override
    public List findAllDomicilio() {
        return em.createNamedQuery("Domicilio.findAll").getResultList();
    }

    @Override
    public void insertDomicilio(Domicilio domicilio) {
        em.persist(domicilio);
    }

    @Override
    public void updateDomicilio(Domicilio domicilio) {
        em.merge(domicilio);
    }

    @Override
    public void deleteDomicilio(Domicilio domicilio) {
        em.remove(em.merge(domicilio));
    }

    @Override
    public List findAllCurso() {
        return em.createNamedQuery("Curso.findAll").getResultList();
    }

    @Override
    public void insertCurso(Curso curso) {
        em.persist(curso);
    }

    @Override
    public void updateCurso(Curso curso) {
        em.merge(curso);
    }

    @Override
    public void deleteCurso(Curso curso) {
        em.remove(em.merge(curso));
    }

    @Override
    public List findAllContacto() {
        return em.createNamedQuery("Contacto.findAll").getResultList();
    }

    @Override
    public void insertContacto(Contacto contacto) {
        em.persist(contacto);
    }

    @Override
    public void updateContacto(Contacto contacto) {
        em.merge(contacto);
    }

    @Override
    public void deleteContacto(Contacto contacto) {
        em.remove(em.merge(contacto));
    }

    @Override
    public List findAllAsignacion() {
        return em.createNamedQuery("Asignacion.findAll").getResultList();
    }

    @Override
    public void insertAsignacion(Asignacion asignacion) {
        em.persist(asignacion);
    }

    @Override
    public void updateAsignacion(Asignacion asignacion) {
        em.merge(asignacion);
    }

    @Override
    public void deleteAsignacion(Asignacion asignacion) {
        em.remove(em.merge(asignacion));
    }

    @Override
    public List findAllAlumno() {
        return em.createNamedQuery("Alumno.findAll").getResultList();
    }

    @Override
    public void insertAlumno(Alumno alumno) {
        em.persist(alumno);
    }

    @Override
    public void updateAlumno(Alumno alumno) {
        em.merge(alumno);
    }

    @Override
    public void deleteAlumno(Alumno alumno) {
        em.remove(em.merge(alumno));
    }
}
