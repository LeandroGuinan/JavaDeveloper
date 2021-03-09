package test;

import ejemploSobreescritura.Empleado;
import ejemploSobreescritura.Gerente;

public class EjemploSobreescritura {
    public static void main(String args[]){
        Empleado empleado = new Empleado("juan",1000);
        System.out.println("empleado = " + empleado.obtenerDetalles());
        
        Gerente gerente = new Gerente("karla",2000,"Finanzas");
        System.out.println("gerente = " + gerente.obtenerDetalles());
    }
}
