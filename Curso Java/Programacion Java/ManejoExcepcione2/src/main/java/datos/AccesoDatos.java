package datos;

import exepciones.AccesoDatosEX;


public interface AccesoDatos {
   public static final int MAX_REGISTROS = 10;
   
   public abstract void insertar() throws AccesoDatosEX;
   
   public abstract void listar() throws AccesoDatosEX;
   
   public abstract void simularError(boolean simularError);
    
}
