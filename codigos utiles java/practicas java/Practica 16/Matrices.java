import java.util.Scanner;

public class Matrices{
  public static void main(String args[]){
 
  Scanner in = new Scanner(System.in);
  int filas = 0, columnas = 0;

  System.out.print("Cuantas filas deseas?: ");
  filas = in.nextInt();

  System.out.print("Cuantas columnas deseas?: ");
  columnas = in.nextInt();

  int numeros[][] = new int[filas][columnas];
  int contador = 1;

  for(int j = 0; j < filas; j++){

     for(int i = 0; i < columnas; i++){

     numeros[j][i] = contador;

     contador++;

     System.out.print("[" + numeros[j][i] + "]");

   }
    System.out.println("");
  }

 }
}