package it.com.gm.sga.servicio;

import it.com.gm.sga.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

//esta clase es un EJB por ende se debe agregar la anotacion de:
@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote{

    @Override
    public List<Persona> listarPersona() {
        List<Persona> personas =new ArrayList<>();
        
        personas.add(new Persona(1,"Juan","Perez","JPerez@Mail.com","77889944"));
        personas.add(new Persona(2,"Maria","Suarez","MSuarez","22334455"));
        
        return personas;
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
    }

    @Override
    public void modificarPersona(Persona persona) {
    }

    @Override
    public void eliminarPersona(Persona persona) {
    }
    
}
