import java.util.Scanner;

public class Practica{
  public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   String nombre = "";
   int num_uno = 0, num_dos = 0, res= 0;


   System.out.println("******************************************");
   System.out.println("*Bienvenido a mi practica de programacion*");
   System.out.println("******************************************");
   System.out.println("");
   System.out.println("");
   System.out.println("**********************************");
   System.out.println("*Para comenzar, ingresa tu nombre*");
   System.out.println("**********************************");
   nombre = in.nextLine();
   System.out.println("***********************************************");
   System.out.println("*Ahora Introduce la cantidad que quieres sumar*");
   System.out.println("***********************************************");
   num_uno = in.nextInt();
   System.out.println("***************************");
   System.out.println("*Uno mas, no seas vago -.-*");
   System.out.println("***************************");
   num_dos = in.nextInt();

   res = num_uno + num_dos;

   System.out.println("*********************************************************************************");
   System.out.println("*Hey "+ nombre +", el resultado de tu suma es: " + res + "Bai bb, saludos a tu mami ;)*");
   System.out.println("*********************************************************************************");
 }
}