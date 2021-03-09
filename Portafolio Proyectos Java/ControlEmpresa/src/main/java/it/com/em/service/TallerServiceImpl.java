package it.com.em.service;

import it.com.em.datos.TallerDao;
import it.com.em.domain.Taller;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class TallerServiceImpl implements TallerService{
    
    @Inject
    TallerDao tallerDao;

    @Override
    public List<Taller> getListaTaller() {
        return tallerDao.getAllTaller();
    }
}
