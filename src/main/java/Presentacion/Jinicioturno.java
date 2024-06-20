package Presentacion;

import Datos.Dempleado;
import Datos.Dinicioturno;
import Datos.Tiempopro;
import Logica.Cconexion;
import Logica.Fempleado;
import Logica.Finicioturno;
import java.awt.HeadlessException;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Jinicioturno extends javax.swing.JFrame {
    Statement st;
    ResultSet rs;
    
    Tiempopro time = new Tiempopro();
//    public static boolean sesionIniciada;

    public Jinicioturno() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("ACCESO AL SISTEMA");
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mostrarTiempo();
        fechacbo();
        inhabilitar();
        generarnumero();
//        this.sesionIniciada = sesionIniciada;

    }
    
    private void llenarcboempleado1(JComboBox combo){
        Finicioturno func = new Finicioturno();
        DefaultComboBoxModel com = new DefaultComboBoxModel();
        combo.setModel(com);
        Cconexion conexion = new Cconexion();
        
        try{
            Connection conectar = conexion.establecerConexion();
            st = conectar.createStatement();
            rs = st.executeQuery("");
        }catch(){
            
        }
        
    }
    public static int idpersona;

    private String accion = "guardar";

    public void generarnumero() {
        Finicioturno func = new Finicioturno();
        int numeroTurno = func.generarNumeroTurno();

        // Convertir el número de turno a cadena
        String numero = Integer.toString(numeroTurno);

        // Mostrar el número de turno en el campo de texto
        txtnumero_turno.setText(numero);
    }

    private void fechacbo() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaActual = LocalDate.now().format(formatter);
        cboempleado.addItem("Turno 1" + " " + fechaActual);
        cboempleado.addItem("Turno 2" + " " + fechaActual);
        cboempleado.addItem("Turno 3" + " " + fechaActual);

    }

    public void inhabilitar() {
        tablalistado.setVisible(false);

        jScrollPane1.setVisible(false);
    }

    private void mostrarTiempo() {

        txtfecha_hora_inicio.setText(time.getFechacomp() + " " + time.getHoracomp());
    }

    public String obtenerTextoFechahorainicio(String txtfechahorainicio) {
        return txtfechahorainicio;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        btningresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        txtpassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtfecha_hora_inicio = new javax.swing.JTextField();
        cboempleado = new javax.swing.JComboBox<>();
        cboestado = new javax.swing.JComboBox<>();
        txtnumero_turno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboturnos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INICIO TURNOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("Estado:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, 20));

        txtusuario.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtusuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 160, 30));

        btningresar.setBackground(new java.awt.Color(204, 204, 204));
        btningresar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btningresar.setText("Ingresar");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        jPanel1.add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, 38));

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablalistado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 40, 20));

        txtpassword.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpasswordKeyPressed(evt);
            }
        });
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 160, 30));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Numero:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("Fecha y Hora Inicio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        txtfecha_hora_inicio.setEditable(false);
        txtfecha_hora_inicio.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jPanel1.add(txtfecha_hora_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 160, 30));

        jPanel1.add(cboempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 290, 30));

        cboestado.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Finalizado" }));
        cboestado.setEnabled(false);
        jPanel1.add(cboestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 90, 30));

        txtnumero_turno.setEditable(false);
        txtnumero_turno.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtnumero_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumero_turnoActionPerformed(evt);
            }
        });
        jPanel1.add(txtnumero_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 90, 30));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("Empleado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setText("Usuario:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jPanel1.add(cboturnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 160, 30));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("Turno:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\reservascombugas\\reservascombugas\\src\\main\\java\\File\\inicio de sesion.png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 490, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed

        Finicioturno func1 = new Finicioturno();
        Dinicioturno dts1 = new Dinicioturno();

        dts1.setFecha_hora_inicio(txtfecha_hora_inicio.getText());

        int selecturno = cboturnos.getSelectedIndex();
        dts1.setTurno((String) cboturnos.getItemAt(selecturno));
        dts1.setEstado((String) cboestado.getItemAt(selecturno));
        dts1.setEstado((String) cboempleado.getItemAt(selecturno));

        dts1.setNumero_turno(Integer.parseInt(txtnumero_turno.getText()));

        if (accion.equals("guardar")) {
            if (func1.insertar(dts1)) {
//                JOptionPane.showMessageDialog(rootPane, " fue registrado satisfactoriamente");

            }
        }
        try {
            DefaultTableModel modelo;
            Fempleado func = new Fempleado();
            Dempleado dts = new Dempleado();

            dts.setLogin(txtusuario.getText());
            dts.setPassword(txtpassword.getText());

            modelo = func.login(dts.getLogin(), dts.getPassword());
            Jmenuhotel.sesionIniciada = true; // Cambiar el estado de la sesión
            JOptionPane.showMessageDialog(this, "Turno iniciado");
            tablalistado.setModel(modelo);

            if (func.totalregistros > 0) {
                this.dispose();
                Jsalidaturno form = new Jsalidaturno();
                form.toFront();
                form.setVisible(true);
                // Establece los valores en Jmenuhotel
                Jmenuhotel.actualizarDatosUsuario(
                        tablalistado.getValueAt(0, 0).toString(),
                        tablalistado.getValueAt(0, 1).toString(),
                        tablalistado.getValueAt(0, 2).toString(),
                        tablalistado.getValueAt(0, 3).toString()
                );
                form.actualizarTurno(
                        txtfecha_hora_inicio.getText(),
                        (String) cboempleado.getItemAt(selecturno)
                );
//                Jsalidaturno.lblacceso.setText(tablalistado.getValueAt(0, 3).toString());
//                Jsalidaturno.txtempleado.setText(tablalistado.getValueAt(0, 1) + "" + tablalistado.getValueAt(0, 2));
            } else {

                JOptionPane.showMessageDialog(rootPane, "Acceso Denegado", "HAS INICIADO CORECTAMENTE TU TURNO", JOptionPane.ERROR_MESSAGE);
            }
        } catch (HeadlessException e) {
        }


    }//GEN-LAST:event_btningresarActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        txtusuario.transferFocus();
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        txtpassword.transferFocus();
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Finicioturno func1 = new Finicioturno();
            Dinicioturno dts1 = new Dinicioturno();

            dts1.setFecha_hora_inicio(txtfecha_hora_inicio.getText());

            int selecturno = cboempleado.getSelectedIndex();
            dts1.setTurno((String) cboempleado.getItemAt(selecturno));
            dts1.setEstado((String) cboestado.getItemAt(selecturno));

            dts1.setNumero_turno(Integer.parseInt(txtnumero_turno.getText()));

            if (accion.equals("guardar")) {
                if (func1.insertar(dts1)) {
//                JOptionPane.showMessageDialog(rootPane, " fue registrado satisfactoriamente");

                }
            }
            try {
                DefaultTableModel modelo;
                Fempleado func = new Fempleado();
                Dempleado dts = new Dempleado();

                dts.setLogin(txtusuario.getText());
                dts.setPassword(txtpassword.getText());

                modelo = func.login(dts.getLogin(), dts.getPassword());
                Jmenuhotel.sesionIniciada = true; // Cambiar el estado de la sesión
                JOptionPane.showMessageDialog(this, "Turno iniciado");
                tablalistado.setModel(modelo);

                if (func.totalregistros > 0) {
                    this.dispose();
                    Jsalidaturno form = new Jsalidaturno();
                    form.toFront();
                    form.setVisible(true);
                    // Establece los valores en Jmenuhotel
                    Jmenuhotel.actualizarDatosUsuario(
                            tablalistado.getValueAt(0, 0).toString(),
                            tablalistado.getValueAt(0, 1).toString(),
                            tablalistado.getValueAt(0, 2).toString(),
                            tablalistado.getValueAt(0, 3).toString()
                    );
                    form.actualizarTurno(
                            txtfecha_hora_inicio.getText(),
                            (String) cboempleado.getItemAt(selecturno)
                    );
//                    // Establece los valores en Jmenuhotel

//                    Jsalidaturno.lblidpersona.setText(tablalistado.getValueAt(0, 0).toString());
//                    Jsalidaturno.lblacceso.setText(tablalistado.getValueAt(0, 3).toString());
//                    Jsalidaturno.txtempleado.setText(tablalistado.getValueAt(0, 1) + "" + tablalistado.getValueAt(0, 2));
                } else {

                    JOptionPane.showMessageDialog(rootPane, "Acceso Denegado", "HAS INICIADO CORECTAMENTE TU TURNO", JOptionPane.ERROR_MESSAGE);
                }
            } catch (HeadlessException e) {
            }

        }
    }//GEN-LAST:event_txtpasswordKeyPressed

    private void txtnumero_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumero_turnoActionPerformed
        // Generar el número de turno

    }//GEN-LAST:event_txtnumero_turnoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Jinicioturno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jinicioturno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jinicioturno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jinicioturno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btningresar;
    private javax.swing.JComboBox<String> cboempleado;
    private javax.swing.JComboBox<String> cboestado;
    private javax.swing.JComboBox<String> cboturnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtfecha_hora_inicio;
    private javax.swing.JTextField txtnumero_turno;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
