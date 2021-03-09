package test;

import dominio.*;
//import org.openjdk.jol.info.GraphLayout;
//import org.openjdk.jol.vm.VM;

public class ClaseObject {

    public static void main(String[] args) {

        Empleado emp1 = new Empleado("juan", 1000);
        //System.out.println("emp1 = " + emp1);
        
        Empleado emp2 = new Empleado("juan", 1000);
        //System.out.println("emp2 = " + emp2);
        
//        System.out.println("Objetos iguales: " +(emp1 == emp2));
//        
//        System.out.println("Direccion memoria empleado 1: " + VM.current().addressOf(emp1));
//        System.out.println("Direccion memoria empleado 2: " + VM.current().addressOf(emp2));
//        
//        System.out.println("Detalle empleado 1: " + GraphLayout.parseInstance(emp1).toPrintable());
//       System.out.println("Detalle empleado 2: " + GraphLayout.parseInstance(emp2).toPrintable());

          compararObjetos(emp1,emp2);
        
    
    }
    
    private static void compararObjetos(Empleado emp1, Empleado emp2){
        System.out.println("Empleado 1:"+emp1);
        System.out.println("Empleado 2:"+emp2);
        
        //revision por referencia:
        if(emp1 == emp2){
            System.out.println("Los objetos tienen la misma direccion en memoria");
        }else{
            System.out.println("Los objetos tienen distinta direccion en memoria");
        }
        
        //revision del metodo equals
        if(emp1.equals(emp2)){
            System.out.println("Los objetos tienen el mismo contenido");
        }else{
            System.out.println("Los objetos NO tienen el mismo contenido");
        }
        
        //revision por hashCode
        
        if(emp1.hashCode() == emp2.hashCode()){
            System.out.println("Los objetos tienen el mismo codigo hash");
            System.out.println("Codigo hash Empleado1: "+emp1.hashCode());
            System.out.println("Codigo hash Empleado2: "+emp2.hashCode());
            
        }else{
            System.out.println("Los objetos NO tienen el mismo codigo hash");
        }
    }
}
