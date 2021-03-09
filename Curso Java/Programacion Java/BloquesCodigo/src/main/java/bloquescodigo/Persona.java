package bloquescodigo;

public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    //bloque de inicializacion de codigo estatico
    static {
        contadorPersonas = 10;

        //Nop podemos utilizar variables NO estaticas en el bloque static
        //idPersona= 2; por eje.
        System.out.println("ejecucion de bloque estatico");
    }
    //bloque no estatico

    {
        System.out.println("Ejecucion bloque no estatico");
        this.idPersona = ++contadorPersonas;
    }
    
    public Persona(){
        System.out.println("Ejecion del constructor");
    }
    public int getIdPersona(){
        return this.idPersona;
    }
}
