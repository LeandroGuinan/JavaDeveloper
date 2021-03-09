package it.com.gm.servicio;

import it.com.gm.dao.PersonaDao;
import it.com.gm.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//para que spring reconozca esta clase de servicio, debe agregar:
@Service
public class PersonaServiceImpl implements PersonaService{
    
    //para inyectar una dependencia en otra, se utiliza: (muy parecido a inject)
    @Autowired
    private PersonaDao personaDao;
    /*
    se pueden utilizar varias clases tipo dao en la capa de servicio
    */
    @Override
    //se debe agregar el tipo de transaccion, por ejemplo en este caso, solo se recupera informacion, por ende se agrega:
    @Transactional(readOnly = true)
    public List<Persona> listarPersona() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    //ya que en estos si van a realizar una transaccion, unicamente se agrega:
    @Transactional
    public void guardar(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }

    @Override
    //sucede el mismo caso que en la primera, solo
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
        //.orElse: en el objeto persona, si no encuentra el objeto regresara null
        return personaDao.findById(persona.getIdPersona()).orElse(null);
    }
    
}
