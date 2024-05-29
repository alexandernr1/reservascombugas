package Presentacion;

import Datos.Dempleado;
import Datos.Dinicioturno;
import Datos.Tiempopro;
import Logica.Fempleado;
import Logica.Finicioturno;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Jinicioturno extends javax.swing.JFrame {

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
//        this.sesionIniciada = sesionIniciada;

    }
    public static int idpersona;

    private String accion = "guardar";

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
        cboturnos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INICIO TURNOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 20));

        txtusuario.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtusuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 160, 30));

        btningresar.setBackground(new java.awt.Color(204, 204, 204));
        btningresar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btningresar.setText("Ingresar");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        jPanel1.add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, 38));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 10, 20));

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
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 160, 30));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Turno:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("Fecha y Hora Inicio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txtfecha_hora_inicio.setEditable(false);
        txtfecha_hora_inicio.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jPanel1.add(txtfecha_hora_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 160, 30));

        jPanel1.add(cboturnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed

        Finicioturno func1 = new Finicioturno();
        Dinicioturno dts1 = new Dinicioturno();

        dts1.setFecha_hora_inicio(txtfecha_hora_inicio.getText());

        int selecturno = cboturnos.getSelectedIndex();
        dts1.setTurno((String) cboturnos.getItemAt(selecturno));

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
                        (String) cboturnos.getItemAt(selecturno)
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

            int selecturno = cboturnos.getSelectedIndex();
            dts1.setTurno((String) cboturnos.getItemAt(selecturno));

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
                            (String) cboturnos.getItemAt(selecturno)
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
    private javax.swing.JComboBox<String> cboturnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtfecha_hora_inicio;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
