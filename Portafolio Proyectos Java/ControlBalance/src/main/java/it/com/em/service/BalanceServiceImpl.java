package it.com.em.service;

import it.com.em.datos.ActivosDao;
import it.com.em.datos.BalanceDao;
import it.com.em.datos.PasivosDao;
import it.com.em.domain.Activos;
import it.com.em.domain.Balance;
import it.com.em.domain.Pasivos;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class BalanceServiceImpl implements BalanceService{
    
    @Inject
    private ActivosDao activosDao;
    
    @Inject
    private PasivosDao pasivosDao;
    
    @Inject
    private BalanceDao balanceDao;

    @Override
    public List<Activos> listarActivos() {
        return activosDao.findAllActivos();
    }

    @Override
    public List<Pasivos> listarPasivos() {
        return pasivosDao.findAllPasivos();
    }

    @Override
    public List<Balance> listarBalance() {
        return balanceDao.findAllBalance();
    }

    @Override
    public Activos encontrarActivosPorId(Activos activos) {
        return this.activosDao.findActivoById(activos);
    }

    @Override
    public Pasivos encontrarPasivosPorId(Pasivos pasivos) {
        return this.pasivosDao.findPasivosById(pasivos);
    }

    @Override
    public Balance encontrarBalancePorId(Balance balance) {
        return this.balanceDao.findBalanceById(balance);
    }

    @Override
    public Activos encontrarActivosPorCantidad(Activos activos) {
        return this.activosDao.findActivosByCantidad(activos);
    }

    @Override
    public Pasivos encontrarPasivosPorCantidad(Pasivos pasivos) {
        return this.pasivosDao.findPasivosByCantidad(pasivos);
    }

    @Override
    public Balance encontrarBalancePorCantidad(Balance balance) {
        return this.balanceDao.findBalanceByCantidad(balance);
    }

    @Override
    public Activos encontrarActivosPorFecha(Activos activos) {
        return this.activosDao.findActivosByFecha(activos);
    }

    @Override
    public Pasivos encontrarPasivosPorFecha(Pasivos pasivos) {
        return this.pasivosDao.findPasivosByFecha(pasivos);
    }

    @Override
    public Balance encontrarBalancePorFecha(Balance balance) {
        return this.balanceDao.findBalanceByFecha(balance);
    }

    @Override
    public void insertarActivos(Activos activos) {
        this.activosDao.insertActivos(activos);
    }

    @Override
    public void insertarPasivos(Pasivos pasivos) {
        this.pasivosDao.insertPasivos(pasivos);
    }

    @Override
    public void insertarBalance(Balance balance) {
        this.balanceDao.insertBalance(balance);
    }

    @Override
    public void modificarActivos(Activos activos) {
        this.activosDao.updateActivos(activos);
    }

    @Override
    public void modificarPasivos(Pasivos pasivos) {
        this.pasivosDao.updatePasivos(pasivos);
    }

    @Override
    public void modificarBalance(Balance balance) {
        this.balanceDao.updateBalance(balance);
    }
    
}
