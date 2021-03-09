
package paquete2;

import paquete1.Clase1;


public class Clase4 {
    
    public Clase4(){
        //prueba de constructores de clase 1
        
        
        new Clase1();//llamada al constructor publico
        //new Clase1("uno","dos");//llamada al constructor protected
        //new Clase1("uno", "dos", "tres");//lamada al constructor default
        //no podemos llamar a construcotres privados en otra clase
//        new Clase1("uno", "dos", "tres","cuatro");//llamada constructo

    }
    public void pruebaDesdeClase4(){
        Clase1 c1 = new Clase1();
        System.out.println("atributo publico: "+c1.aributoPublico);
        //System.out.println("Atributo Protegido "+c1.atributoProtegido);
        //System.out.println("Atributo Default "+c1.atributoDefault);
        //System.out.println("Atributo Privado "+c1.atributoPrivado);

        System.out.println("");
        System.out.println("Metodo Publico: "+c1.metodoPublico());
        //System.out.println("Metodo default"+ c1.metodoProtegido());
        //System.out.println("Metodo Protegido"+c1.metodoProtegido());
        //System.out.println("Metodo Privado" +c1.metodoPrivado());
    }
    public static void main(String[]args){
        Clase4 c3 = new Clase4();
        c3.pruebaDesdeClase4();
    }
    
}
