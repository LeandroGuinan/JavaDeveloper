
package it.com.ae.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="palabra")
@NamedQueries({
    @NamedQuery(name ="Palabra.findAll", query="SELECT p FROM Palabra p ORDER BY p.idPalabra")
})
public class Palabra implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idPalabra")
    private int idPalabra;
    
    private String palabraBase;
    private String palabraEncriptada;
    
    private int longitudPalabraBase;
    private int longitudPalabraEncriptada;

    public Palabra() {
    }

    public Palabra(String palabraBase, String palabraEncriptada, int longitudPalabraBase, int longitudPalabraEncriptada) {
        this.palabraBase = palabraBase;
        this.palabraEncriptada = palabraEncriptada;
        this.longitudPalabraBase = longitudPalabraBase;
        this.longitudPalabraEncriptada = longitudPalabraEncriptada;
    }

    public int getIdPalabra() {
        return idPalabra;
    }

    public void setIdPalabra(int idPalabra) {
        this.idPalabra = idPalabra;
    }

    public String getPalabraBase() {
        return palabraBase;
    }

    public void setPalabraBase(String palabraBase) {
        this.palabraBase = palabraBase;
    }

    public String getPalabraEncriptada() {
        return palabraEncriptada;
    }

    public void setPalabraEncriptada(String palabraEncriptada) {
        this.palabraEncriptada = palabraEncriptada;
    }

    public int getLogitudPalabraBase() {
        return longitudPalabraBase;
    }

    public void setLongitudPalabraBase(int lognitudPalabraBase) {
        this.longitudPalabraBase = longitudPalabraBase;
    }

    public int getLongitudPalabraEncriptada() {
        return longitudPalabraEncriptada;
    }

    public void setLongitudPalabraEncriptada(int longitudPalabraEncriptada) {
        this.longitudPalabraEncriptada = longitudPalabraEncriptada;
    }

    @Override
    public String toString() {
        return "Palabra{" + "idPalabra=" + idPalabra + ", palabraBase=" + palabraBase + ", palabraEncriptada=" + palabraEncriptada + ", logitudPalabraBase=" + longitudPalabraBase + ", longitudPalabraEncriptada=" + longitudPalabraEncriptada + '}';
    }
    
}
