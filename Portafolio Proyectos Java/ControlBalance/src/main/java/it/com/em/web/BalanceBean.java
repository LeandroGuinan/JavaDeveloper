package it.com.em.web;

import it.com.em.domain.Activos;
import it.com.em.domain.Balance;
import it.com.em.domain.Pasivos;
import it.com.em.service.BalanceService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.logging.log4j.*;

@Named("balanceBean")
@RequestScoped
public class BalanceBean {
    
    Logger log = LogManager.getRootLogger();
    
    @Inject
    private BalanceService balanceService;
    
    private Balance balanceSeleccionado;
    private Pasivos pasivoSeleccionado;
    private Activos activoSeleccionado;
    
    List<Balance> balances;
    List<Pasivos> pasivos;
    List<Activos> activos;
    
    public BalanceBean(){
        
    }
    
    @PostConstruct
    public void inicializar(){
        balances = balanceService.listarBalance();
        pasivos = balanceService.listarPasivos();
        activos = balanceService.listarActivos();
        log.debug("Listas cargadas con exito");
        
        balanceSeleccionado = new Balance();
        pasivoSeleccionado = new Pasivos();
        activoSeleccionado = new Activos();
        log.debug("Objetos creados con exito");
    }

    public Balance getBalanceSeleccionado() {
        return balanceSeleccionado;
    }

    public void setBalanceSeleccionado(Balance balanceSeleccionado) {
        this.balanceSeleccionado = balanceSeleccionado;
    }

    public Pasivos getPasivoSeleccionado() {
        return pasivoSeleccionado;
    }

    public void setPasivoSeleccionado(Pasivos pasivoSeleccionado) {
        this.pasivoSeleccionado = pasivoSeleccionado;
    }

    public Activos getActivoSeleccionado() {
        return activoSeleccionado;
    }

    public void setActivoSeleccionado(Activos activoSeleccionado) {
        this.activoSeleccionado = activoSeleccionado;
    }

    public List<Balance> getBalances() {
        return balances;
    }

    public void setBalances(List<Balance> balances) {
        this.balances = balances;
    }

    public List<Pasivos> getPasivos() {
        return pasivos;
    }

    public void setPasivos(List<Pasivos> pasivos) {
        this.pasivos = pasivos;
    }

    public List<Activos> getActivos() {
        return activos;
    }

    public void setActivos(List<Activos> activos) {
        this.activos = activos;
    }
    
    public void agregarActivos(){
        log.debug("No agregado aun: agregarActivos");
        
    }
    
    public void agregarPasivos(){
        log.debug("No agregado aun: agregarPasivos");
    }
    
}
