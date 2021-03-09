package it.com.em.datos;

import it.com.em.domain.Activos;
import java.util.List;

public interface ActivosDao {

    public List<Activos> findAllActivos();
    
    public Activos findActivoById(Activos activos);
    
    public Activos findActivosByCantidad(Activos activos);
    
    public Activos findActivosByFecha(Activos activos);
    
    public void insertActivos(Activos activos);
    
    public void updateActivos(Activos activos);
}
