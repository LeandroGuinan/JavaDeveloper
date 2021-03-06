package PalabraFinal;

public  class ClaseFinal {

    //Variables marcada marcadas como final
    public final int varNumero = 10;

    //constantes en java
    //por lo general las constantes en java son todas en mayus
    //si tienen mas de dos palabras estan separadas por un _
    public static final int VAR_PRIMITIVO = 15;

    public static final Persona VAR_PERSONA = new Persona();
    
    //metodo final, lo vemos a detalle en el tema de sobreescritura
    //si marcamos un metodo como final, ya no podra ser reescrito en la clase hija
    
    public final void metodoFinal(){
        
    }
}
//no es posible crear clases hijas
//de una clase marcada como final
class ClaseHija extends ClaseFinal{
        //no es posible modificar el comportamiento (sobreescritura)
        //de un metodo padre marado como final
//       public void metodoFinal(){
//           
//       }

}
