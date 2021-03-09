package it.com.em.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="palabra")
public class Palabra implements Serializable{
    
    public static final long serialVersionUID= 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idPalabra")
    private int idPalabra;
    
    private String PalabraBase;
    private String PalabraEncriptada;
    
    private int LongitudPalabraBase;
    private int LongitudPalabraEncriptada;

    public Palabra() {
    }

    public Palabra(String PalabraBase, String PalabraEncriptada, int LongitudPalabraBase, int LongitudPalabraEncriptada) {
        this.PalabraBase = PalabraBase;
        this.PalabraEncriptada = PalabraEncriptada;
        this.LongitudPalabraBase = LongitudPalabraBase;
        this.LongitudPalabraEncriptada = LongitudPalabraEncriptada;
    }

    public int getIdPalabra() {
        return idPalabra;
    }

    public void setIdPalabra(int idPalabra) {
        this.idPalabra = idPalabra;
    }

    public String getPalabraBase() {
        return PalabraBase;
    }

    public void setPalabraBase(String PalabraBase) {
        this.PalabraBase = PalabraBase;
    }

    public String getPalabraEncriptada() {
        return PalabraEncriptada;
    }

    public void setPalabraEncriptada(String PalabraEncriptada) {
        this.PalabraEncriptada = PalabraEncriptada;
    }

    public int getLongitudPalabraBase() {
        return LongitudPalabraBase;
    }

    public void setLongitudPalabraBase(int LongitudPalabraBase) {
        this.LongitudPalabraBase = LongitudPalabraBase;
    }

    public int getLongitudPalabraEncriptada() {
        return LongitudPalabraEncriptada;
    }

    public void setLongitudPalabraEncriptada(int LongitudPalabraEncriptada) {
        this.LongitudPalabraEncriptada = LongitudPalabraEncriptada;
    }

    @Override
    public String toString() {
        return "Palabra{" + "idPalabra=" + idPalabra + ", PalabraBase=" + PalabraBase + ", PalabraEncriptada=" + PalabraEncriptada + ", LongitudPalabraBase=" + LongitudPalabraBase + ", LongitudPalabraEncriptada=" + LongitudPalabraEncriptada + '}';
    }
    
    
}
