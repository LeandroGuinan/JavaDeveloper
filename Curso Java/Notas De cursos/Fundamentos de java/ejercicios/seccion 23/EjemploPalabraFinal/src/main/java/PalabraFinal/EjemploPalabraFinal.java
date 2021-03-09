package PalabraFinal;

public class EjemploPalabraFinal {
    public static void main(String []args){
        //Modificar un atributo marcado como final
//        ClaseFinal.VAR_PRIMITIVO = 20;

        //modificar la referencia de un atributo tipo object
        //ClaseFinal.VAR_PERSONA = new Persona();
        
        ClaseFinal.VAR_PERSONA.setNomnre("Juan");
        System.out.println(ClaseFinal.VAR_PERSONA.getNomnre());
        
        ClaseFinal.VAR_PERSONA.setNomnre("Carlos");
        System.out.println(ClaseFinal.VAR_PERSONA.getNomnre());
    }
}
