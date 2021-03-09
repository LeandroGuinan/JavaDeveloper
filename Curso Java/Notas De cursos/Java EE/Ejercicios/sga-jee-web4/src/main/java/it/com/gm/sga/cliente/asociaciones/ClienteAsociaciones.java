/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.com.gm.sga.cliente.asociaciones;

import it.com.gm.sga.domain.Persona;
import it.com.gm.sga.domain.Usuario;
import java.util.List;
import javax.persistence.*;
import org.apache.logging.log4j.*;


public class ClienteAsociaciones {
   static Logger log = LogManager.getRootLogger();
   
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        List<Persona> personas = em.createNamedQuery("Persona.findAll").getResultList();
        
        //Cerramos la conexion 
        em.close();
        
        //Imprimimos los objetos
        for(Persona persona : personas){
            log.debug("Personas: " + persona);
            //recuperamos los usuarios relacionados
            for(Usuario us : persona.getUsuarioList()){
                log.debug("Usuario: " + us);
            }
        }
    }
}
