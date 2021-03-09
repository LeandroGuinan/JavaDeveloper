
public class PalabraNull {

    public static void main(String args[]) {
        Persona persona = new Persona("Juan");
        System.out.println("perona = " + persona.obtenerNombre());
        Persona persona2 = persona;
        System.out.println("persona2 = " + persona2.obtenerNombre());

        persona = null;
        
        if (persona != null) {
            
            System.out.println("persona = " + persona.obtenerNombre());
            
        } else {
            System.out.println("La variable persona no apunta a ningun objeto");
            persona2=null;
            System.gc();//este es el recolector de basura, pero solo podemos planificarlo, este se ejecutara cuando la consola virtual lo perimta
        }
    }
}

class Persona {

    String nombre;//por default es null para los atribulos de objetos

    Persona(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return this.nombre;
    }
}
