package arreglos;

public class EjemploArreglos {

    public static void main(String[] args) {
        //1.declaramos un arreglo tipo int

        int edades[];

        //2.intanciamos el arreglo de tipo int
        edades = new int[3];

        //3. inicializammos los valores de los elementos del arreglo
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;
        
        //4.imprimirmos los valores del arreglo
        
        System.out.println("arreglo de enteros indice 0: "+edades[0]);
        System.out.println("arreglo de enteros indice 1: "+edades[1]);
        System.out.println("arreglo de enteros indice 2: "+edades[2]);
        
        //1. declaramos un arreglo de tipo object
        
        Persona personas[] = new Persona[4];
        //incicializamos los valores del arreglo
        
        personas[0] = new Persona("Juan");
        personas[2] = new Persona("Karla");
        
        System.out.println("Arreglo personas indice 0: "+ personas[0]);
        System.out.println("Arreglo personas indice 1: "+ personas[1]);
        System.out.println("Arreglo personas indice 2: "+ personas[2]);
        System.out.println("Arreglo personas indice 3: "+ personas[3]);
        
        //Arreglos notacion simplificada
        String nombres[] = {"Sara","Laura","Carlos","Carmen"};
        
        //imprimimos los elementos de un arreglo
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Arreglo String indice: "+i +", "+nombres[i]); 
        }
    }

}
