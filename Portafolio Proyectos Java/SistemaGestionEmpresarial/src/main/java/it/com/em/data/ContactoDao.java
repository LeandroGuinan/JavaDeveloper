package it.com.em.data;

import it.com.em.domain.Contacto;
import java.util.List;

public interface ContactoDao {
    
    public List<Contacto> findAllContacto();
    
    public Contacto findContactoByID(Contacto contacto);
    
    public void updateContacto(Contacto contacto);
    
    public void deleteContacto(Contacto contacto);
}
