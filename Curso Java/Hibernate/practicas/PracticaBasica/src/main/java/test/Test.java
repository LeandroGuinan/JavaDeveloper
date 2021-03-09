package test;

import it.com.em.domain.Persona;
import java.util.List;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class Test {
    
    static Logger log = LogManager.getLogger(Test.class);
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PSC");
        EntityManager em = emf.createEntityManager();
        
        List<Persona> personas = em.createNamedQuery("Persona.findAll").getResultList();
        log.info("Objeto creado" + "\n");
        for(Persona p:personas){
            log.info("Persona: " + p);
        }
    }
}
