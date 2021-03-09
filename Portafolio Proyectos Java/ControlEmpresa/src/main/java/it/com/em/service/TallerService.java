package it.com.em.service;

import it.com.em.domain.Taller;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TallerService {
    
    public List<Taller> getListaTaller();
}
