package it.com.en.datos;

import it.com.en.domain.Palabras;
import java.util.List;

public interface PalabrasDao {

    public List<Palabras> findAllPalabras();
    
    public Palabras findPalabrasById(Integer idToDec);
    
    public void insertPalabra(String palabra);
}
