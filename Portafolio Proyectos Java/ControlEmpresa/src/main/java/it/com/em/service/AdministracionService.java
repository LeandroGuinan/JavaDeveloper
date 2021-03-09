package it.com.em.service;

import it.com.em.domain.Administracion;
import java.util.List;
import javax.ejb.Local;

@Local
public interface AdministracionService {
    
    public List<Administracion> getListaDeAdministracion();
}
