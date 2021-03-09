package it.com.em.service;

import it.com.em.domain.Alumno;
import java.util.List;
import javax.ejb.Local;

@Local
public interface SgaService {
    
    public List<Alumno> listarAlumnos();
    
    public void insertarAlumno(Alumno alumno);
    
}
