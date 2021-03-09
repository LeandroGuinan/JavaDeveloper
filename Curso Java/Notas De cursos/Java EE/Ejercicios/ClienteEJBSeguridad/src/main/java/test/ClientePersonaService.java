package test;

import com.sun.enterprise.security.ee.auth.login.ProgrammaticLogin;
import it.com.gm.sga.servicio.PersonaServiceRemote;
import it.com.sga.domain.Persona;
import java.util.List;
import javax.naming.*;

public class ClientePersonaService {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada EJB desde cliente");
        
        String authFile="login.conf";
        
        System.setProperty("java.security.auth.login.config", authFile);
        
        ProgrammaticLogin programaticLogin = new ProgrammaticLogin();
        programaticLogin.login("admin", "admin".toCharArray());
        
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee-web10/PersonaServiceImpl!it.com.gm.sga.servicio.PersonaServiceRemote");
            List<Persona> personas = personaService.listarPersonas();
            
            for(Persona p: personas){
                System.out.println("Persona: "+p);
            }
            System.out.println("\nFin de la llamada al EJB desde cliente");
            
        } catch (NamingException ex) {
            System.out.println("Error");
            ex.printStackTrace(System.out);
        }
    }
}
