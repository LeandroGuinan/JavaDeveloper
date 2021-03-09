package it.com.ae.datos;

import it.com.ae.domain.Palabra;
import java.util.List;

public interface PalabraDao {
    
    public List<Palabra> findAllPalabra();
    
}
