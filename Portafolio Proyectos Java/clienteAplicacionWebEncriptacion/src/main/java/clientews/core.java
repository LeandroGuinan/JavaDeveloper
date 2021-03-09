package clientews;

import clientews.servicio.DecryptWS;
import clientews.servicio.DecryptWSImplService;
import clientews.servicio.EncryptWS;
import clientews.servicio.EncryptWSImplService;
import java.util.Scanner;

public class core {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        DecryptWS serviceDes = new DecryptWSImplService().getDecryptWSImplPort();
        EncryptWS servicioEn = new EncryptWSImplService().getEncryptWSImplPort();
        int control = -1;
        
        System.out.println("Selecciona: \n1: para encriptar una palabra \n2:Desencriptar un ID");
        control = in.nextInt();
        switch(control){
            case 1:
                System.out.println("Inserte Palabra A Encriptar");
                String palabra = in2.nextLine();
                String palabra2 = servicioEn.encrypt(palabra);
                System.out.println("Palabra Encriptada Con Exito: " + palabra2);
                break;
            case 2:
                System.out.println("Inserte ID a Desencriptar");
                Integer id = in.nextInt();
                String palabra3 = serviceDes.decrypt(id);
                System.out.println("Palabra Desencriptada Con Exito: " +palabra3);
                break;
            default:
                System.out.println("Opcion Inexistente");
                break;
        }
    }
}
