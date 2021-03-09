package it.com.em.datos;

import it.com.em.domain.Pasivos;
import java.util.List;


public interface PasivosDao {
    
    public List<Pasivos> findAllPasivos();
    
    public Pasivos findPasivosById(Pasivos pasivos);
    
    public Pasivos findPasivosByCantidad(Pasivos pasivos);
    
    public Pasivos findPasivosByFecha(Pasivos pasivos);
    
    public void insertPasivos(Pasivos pasivos);
    
    public void updatePasivos(Pasivos pasivos);
}
