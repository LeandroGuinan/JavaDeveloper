package it.com.ae.domain;

import java.io.Serializable;

public class PalabraEncriptada implements Serializable {

    private static final long serialVersionUID = 1L;

    private String palabraEncriptada;

    public PalabraEncriptada(String palabraEncriptada) {
        this.palabraEncriptada = palabraEncriptada;
    }



    public String getPalabraEncriptada() {
        return palabraEncriptada;
    }

    public void setPalabraEncriptada(String palabraEncriptada) {
        this.palabraEncriptada = palabraEncriptada;
    }

    @Override
    public String toString() {
        return "PalabraEncriptada{" +  " palabraEncriptada=" + palabraEncriptada + '}';
    }

}
