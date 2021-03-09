import java.util.Scanner;

public class Traspuesta{
  public static void main(String args[]){


  Scanner in = new Scanner(System.in);
  int entrada = 0, traspuesta = 0;
  int matriz[][] = new int[2][2];

  for(int f = 0; f < 2; f++){
    for(int c = 0; c < 2; c++){
    System.out.print("Ingresa el valor de la posicion " + (f+1) + (c+1) + ": ");
    entrada = in.nextInt();
    matriz[f][c] = entrada;
  
   }
  }
  System.out.println("Tu matriz es: ");
  System.out.print("[" + matriz[0][0] + "]");
  System.out.print("[" + matriz[0][1] + "]");
  System.out.println("");
  System.out.print("[" + matriz[1][0] + "]");
  System.out.print("[" + matriz[1][1] + "]");
  System.out.println("");

  int A = 0, B = 0, C = 0, D = 0;

  A = matriz[0][0];
  B = matriz[0][1];
  C = matriz[1][0];
  D = matriz[1][1];
  
   traspuesta = ((A * D) - (B * C));

   System.out.print("La traspuesta a esta matriz es: " + traspuesta);
 }
}