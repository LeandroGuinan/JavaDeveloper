package test;

import ejemploInstanceOf.Empleado;
import ejemploInstanceOf.Gerente;

public class EjemploInstanceOf {

    public static void main(String args[]) {
        Empleado empleado = new Empleado("juan", 1000);
         determinaTipo(empleado);

        Gerente gerente = new Gerente("karla", 2000, "Finanzas");
       // determinaTipo(gerente);
    }

    public static void determinaTipo(Empleado empleado) {

        if (empleado instanceof Gerente) {
            //(casting)
            Gerente gerente = (Gerente) empleado;
            System.out.println(gerente.getDepartamento());
            // System.out.println(((Gerente)empleado).getDepartamento());

        }

        else if (empleado instanceof Empleado) {

            System.out.println(empleado.getNombre());

        }
        
         if(empleado instanceof Object){
            System.out.println("obeject: "+empleado.toString());
            
        }

    }
}
