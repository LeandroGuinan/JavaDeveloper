package it.com.gm.sga.cliente;

import it.com.gm.sga.domain.Persona;
import it.com.gm.sga.servicio.PersonaServiceRemote;
import javax.naming.*;
import org.apache.logging.log4j.*;

public class PruebaManejoTransacciones {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee-web-1.0/PersonaServiceImpl!it.com.gm.sga.servicio.PersonaServiceRemote");
         log.debug("Iniciando Prueba manejo Transaccional PersonaService");
         
         //Buscar un objeto persona
         Persona persona1 = personaService.encontrarPersonaPorId(new Persona(1));
         
         log.debug("Persona Recuperada: " + persona1);
         
         //cambiar el apellido 
         //persona1.setApellido("Cambio con error---------------------------------------------------------------------------");
         persona1.setApellido("Perez");
         personaService.modificarPersona(persona1);
         log.debug("Objeto modificado: "+persona1);
         log.debug("Fin de prueba EJB TRANSACCIONAL");
         
        } catch (NamingException ex) {
            log.debug(ex);
        }
    }
}
