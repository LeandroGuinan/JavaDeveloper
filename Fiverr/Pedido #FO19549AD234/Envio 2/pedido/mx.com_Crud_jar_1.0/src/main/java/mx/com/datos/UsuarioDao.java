package mx.com.datos;

import java.util.List;
import javax.persistence.*;
import javax.swing.JOptionPane;
import mx.com.domain.Usuario;

public class UsuarioDao {

    EntityManagerFactory emf;
    EntityManager em;

    public UsuarioDao() {
        this.emf = Persistence.createEntityManagerFactory("PU");
        this.em = emf.createEntityManager();
    }

    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = em.createNamedQuery("Usuario.findAll").getResultList();
        return usuarios;
    }

    public void insertarUsuarios(Usuario usuario) {
        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Usuario ya existente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void modificarUsuario(Usuario usuario) {
        try {
            em.getTransaction().begin();
            em.merge(usuario);
            em.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            System.out.println("Error en modificar usuario");
        }
    }

    public void eliminarUsuario(Usuario usuario) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(usuario));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            System.out.println("Error en eliminar usuario");
        }
    }
    
    public Usuario encontrarPorId(Usuario usuario){
        return em.find(Usuario.class, usuario.getIdUsuario());
    }
}
