package test;

import datos.Conexion;
import datos.UsuarioPasswordJDBC;
import domain.Persona;
import domain.UsuarioPassword;
import java.sql.*;



public class PruebaServer2 {

    public static void main(String[] args) {
        
       Connection conexion = null;
       
        try {
            conexion = Conexion.getConection();
            //con esto ya tenemos nuestra conexion fuera de PersonaJDBC
            
            
            //revisamos que la conexion no haga autocomit
            if(conexion.getAutoCommit()){
                    //  de ser asi la cambiamos a false, para que no la haga
                conexion.setAutoCommit(false);
                
            }
            //utilizamos el constructor con un argumento de la clase
            //PersonaJDBC, ahora enviamos el objeto conexion
            //para establecer una conexion. de lo contrario
            //se ejecutara y cerrara la conexion con cada instancia de
            // transaccion
            UsuarioPasswordJDBC usuario = new UsuarioPasswordJDBC();
            
            UsuarioPassword cambioDatos = new UsuarioPassword();
            
            cambioDatos.setId_usuario(3);
            cambioDatos.setUsuario("jose");
            cambioDatos.setPassword("niIdea");
            
            
            usuario.update(cambioDatos);
            
            
            
            UsuarioPasswordJDBC nuevoUs = new UsuarioPasswordJDBC();
            
            
            //al hacer todas las modificaciones, al llamar este metodo
            //podremos guardar nuestras modificaciones en la base de datos
            conexion.commit();
            System.out.println("Seah hecho comit de la transaccion");
        } catch (SQLException ex) {
            
           try {
               ex.printStackTrace(System.out);
               System.out.println("entramos el rollback");
               
               conexion.rollback();
               
           } catch (SQLException ex1) {
               
               ex1.printStackTrace(System.out);
           }
            
        }
    }
}
