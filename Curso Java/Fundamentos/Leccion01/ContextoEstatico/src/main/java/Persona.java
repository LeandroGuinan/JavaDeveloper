
public class Persona {

    private int idPersona; //se asocia con un objeto (instancia)
    private String nombre;
    private static int contadorPersonas; //se asocia con la clase y no con los objetos

    public Persona(String nombre) {
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;

    }

    public int getIdPersona() {
        return this.idPersona;
    }
//    public void setIdPersona(int idPersona){
//        this.idPersona = idPersona;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return "IdPersona: " + idPersona + ", nombre: " +nombre+ " ContadorPersonas: " + contadorPersonas;
    }
}
