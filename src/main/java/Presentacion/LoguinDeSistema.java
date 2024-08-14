package Presentacion;

import Datos.Dempleado;
import Logica.Fempleado;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public final class LoguinDeSistema extends javax.swing.JFrame {

    public LoguinDeSistema() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("ACCESO A SISTEMA");
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 260, 340));

        usuarioLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        usuarioLabel.setText("Usuario:");

        txtusuario.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtusuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        passwordLabel.setText("Password:");

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

        btnIngresar.setBackground(new java.awt.Color(0, 204, 204));
        btnIngresar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel3.setText("LOGIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(usuarioLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(passwordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarioLabel))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(57, 57, 57)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        txtusuario.transferFocus();
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        txtpassword.transferFocus();
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

  try {
        Fempleado func = new Fempleado();
        
        // Obtener el usuario y contraseña ingresados
        String login = txtusuario.getText();
        String password = txtpassword.getText();

        // Intentar realizar el login
        Dempleado empleado = func.login(login, password);

        if (empleado != null) {
            System.out.println("Login exitoso. Datos del empleado:");
            System.out.println(empleado);
            
            // Crear y mostrar el formulario principal
            Jmenuprin form = new Jmenuprin();
            form.toFront();
            form.setVisible(true);
            
            // Establecer los valores en Jmenuprin
            Jmenuprin.lblacceso.setText(empleado.getAcceso());

            // Verificar si el acceso es para un empleado
            if (!Jmenuprin.lblacceso.getText().equals("General")) {
                JOptionPane.showMessageDialog(rootPane, "Acceso Denegado", "Acceso al Sistema", JOptionPane.ERROR_MESSAGE);
                // Si el acceso no es para un General, puedes desactivar el menú u realizar alguna otra acción
                form.setVisible(false);
            } else {
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Credenciales incorrectas o el usuario no está activo.", "Error de Login", JOptionPane.ERROR_MESSAGE);
        }
    } catch (HeadlessException e) {
        System.out.println("ERROR DE LOGIN");
        JOptionPane.showMessageDialog(rootPane, "Ocurrió un error durante el login.", "Error", JOptionPane.ERROR_MESSAGE);
    }   catch (SQLException ex) {
            Logger.getLogger(LoguinDeSistema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             try {
        Fempleado func = new Fempleado();
        
        // Obtener el usuario y contraseña ingresados
        String login = txtusuario.getText();
        String password = txtpassword.getText();

        // Intentar realizar el login
        Dempleado empleado = func.login(login, password);

        if (empleado != null) {
            System.out.println("Login exitoso. Datos del empleado:");
            System.out.println(empleado);
            
            // Crear y mostrar el formulario principal
            Jmenuprin form = new Jmenuprin();
            form.toFront();
            form.setVisible(true);
            
            // Establecer los valores en Jmenuprin
            Jmenuprin.lblacceso.setText(empleado.getAcceso());

            // Verificar si el acceso es para un empleado
            if (!Jmenuprin.lblacceso.getText().equals("General")) {
                JOptionPane.showMessageDialog(rootPane, "Acceso Denegado", "Acceso al Sistema", JOptionPane.ERROR_MESSAGE);
                // Si el acceso no es para un General, puedes desactivar el menú u realizar alguna otra acción
                form.setVisible(false);
            } else {
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Credenciales incorrectas o el usuario no está activo.", "Error de Login", JOptionPane.ERROR_MESSAGE);
        }
    } catch (HeadlessException e) {
        System.out.println("ERROR DE LOGIN");
        JOptionPane.showMessageDialog(rootPane, "Ocurrió un error durante el login.", "Error", JOptionPane.ERROR_MESSAGE);
    }       catch (SQLException ex) {
                Logger.getLogger(LoguinDeSistema.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(LoguinDeSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoguinDeSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoguinDeSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoguinDeSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoguinDeSistema().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusuario;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}
