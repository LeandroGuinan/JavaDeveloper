
package it.com.gm.sga.cliente;

import it.com.gm.sga.domain.Persona;
import it.com.gm.sga.servicio.PersonaServiceRemote;
import java.util.List;
import javax.naming.*;


public class ClientePersonaService {
    
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente");
        
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServiceImpl!it.com.gm.sga.servicio.PersonaServiceRemote");
            
            List<Persona> Personas = personaService.listarPersonas();
            for(Persona per:Personas){
                System.out.println(per);
            }
            System.out.println("\nFin de la llamada al EJB desde el cliente");
            
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
