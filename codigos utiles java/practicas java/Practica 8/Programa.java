import java.util.Scanner;

public class Programa{
  public static void main(String args[]){
  
   Scanner in = new Scanner(System.in);
   String nombre = "";
   int clave = 0, antiguedad = 0;

   System.out.println("******************************************************");
   System.out.println("*Bienvenido a sistema vacacional de Coca-Cola Company*");
   System.out.println("******************************************************");
   System.out.println("");
   System.out.println("");

   System.out.println("?Cual es el nombre del trabajador?");
   nombre = in.nextLine();
   System.out.println("");

   System.out.println("?Cuantos a?os de servicio tiene el trabajador?");
   antiguedad = in.nextInt();
   System.out.println("");  

   System.out.println("?Cual es la clave del departamento?");
   clave = in.nextInt();
   System.out.println("");

   if(clave == 1){
    if(antiguedad ==1){
     System.out.println(nombre + ", Derecho a 6 dias");
   }else if(antiguedad >= 2 && antiguedad <= 6){
     System.out.println(nombre +  ", Derecho a 14 dias");
   }else if(antiguedad >=7){
     System.out.println(nombre + ", Derecho a 20 dias");
   }else
     System.out.println("Aun no tiene derecho a vacaciones");
  }else if (clave == 2){
    if(antiguedad ==1){
     System.out.println(nombre + ", Derecho a 7 dias");
   }else if(antiguedad >= 2 && antiguedad <= 6){
     System.out.println(nombre +  ", Derecho a 15 dias");
   }else if(antiguedad >=7){
     System.out.println(nombre + ", Derecho a 22 dias");
   }else
     System.out.println("Aun no tiene derecho a vacaciones");
  }else if(clave == 3){
    if(antiguedad ==1){
     System.out.println(nombre + ", Derecho a 10 dias");
   }else if(antiguedad >= 2 && antiguedad <= 6){
     System.out.println(nombre +  ", Derecho a 20 dias");
   }else if(antiguedad >=7){
     System.out.println(nombre + ", Derecho a 30 dias");
   }else
     System.out.println("Aun no tiene derecho a vacaciones");
  }else
    System.out.println("ERROR, La clave del departamento no existe");
 }
}