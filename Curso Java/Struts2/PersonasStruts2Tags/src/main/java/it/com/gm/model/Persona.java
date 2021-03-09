package it.com.gm.model;


public class Persona {
    private String nombre;
    //a diferencia de anteriosres ocaciones utilizamos una clase extra para mapear mas resultados
    Domicilio domicilo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilo() {
        return domicilo;
    }

    public void setDomicilo(Domicilio domicilo) {
        this.domicilo = domicilo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", domicilo=" + domicilo + '}';
    }
    
    
}
