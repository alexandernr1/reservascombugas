package Presentacion;

import Logica.Cconexion;
import com.toedter.calendar.JDateChooser;
import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class Jreportes extends javax.swing.JInternalFrame {

    public Jreportes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnBuscarReporte = new javax.swing.JButton();
        txtnumero_turno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBuscarReporte1 = new javax.swing.JButton();
        dcfechainicial = new com.toedter.calendar.JDateChooser();
        dcfechafin = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPORTE TURNOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarReporte.setText("Buscar");
        btnBuscarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarReporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 57, -1, -1));
        jPanel1.add(txtnumero_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, 20));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("Reporte con Numero Turno:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Repote con Parametro de Fechas:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btnBuscarReporte1.setText("Buscar");
        btnBuscarReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarReporte1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarReporte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));
        jPanel1.add(dcfechainicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 110, -1));
        jPanel1.add(dcfechafin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 120, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Inicial:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("Inicial:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("Final:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPORTE ACOMPAÑANTES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 12))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Connection Connection = new Cconexion().establecerConexion();

    private void btnBuscarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarReporteActionPerformed

        int numero = Integer.parseInt(txtnumero_turno.getText());

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("numero_turno", numero);
        JasperReport report;
        JasperPrint print;

        try {
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/Reportes/Turnos.jrxml");
            print = JasperFillManager.fillReport(report, parameters, Connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Comprobante");
            view.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarReporteActionPerformed

    private void btnBuscarReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarReporte1ActionPerformed

        java.util.Date selectedStartDate =  dcfechainicial.getDate();
        java.util.Date selectedEndDate =  dcfechafin.getDate();

        if (selectedStartDate != null && selectedEndDate != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
            String formattedStartDate = dateFormat.format(selectedStartDate);
            String formattedEndDate = dateFormat.format(selectedEndDate);
            int fechaInicial = Integer.parseInt(formattedStartDate);
            int fechaFin = Integer.parseInt(formattedEndDate);

            System.out.println("Fecha inicial como entero: " + fechaInicial);
            System.out.println("Fecha final como entero: " + fechaFin);

            java.sql.Date sqlStartDate = new java.sql.Date(selectedStartDate.getTime());
            java.sql.Date sqlEndDate = new java.sql.Date(selectedEndDate.getTime());

            Map<String, Object> parameters = new HashMap<>();
            parameters.put("fecha_inicial", sqlStartDate);
            parameters.put("fecha_final", sqlEndDate);

            JasperReport report;
            JasperPrint print;

            try {
                report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                        + "/src/main/java/Reportes/fechaturnos.jrxml");
                print = JasperFillManager.fillReport(report, parameters, Connection);
                JasperViewer view = new JasperViewer(print, false);
                view.setTitle("Comprobante");
                view.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No se han seleccionado todas las fechas.");
        }

    }//GEN-LAST:event_btnBuscarReporte1ActionPerformed

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
    private com.toedter.calendar.JDateChooser dcfechafin;
    private com.toedter.calendar.JDateChooser dcfechainicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtnumero_turno;
    // End of variables declaration//GEN-END:variables
}
