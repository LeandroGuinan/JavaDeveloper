package datos;

import domain.UsuarioPassword;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UsuarioPasswordJDBC {
    
    private Connection conexionTransaxional;
    
    private static final String SQLSELECT = "SELECT id_usuario, usuario, password FROM sga";
    private static final String SQLINSERT = "INSERT INTO sga(usuario, password)VALUES (?, ?)";
    private static final String SQLUPDATE = "UPDATE sga SET usuario=?, password=? WHERE id_usuario=?";
    private static final String SQLDELETE = "DELETE FROM sga WHERE id_usuario=?";
    
    public UsuarioPasswordJDBC(){
        
    }
    
    public UsuarioPasswordJDBC(Connection conexionTransaxional){
        
        this.conexionTransaxional = conexionTransaxional;
    }

    public List<UsuarioPassword> select() throws SQLException {

        Connection conn = null;

        PreparedStatement stmt = null;

        ResultSet rs = null;

        UsuarioPassword up = null;

        List<UsuarioPassword> upl = new ArrayList<UsuarioPassword>();

        try {
            conn = this.conexionTransaxional != null ? this.conexionTransaxional :Conexion.getConection();

            stmt = conn.prepareStatement(SQLSELECT);

            rs = stmt.executeQuery();

            while (rs.next()) {

                int id_usuario = rs.getInt("id_usuario");
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");

                up = new UsuarioPassword();
                up.setId_usuario(id_usuario);
                up.setUsuario(usuario);
                up.setPassword(password);

                upl.add(up);
            }

        
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            if(conexionTransaxional == null){
                
                Conexion.close(conn);
            }
        }
        return upl;

    }

    public int insert(UsuarioPassword usuarioPass) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = this.conexionTransaxional != null ? this.conexionTransaxional :Conexion.getConection();
            stmt = conn.prepareStatement(SQLINSERT);

            stmt.setString(1, usuarioPass.getUsuario());
            stmt.setString(2, usuarioPass.getPassword());

            System.out.println("Ejecutando query: " + SQLINSERT);

            rows = stmt.executeUpdate();

        
        } finally {

            Conexion.close(stmt);
           if(conexionTransaxional == null){
                
                Conexion.close(conn);
            }
        }

        return rows;

    }

    public int update(UsuarioPassword usuarioPass) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = this.conexionTransaxional != null ? this.conexionTransaxional :Conexion.getConection();
            System.out.println("Ejecutando query: " + SQLUPDATE);
            stmt = conn.prepareStatement(SQLUPDATE);
            
            stmt.setString(1, usuarioPass.getUsuario());
            stmt.setString(2, usuarioPass.getPassword());
            stmt.setInt(3,usuarioPass.getId_usuario());
            
            rows = stmt.executeUpdate();
            
            System.out.println("Numero de registros afectados: "+ rows);
            
            
        } finally{
            Conexion.close(stmt);
            if(conexionTransaxional == null){
                
                Conexion.close(conn);
            }
        }
        return rows;

    }
    
    public int delete(UsuarioPassword usuarioPass) throws SQLException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows =0;
        
        try {
            conn = this.conexionTransaxional != null ? this.conexionTransaxional :Conexion.getConection();
            stmt = conn.prepareStatement(SQLDELETE);
            stmt.setInt(1, usuarioPass.getId_usuario());
            
           rows = stmt.executeUpdate();
            System.out.println("Registros eliminados: "+rows);
            
        } finally{
            
            Conexion.close(stmt);
            if(conexionTransaxional == null){
                
                Conexion.close(conn);
            }
        }
        return rows;
        
        
    }

}
