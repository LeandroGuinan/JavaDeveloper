package it.com.em.datos;

import it.com.em.domain.Balance;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class BalanceDaoImpl implements BalanceDao {

    @PersistenceContext(name = "EmpresaPU")
    EntityManager em;

    @Override
    public List<Balance> findAllBalance() {
        return em.createNamedQuery("Balance.findAll").getResultList();
    }

    @Override
    public Balance findBalanceById(Balance balance) {
        return em.find(Balance.class, balance.getIdBalance());
    }

    @Override
    public Balance findBalanceByCantidad(Balance balance) {
        return em.find(Balance.class, balance.getBalance());
    }

    @Override
    public Balance findBalanceByFecha(Balance balance) {
        return em.find(Balance.class, balance.getFecha());
    }

    @Override
    public void insertBalance(Balance balance) {
        em.persist(balance);
    }

    @Override
    public void updateBalance(Balance balance) {
        em.merge(balance);
    }
}
