package test;


public class AutoboxingUnboxing {
    public static void main(String[]args){
        
        //Autoboxing (envolvemos tipos primitivos en clases de tipo wrapper)
        
        Integer enteroObj = 10;
        
        System.out.println("entero = " + enteroObj);
        
        //Unboxing (extraemos el tipo primitivo del objeto envolvente)
        
        int entero = enteroObj;
        System.out.println("entero = " + entero);
        
        Float floatobj = 15.4F;
        System.out.println("floatobj = " + floatobj);
        float flotante = floatobj;
        System.out.println("flotante = " + flotante);
        System.out.println("int a partir de float = " + floatobj.intValue());
        
        //Lista de  clases envolventes
        //primitiva / envolvente
        //boolean   - Boolean
        //byte      - Byte
        //char      - Character
        //short     - Short
        //int       - Integer
        //long      - Long
        //float     - Float
        //double    - Double
    }
}
