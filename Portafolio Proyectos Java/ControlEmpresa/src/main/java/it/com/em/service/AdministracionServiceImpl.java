package it.com.em.service;

import it.com.em.datos.AdministracionDao;
import it.com.em.domain.Administracion;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class AdministracionServiceImpl implements AdministracionService{
    
    @Inject
    AdministracionDao adminDao;

    @Override
    public List<Administracion> getListaDeAdministracion() {
       return adminDao.getAllAdministracion();
    }
}
