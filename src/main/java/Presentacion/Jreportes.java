package Presentacion;

import Logica.Cconexion;
import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class Jreportes extends javax.swing.JInternalFrame {

    public Jreportes() {
        initComponents();
        setTitle("REPORTES");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        txtmes.setText("2024-07");
        txtmes1.setText("09-2024");
        txtfecha_turno.setText("'d-m-y'");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnBuscarReporte = new javax.swing.JButton();
        txtfecha_turno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarReporte1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBuscarReporte4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtnumero_turno = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnBuscarReporte2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtmes = new javax.swing.JTextField();
        txtmes1 = new javax.swing.JTextField();
        btnBuscarReporte5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnBuscarReporte3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPORTE TURNOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reservas.png"))); // NOI18N
        btnBuscarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarReporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, 40));
        jPanel1.add(txtfecha_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 90, -1));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("Reporte con Numero Turno:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        btnBuscarReporte1.setBackground(java.awt.SystemColor.activeCaptionBorder);
        btnBuscarReporte1.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnBuscarReporte1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reservas.png"))); // NOI18N
        btnBuscarReporte1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarReporte1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarReporte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, 40));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("Ingresa el numero:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 30));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("Fecha('D-M-Y'):");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        btnBuscarReporte4.setBackground(java.awt.SystemColor.activeCaptionBorder);
        btnBuscarReporte4.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnBuscarReporte4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reservas.png"))); // NOI18N
        btnBuscarReporte4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarReporte4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarReporte4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarReporte4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, 40));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setText("Reporte del dia:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, 30));
        jPanel1.add(txtnumero_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 60, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPORTE ACOMPAÑANTES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 12))); // NOI18N

        btnBuscarReporte2.setBackground(java.awt.SystemColor.activeCaptionBorder);
        btnBuscarReporte2.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnBuscarReporte2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reservas.png"))); // NOI18N
        btnBuscarReporte2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarReporte2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText(" mensual:(Y-M)");

        btnBuscarReporte5.setBackground(java.awt.SystemColor.activeCaptionBorder);
        btnBuscarReporte5.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnBuscarReporte5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reservas.png"))); // NOI18N
        btnBuscarReporte5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarReporte5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarReporte5ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setText(" mensual:(M-Y)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtmes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarReporte2)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtmes1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarReporte5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarReporte5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarReporte2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtmes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPORTE FACTURA ELECTRONICA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 12))); // NOI18N

        btnBuscarReporte3.setBackground(java.awt.SystemColor.activeCaptionBorder);
        btnBuscarReporte3.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnBuscarReporte3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reservas.png"))); // NOI18N
        btnBuscarReporte3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarReporte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarReporte3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("Reporte del dia:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarReporte3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscarReporte3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Connection Connection = new Cconexion().establecerConexion();

    private void btnBuscarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarReporteActionPerformed

        int numero = Integer.parseInt(txtfecha_turno.getText());

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("numero_turno", numero);
        JasperReport report;
        JasperPrint print;

        try {
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/Reportes/Turnos.jrxml");
            print = JasperFillManager.fillReport(report, parameters, Connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Reporte");
            view.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarReporteActionPerformed

    private void btnBuscarReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarReporte1ActionPerformed

        String Dia = txtfecha_turno.getText();

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("TurnoFecha", Dia);  // Asegúrate de que el nombre del parámetro coincide con el del informe

        JasperReport report;
        JasperPrint print;

        try {

            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/Reportes/ReporteFechaTurno.jrxml");
            print = JasperFillManager.fillReport(report, parameters, Connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Reporte");
            view.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnBuscarReporte1ActionPerformed

    private void btnBuscarReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarReporte2ActionPerformed
        // TODO add your handling code here:
        String mes = txtmes.getText();

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("MesConsulta", mes);  // Asegúrate de que el nombre del parámetro coincide con el del informe

        JasperReport report;
        JasperPrint print;

        try {

            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/Reportes/Acompañantes.jrxml");
            print = JasperFillManager.fillReport(report, parameters, Connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Reporte");
            view.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarReporte2ActionPerformed

    private void btnBuscarReporte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarReporte3ActionPerformed
        // TODO add your handling code here:
        Map p = new HashMap();

        JasperReport report;
        JasperPrint print;

        try {
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/Reportes/R_pago.jrxml");
            print = JasperFillManager.fillReport(report, p, Connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Reporte");
            view.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnBuscarReporte3ActionPerformed

    private void btnBuscarReporte4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarReporte4ActionPerformed
        Map p = new HashMap();

        JasperReport report;
        JasperPrint print;

        try {
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/Reportes/Reportedia.jrxml");
            print = JasperFillManager.fillReport(report, p, Connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Reporte");
            view.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarReporte4ActionPerformed

    private void btnBuscarReporte5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarReporte5ActionPerformed
        String mes = txtmes1.getText();

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("consulta", mes);  // Asegúrate de que el nombre del parámetro coincide con el del informe

        JasperReport report;
        JasperPrint print;

        try {

            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/Reportes/Huespedprincipal.jrxml");
            print = JasperFillManager.fillReport(report, parameters, Connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Reporte");
            view.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarReporte5ActionPerformed

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
            java.util.logging.Logger.getLogger(Jreportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jreportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jreportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jreportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jreportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarReporte;
    private javax.swing.JButton btnBuscarReporte1;
    private javax.swing.JButton btnBuscarReporte2;
    private javax.swing.JButton btnBuscarReporte3;
    private javax.swing.JButton btnBuscarReporte4;
    private javax.swing.JButton btnBuscarReporte5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtfecha_turno;
    private javax.swing.JTextField txtmes;
    private javax.swing.JTextField txtmes1;
    private javax.swing.JTextField txtnumero_turno;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
