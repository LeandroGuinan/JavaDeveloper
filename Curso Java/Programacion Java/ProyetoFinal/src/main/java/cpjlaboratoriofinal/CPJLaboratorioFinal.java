package cpjlaboratoriofinal;

import java.util.Scanner;
import mx.com.gm.peliculas.negocios.*;

public class CPJLaboratorioFinal {

    private static final Scanner scanner = new Scanner(System.in);
    private static int opcion = -1;
    private static final String nombreArchivo = "C:\\Users\\user\\Desktop\\ejemplo\\lista.txt";
    private static final CatalogoPeliculas catalogoPeli = new CatalogoPeliculasImpl();

    public static void main(String[] args) {
        while (opcion != 0) {

            try {
                System.out.println("Elige opcion: \n1. -Iniciar catalogo peliculas"
                        + "\n2.Agregar Pelicula\n"
                        + "3.-Listar Peliculas\n"
                        + "4.-Buscar Peliculas\n"
                        + "0.-Salir");

                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        catalogoPeli.iniciarArchivo(nombreArchivo);
                        break;

                    case 2:
                        System.out.println("Introduce el nombre de una pelicula a agregar: ");
                        String nombre = scanner.nextLine();
                        catalogoPeli.agregarPelicula(nombre, nombreArchivo);
                        break;

                    case 3:
                        catalogoPeli.listarPeliculas(nombreArchivo);
                        break;

                    case 4:
                        System.out.println("Introduce el nombre de una pelicula a buscar: ");
                        String buscar = scanner.nextLine();
                        catalogoPeli.buscarPelicula(nombreArchivo, buscar);
                        break;

                    case 0:

                        System.out.println("Hasta Pronto!");

                    default:
                        System.out.println("Opcion no reconocida");
                        break;

                }

            } catch (Exception e) {
                System.out.println("ERROR!");

            }

        }

    }
}
