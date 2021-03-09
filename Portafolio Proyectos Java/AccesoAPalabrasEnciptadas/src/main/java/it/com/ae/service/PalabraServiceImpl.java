package it.com.ae.service;

import it.com.ae.datos.PalabraDao;
import it.com.ae.domain.Palabra;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class PalabraServiceImpl implements PalabraService{
    
    @Inject
    PalabraDao palabraDao;
    
    @Override
    public List<Palabra> encontrarPalabras() {
        return palabraDao.findAllPalabra();
    }
    
}
