package datos;

import domain.Persona;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PersonaJDBC {

    //esta sentencia es la que se utiliza para tomar los valores de la base de datos y guardarlo en variables locales
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=?, email=?, telefono=? WHERE id_persona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona=?";

    //este metodo nos regresara el listado de objetos tipo persona
    public List<Persona> select() {
        //este objeto se utiliza para crear una conxion a la base de datos
        //que previamente se ah establecido una conexion en la clase conexion
        //con la clase Connection, esta llamada en la clase Conexion
        Connection conn = null;

        //con esta llamada a objeto utilizamos los statament que se utilizan para 
        //agilizar el proceso de seleccion
        PreparedStatement stmt = null;
        //con este podemos seleccionar los objetos utilizados en tiempo real y guardarlos en variables temporales
        ResultSet rs = null;
        //con esto guardamos los datos en la clase persona
        Persona persona = null;

        //aqui se crea una lista en la que solo pueden entrar datos de tipo persona
        List<Persona> personas = new ArrayList<Persona>();

        try {
            //se llama al metodo de la clase previamente establecido, que establece la conexion
            conn = Conexion.getConection();
            //este recibe las selecciones especificadas en la variable
            stmt = conn.prepareStatement(SQL_SELECT);
            //esta ejecuta la consulta seleccionada por el 
            rs = stmt.executeQuery();
            while (rs.next()) {

                //este grupo de variables toman los datos seleccionados de la base de datos y lo guardan en variables temporales
                int id_persona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                //en este grupo se llaman a los metodos de la clase persona donde se alojan informacion
                //y se le guardan los datos de las variables temporales
                persona = new Persona();
                persona.setIdPersona(id_persona);
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                persona.setEmail(email);
                persona.setTelefono(telefono);

                //por ultimo se utiliza la lista creada previamente para crear una base de datos local
                personas.add(persona);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);

        } finally {
            //es importante cerrar siempre las conecciones, por eso el finnaly
            //pase lo que pase siempre se ejecutara
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return personas;
    }

    //este metodo inserta valores establecidos por la clase prueba en la base de datos, retornando tambien el numero de campos afectados por esto
    public int insert(Persona persona) {
        //variable que apunta a objeto para establecer una conexion
        Connection conn = null;
        //creamos un objetos para para ejecutar el query
        PreparedStatement stmt = null;

        int rows = 0;//esta se usa para saber cuantos registros se vieron afectados
        try {
            //establecemos conexion
            conn = Conexion.getConection();
            //ejecutamos la sentencia insert pre definida
            stmt = conn.prepareStatement(SQL_INSERT);

            //individualmente agregamos los campos en la base de datos
            //sin contar id persona, porque lo genera automaticamente
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());

            //aqui escribimos la accion
            System.out.println("Ejecutando query: " + SQL_INSERT);

            //esto nos regresa un entero con el numero de valores modificados
            rows = stmt.executeUpdate();

            //aqui mostramos los campos afectados por estos
            System.out.println("Registros afectados: " + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);

        } finally {
            //IMPORANTE CERRAR CONEXION
            Conexion.close(stmt);
            Conexion.close(conn);

        }
        return rows;
    }

    public int update(Persona persona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConection();
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getIdPersona());
            
            rows = stmt.executeUpdate();
            
            System.out.println("Registros actualizados: "+ rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
           Conexion.close(conn);
           Conexion.close(stmt);
        }
        return rows;
    }
    
    public int delete(Persona persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConection();
            System.out.println("Ejecutando query: "+ SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getIdPersona());
            
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados: "+rows);
            
            
            
        } catch (SQLException ex) {
            
            ex.printStackTrace(System.out);
        }
        
        finally{
            
            Conexion.close(stmt);
            Conexion.close(conn);
            
            
        }
        
        return rows;
    }

}
