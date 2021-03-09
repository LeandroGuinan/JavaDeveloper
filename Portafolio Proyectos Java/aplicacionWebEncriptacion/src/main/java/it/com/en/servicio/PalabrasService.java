package it.com.en.servicio;

import it.com.en.domain.Palabras;
import java.util.List;
import javax.ejb.Local;

@Local
public interface PalabrasService {
    
    public List<Palabras> listarPalabras();
    
}
