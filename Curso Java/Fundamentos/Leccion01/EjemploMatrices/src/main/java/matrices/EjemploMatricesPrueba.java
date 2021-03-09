package matrices;

public class EjemploMatricesPrueba {

    public static void main(String[] args) {

        //1.declaramos una matriz e int
        int edades[][];
        //2.instanciamos esta matiz
        edades = new int[3][2];
        //3.intanciamos los valores de la matriz
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;

        //4.imprimir
        System.out.println("Matriz de enteros en el indice 0-0: " + edades[0][0]);
        System.out.println("Matriz de enteros indice 2-0: " + edades[2][0]);

        //1.declaramos e instanciamos una matriz de tipo personas
        Persona personas[][] = new Persona[1][2];

        //2.inicializamos valores
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");

        //3. imprimimos valores
        System.out.println("Matriz persona indice 0-0: " + personas[0][0]);
        System.out.println("Matriz persona indice 0-1: " + personas[0][1]);

        for (int filas = 0; filas < personas.length; filas++) {
            
            for (int columnas = 0; columnas < personas[filas].length; columnas++) {
                
                    System.out.println("Matriz de personas en el indice: "+filas+"-"+columnas+personas[filas][columnas]);
            }

        }

    }
}
