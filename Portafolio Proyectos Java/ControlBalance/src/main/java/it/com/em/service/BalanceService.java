package it.com.em.service;

import it.com.em.domain.Activos;
import it.com.em.domain.Balance;
import it.com.em.domain.Pasivos;
import java.util.List;
import javax.ejb.Local;

@Local
public interface BalanceService {
    
    public List<Activos> listarActivos();
    
    public List<Pasivos> listarPasivos();
    
    public List<Balance> listarBalance();
    
    public Activos encontrarActivosPorId(Activos activos);
    
    public Pasivos encontrarPasivosPorId(Pasivos pasivos);
    
    public Balance encontrarBalancePorId(Balance balance);
    
    public Activos encontrarActivosPorCantidad(Activos activos);
    
    public Pasivos encontrarPasivosPorCantidad(Pasivos pasivos);
    
    public Balance encontrarBalancePorCantidad(Balance balance);
    
    public Activos encontrarActivosPorFecha(Activos activos);
    
    public Pasivos encontrarPasivosPorFecha(Pasivos pasivos);
    
    public Balance encontrarBalancePorFecha(Balance balance);
    
    public void insertarActivos(Activos activos);
    
    public void insertarPasivos(Pasivos pasivos);
    
    public void insertarBalance(Balance balance);
    
    public void modificarActivos(Activos activos);
    
    public void modificarPasivos(Pasivos pasivos);
    
    public void modificarBalance(Balance balance);
}
