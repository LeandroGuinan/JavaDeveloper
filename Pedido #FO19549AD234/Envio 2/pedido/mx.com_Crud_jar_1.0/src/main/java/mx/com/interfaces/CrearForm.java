/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.interfaces;

import javax.swing.JOptionPane;
import mx.com.domain.*;
import mx.com.service.ClienteService;
import mx.com.util.AgregarMail;

/**
 *
 * @author guina
 */
public class CrearForm extends javax.swing.JFrame {

    /**
     * Creates new form CrearForm
     */
    public CrearForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Agregar Datos");
        municipioBox.setEnabled(false);
        contribuyenteBox.removeAllItems();
        contribuyenteBox.addItem("pequeño");
        contribuyenteBox.addItem("normal");
        isrBox.removeAllItems();
        isrBox.addItem("mensual");
        isrBox.addItem("trimestral");
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
        jLabel1 = new javax.swing.JLabel();
        CUIText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ApellidoText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EdadText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nitText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        telefono1Text = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        telefono2Text = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        contribuyenteBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        direccionText = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        zonaText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        empresaText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        coloniaText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        isrBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        nombreText = new javax.swing.JTextField();
        departamentoBox = new javax.swing.JComboBox<>();
        municipioBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 99, -1, -1));
        jPanel1.add(CUIText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 133, 87, -1));

        jLabel2.setText("Apellido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 99, -1, -1));

        jLabel3.setText("CUI");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 99, -1, -1));
        jPanel1.add(ApellidoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 133, 87, -1));

        jLabel4.setText("Edad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 99, -1, -1));
        jPanel1.add(EdadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 133, 87, -1));

        jLabel5.setText("Nit");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, -1, -1));
        jPanel1.add(nitText, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 87, -1));

        jLabel6.setText("Telefono 1");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 175, -1, -1));
        jPanel1.add(telefono1Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 197, 87, -1));

        jLabel7.setText("Telefono 2");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 175, -1, -1));
        jPanel1.add(telefono2Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 197, 87, -1));

        jLabel8.setText("Email");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 175, -1, -1));

        jLabel9.setText("Contribuyente");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, -1, -1));

        contribuyenteBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contribuyenteBoxActionPerformed(evt);
            }
        });
        jPanel1.add(contribuyenteBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, -1, -1));

        jLabel10.setText("Departamento");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 247, -1, -1));

        jLabel11.setText("Municipio");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 247, -1, -1));
        jPanel1.add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 197, 87, -1));

        jLabel12.setText("Direccion");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 175, -1, -1));
        jPanel1.add(direccionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 197, 87, -1));

        jLabel13.setText("Zona");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));
        jPanel1.add(zonaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 87, -1));

        jLabel14.setText("Colonia");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));
        jPanel1.add(empresaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 87, -1));

        jLabel15.setText("Empresa");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));
        jPanel1.add(coloniaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 87, -1));

        jLabel16.setText("ISR");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jPanel1.add(isrBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 438, -1, -1));

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 438, -1, -1));
        jPanel1.add(nombreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 133, 87, -1));

        departamentoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------------", "Alta Verapaz", "Baja Verapaz", "Chimaltenango", "Chiquimula", "Peten", "El progreso", "El Quiché", "Escuintla", "Guatemala", "Huehuetenango", "Izabal", "Jalapa", "Jutiapa", "Quetzaltenango", "Retalhuleu", "Sacatepéquez", "San Marcos", "Santa Rosa", "Sololá", "Suchitepéquez", "Totonicapán", "Zacapa" }));
        departamentoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentoBoxActionPerformed(evt);
            }
        });
        jPanel1.add(departamentoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 281, -1, -1));

        municipioBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------------" }));
        jPanel1.add(municipioBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 281, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (departamentoBox.getSelectedItem().toString().equals("----------------") || !direccionText.getText().equals("") || municipioBox.getSelectedItem().toString().equals("----------------")
                || !zonaText.getText().equals("") || !coloniaText.getText().equals("") || !telefono1Text.getText().equals("") || !emailText.getText().equals("")
                || !telefono2Text.getText().equals("") || !CUIText.getText().equals("") || !EdadText.getText().equals("") || !nitText.getText().equals("")
                || !nombreText.getText().equals("") || !ApellidoText.getText().equals("")) {

            try {
                Departamento departamento = new Departamento(departamentoBox.getSelectedItem().toString());
                Municipio municipio = new Municipio(municipioBox.getSelectedItem().toString());
                Direccion direccion = new Direccion(direccionText.getText(), zonaText.getText(), coloniaText.getText(), departamento, municipio);
                Contribuyente contribuyente = new Contribuyente();
                if (contribuyenteBox.getSelectedItem().toString().equals("pequeño")) {
                    contribuyente = new Contribuyente("pequeño");
                } else if (contribuyenteBox.getSelectedItem().toString().equals("normal")) {
                    contribuyente = new Contribuyente("normal");
                }
                Empresa empresa = new Empresa(empresaText.getText());
                Isr isr = new Isr();
                if (isrBox.getSelectedItem().toString().equals("mensual")) {
                    isr = new Isr("mensual");
                } else if (isrBox.getSelectedItem().toString().equals("trimestral")) {
                    isr = new Isr("trimestral");
                }
                AgregarMail ag = new AgregarMail();
                if (ag.validar(emailText.getText()) == true) {
                    Contacto contacto = new Contacto(telefono1Text.getText(), telefono2Text.getText(), emailText.getText());
                    if (Integer.parseInt(EdadText.getText()) > 0 && Integer.parseInt(EdadText.getText()) < 100) {
                        Cliente cliente = new Cliente(nombreText.getText(), ApellidoText.getText(), Integer.parseInt(CUIText.getText()), Integer.parseInt(EdadText.getText()), nitText.getText(), contacto, contribuyente, direccion, empresa, isr);
                        ClienteService servicio = new ClienteService();
                        servicio.agregarCliente(cliente);
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingresa Una Edad Valida", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Ingresa Un Email Valido", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ingresa Valores Validos", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "rellena todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void contribuyenteBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contribuyenteBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contribuyenteBoxActionPerformed

    private void departamentoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentoBoxActionPerformed
        // TODO add your handling code here:
        if (departamentoBox.getSelectedItem().toString().equals("Alta Verapaz")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Cobán");
            municipioBox.addItem("Santa Cruz Verapaz");
            municipioBox.addItem("San Cristobal Verapaz");
            municipioBox.addItem("Tactíc");
            municipioBox.addItem("Tamahú");
            municipioBox.addItem("San Miguel Tucurú");
            municipioBox.addItem("Panzos");
            municipioBox.addItem("Senahú");
            municipioBox.addItem("San Pedro Carchá");
            municipioBox.addItem("San Juan Chamelco");
            municipioBox.addItem("Lanquín");
            municipioBox.addItem("Santa Maria Cahabón");
            municipioBox.addItem("Chisec");
            municipioBox.addItem("Chahal");
            municipioBox.addItem("Fray Bartolomé de las casas");
            municipioBox.addItem("Santa Catarina La Tinta");
        } else if (departamentoBox.getSelectedItem().toString().equals("Baja Verapaz")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Salamá");
            municipioBox.addItem("San Miguel Chicaj");
            municipioBox.addItem("Rabinal");
            municipioBox.addItem("Cubulco");
            municipioBox.addItem("Granados");
            municipioBox.addItem("Santa Cruz El Chol");
            municipioBox.addItem("San Jerónimo");
            municipioBox.addItem("Purulhá");
        } else if (departamentoBox.getSelectedItem().toString().equals("Chimaltenango")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Chimaltenango");
            municipioBox.addItem("San José Poaquil");
            municipioBox.addItem("San Martín Jilotepeque");
            municipioBox.addItem("San Juan Comalapa");
            municipioBox.addItem("Santa Apolonia");
            municipioBox.addItem("Tecpán Guatemala");
            municipioBox.addItem("Patzun");
            municipioBox.addItem("San Miguel Pochuta");
            municipioBox.addItem("Patzicia");
            municipioBox.addItem("Santa Cruz Balanyá");
            municipioBox.addItem("Acatenango");
            municipioBox.addItem("San Pedro Yepocapa");
            municipioBox.addItem("San Andrés Itzapa");
            municipioBox.addItem("Parramos");
            municipioBox.addItem("Zaragoza");
            municipioBox.addItem("El Tejar");

        } else if (departamentoBox.getSelectedItem().toString().equals("Peten")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Flores");
            municipioBox.addItem("San José");
            municipioBox.addItem("San Benito");
            municipioBox.addItem("San Andrés");
            municipioBox.addItem("La Libertad");
            municipioBox.addItem("San Francisco");
            municipioBox.addItem("Santa Ana");
            municipioBox.addItem("Dolores");
            municipioBox.addItem("San Luis");
            municipioBox.addItem("Sayaxche");
            municipioBox.addItem("Melchor de Mencos");
            municipioBox.addItem("Poptun");
        } else if (departamentoBox.getSelectedItem().toString().equals("El progreso")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Guastatoya");
            municipioBox.addItem("Morazán");
            municipioBox.addItem("San Agustín Acasaguastlan");
            municipioBox.addItem("San Cristóbal Acasaguastlan ");
            municipioBox.addItem("El Jícaro");
            municipioBox.addItem("Sansare");
            municipioBox.addItem("San Antonio La Paz");
        } else if (departamentoBox.getSelectedItem().toString().equals("El Quiché")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Santa Cruz del Quiche");
            municipioBox.addItem("Chiche");
            municipioBox.addItem("Chinique");
            municipioBox.addItem("Zacualpa");
            municipioBox.addItem("Chajul");
            municipioBox.addItem("Santo Tomás Chichicstenango");
            municipioBox.addItem("Patzité");
            municipioBox.addItem("San Antonio Ilotenango");
            municipioBox.addItem("San Pedro Jocopilas");
            municipioBox.addItem("Cunén");
            municipioBox.addItem("San Juan Cotzal");
            municipioBox.addItem("Joyabaj");
            municipioBox.addItem("Santa María Nebaj");
            municipioBox.addItem("San Andrés Sajcabajá");
            municipioBox.addItem("San Miguel Uspatán");
            municipioBox.addItem("Sacapulas");
            municipioBox.addItem("San Bartolomé Jocotenango");
            municipioBox.addItem("Canilla");
            municipioBox.addItem("Chicaman");
            municipioBox.addItem("Playa Grnade - Ixcán");
            municipioBox.addItem("Pachalúm");

        } else if (departamentoBox.getSelectedItem().toString().equals("Escuintla")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Escuintla");
            municipioBox.addItem("Santa Lucía Cotzumalguapa");
            municipioBox.addItem("La Democracia");
            municipioBox.addItem("Siquinalá");
            municipioBox.addItem("Masagua");
            municipioBox.addItem("Pueblo Nuevo Tiquisate");
            municipioBox.addItem("La Gomera");
            municipioBox.addItem("Guanagazapa");
            municipioBox.addItem("Puerto de San José");
            municipioBox.addItem("Iztapa");
            municipioBox.addItem("Palín");
            municipioBox.addItem("San Vicente Pacaya");
            municipioBox.addItem("Nueva Concepción");
        } else if (departamentoBox.getSelectedItem().toString().equals("Guatemala")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Guatemala");
            municipioBox.addItem("Santa Catarina Pinula");
            municipioBox.addItem("San José Pinula");
            municipioBox.addItem("San José del Golfo");
            municipioBox.addItem("Palencia");
            municipioBox.addItem("Chinautla");
            municipioBox.addItem("San Pedro Ayampuc");
            municipioBox.addItem("Mixco");
            municipioBox.addItem("San Pedro Sacatepequez");
            municipioBox.addItem("San Juan Sacatepequez");
            municipioBox.addItem("San Raymundo");
            municipioBox.addItem("Chuarrancho");
            municipioBox.addItem("Fraijanes");
            municipioBox.addItem("Amatitlán");
            municipioBox.addItem("Villa Nueva");
            municipioBox.addItem("Villa Canales");
            municipioBox.addItem("San Miguel Petapa");
        } else if (departamentoBox.getSelectedItem().toString().equals("Huehuetenango")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Huehuetenango");
            municipioBox.addItem("Chiantla");
            municipioBox.addItem("Malacatancito");
            municipioBox.addItem("Cuilco");
            municipioBox.addItem("Nentón");
            municipioBox.addItem("San Pedro Necta");
            municipioBox.addItem("Jacaltenango");
            municipioBox.addItem("San Pedro Soloma");
            municipioBox.addItem("San Ildelfonso Ixtahuac´n");
            municipioBox.addItem("Santa Bárbara");
            municipioBox.addItem("La Libertad");
            municipioBox.addItem("La Democracia");
            municipioBox.addItem("San Miguel Acatán");
            municipioBox.addItem("San Rafael La Independencia");
            municipioBox.addItem("Todos Santos Chuchcumatán");
            municipioBox.addItem("San Juan Atitán");
            municipioBox.addItem("Santa Eulalia");
            municipioBox.addItem("San Mateo Ixtatán");
            municipioBox.addItem("Colotenango");
            municipioBox.addItem("San Sebastián Huehuetenango");
            municipioBox.addItem("Tectitán");
            municipioBox.addItem("Concepción Huista");
            municipioBox.addItem("San Juan Ixcoy");
            municipioBox.addItem("San Antonio Huista");
            municipioBox.addItem("San Sebastián Coatán");
            municipioBox.addItem("Santa Cruz Barillas");
            municipioBox.addItem("Aguacatán");
            municipioBox.addItem("San Rafael Petzal");
            municipioBox.addItem("San Gaspar Ixchil");
            municipioBox.addItem("Santiago Chimaltenango");
            municipioBox.addItem("Santa Ana Huista");
        } else if (departamentoBox.getSelectedItem().toString().equals("Izabal")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Puerto Barrios");
            municipioBox.addItem("Livingston");
            municipioBox.addItem("El Estor");
            municipioBox.addItem("Morales");
            municipioBox.addItem("Los Amates");
        } else if (departamentoBox.getSelectedItem().toString().equals("Jalapa")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Jalapa");
            municipioBox.addItem("San Pedro Pinula");
            municipioBox.addItem("San Luis Jilotepeque");
            municipioBox.addItem("San Manuel Chaparrón");
            municipioBox.addItem("San Carlos Alzatate");
            municipioBox.addItem("Monjas");
            municipioBox.addItem("Mataquescuintla");
        } else if (departamentoBox.getSelectedItem().toString().equals("Jutiapa")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Jutiapa");
            municipioBox.addItem("El Progreso");
            municipioBox.addItem("Santa Catarina Mita");
            municipioBox.addItem("Agua Blanca");
            municipioBox.addItem("Asunción Mita");
            municipioBox.addItem("Yupiltepeque");
            municipioBox.addItem("Atescatempa");
            municipioBox.addItem("Jerez");
            municipioBox.addItem("El Adelanto");
            municipioBox.addItem("Zapotitlán");
            municipioBox.addItem("Comapa");
            municipioBox.addItem("Jalpatagua");
            municipioBox.addItem("Conguaco");
            municipioBox.addItem("Moyuta");
            municipioBox.addItem("Pasaco");
            municipioBox.addItem("San José Acatempa");
            municipioBox.addItem("Quezada");
        } else if (departamentoBox.getSelectedItem().toString().equals("Quetzaltenango")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Quetzaltenango");
            municipioBox.addItem("Salcajá");
            municipioBox.addItem("Olintepeque");
            municipioBox.addItem("San Carlos Sija");
            municipioBox.addItem("Sibilia");
            municipioBox.addItem("Cabrican");
            municipioBox.addItem("Cajola");
            municipioBox.addItem("San Miguel Siguilça");
            municipioBox.addItem("San Juan Ostuncalco");
            municipioBox.addItem("San Mateo");
            municipioBox.addItem("Concepción Chiquirichapa");
            municipioBox.addItem("San Martín Sacatepequez");
            municipioBox.addItem("Almolonga");
            municipioBox.addItem("Cantel");
            municipioBox.addItem("Huitán");
            municipioBox.addItem("Zunil");
            municipioBox.addItem("Colomba");
            municipioBox.addItem("San Francisco La Unión");
            municipioBox.addItem("El Palmar");
            municipioBox.addItem("Coatepeque");
            municipioBox.addItem("Génova");
            municipioBox.addItem("Flores Costa Cuca");
            municipioBox.addItem("La Esperanza");
            municipioBox.addItem("Palestina de los Altos");
        } else if (departamentoBox.getSelectedItem().toString().equals("Retalhuleu")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Retalhuelu");
            municipioBox.addItem("San Sebastián");
            municipioBox.addItem("Santa Cruz Mulúa");
            municipioBox.addItem("San Martín Zapotitlán");
            municipioBox.addItem("San Felipe Retalhuleu");
            municipioBox.addItem("San Andrés Villa Seca");
            municipioBox.addItem("Champerico");
            municipioBox.addItem("Nuevo San Carlos");
            municipioBox.addItem("El Asintal");
        } else if (departamentoBox.getSelectedItem().toString().equals("Sacatepéquez")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Antigua Guatemala");
            municipioBox.addItem("Jocotenango");
            municipioBox.addItem("Pastores");
            municipioBox.addItem("Sumpango");
            municipioBox.addItem("Santo Domingo Xenacoj");
            municipioBox.addItem("Santiago Sacatepequez");
            municipioBox.addItem("San Bartolomé Milpas Altas");
            municipioBox.addItem("San Lucas Sacatepequez");
            municipioBox.addItem("Santa Lucía Milpas Altas");
            municipioBox.addItem("Magdalena Milpas Altas");
            municipioBox.addItem("Santa María de Jesús");
            municipioBox.addItem("Ciudad Vieja");
            municipioBox.addItem("San Miguel Dueñas");
            municipioBox.addItem("San Juan Alotenango");
            municipioBox.addItem("San Antonio Aguas Calientes");
            municipioBox.addItem("Santa Catarina Barahona");
        } else if (departamentoBox.getSelectedItem().toString().equals("San Marcos")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("San Marcos");
            municipioBox.addItem("San Pedro Sacatepéquez");
            municipioBox.addItem("Comitancillo");
            municipioBox.addItem("San Antonio Sacatepéquez");
            municipioBox.addItem("San Miguel Ixtahuacan");
            municipioBox.addItem("Concepción Tutuapa");
            municipioBox.addItem("Tacaná");
            municipioBox.addItem("Sibinal");
            municipioBox.addItem("Tajumulco");
            municipioBox.addItem("Tejutla");
            municipioBox.addItem("San Rafael Pié de la Cuesta");
            municipioBox.addItem("Nuevo Progreso");
            municipioBox.addItem("El Tumbador");
            municipioBox.addItem("San José El Rodeo");
            municipioBox.addItem("Malacatán");
            municipioBox.addItem("Catarina");
            municipioBox.addItem("Ayutla");
            municipioBox.addItem("Ocos");
            municipioBox.addItem("San Pablo");
            municipioBox.addItem("El Quetzal");
            municipioBox.addItem("La Reforma");
            municipioBox.addItem("Pajapita");
            municipioBox.addItem("Ixchiguan");
            municipioBox.addItem("San José Ojetenán");
            municipioBox.addItem("San Cristóbal Cucho");
            municipioBox.addItem("Sipacapa");
            municipioBox.addItem("Esquipulas Palo Gordo");
            municipioBox.addItem("Río Blanco");
            municipioBox.addItem("San Lorenzo");
        } else if (departamentoBox.getSelectedItem().toString().equals("Santa Rosa")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Cuilapa");
            municipioBox.addItem("Berberena");
            municipioBox.addItem("San Rosa de Lima");
            municipioBox.addItem("Casillas");
            municipioBox.addItem("San Rafael Las Flores");
            municipioBox.addItem("Oratorio");
            municipioBox.addItem("San Juan TEcuaco");
            municipioBox.addItem("Chiquimulilla");
            municipioBox.addItem("Taxisco");
            municipioBox.addItem("Santa María Ixhuatan");
            municipioBox.addItem("Guazacapán");
            municipioBox.addItem("Santa Cruz Naranjo");
            municipioBox.addItem("Pueblo Nuevo Viñas");
            municipioBox.addItem("Nueva Santa Rosa");
        } else if (departamentoBox.getSelectedItem().toString().equals("Sololá")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Sololá");
            municipioBox.addItem("San José Chacaya");
            municipioBox.addItem("Santa María Visitación");
            municipioBox.addItem("Santa Lucía Utatlán");
            municipioBox.addItem("Nahualá");
            municipioBox.addItem("Santa Catarina Ixtahuacán");
            municipioBox.addItem("Santa Clara La Laguna");
            municipioBox.addItem("Concepción");
            municipioBox.addItem("San Andrés Semetabaj");
            municipioBox.addItem("Panajachel");
            municipioBox.addItem("Santa Catarina Palopó");
            municipioBox.addItem("San Antonio Palopó");
            municipioBox.addItem("San Lucas Tolimán");
            municipioBox.addItem("Santa Cruz La Laguna");
            municipioBox.addItem("Sna Pablo La Laguna");
            municipioBox.addItem("San Marcos La Laguna");
            municipioBox.addItem("San Juan La Laguna");
            municipioBox.addItem("San Pedro La Laguna");
            municipioBox.addItem("Santiago Atitlán");
        } else if (departamentoBox.getSelectedItem().toString().equals("Suchitepéquez")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Mazatenango");
            municipioBox.addItem("Cuyotenango");
            municipioBox.addItem("San Francisco Zapotitlán");
            municipioBox.addItem("San Bernardino");
            municipioBox.addItem("San José El Ídolo");
            municipioBox.addItem("Santo Domingo Suchitepequez");
            municipioBox.addItem("San Lorenzo");
            municipioBox.addItem("Samayac");
            municipioBox.addItem("San Pablo Jocopilas");
            municipioBox.addItem("San Antonio Suchitepéquez");
            municipioBox.addItem("San Miguel Panán");
            municipioBox.addItem("San Gabriel");
            municipioBox.addItem("Chicacao");
            municipioBox.addItem("Patulul");
            municipioBox.addItem("Santa Bárbara");
            municipioBox.addItem("San Juan Bautista");
            municipioBox.addItem("Santo Tomás La Unión");
            municipioBox.addItem("Zunilito");
            municipioBox.addItem("Pueblo Nuevo Suchitepéquez");
            municipioBox.addItem("Río Bravo");
        } else if (departamentoBox.getSelectedItem().toString().equals("Totonicapán")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Totonicapán");
            municipioBox.addItem("San Cristóbal Totonicapán");
            municipioBox.addItem("San Francisco El Alto");
            municipioBox.addItem("San Andrés Xecul");
            municipioBox.addItem("Momostenango");
            municipioBox.addItem("Santa María Chiquimula");
            municipioBox.addItem("Santa Lucía La Reforma");
            municipioBox.addItem("San Bartolo Aguas Calientes");
        } else if (departamentoBox.getSelectedItem().toString().equals("Zacapa")) {
            municipioBox.setEnabled(true);
            municipioBox.removeAllItems();
            municipioBox.addItem("Zacapa");
            municipioBox.addItem("Estanzuela");
            municipioBox.addItem("Río Hondo");
            municipioBox.addItem("gualán");
            municipioBox.addItem("Teculután");
            municipioBox.addItem("Usumatlán");
            municipioBox.addItem("Cabañas");
            municipioBox.addItem("San Diego");
            municipioBox.addItem("La Unión");
            municipioBox.addItem("Huite");
        } else if (departamentoBox.getSelectedItem().toString().equals("----------------")) {
            municipioBox.setEnabled(false);
            municipioBox.removeAllItems();
            municipioBox.addItem("----------------");
        }
    }//GEN-LAST:event_departamentoBoxActionPerformed

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
            java.util.logging.Logger.getLogger(CrearForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoText;
    private javax.swing.JTextField CUIText;
    private javax.swing.JTextField EdadText;
    private javax.swing.JTextField coloniaText;
    private javax.swing.JComboBox<String> contribuyenteBox;
    private javax.swing.JComboBox<String> departamentoBox;
    private javax.swing.JTextField direccionText;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField empresaText;
    private javax.swing.JComboBox<String> isrBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> municipioBox;
    private javax.swing.JTextField nitText;
    private javax.swing.JTextField nombreText;
    private javax.swing.JTextField telefono1Text;
    private javax.swing.JTextField telefono2Text;
    private javax.swing.JTextField zonaText;
    // End of variables declaration//GEN-END:variables
    public static boolean privilegiosAdmin = false;
    public static String textoUsuario = "";
    public static String textoRol = "";
}
