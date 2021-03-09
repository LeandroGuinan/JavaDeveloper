package Test;

import it.com.em.dao.*;
import java.util.List;

public class test {

    public static void main(String[] args) {
        AlumnoDao alD = new AlumnoDao();
        AsignacionDao asD = new AsignacionDao();
        ContactoDao cnD = new ContactoDao();
        CursoDao crD = new CursoDao();
        DomicilioDao dmD = new DomicilioDao();
        
        listar(alD.listarAlumnos());
        System.out.println("");
        listar(asD.listarAsignaciones());
        System.out.println("");
        listar(cnD.listarContacto());
        System.out.println("");
        listar(crD.listarCursos());
        System.out.println("");
        listar(dmD.listarDomicilio());
        
    }
    
    public static void listar(List lista){
        for(Object o: lista){
            System.out.println(o);
        }
    }
}
