package Test;

import entidad.Persona;

public class ForEachTest {

    public static void main(String[] args) {
        int edades[] = {15, 20, 41, 50};

        for (int edad : edades) {
            System.out.println("Edad: " + edad);
        }

        //arreglo tipo persona
        Persona persona[] = {new Persona("Juan"), new Persona("Karla")};
        
        System.out.println("");
        for(Persona p : persona){
            System.out.println("p = " + p);
        }
    }
}
