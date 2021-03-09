package it.com.ae.domain;

import java.io.Serializable;

public class Palabra implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String palabra;

    public Palabra(String palabra) {
        this.palabra = palabra;
    }
    
    
    
    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    

    

    @Override
    public String toString() {
        return "Palabra{" + "palabra=" + palabra + '}';
    }
    
    
}
