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
import mx.com.domain.Cliente;
import mx.com.service.ClienteService;

/**
 *
 * @author guina
 */
public class BuscarForm extends javax.swing.JFrame {

    /**
     * Creates new form BuscarForm
     */
    public BuscarForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Buscar Datos");
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        ClienteService servicio = new ClienteService();
        List<Cliente> clientes = servicio.listarClientes();
        for (Cliente c : clientes) {
            modelo.addRow(new Object[]{c.getIdCliente().toString(), c.getNombre(), c.getApellido(),
                c.getCui().toString(), c.getEdad(), c.getIdContacto().getTelefono1(),
                c.getIdContacto().getTelefono2(), c.getIdDireccion().getDireccion(),
                c.getNit(), c.getIdContacto().getEmail(), c.getIdContribuyente().getDescripcion(),
                c.getIdIsr().getTipoIsr(), c.getIdEmpresa().getNombreEmpresa()});
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
        jButton1 = new javax.swing.JButton();
        nitField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cuiField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Cliente", "Nombre", "Apellido", "CUI", "Edad", "Telefono 1", "Telefono 2", "Direccion", "NIT", "Email", "Contribuyente", "ISR", "Empresa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("NIT");

        jLabel2.setText("CUI");

        jLabel3.setText("Nombre");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Buscar");

        jButton3.setText("Reestablecer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1)
                        .addComponent(nitField)
                        .addComponent(jLabel1)
                        .addComponent(cuiField, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(nombreField, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nitField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cuiField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(15, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        menu mn = new menu();
        if (privilegiosAdmin) {
            menu.gestionUsuarios.setEnabled(true);
        } else {
            menu.gestionUsuarios.setEnabled(false);
        }
        menu.etiquetaRol.setText(textoRol);
        menu.etiquetaUsuario.setText(textoUsuario);
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ClienteService servicio = new ClienteService();

        if (!this.cuiField.getText().equals("")) {
            DefaultTableModel nuevo = new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "ID Cliente", "Nombre", "Apellido", "CUI", "Edad", "Telefono 1", "Telefono 2", "Direccion", "NIT", "Email", "Contribuyente", "ISR", "Empresa"
                    }
            ) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            jTable1.setModel(nuevo);
            List<Cliente> clientes = servicio.listarClientes();
            for (Cliente c : clientes) {
                nuevo.addRow(new Object[]{c.getIdCliente().toString(), c.getNombre(), c.getApellido(),
                    c.getCui().toString(), c.getEdad(), c.getIdContacto().getTelefono1(),
                    c.getIdContacto().getTelefono2(), c.getIdDireccion().getDireccion(),
                    c.getNit(), c.getIdContacto().getEmail(), c.getIdContribuyente().getDescripcion(),
                    c.getIdIsr().getTipoIsr(), c.getIdEmpresa().getNombreEmpresa()});
            }
            TableRowSorter<TableModel> modeloFiltrado = new TableRowSorter<TableModel>(nuevo);
            jTable1.setRowSorter(modeloFiltrado);
            modeloFiltrado.setRowFilter(RowFilter.regexFilter(cuiField.getText(), 3));
            modeloFiltrado = null;

        } else if (!this.nitField.getText().equals("")) {

            DefaultTableModel nuevo = new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "ID Cliente", "Nombre", "Apellido", "CUI", "Edad", "Telefono 1", "Telefono 2", "Direccion", "NIT", "Email", "Contribuyente", "ISR", "Empresa"
                    }
            ) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            jTable1.setModel(nuevo);
            List<Cliente> clientes = servicio.listarClientes();
            for (Cliente c : clientes) {
                nuevo.addRow(new Object[]{c.getIdCliente().toString(), c.getNombre(), c.getApellido(),
                    c.getCui().toString(), c.getEdad(), c.getIdContacto().getTelefono1(),
                    c.getIdContacto().getTelefono2(), c.getIdDireccion().getDireccion(),
                    c.getNit(), c.getIdContacto().getEmail(), c.getIdContribuyente().getDescripcion(),
                    c.getIdIsr().getTipoIsr(), c.getIdEmpresa().getNombreEmpresa()});
            }
            TableRowSorter<TableModel> modeloFiltrado = new TableRowSorter<TableModel>(nuevo);
            jTable1.setRowSorter(modeloFiltrado);
            modeloFiltrado.setRowFilter(RowFilter.regexFilter(nitField.getText(), 8));
            modeloFiltrado = null;
        } else if (!this.nombreField.getText().equals("")) {
            DefaultTableModel nuevo = new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "ID Cliente", "Nombre", "Apellido", "CUI", "Edad", "Telefono 1", "Telefono 2", "Direccion", "NIT", "Email", "Contribuyente", "ISR", "Empresa"
                    }
            ) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }

            };
            jTable1.setModel(nuevo);
            List<Cliente> clientes = servicio.listarClientes();
            for (Cliente c : clientes) {
                nuevo.addRow(new Object[]{c.getIdCliente().toString(), c.getNombre(), c.getApellido(),
                    c.getCui().toString(), c.getEdad(), c.getIdContacto().getTelefono1(),
                    c.getIdContacto().getTelefono2(), c.getIdDireccion().getDireccion(),
                    c.getNit(), c.getIdContacto().getEmail(), c.getIdContribuyente().getDescripcion(),
                    c.getIdIsr().getTipoIsr(), c.getIdEmpresa().getNombreEmpresa()});
            }

            TableRowSorter<TableModel> modeloFiltrado = new TableRowSorter<TableModel>(nuevo);
            jTable1.setRowSorter(modeloFiltrado);
            modeloFiltrado.setRowFilter(RowFilter.regexFilter("(?i)"+nombreField.getText(), 1));
            modeloFiltrado = null;
        } else {
            JOptionPane.showMessageDialog(null, "Introduce Datos Para Buscar", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ClienteService servicio = new ClienteService();
        DefaultTableModel nuevo = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID Cliente", "Nombre", "Apellido", "CUI", "Edad", "Telefono 1", "Telefono 2", "Direccion", "NIT", "Email", "Contribuyente", "ISR", "Empresa"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };

        List<Cliente> clientes = servicio.listarClientes();
        for (Cliente c : clientes) {
            nuevo.addRow(new Object[]{c.getIdCliente().toString(), c.getNombre(), c.getApellido(),
                c.getCui().toString(), c.getEdad(), c.getIdContacto().getTelefono1(),
                c.getIdContacto().getTelefono2(), c.getIdDireccion().getDireccion(),
                c.getNit(), c.getIdContacto().getEmail(), c.getIdContribuyente().getDescripcion(),
                c.getIdIsr().getTipoIsr(), c.getIdEmpresa().getNombreEmpresa()});
        }
        jTable1.setModel(nuevo);
        jTable1.setRowSorter(new TableRowSorter(nuevo));
        jTable1.setAutoCreateRowSorter(true);
        cuiField.setText("");
        nombreField.setText("");
        nitField.setText("");

    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void NotMain(String args[]) {
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
            java.util.logging.Logger.getLogger(BuscarForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cuiField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nitField;
    private javax.swing.JTextField nombreField;
    // End of variables declaration//GEN-END:variables
    public static boolean privilegiosAdmin = false;
    public static String textoUsuario = "";
    public static String textoRol = "";
}
