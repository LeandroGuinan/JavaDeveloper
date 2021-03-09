package it.com.gm.sga.servicio;

import it.com.gm.sga.datos.PersonaDao;
import it.com.gm.sga.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

//esta clase es un EJB por ende se debe agregar la anotacion de:
@Stateless
//como se esta utilizando un WS se debe agregar su endPoint, haciendo referencia a el WebService
@WebService(endpointInterface = "it.com.gm.sga.servicio.PersonaServiceWs")
//ya los metodos de esta clase existian, pero normalemente se deben agregar
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService, PersonaServiceWs{
    
    
    //interactuamos con la base de datos, inyectando el persona dao, por esto debe ser un stateless
    //que que estamos en un entorno empresarial, se puede hacer inject directamente del ejb 
    @Inject
    private PersonaDao personaDao;
    
    @Override
    public List<Persona> listarPersona() {
        List<Persona> personas =new ArrayList<>();
        personas = personaDao.findAllPersona();
        return personas;
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaDao.findPersonaById(persona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaDao.findPersonaByEmail(persona);
    }

    @Override
    public void registrarPersona(Persona persona) {
        personaDao.insertPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaDao.updatePersona(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaDao.deletePersona(persona);
    }
}
