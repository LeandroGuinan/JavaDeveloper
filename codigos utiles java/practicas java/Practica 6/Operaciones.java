public class Operaciones{
  public static void main(String args[]){
  
   int operacion = 4;
   int num_uno = 8;
   int num_dos = 4;
   int res = 0; 
  
   if(operacion == 1){
     res = num_uno + num_dos;
     System.out.println("el resultado de la suma es: " + res);
  } else if (operacion == 2){
     res = num_uno - num_dos;
     System.out.println("el resultado de la resta es: " + res); 
  } else if (operacion == 3){
     res = num_uno * num_dos;
     System.out.println("el resultado de la multiplicacion es: " + res);
  } else if(operacion == 4){
     res = num_uno / num_dos;
     System.out.println("el resultado de la division es: " + res);
  } else {
     System.out.println("la opcion no existe");
  }
 }
}