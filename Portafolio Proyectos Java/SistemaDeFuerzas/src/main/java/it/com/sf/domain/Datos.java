package it.com.sf.domain;

import java.io.Serializable;

public class Datos implements Serializable {

    private static final long serialVersionUID = 1L;

    private int idDato;
    private int masa;

    public Datos(int idDato, int masa) {
        this.idDato = idDato;
        this.masa = masa;
    }
    
    public int getIdDato() {
        return idDato;
    }

    public void setIdDato(int idDato) {
        this.idDato = idDato;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    @Override
    public String toString() {
        return "Datos{" + "idDato=" + idDato + ", masa=" + masa + '}';
    }
}
