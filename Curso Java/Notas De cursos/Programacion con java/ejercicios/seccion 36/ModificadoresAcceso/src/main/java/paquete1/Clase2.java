
package paquete1;

public class Clase2 {
    public Clase2(){
        //prueba de constructores de clase 1
        new Clase1();//llamada al constructor publico
        new Clase1("uno","dos");//llamada al constructor protected
        new Clase1("uno", "dos", "tres");//lamada al constructor default
        //no podemos llamar a construcotres privados en otra clase
//        new Clase1("uno", "dos", "tres","cuatro");//llamada constructor privado
        
    }
    
    public void pruebaDesdeClase2(){
        Clase1 c1 = new Clase1();
        System.out.println("atributo publico "+c1.aributoPublico);
        System.out.println("Atributo Protegido "+c1.atributoProtegido);
        System.out.println("Atributo Default "+c1.atributoDefault);
//        System.out.println("Atributo Privado "+c1.atributoPrivado);

        System.out.println("");
        System.out.println("Metodo Publico"+c1.metodoPublico());
        System.out.println("Metodo default"+c1.metodoProtegido());
        System.out.println("Metodo Protegido"+c1.metodoProtegido());
        //System.out.println("Metodo Privado" +c1.metodoPrivado());
    }
    
    public static void main(String[]args){
        
        
        Clase2 c2 = new Clase2();
        c2.pruebaDesdeClase2();
    }
}
