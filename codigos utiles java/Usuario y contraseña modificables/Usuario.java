import java.util.Scanner;

public class Usuario{
  public static void main(String args[]){

  Scanner in = new Scanner(System.in);
  String usuario = "admin", NewUs = "",  password = "123", NewPass = "", seleccion = "";
  int controlador = 0;
  

   System.out.print("Desea cambiar su usuario y contrase�a?");
   seleccion = in.nextLine();

   if(seleccion.equalsIgnoreCase("Si")){

    while(password != NewPass){
    System.out.print("Ingrese nuevo nombre de usuario: ");
    NewUs = in.nextLine();

     System.out.print("Ingrese nueva contase�a: ");
    password = in.nextLine();

    System.out.print("Repita nueva contrase�a: ");
    NewPass = in.nextLine();


    if(password.equals(NewPass)){
      password = NewPass;
      usuario = NewUs;
    
   }else
  
    System.out.println("Las contrase�as deben coincidir");

    } 
   }   
   System.out.print("Bienvenido al programa");
   System.out.println("");

   while(controlador < 1){
   System.out.print("Ingrese nombre de usuario:");
   NewUs = in.nextLine();

   System.out.print("Ingrese la contrase�a:");
   NewPass = in.nextLine();

   if(NewUs.equals(usuario) && NewPass.equals(password)){
     password = NewPass;
     usuario = NewUs;
     controlador++;

      System.out.print("Bienvenido usuario: " + usuario);
  }else
   
   System.out.println("Nombre de usuario o contrase�a incorrectos");
   
  } 
 } 
}