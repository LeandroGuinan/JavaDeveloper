package it.com.ae.service;

import it.com.ae.domain.Palabra;
import java.util.List;
import javax.ejb.Local;

@Local
public interface PalabraService {
    
    public List<Palabra> encontrarPalabras();
}
