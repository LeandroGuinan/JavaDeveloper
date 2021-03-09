package test;

import ejemploPolimorfismo.Empleado;
import ejemploPolimorfismo.Gerente;

public class EjemploPolimorfismo {
    public static void main(String args[]){
        Empleado empleado = new Empleado("juan",1000);
        imprimirDetalles(empleado);
        
        Gerente gerente = new Gerente("karla",2000,"Finanzas");
        imprimirDetalles(gerente);
    }
    
    public static void imprimirDetalles(Empleado empleado){
        System.out.println("Empleado: "+ empleado.obtenerDetalles());
    }
}
