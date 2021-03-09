package test;

import datos.*;
import exepciones.*;

public class ManejoExcepciones2 {

    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMySql();

        datos.simularError(false);

        ejecutar(datos, "listar");
        
        AccesoDatos datos2 = new ImplementacionOracle();
        datos2.simularError(false);
        
        ejecutar(datos2, "insertar");
    }

    private static void ejecutar(AccesoDatos datos, String accion) {
        if ("listar".equals(accion)) {
            try {
                datos.listar();

            } catch (LecturaDatosEx ex) {
                System.out.println("Error de lectura");
                ex.printStackTrace(System.out);
            } catch (AccesoDatosEX ex) {

                System.out.println("Error acceso a datos");
                ex.printStackTrace(System.out);

            } catch (Exception ex) {
                System.out.println("Error general");
                ex.printStackTrace(System.out);
            } finally {
                System.out.println("procesar finally es opcional, pero siempre se va a ejecutar");

            }

        } else if ("insertar".equals(accion)) {
            try {
                datos.insertar();
            } catch (AccesoDatosEX ex) {
                System.out.println("Exepcion de acceso a datos");
                ex.printStackTrace(System.out);
            } finally {
                System.out.println("Procesar este bloque es opcional");
            }

        } else {
            System.out.println("No se proporciono ninguna accion conocida");
        }

    }
}
