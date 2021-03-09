package it.com.em.data;

import it.com.em.domain.Direccion;
import java.util.List;

public interface DireccionDao {

    public List<Direccion> findAllDirecction();
    
    public Direccion findDireccionByID(Direccion direccion);
    
    public void updateDireccion(Direccion direccion);
    
    public void deleteDireccion(Direccion direccion);
}
