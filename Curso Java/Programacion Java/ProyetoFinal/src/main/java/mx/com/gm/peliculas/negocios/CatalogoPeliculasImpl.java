package mx.com.gm.peliculas.negocios;

import java.util.List;
import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.*;
import mx.com.gm.peliculas.excepciones.*;

public class CatalogoPeliculasImpl implements CatalogoPeliculas {
    
    private final AccesoDatos DATOS;
    
    public CatalogoPeliculasImpl() {
        this.DATOS = new AccesoDatosImpl();
    }
    
    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        
        try {
            anexar = DATOS.existe(nombreArchivo);
            DATOS.escrbir(pelicula, nombreArchivo, anexar);
        } catch (AccesoDatosEx ex) {
            
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
        
    }
    
    @Override
    public void listarPeliculas(String nombreArchivo) {
        
        try {
            List<Pelicula> peliculas = DATOS.listar(nombreArchivo);
            for (Pelicula pelicula : peliculas) {
                System.out.println("Pelicula: " + pelicula);
            }
            
        } catch (LecturaDatosEx ex) {
            ex.printStackTrace(System.out);
        }
        
    }
    
    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        String resultado = null;
        
        try {
            resultado = DATOS.buscar(buscar, nombreArchivo);
        } catch (EscrituraDatosEx ex) {
            System.out.println("Error al buscar pelicula");
            ex.printStackTrace(System.out);
        }
        
    }
    
    @Override
    public void iniciarArchivo(String nombreArchivo) {
        try {
            if (DATOS.existe(nombreArchivo)) {
                DATOS.borrar(nombreArchivo);
                DATOS.crear(nombreArchivo);
                DATOS.borrar(nombreArchivo);
                
            }
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
