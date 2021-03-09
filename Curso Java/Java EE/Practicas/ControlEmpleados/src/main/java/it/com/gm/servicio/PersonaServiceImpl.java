package it.com.gm.servicio;

import it.com.gm.datos.PersonaDao;
import it.com.gm.domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class PersonaServiceImpl implements PersonaService {

    @Inject
    private PersonaDao personaDao;

    @Override
    public List<Persona> encontrarPersonas() {
        return this.personaDao.findAllPersona();
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaDao.findPersonaById(persona);
    }

    @Override
    public void insertarPersona(Persona persona) {
        personaDao.insertPersona(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        this.personaDao.updatePersona(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        this.personaDao.deletePersona(persona);
    }

}
