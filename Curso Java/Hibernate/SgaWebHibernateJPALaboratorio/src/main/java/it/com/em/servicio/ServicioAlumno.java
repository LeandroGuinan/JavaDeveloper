package it.com.em.servicio;

import it.com.em.dao.AlumnoDao;
import it.com.em.domain.Alumno;
import java.util.List;

public class ServicioAlumno {

    private AlumnoDao alumnoDao = new AlumnoDao();
    
    public List<Alumno> listarAlumnos(){
        return alumnoDao.listarAlumnos();
    }
    
    public void guardarAlumno(Alumno alumno){
        if(alumno != null && alumno.getIdAlumno() == null){
            alumnoDao.insertarAlumno(alumno);
        }else{
            alumnoDao.modificarAlumno(alumno);
        }
    }
    
    public void elimnarAlumno(Alumno alumno){
        alumnoDao.eliminarAlumno(alumno);
    }
    
    public Alumno encontrarAlumno(Alumno alumno){
        return alumnoDao.encontrarPorID(alumno);
    }
}
