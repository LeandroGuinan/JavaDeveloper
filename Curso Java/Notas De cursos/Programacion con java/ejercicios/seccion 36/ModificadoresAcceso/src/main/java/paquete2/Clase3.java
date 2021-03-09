package paquete2;

import paquete1.Clase1;
import paquete1.Clase2;


public class Clase3 extends Clase1 {
    
    public Clase3(){
        
        //prueba de constructores de clase 1
        super("uno","dos");//podemos hacer uso de los elementos marcados como protegidos en una clase hija
        
        new Clase1();//llamada al constructor publico
        //new Clase1("uno","dos");//llamada al constructor protected
        //new Clase1("uno", "dos", "tres");//lamada al constructor default
        //no podemos llamar a construcotres privados en otra clase
//        new Clase1("uno", "dos", "tres","cuatro");//llamada constructo

        
    }
    
    public void pruebaDesdeClase3(){
        Clase1 c1 = new Clase1();
        System.out.println("atributo publico "+c1.aributoPublico);
        System.out.println("Atributo Protegido "+atributoProtegido);
        //System.out.println("Atributo Default "+c1.atributoDefault);
        //System.out.println("Atributo Privado "+c1.atributoPrivado);

        System.out.println("");
        System.out.println("Metodo Publico"+c1.metodoPublico());
        System.out.println("Metodo default"+ metodoProtegido());
        //System.out.println("Metodo Protegido"+c1.metodoProtegido());
        //System.out.println("Metodo Privado" +c1.metodoPrivado());
    }
    
    
        
    public static void main(String[]args){
        
        
        Clase3 c3 = new Clase3();
        c3.pruebaDesdeClase3();
    }
    
}
