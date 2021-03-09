import java.util.Scanner;

public class Calculadora{
  public static void main(String args[]){
   
   Scanner in = new Scanner(System.in);
   int con = 0;
   int num_uno = 0, num_dos = 0, res = 0;

   System.out.println("Dame el primer valor");
   num_uno = in.nextInt();
   
   System.out.println("Dame el segundo valor");
   num_dos = in.nextInt();

   System.out.println("introduce 1 para sumar, 2 para restar, 3 para multiplicar, 4 para dividir");
   con = in.nextInt(); 

    if(con == 1){
    res = num_uno + num_dos;
    System.out.println("El resultado de tu suma es: " + res);
  }else if(con == 2){
    res = num_uno - num_dos;
    System.out.println("El resultado de tu resta es: " + res);
  }else if(con == 3){
    res = num_uno * num_dos;
    System.out.println("El resultado de tu multiplicacion es: " + res);
  }else if(con == 4){
    res = num_uno / num_dos;
    System.out.println("El resultado de tu division es: " + res);  
  }else 
    System.out.println("Tu seleccion no es valida");

    System.out.println("Tu programa a finalizado con exito");
 }
}