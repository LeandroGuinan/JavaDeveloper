
package it.com.gm.sga.cliente.cascade;

import it.com.gm.sga.domain.Persona;
import it.com.gm.sga.domain.Usuario;
import javax.persistence.*;
import org.apache.logging.log4j.*;


public class PersistenciaCascadaJPA {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        //Paso1. Creamos un nuevo Objeto
        //Objeto en estado transistido
        Persona persona1 = new Persona("Hugo", "Hernandez", "HHernandez@mail.com", "5566771122");
        
        //Creamos objeto usuario(tiene dependencia con el objeto persona)
        Usuario usuario1 = new Usuario("Hhernandez", "123",persona1);
        
        //Paso3. Persistimos el objeto usuario
        /*de no tener la persistencia de cascada, entonces tendriamos que perisistir
        el objeto persona haciendo em.persist(persona1);*/
        em.persist(usuario1);
        
        //Paso4. hacemos commit: transaccion
        
        tx.commit();
        
        //Objetos en estados de detacht
        log.debug("Objeto persistido persona: " + persona1);
        log.debug("Objeto Persistido usuario: "+ usuario1);
        em.close();
        
    }
}
