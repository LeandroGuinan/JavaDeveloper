package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import mx.com.gm.peliculas.domain.*;
import mx.com.gm.peliculas.excepciones.*;

public class AccesoDatosImpl implements AccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);
        List<Pelicula> peliculas = new ArrayList();

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();

            while (linea != null) {
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }

            entrada.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return peliculas;

    }

    @Override
    public void escrbir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {

        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("El archivo se ah escrito correctamente");

        } catch (IOException ex) {

            ex.printStackTrace(System.out);
        }

    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws EscrituraDatosEx {
        File archivo = new File(nombreArchivo);
        String resultado = null;

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            int i = 0;
            linea = entrada.readLine();
            while (linea != null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado = "Pelicula " + linea + "encontrada en indice: " + i;
                    break;

                }

            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return resultado;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ah creado el archivo correctamente");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        archivo.delete();
        System.out.println("Sea ah borrado el archivo correctamente");
    }

}
