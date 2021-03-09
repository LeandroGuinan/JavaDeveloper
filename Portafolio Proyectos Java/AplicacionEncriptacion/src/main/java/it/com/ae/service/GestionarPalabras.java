
package it.com.ae.service;

import it.com.ae.domain.Palabra;
import it.com.ae.domain.PalabraEncriptada;
import java.util.List;
import javax.ejb.Local;

@Local
public interface GestionarPalabras {
    
    public List<Palabra> cargarListaDePalabras();
    
    public List<PalabraEncriptada> encriptarPalabras();
}
