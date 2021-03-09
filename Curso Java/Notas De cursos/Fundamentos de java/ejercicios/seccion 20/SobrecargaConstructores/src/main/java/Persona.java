
public class Persona {

    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;
    
    private Persona(){
        //super(); se manda a llamar de manera automatica
        this.idPersona = ++contadorPersonas;
    }
    
    //Constructor completo = sobrecarga
    
    public Persona(String nombre, int edad){
        //el this manda a llamar al constructor privado sin argumentos
        this();
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }
    
    
}
