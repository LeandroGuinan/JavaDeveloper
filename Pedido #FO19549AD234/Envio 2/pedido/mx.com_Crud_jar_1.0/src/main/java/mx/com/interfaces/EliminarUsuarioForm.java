/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.interfaces;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import mx.com.domain.Usuario;
import mx.com.service.UsuariosService;

/**
 *
 * @author guina
 */
public class EliminarUsuarioForm extends javax.swing.JFrame {

    /**
     * Creates new form EliminarUsuarioForm
     */
    public EliminarUsuarioForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Eliminar Usuario");
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        UsuariosService servicio = new UsuariosService();
        List<Usuario> usuarios = servicio.listarUsuarios();
        for (Usuario u : usuarios) {
            modelo.addRow(new Object[]{u.getIdUsuario(), u.getIdEmpleado().getPersona().getNombre() + " " + u.getIdEmpleado().getPersona().getApellido(),
                u.getNombreUsuario(), u.getPasswordUsuario(), u.getIdRol().getTipoRol()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        usuarioText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Usuario", "Contraseña", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Usuario:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reestablecer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Volver a menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(nombreText, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(usuarioText))
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(usuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        menuUsuarios menu = new menuUsuarios();
        menuUsuarios.textoUsuario.setText("Bienvenido Usuario Administrador: " + usuario.getNombreUsuario());
        menuUsuarios.usuario = usuario;
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!usuarioText.getText().equals("")) {
            UsuariosService servicio = new UsuariosService();
            DefaultTableModel nuevo = new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "ID", "Nombre", "Usuario", "Contraseña", "Rol"
                    }
            ) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            jTable1.setModel(nuevo);
            List<Usuario> usuarios = servicio.listarUsuarios();
            for (Usuario u : usuarios) {
                nuevo.addRow(new Object[]{u.getIdUsuario(), u.getIdEmpleado().getPersona().getNombre() + " " + u.getIdEmpleado().getPersona().getApellido(),
                    u.getNombreUsuario(), u.getPasswordUsuario(), u.getIdRol().getTipoRol()});
            }

            TableRowSorter<TableModel> modeloFiltrado = new TableRowSorter<TableModel>(nuevo);
            jTable1.setRowSorter(modeloFiltrado);
            modeloFiltrado.setRowFilter(RowFilter.regexFilter(usuarioText.getText(), 2));
            modeloFiltrado = null;
        } else if (!nombreText.getText().equals("")) {
            UsuariosService servicio = new UsuariosService();
            DefaultTableModel nuevo = new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "ID", "Nombre", "Usuario", "Contraseña", "Rol"
                    }
            ) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            jTable1.setModel(nuevo);
            List<Usuario> usuarios = servicio.listarUsuarios();
            for (Usuario u : usuarios) {
                nuevo.addRow(new Object[]{u.getIdUsuario(), u.getIdEmpleado().getPersona().getNombre() + " " + u.getIdEmpleado().getPersona().getApellido(),
                    u.getNombreUsuario(), u.getPasswordUsuario(), u.getIdRol().getTipoRol()});
            }

            TableRowSorter<TableModel> modeloFiltrado = new TableRowSorter<TableModel>(nuevo);
            jTable1.setRowSorter(modeloFiltrado);
            modeloFiltrado.setRowFilter(RowFilter.regexFilter(nombreText.getText(), 1));
            modeloFiltrado = null;
        } else {
            JOptionPane.showMessageDialog(null, "Introduce Datos Para Buscar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        UsuariosService servicio = new UsuariosService();
        DefaultTableModel nuevo = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID", "Nombre", "Usuario", "Contraseña", "Rol"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        List<Usuario> usuarios = servicio.listarUsuarios();
        for (Usuario u : usuarios) {
            nuevo.addRow(new Object[]{u.getIdUsuario(), u.getIdEmpleado().getPersona().getNombre() + " " + u.getIdEmpleado().getPersona().getApellido(),
                u.getNombreUsuario(), u.getPasswordUsuario(), u.getIdRol().getTipoRol()});
        }
        jTable1.setModel(nuevo);
        jTable1.setRowSorter(new TableRowSorter(nuevo));
        jTable1.setAutoCreateRowSorter(true);
        usuarioText.setText("");
        nombreText.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        Integer idM = Integer.parseInt(modelo.getValueAt(jTable1.getSelectedRow(), 0) + "");
        if (idM == usuario.getIdUsuario()) {
            JOptionPane.showMessageDialog(null, "No Puedes Editar o Eliminar un Usuario en Sesion", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            UsuariosService servicio = new UsuariosService();
            Usuario us = new Usuario(idM);
            servicio.eliminarUsuario(us);

            DefaultTableModel nuevo = new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "ID", "Nombre", "Usuario", "Contraseña", "Rol"
                    }
            ) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            List<Usuario> usuarios = servicio.listarUsuarios();
            for (Usuario u : usuarios) {
                nuevo.addRow(new Object[]{u.getIdUsuario(), u.getIdEmpleado().getPersona().getNombre() + " " + u.getIdEmpleado().getPersona().getApellido(),
                    u.getNombreUsuario(), u.getPasswordUsuario(), u.getIdRol().getTipoRol()});
            }
            jTable1.setModel(nuevo);
            jTable1.setRowSorter(new TableRowSorter(nuevo));
            jTable1.setAutoCreateRowSorter(true);
            usuarioText.setText("");
            nombreText.setText("");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void Notmain(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuarioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuarioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuarioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuarioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarUsuarioForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombreText;
    private javax.swing.JTextField usuarioText;
    // End of variables declaration//GEN-END:variables
    public static Usuario usuario;
}
