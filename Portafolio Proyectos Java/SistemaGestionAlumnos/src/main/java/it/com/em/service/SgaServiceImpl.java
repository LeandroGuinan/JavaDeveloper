package it.com.em.service;

import it.com.em.data.DAO;
import it.com.em.domain.Alumno;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class SgaServiceImpl implements SgaService{
    
    @Inject
    DAO dao;
    
    @Override
    public List<Alumno> listarAlumnos() {
        return dao.findAllAlumno();
    }

    @Override
    public void insertarAlumno(Alumno alumno) {
        dao.insertAlumno(alumno);
    }
    
}
