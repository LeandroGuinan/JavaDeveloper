package it.com.gm.sga.cliente.ciclovidajpa;

import it.com.gm.sga.domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActualizarObjetoJPA {
    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");

        EntityManager em = emf.createEntityManager();

        

        //Inicia la transaccion 
        //Paso1. Iniciar transaccion
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //Paso2. Ejecuta SQL de tipo select
        //El id seleccionado debe existir en base de datos
        Persona persona1 = em.find(Persona.class, 1);
        
        //Paso3. termina la transaccion 1
        tx.commit();
        
        //Objeto en estado de detacht
        log.debug("Objeto Recuperado: " + persona1);
        
        //Paso4. setValue(nuevo Valor)
        persona1.setApellido("Juarez");
        
        //Paso5. Iniciamos la transaccion 2
        
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        
        //Paso6.Modificamos el objeto
        em.merge(persona1);
        /* em.flush(); vacia los cambios directamente 
        sin finalizar la transaccion, es como un metodo 
        intermedio*/
        
        //Paso7.Termina transaccion 2
        tx2.commit();
        
        //Objeto en estado detached ya modificado
        log.debug("Objeto Recuperado: "+ persona1);
        
        //Cerramos el entity manager
        em.close();
    }
}
