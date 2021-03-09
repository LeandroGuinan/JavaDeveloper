import java.util.Scanner;

public class Practica{
  public static void main(String args[]){

  String operacion = "";
  Scanner in = new Scanner(System.in);
  int num_uno = 0, num_dos = 0, res = 0;

  System.out.print("Introduce tu operacion: ");
  operacion = in.nextLine();  

  System.out.print("Introduce tu valor 1: ");
  num_uno = in.nextInt();

  System.out.print("Introduce tu valor 2: ");
  num_dos = in.nextInt();

  if(operacion.equals("+")){
    res = num_uno + num_dos;
    System.out.print("tu resultado es:" + res);
  }else if(operacion.equals("-")){
    res = num_uno - num_dos;
    System.out.print("tu resultado es:" + res);
  }else if(operacion.equals("*")){
    res = num_uno * num_dos;
    System.out.print("tu resultado es:" + res);
  }else if(operacion.equals("/")){
    res = num_uno / num_dos;
    System.out.print("tu resultado es:" + res);

  }else
   System.out.println("Tu opcion no es valida");
 }
}