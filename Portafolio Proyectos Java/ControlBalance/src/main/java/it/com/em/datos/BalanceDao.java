package it.com.em.datos;

import it.com.em.domain.Balance;
import java.util.List;

public interface BalanceDao {

    public List<Balance> findAllBalance();
    
    public Balance findBalanceById(Balance balance);
    
    public Balance findBalanceByCantidad(Balance balance);
    
    public Balance findBalanceByFecha(Balance balance);
    
    public void insertBalance(Balance balance);
    
    public void updateBalance(Balance balance);
}
