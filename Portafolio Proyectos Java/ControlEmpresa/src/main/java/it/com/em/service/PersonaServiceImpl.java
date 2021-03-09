package it.com.em.service;

import it.com.em.datos.PersonaDao;
import it.com.em.domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class PersonaServiceImpl implements PersonaService{
    
    @Inject
    PersonaDao personaDao;

    @Override
    public List<Persona> getListaDePersonas() {
       return personaDao.getAllPersona();
    }
}
