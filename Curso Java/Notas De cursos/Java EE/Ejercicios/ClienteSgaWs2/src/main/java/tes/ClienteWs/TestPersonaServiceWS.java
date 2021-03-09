package tes.ClienteWs;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceWs;
import java.util.List;
import javax.xml.ws.BindingProvider;

public class TestPersonaServiceWS {

    public static void main(String[] args) {
        PersonaServiceWs personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
        
        ((BindingProvider)personaService).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "admin");
        ((BindingProvider)personaService).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "admin");
        
        System.out.println("Ejecutando servidio listar personas ws");
        List<Persona> personas = personaService.listarPersonas();
        for(Persona p: personas){
            System.out.println("Persona ID: " + p.getIdPersona()+ ", Nombre: "+p.getNombre()+", Apellido: "+p.getApellido()+
                    ", Email: "+p.getEmail());
        }
        System.out.println("Fin servicio listar personas");
    }
}
