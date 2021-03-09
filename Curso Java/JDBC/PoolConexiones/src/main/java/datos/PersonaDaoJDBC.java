package datos;

import domain.PersonaDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDaoJDBC implements PersonaDao {

    //con esta variable tipo coneccion crearemos una unica conexion que
    //podra ejecutar todas las transacciones
    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=?, email=?, telefono=? WHERE id_persona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona=?";

    //creamos el contructor vacio
    public PersonaDaoJDBC() {

    }

    //y el constructor que recibe la coneccion 
    public PersonaDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<PersonaDTO> select() throws SQLException {
        Connection conn = null;

        PreparedStatement stmt = null;
        ResultSet rs = null;
        PersonaDTO persona = null;

        List<PersonaDTO> personas = new ArrayList<PersonaDTO>();

        try {
            //esta linea se interpreta como: si conexionTransaccional es diferente de null
            //utilizaremos el objeto de conexionTransaccional, de lo contrario utilizaremos
            //de lo contrario utilizaremos otra conexion, de ser el caso esta conexion
            //se cerrara en este metodo
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();

            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {

                int id_persona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                persona = new PersonaDTO();
                persona.setIdPersona(id_persona);
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                persona.setEmail(email);
                persona.setTelefono(telefono);

                personas.add(persona);
            }
        } 
        finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            //con esta sentencia, decimos: si la conexion viene del metodo actual
            //esta se cerrara, de lo contrario aun estara abierta
            if (conexionTransaccional == null) {

                Conexion.close(conn);
            }

        }
        //lo mismo se crea para todos los metodos posteriores
        return personas;
    }

    public int insert(PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        int rows = 0;
        try {
            conn = conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());

            System.out.println("Ejecutando query: " + SQL_INSERT);

            rows = stmt.executeUpdate();

            System.out.println("Registros afectados: " + rows);

        }  finally {
            Conexion.close(stmt);
            if (conexionTransaccional == null) {

                Conexion.close(conn);
            }

        }
        return rows;
    }

    public int update(PersonaDTO persona) throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();

            System.out.println("Ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getIdPersona());

            rows = stmt.executeUpdate();

            System.out.println("Registros actualizados: " + rows);

        }  finally {

            Conexion.close(stmt);
            if (conexionTransaccional == null) {

                Conexion.close(conn);
            }
        }
        return rows;
    }

    public int delete(PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();

            System.out.println("Ejecutando query: " + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getIdPersona());

            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados: " + rows);

        }  finally {

            Conexion.close(stmt);
            if (conexionTransaccional == null) {

                Conexion.close(conn);
            }

        }

        return rows;
    }

}
