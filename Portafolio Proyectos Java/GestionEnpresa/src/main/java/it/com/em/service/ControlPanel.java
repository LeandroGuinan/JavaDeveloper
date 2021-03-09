package it.com.em.service;

import it.com.em.domain.Administracion;
import it.com.em.domain.Empleado;
import it.com.em.domain.Persona;
import it.com.em.domain.Taller;
import java.util.List;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ControlPanel {

    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmpresaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction ts = em.getTransaction();
        
        List<Persona> personas = em.createNamedQuery("Persona.findAll").getResultList();
        
        
        for (Persona p: personas) {
            System.out.println("");
            log.debug(p);
            for (Empleado e: p.getEmpleadoList()) {
                log.debug(e);
                for (Administracion a: e.getAdministracionList()) {
                    log.debug(a);
                }
                for (Taller l: e.getTallerList()) {
                    log.debug(l);
                    System.out.println("");
                }
            }
        }
        
    }
}
