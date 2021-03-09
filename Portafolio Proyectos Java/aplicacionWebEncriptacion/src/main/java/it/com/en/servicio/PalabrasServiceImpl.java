package it.com.en.servicio;

import it.com.en.datos.PalabrasDao;
import it.com.en.domain.Palabras;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class PalabrasServiceImpl implements PalabrasService{
    
    @Inject
    PalabrasDao palabrasDao;
    
    @Override
    public List<Palabras> listarPalabras() {
        return palabrasDao.findAllPalabras();
    }

    
}
