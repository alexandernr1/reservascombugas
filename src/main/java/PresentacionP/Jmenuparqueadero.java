package PresentacionP;

import LogicaP.Finicioturnop;
import static Presentacion.Jmenuprin.lblacceso;
import static Presentacion.Jmenuprin.lblidpersona;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Jmenuparqueadero extends javax.swing.JInternalFrame {

    public static Boolean sesionIniciada = false;
    private Jingresop ingresoFormulario;
    private Jsalidap salidaFormulario;
    private Jpagop pagoFormulario;
    private Jfinturnop salidaturno;

    public Jmenuparqueadero() {
        initComponents();
    }

    static void actualizarDatosUsuario1(String fecha, String turno, String empleado, String estado) {
        lblfecha.setText(fecha);
        lblturnos.setText(turno);
        lblempleado.setText(empleado);
        lblestado.setText(estado);

    }
    public static void limpiarDatosUsuario() {
        lblfecha.setText("");
        lblturnos.setText("");
        lblempleado.setText("");
        lblestado.setText("");
    }

    // Métodos para actualizar los JLabel
    public static void actualizarFecha(String fecha) {
        lblfecha.setText(fecha);
    }

    public static void actualizarTurno(String turno) {
        lblturnos.setText(turno);
    }

    public static void actualizarEmpleado(String empleado) {
        lblempleado.setText(empleado);
    }

    public static void actualizarEstado(String estado) {
        lblestado.setText(estado);
    }

    public static int idusuario;

    static void inhabilitar() {
        lblidpersona.setVisible(false);
        lblacceso.setVisible(false);

    }
     public void metodoDondeSeNecesitaFormLogin() {
        // Inicialización de formLogin
        Jinicioturnop formLogin = new Jinicioturnop();

        // Intento de deshabilitar formLogin
        formLogin.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblestado = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        lblturnos = new javax.swing.JLabel();
        lblempleado = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnregistrovehiculo = new javax.swing.JButton();
        btnsalidap = new javax.swing.JButton();
        btnentregaturnop = new javax.swing.JButton();
        btnpagosp = new javax.swing.JButton();
        btnregistro4 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        desktopPane.setBackground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\logo combugas.png")); // NOI18N

        lblestado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblestado.setText("estado");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setText("Estado:");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setText("Empleado:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel10.setText("Turno:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("Fecha:");

        lblfecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblfecha.setText("fecha");

        lblturnos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblturnos.setText("turnos");

        lblempleado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblempleado.setText("empleado");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel10))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel9)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblturnos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblestado, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel10)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel8)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblfecha)
                                .addGap(0, 0, 0)
                                .addComponent(lblturnos)
                                .addGap(0, 0, 0)
                                .addComponent(lblempleado)
                                .addGap(0, 0, 0)
                                .addComponent(lblestado)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        btnregistrovehiculo.setBackground(new java.awt.Color(0, 204, 204));
        btnregistrovehiculo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnregistrovehiculo.setForeground(new java.awt.Color(0, 0, 102));
        btnregistrovehiculo.setText("INGRESO VEHICULO");
        btnregistrovehiculo.setActionCommand("     REGISTRO");
        btnregistrovehiculo.setBorder(null);
        btnregistrovehiculo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnregistrovehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrovehiculoActionPerformed(evt);
            }
        });

        btnsalidap.setBackground(new java.awt.Color(0, 204, 204));
        btnsalidap.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnsalidap.setForeground(new java.awt.Color(0, 0, 102));
        btnsalidap.setText("SALIDA VEHICULO");
        btnsalidap.setActionCommand("     REGISTRO");
        btnsalidap.setBorder(null);
        btnsalidap.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsalidap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalidapActionPerformed(evt);
            }
        });

        btnentregaturnop.setBackground(new java.awt.Color(0, 204, 204));
        btnentregaturnop.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnentregaturnop.setForeground(new java.awt.Color(0, 0, 102));
        btnentregaturnop.setText("ENTREGA TURNO");
        btnentregaturnop.setActionCommand("     REGISTRO");
        btnentregaturnop.setBorder(null);
        btnentregaturnop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnentregaturnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentregaturnopActionPerformed(evt);
            }
        });

        btnpagosp.setBackground(new java.awt.Color(0, 204, 204));
        btnpagosp.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnpagosp.setForeground(new java.awt.Color(0, 0, 102));
        btnpagosp.setText("PAGOS");
        btnpagosp.setActionCommand("     REGISTRO");
        btnpagosp.setBorder(null);
        btnpagosp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnpagosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagospActionPerformed(evt);
            }
        });

        btnregistro4.setBackground(new java.awt.Color(0, 204, 204));
        btnregistro4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnregistro4.setForeground(new java.awt.Color(0, 0, 102));
        btnregistro4.setText("REGISTRO");
        btnregistro4.setActionCommand("     REGISTRO");
        btnregistro4.setBorder(null);
        btnregistro4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnregistro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistro4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnentregaturnop, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalidap, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnregistrovehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpagosp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnregistro4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnregistrovehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsalidap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnentregaturnop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnpagosp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnregistro4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        desktopPane.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrovehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrovehiculoActionPerformed

        if (ingresoFormulario == null || !ingresoFormulario.isVisible()) {
            // Si no está abierto, crea una nueva instancia o usa el Singleton
            ingresoFormulario = Jingresop.getInstance(); // Usando Singleton
            ingresoFormulario.setVisible(true);
        } else {
            // Si ya está abierto, enfócalo
            ingresoFormulario.setExtendedState(JFrame.NORMAL); // Restaurar si está minimizado
            ingresoFormulario.toFront(); // Traer al frente
            ingresoFormulario.requestFocus(); // Solicitar foco
        }
    }//GEN-LAST:event_btnregistrovehiculoActionPerformed

    private void btnsalidapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalidapActionPerformed

        if (salidaFormulario == null || !salidaFormulario.isVisible()) {
            // Si no está abierto, crea una nueva instancia o usa el Singleton
            salidaFormulario = Jsalidap.getInstance(); // Usando Singleton
            salidaFormulario.setVisible(true);
        } else {
            // Si ya está abierto, enfócalo
            salidaFormulario.setExtendedState(JFrame.NORMAL); // Restaurar si está minimizado
            salidaFormulario.toFront(); // Traer al frente
            salidaFormulario.requestFocus(); // Solicitar foco
        }
    }//GEN-LAST:event_btnsalidapActionPerformed

    private void btnentregaturnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentregaturnopActionPerformed

        Finicioturnop finicio = new Finicioturnop();

        if (sesionIniciada) {
            // Si la sesión no está iniciada, mostrar el formulario de inicio de sesión

            Jfinturnop formTurnos = Jfinturnop.getInstance();
            formTurnos.toFront();
            formTurnos.setVisible(true);
            if (salidaturno == null || !salidaturno.isVisible()) {
                // Si no está abierto, crea una nueva instancia o usa el Singleton
                salidaturno = Jfinturnop.getInstance(); // Usando Singleton
                salidaturno.setVisible(true);
            } else {
                // Si ya está abierto, enfócalo
                salidaturno.setExtendedState(JFrame.NORMAL); // Restaurar si está minimizado
                salidaturno.toFront(); // Traer al frente
                salidaturno.requestFocus(); // Solicitar foco
            }

            metodoDondeSeNecesitaFormLogin();
        } else {
            if (finicio.hayTurnoActivo()) {
                JOptionPane.showMessageDialog(null, "Hay un turno activo. Debe finalizar el turno actual antes de iniciar uno nuevo.");
                Jfinturnop formTurnos = Jfinturnop.getInstance();
                formTurnos.toFront();
                formTurnos.setVisible(true);

            } else {
                Jinicioturnop formLogin = new Jinicioturnop();
                formLogin.toFront();
                formLogin.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnentregaturnopActionPerformed

    private void btnpagospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagospActionPerformed

        if (pagoFormulario == null || !pagoFormulario.isVisible()) {
            // Si no está abierto, crea una nueva instancia o usa el Singleton
            pagoFormulario = Jpagop.getInstance(); // Usando Singleton
            pagoFormulario.setVisible(true);
        } else {
            // Si ya está abierto, enfócalo
            pagoFormulario.setExtendedState(JFrame.NORMAL); // Restaurar si está minimizado
            pagoFormulario.toFront(); // Traer al frente
            pagoFormulario.requestFocus(); // Solicitar foco
        }
    }//GEN-LAST:event_btnpagospActionPerformed

    private void btnregistro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistro4ActionPerformed

    }//GEN-LAST:event_btnregistro4ActionPerformed

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
            java.util.logging.Logger.getLogger(Jmenuparqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jmenuparqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jmenuparqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jmenuparqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Jmenuparqueadero().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnentregaturnop;
    private javax.swing.JButton btnpagosp;
    private javax.swing.JButton btnregistro4;
    private javax.swing.JButton btnregistrovehiculo;
    private javax.swing.JButton btnsalidap;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel lblempleado;
    public static javax.swing.JLabel lblestado;
    public static javax.swing.JLabel lblfecha;
    public static javax.swing.JLabel lblturnos;
    // End of variables declaration//GEN-END:variables

}
