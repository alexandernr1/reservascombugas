package Presentacion;

import Datos.Dempleado;
import Datos.Dinicioturno;
import Datos.Tiempopro;
import Logica.Cconexion;
import Logica.Fempleado;
import Logica.Finicioturno;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Jinicioturno extends javax.swing.JFrame {

    Statement st;
    ResultSet rs;

    Tiempopro time = new Tiempopro();

    public Jinicioturno() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("ACCESO AL SISTEMA");
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mostrarTiempo();
        fechacbo();

        generarnumero();
        llenarcboempleado1(cboempleados);

    }

    private void llenarcboempleado1(JComboBox combo) {
        Finicioturno func = new Finicioturno();
        DefaultComboBoxModel com = new DefaultComboBoxModel();
        combo.setModel(com);
        Cconexion conexion = new Cconexion();
        com.addElement("Seleccione un usuario");

        try {
            Connection conectar = conexion.establecerConexion();
            st = conectar.createStatement();
            rs = st.executeQuery("SELECT p.nombres, p.apellidos,p.numdocumento "
                    + "FROM empleado e "
                    + "JOIN persona p ON e.idpersona = p.idpersona "
                    + "WHERE e.acceso = 'Empleado' ;");

            while (rs.next()) {

                Dempleado empleado = new Dempleado();
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String documento = rs.getString("numdocumento");

                empleado.setNombres(nombres + " " + apellidos);
                empleado.setNumdocumento(documento);
                func.agregarEmpleados(empleado);
                com.addElement(empleado.getNombres());

            }
        } catch (Exception e) {
            System.out.println("ERROR " + e);
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
        cboturnos.addItem("Turno 1" + " " + fechaActual);
        cboturnos.addItem("Turno 2" + " " + fechaActual);
        cboturnos.addItem("Turno 3" + " " + fechaActual);

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
        txtpassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtfecha_hora_inicio = new javax.swing.JTextField();
        cboturnos = new javax.swing.JComboBox<>();
        cboestado = new javax.swing.JComboBox<>();
        txtnumero_turno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboempleados = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ingresoTurno = new javax.swing.JButton();

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

        jPanel1.add(cboturnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 160, 30));

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

        jPanel1.add(cboempleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 270, 30));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("Turno:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\reservascombugas\\reservascombugas\\src\\main\\java\\File\\inicio de sesion.png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 490, 470));

        ingresoTurno.setText("Ingreso");
        ingresoTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoTurnoActionPerformed(evt);
            }
        });
        jPanel1.add(ingresoTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, -1));

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

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        txtusuario.transferFocus();
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        txtpassword.transferFocus();
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyPressed
//        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (cboempleados.getSelectedIndex() == 0) {
        JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR UN NOMBRE DE EMPLEADO", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Finicioturno func1 = new Finicioturno();
    Dinicioturno dts1 = new Dinicioturno();

    dts1.setFecha_hora_inicio(txtfecha_hora_inicio.getText());

    int selecturno = cboturnos.getSelectedIndex();
    dts1.setTurno((String) cboturnos.getItemAt(selecturno));

    int estado = cboestado.getSelectedIndex();
    dts1.setEstado((String) cboestado.getItemAt(estado));

    int trabajador = cboempleados.getSelectedIndex();
    dts1.setEmpleado((String) cboempleados.getItemAt(trabajador));

    dts1.setNumero_turno(Integer.parseInt(txtnumero_turno.getText()));

    if (accion.equals("guardar")) {
        if (func1.insertar(dts1)) {
            // Turno registrado
        }
    }

    try {
        Fempleado func = new Fempleado();

        // Obtener el usuario y contraseña ingresados
        String login = txtusuario.getText();
        String password = txtpassword.getText();

        Dempleado empleado = func.login(login, password);

        if (empleado != null) {
            Jmenuhotel.sesionIniciada = true; // Cambiar el estado de la sesión

            this.dispose();

            // Establecer los valores en Jmenuhotel
            Jmenuhotel.actualizarDatosUsuario1(
                    txtfecha_hora_inicio.getText(),
                    (String) cboturnos.getItemAt(selecturno),
                    (String) cboempleados.getItemAt(trabajador),
                    (String) cboestado.getItemAt(estado)
            );

            // Mostrar Jsalidaturno solo si la sesión ya estaba iniciada
            if (Jmenuhotel.sesionIniciada) {
                Jsalidaturno form = new Jsalidaturno();
                form.toFront();
                form.setVisible(false);
                form.actualizarTurno(
                        txtfecha_hora_inicio.getText(),
                        (String) cboturnos.getItemAt(selecturno)
                );

                Jsalidaturno.txtempleado.setText(empleado.getNombres() + " " + empleado.getApellidos());
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Acceso Denegado", "Error de Login", JOptionPane.ERROR_MESSAGE);
        }
    } catch (HeadlessException e) {
        JOptionPane.showMessageDialog(rootPane, "Ocurrió un error durante el login.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        Logger.getLogger(Jinicioturno.class.getName()).log(Level.SEVERE, null, ex);
    }
        }
    }//GEN-LAST:event_txtpasswordKeyPressed

    private void txtnumero_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumero_turnoActionPerformed
        // Generar el número de turno

    }//GEN-LAST:event_txtnumero_turnoActionPerformed

    private void ingresoTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoTurnoActionPerformed

        if (cboempleados.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR UN NOMBRE DE EMPLEADO", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Finicioturno func1 = new Finicioturno();
        Dinicioturno dts1 = new Dinicioturno();

        dts1.setFecha_hora_inicio(txtfecha_hora_inicio.getText());

        int selecturno = cboturnos.getSelectedIndex();
        dts1.setTurno((String) cboturnos.getItemAt(selecturno));

        int estado = cboestado.getSelectedIndex();
        dts1.setEstado((String) cboestado.getItemAt(estado));

        int trabajador = cboempleados.getSelectedIndex();
        dts1.setEmpleado((String) cboempleados.getItemAt(trabajador));

        dts1.setNumero_turno(Integer.parseInt(txtnumero_turno.getText()));

        if (accion.equals("guardar")) {
            if (func1.insertar(dts1)) {
                // Turno registrado
            }
        }

        try {
            Fempleado func = new Fempleado();

            // Obtener el usuario y contraseña ingresados
            String login = txtusuario.getText();
            String password = txtpassword.getText();

            Dempleado empleado = func.login(login, password);

            if (empleado != null) {
                Jmenuhotel.sesionIniciada = true; // Cambiar el estado de la sesión

                this.dispose();

                // Establecer los valores en Jmenuhotel
                Jmenuhotel.actualizarDatosUsuario1(
                        txtfecha_hora_inicio.getText(),
                        (String) cboturnos.getItemAt(selecturno),
                        (String) cboempleados.getItemAt(trabajador),
                        (String) cboestado.getItemAt(estado)
                );

                // Mostrar Jsalidaturno solo si la sesión ya estaba iniciada
                if (Jmenuhotel.sesionIniciada) {
                    Jsalidaturno form = new Jsalidaturno();
                    form.toFront();
                    form.setVisible(false);
                    form.actualizarTurno(
                            txtfecha_hora_inicio.getText(),
                            (String) cboturnos.getItemAt(selecturno)
                    );

                    Jsalidaturno.txtempleado.setText(empleado.getNombres() + " " + empleado.getApellidos());
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Acceso Denegado", "Error de Login", JOptionPane.ERROR_MESSAGE);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error durante el login.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Jinicioturno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ingresoTurnoActionPerformed

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
//Cambiar el tipo de dato del combo a Dempleado
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cboempleados;
    private javax.swing.JComboBox<String> cboestado;
    private javax.swing.JComboBox<String> cboturnos;
    private javax.swing.JButton ingresoTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtfecha_hora_inicio;
    private javax.swing.JTextField txtnumero_turno;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
