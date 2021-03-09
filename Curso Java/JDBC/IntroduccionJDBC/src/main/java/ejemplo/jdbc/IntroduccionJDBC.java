package ejemplo.jdbc;

import java.sql.*;

public class IntroduccionJDBC {

    public static void main(String[] args) {

        //paso 1 creamos nuestra cadena de coneccion a mysql
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC";

        try {
            //paso 2. creamos el objeto de conexion a la base de datos
            Connection conexion = DriverManager.getConnection(url, "root", "admin");
            //paso 3. creamos un objeto de tipo statement
            Statement instruccion = conexion.createStatement();
            //paso 4. creamos el query
            String sql = "select id_persona, nombre, apellido, email, telefono from persona";
            //paso 5. ejecutamos del query
            ResultSet resultado = instruccion.executeQuery(sql);
            //paso 6. proceamos el resultado
            while (resultado.next()) {
                System.out.print("id persona: " + resultado.getInt(1));
                System.out.print(" Nombre: " + resultado.getString(2));
                System.out.print(" Apellido: " + resultado.getString(3));
                System.out.print(" Email: " + resultado.getString(4));
                System.out.println(" telefono: " + resultado.getString(5));
            }
            resultado.close();
            instruccion.close();
            conexion.close();

        } catch (SQLException ex) {

            ex.printStackTrace(System.out);

        }

    }
}
