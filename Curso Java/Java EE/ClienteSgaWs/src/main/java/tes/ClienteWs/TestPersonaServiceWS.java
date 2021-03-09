package tes.ClienteWs;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceWs;
import java.util.List;

public class TestPersonaServiceWS {

    public static void main(String[] args) {
        PersonaServiceWs personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
        
        System.out.println("Ejecutando servidio listar personas ws");
        List<Persona> personas = personaService.listarPersonas();
        for(Persona p: personas){
            System.out.println("Persona ID: " + p.getIdPersona()+ ", Nombre: "+p.getNombre()+", Apellido: "+p.getApellido()+
                    ", Email: "+p.getEmail());
        }
        System.out.println("Fin servicio listar personas");
    }
}
