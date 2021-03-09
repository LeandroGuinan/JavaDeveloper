
public class PruebaPersona {

    public static void main(String[]args){
        Persona persona = new Persona("juan",3000,false);
//        System.out.println("Nombre persona: "+persona.getNombre());
//        System.out.println("sueldo persona: "+persona.getSueldo());
//        System.out.println("persona eliminada? "+persona.isEliminado());
        System.out.println("perosna: " + persona);
        persona.setNombre("carlos");
        persona.setSueldo(5000);
        persona.setEliminado(true);
        
//        System.out.println("nombre persona: "+persona.getNombre());
//        System.out.println("sueldo = " + persona.getSueldo());
//        System.out.println("es eliminado? " + persona.isEliminado());

        System.out.println("Perosna: "+persona.toString());
        
        /*el metodo toString regresa una cadena con cada uno de los valores de cada atributo
        de la clase que estemos utilizando, en este claso la clase persona*/
        
    }
    
    
}
