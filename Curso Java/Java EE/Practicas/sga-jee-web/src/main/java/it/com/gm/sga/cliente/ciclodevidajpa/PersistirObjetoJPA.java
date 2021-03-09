package it.com.gm.sga.cliente.ciclodevidajpa;

import it.com.gm.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PersistirObjetoJPA {
    
    //este se utiliza para manejar nuestro log
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        //creamos el objeto EntityManagerFactory que hara referencia a nuestra unidad de persistencia
        //que en este momentos esta configurada para su uso local
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        
        //posteriormente creamos el objeto que abrira la transaccion
        EntityManager em = emf.createEntityManager();
        
        //posteriormente creamos el objeto de transaccion que nos ayudara a modificar la base de datos
        EntityTransaction ts = em.getTransaction();
        
        //Inicia La Transaccion
        //Paso1. creamos un nuevo objeto
        Persona persona1 = new Persona("Santiago", "Ramirez", "SRamirez@Mail.com", "11229988");
        
        //Paso2. Inicia La Transaccion
        ts.begin();
        
        //Paso3. Ejecutamos el SQL
        em.persist(persona1);
        log.debug(persona1);
        //Paso4. commit/rollback (solo en este momento es que el objeto se asocia con la base de datos, antes estaba en estado transitivo
        ts.commit();
        
        //objeto en estodo detachet
        
        log.debug("Objeto persistido: estado detached " + persona1);
        
        //Cerramos el EntityManager
        em.close();
    }
}
