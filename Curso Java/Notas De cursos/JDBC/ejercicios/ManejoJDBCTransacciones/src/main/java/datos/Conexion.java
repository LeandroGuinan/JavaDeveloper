package datos;

import java.sql.*;



public class Conexion {
    
    //esta es la direccion de la base de datos, por ende debe ser final
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC";
    //lo mismo para el usuario
    private static final String JDBC_USER = "root";
    //y la contraseña
    private static final String JDBC_PASS = "admin";
    
    //en este metodo se establece la conexion al servidor, se deben agregar: direccion, usuario y contraseña.
    public static Connection getConection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASS);
    }
    
    
    //aqui se cierran las conecciones con la la clase que se encarga de seleccionar los resultados
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    //en este metodo se cierran las conecciones con los statements
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    //en esta se cierran las conecciones con el servidor
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
