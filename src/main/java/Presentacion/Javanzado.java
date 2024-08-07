package Presentacion;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Javanzado extends javax.swing.JFrame {

    public Javanzado() {
        initComponents();
        setTitle("AVANZADO");
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnempleados = new javax.swing.JButton();
        btnhabitaciones = new javax.swing.JButton();
        btnproducto = new javax.swing.JButton();
        lblacceso = new javax.swing.JLabel();
        btnReportes = new javax.swing.JButton();
        jdmenu = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "opciones avanzadas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 14))); // NOI18N

        btnempleados.setBackground(new java.awt.Color(0, 153, 204));
        btnempleados.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnempleados.setForeground(new java.awt.Color(0, 0, 102));
        btnempleados.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\reservascombugas\\Imágenes Menú\\trabajadores.png")); // NOI18N
        btnempleados.setText("REGISTRO EMPLEADOS");
        btnempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempleadosActionPerformed(evt);
            }
        });

        btnhabitaciones.setBackground(new java.awt.Color(0, 153, 204));
        btnhabitaciones.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnhabitaciones.setForeground(new java.awt.Color(0, 0, 102));
        btnhabitaciones.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\reservascombugas\\Imágenes Menú\\habitaciones.png")); // NOI18N
        btnhabitaciones.setText("REGISTRO HABITACIONES");
        btnhabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhabitacionesActionPerformed(evt);
            }
        });

        btnproducto.setBackground(new java.awt.Color(0, 153, 204));
        btnproducto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnproducto.setForeground(new java.awt.Color(0, 0, 102));
        btnproducto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\reservascombugas\\Imágenes Menú\\productos.png")); // NOI18N
        btnproducto.setText("REGISTRO PRODUCTOS");
        btnproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproductoActionPerformed(evt);
            }
        });

        lblacceso.setText("jLabel1");

        btnReportes.setBackground(new java.awt.Color(0, 153, 204));
        btnReportes.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(0, 0, 102));
        btnReportes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\reservascombugas\\Imágenes Menú\\Consultas.png")); // NOI18N
        btnReportes.setText("REPORTES");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lblacceso, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnproducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnempleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnhabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblacceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnempleados, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnhabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jdmenuLayout = new javax.swing.GroupLayout(jdmenu);
        jdmenu.setLayout(jdmenuLayout);
        jdmenuLayout.setHorizontalGroup(
            jdmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        jdmenuLayout.setVerticalGroup(
            jdmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdmenu)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdmenu)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhabitacionesActionPerformed
        Jhabitaciones Jhabitaciones = new Jhabitaciones();
        jdmenu.add(Jhabitaciones);
        
        Jhabitaciones.setVisible(true);
    }//GEN-LAST:event_btnhabitacionesActionPerformed

    private void btnempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnempleadosActionPerformed
//        new Jregistroempleados().setVisible(true);
        Jregistroempleados Jregistroempleados = new Jregistroempleados();
        jdmenu.add(Jregistroempleados);
         Jregistroempleados.toFront();
        Jregistroempleados.setVisible(true);
    }//GEN-LAST:event_btnempleadosActionPerformed

    private void btnproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproductoActionPerformed
       Jproducto Jproducto = new Jproducto();
        jdmenu.add(Jproducto);
         Jproducto.toFront();
        Jproducto.setVisible(true);
    }//GEN-LAST:event_btnproductoActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
         Jreportes reportes = new Jreportes();
        jdmenu.add(reportes);
         reportes.toFront();
        reportes.setVisible(true);
    }//GEN-LAST:event_btnReportesActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Javanzado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnempleados;
    private javax.swing.JButton btnhabitaciones;
    private javax.swing.JButton btnproducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane jdmenu;
    public static javax.swing.JLabel lblacceso;
    // End of variables declaration//GEN-END:variables
}
