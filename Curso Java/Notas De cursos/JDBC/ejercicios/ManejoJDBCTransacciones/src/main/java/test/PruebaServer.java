package test;

import datos.UsuarioPasswordJDBC;
import domain.UsuarioPassword;
import java.util.List;
import java.util.Scanner;

public class PruebaServer {

    public static void main(String[] args) {

        UsuarioPasswordJDBC usuario = new UsuarioPasswordJDBC();
        UsuarioPassword us = new UsuarioPassword();
        Scanner in = new Scanner(System.in);
        
        int tempId=0;
        int seleccion = -1;
        
//        List<UsuarioPassword> lista = usuario.select();
        String usuarioN = "";
        String passwordN = "";

        while (seleccion != 0) {
            System.out.println("Selelecciona: \n 1.ver datos del servidor \n 2.insertar datos en el servidor \n 3.reescribir un dato del servidor \n 4.Eliminar dato del servidor \n 0. salir");
            seleccion = in.nextInt();

            switch (seleccion) {
               /* case 1:
                    for (UsuarioPassword nose : lista) {
                        System.out.println("estado del servidor: " + nose);
                    }
                    break;*/
                    
                case 2:
                    System.out.println("Introduciendo datos pre-seleccionados");
                    
                    us.setUsuario("Leandro");
                    
                    us.setPassword("Casa009");
                    usuario.insert(us);
                    
                    break;
                    
                case 3:
                    
                    System.out.println("Resscribiendo datos");
                    
                    System.out.println("Introduce el id del usuario a modificar");
                    tempId=in.nextInt();
                    us.setId_usuario(tempId);
                    
                    us.setUsuario("Jose");
                    us.setPassword("verga");
                    
                    usuario.update(us);
                    
                case 4:
                    
                    System.out.println("Introduce el id del usuario a eliminar");
                    tempId=in.nextInt();
                    us.setId_usuario(tempId);
                    usuario.delete(us);
                    break;
                default:
                    System.out.println("seleccion no valida");
                    break;
            }

        }

    }
}
