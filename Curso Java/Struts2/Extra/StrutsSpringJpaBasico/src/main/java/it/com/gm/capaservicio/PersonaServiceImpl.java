package it.com.gm.capaservicio;

import it.com.gm.capadatos.PersonaDao;
import it.com.gm.capadatos.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonaServiceImpl implements PersonaService{
    
    @Autowired
    private PersonaDao personaDao;
    
    @Override
    public List<Persona> listarPersonas() {
        return personaDao.findAllPersonas();
    }

    @Override
    public Persona recuperarPersona(Persona persona) {
        return personaDao.findPersonaById(persona.getIdPersona());
    }

    @Override
    public void agregarPersona(Persona persona) {
        this.personaDao.insertPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        this.personaDao.updatePersona(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        this.personaDao.deletePersona(persona);
    }

    @Override
    public Integer contarPersonas() {
        return this.personaDao.contadorPersonas();
    }

    /*
    ahora entramos de lleno en el comcepto de struts, utilizando acciones, recordando
    que deben terminar en actios.
    */
}
