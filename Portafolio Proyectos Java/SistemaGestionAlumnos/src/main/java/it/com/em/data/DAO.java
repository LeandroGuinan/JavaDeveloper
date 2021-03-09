package it.com.em.data;

import it.com.em.domain.*;
import java.util.List;

public interface DAO {
    
    public List findAllDomicilio();
    
    public void insertDomicilio(Domicilio domicilio);
    
    public void updateDomicilio(Domicilio domicilio);
    
    public void deleteDomicilio(Domicilio domicilio);
    
    public List findAllCurso();
    
    public void insertCurso(Curso curso);
    
    public void updateCurso(Curso curso);
    
    public void deleteCurso(Curso curso);
    
    public List findAllContacto();
    
    public void insertContacto(Contacto contacto);
    
    public void updateContacto(Contacto contacto);
    
    public void deleteContacto(Contacto contacto);
    
    public List findAllAsignacion();
    
    public void insertAsignacion(Asignacion asignacion);
    
    public void updateAsignacion(Asignacion asignacion);
    
    public void deleteAsignacion(Asignacion asignacion);
    
    public List findAllAlumno();
    
    public void insertAlumno(Alumno alumno);
    
    public void updateAlumno(Alumno alumno);
    
    public void deleteAlumno(Alumno alumno);
    
    
}
