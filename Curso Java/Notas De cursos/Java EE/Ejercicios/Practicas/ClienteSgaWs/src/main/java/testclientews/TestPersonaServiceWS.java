package testclientews;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceWs;
import java.util.List;

public class TestPersonaServiceWS {

    public static void main(String[] args) {
        PersonaServiceWs personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
        System.out.println("Ejecuando servicio de listar personas");
        
        List<Persona> personas = personaService.listarPersona();
        for (Persona p : personas) {
            System.out.println("Persona: ID: "+ p.getIdPersona() + ", Nombre: " + p.getNombre() + ", Apellido: " + p.getApellido() + ", Email: " + p.getEmail());
        }
        System.out.println("Fin de Servicio");
    }
}
