package it.com.sf.servicio;

import it.com.sf.domain.Datos;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface DataServiceRemote {
    
    public List<Datos> calcularFuerzas();
}
