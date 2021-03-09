package test;

import it.com.sga.domain.Persona;
import javax.persistence.*;
import javax.persistence.Persistence;
import org.apache.logging.log4j.*;


public class ClienteEntidadTest {
    //con esta variable interactuamos con el nuestro objeto log, que permite mostrar detalles al uso de base de datos con persistence
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        //con esta variable creamos nuestro objeto de persistencia ya configurado en el archivo persistence, por ende debe tener el mismo nombre
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        //creamos una instancaia del objeto entity manager
        EntityManager em = emf.createEntityManager();
        //abrimos una transaccion, para poder interactuar con la base de datos
        EntityTransaction tx = em.getTransaction();
        
        //iniciamos la transaccion
        tx.begin();
        
        //ingresamos un registro en la base de datos, pero no se especifica el id, esta lo genera automaticamente la base de datos
        Persona persona1 = new Persona("Karla","Guitierrez","kGui@mail.com","11227788");
        log.debug("objeto a persistir: "+persona1);
        //persistimos el objeto:
        em.persist(persona1);
        //este no se persistira hasta que hagamos comit de la transaccion, terminamos la transaccion
        tx.commit();
        //imprimimos el objeto ya persistido, con esto se deberia ver un id
        log.debug("objeto perssitido: " + persona1);
        //y cerramos el objeto em(EntityManager)
        em.close();
    }
}
