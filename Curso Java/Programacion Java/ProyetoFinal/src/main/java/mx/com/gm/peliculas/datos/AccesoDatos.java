package mx.com.gm.peliculas.datos;

import java.util.*;
import mx.com.gm.peliculas.excepciones.*;
import mx.com.gm.peliculas.domain.*;

public interface AccesoDatos {
    
    boolean existe(String nombreArchivo) throws AccesoDatosEx;
    
    public List <Pelicula> listar (String nombreArchivo) throws LecturaDatosEx;
    
    void escrbir (Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
    
    public String buscar(String nombreArchivo, String buscar) throws EscrituraDatosEx;
    
    public void crear (String nombreArchivo) throws AccesoDatosEx;
    
    public void borrar (String nombreArchivo) throws AccesoDatosEx;
    
    
}
