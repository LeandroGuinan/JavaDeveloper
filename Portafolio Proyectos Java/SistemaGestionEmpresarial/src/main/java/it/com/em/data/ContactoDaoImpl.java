package it.com.em.data;

import it.com.em.domain.Contacto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ContactoDaoImpl implements ContactoDao{
    
    @PersistenceContext(name="SGEPU")
    EntityManager em;

    @Override
    public List<Contacto> findAllContacto() {
        return em.createNamedQuery("Contacto.findAll").getResultList();
    }

    @Override
    public Contacto findContactoByID(Contacto contacto) {
        return em.find(Contacto.class, contacto.getIdContacto());
    }

    @Override
    public void updateContacto(Contacto contacto) {
        em.merge(contacto);
    }

    @Override
    public void deleteContacto(Contacto contacto) {
        em.remove(em.merge(contacto));
    }
}
