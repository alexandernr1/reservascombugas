package Presentacion;

import javax.swing.JFrame;

public class Jmenuprin extends javax.swing.JFrame {

    public Jmenuprin() {

        initComponents();
        setLocationRelativeTo(null);
        setTitle("MENU PRINCIPAL");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        inhabilitar();

    }
static void inhabilitar() {
        lblidpersona.setVisible(false);
        lblnombres.setVisible(false);
        lblapellidos.setVisible(false);
        lblacceso.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnmenuhotel = new javax.swing.JButton();
        btnrestaurante = new javax.swing.JButton();
        btnlavanderia = new javax.swing.JButton();
        btnpicinas = new javax.swing.JButton();
        btnparqueadero = new javax.swing.JButton();
        butsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblapellidos = new javax.swing.JLabel();
        lblidpersona = new javax.swing.JLabel();
        lblacceso = new javax.swing.JLabel();
        lblnombres = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));

        btnmenuhotel.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnmenuhotel.setText("HOTEL");
        btnmenuhotel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnmenuhotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuhotelActionPerformed(evt);
            }
        });

        btnrestaurante.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnrestaurante.setText("RESTAURANTE");
        btnrestaurante.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnrestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestauranteActionPerformed(evt);
            }
        });

        btnlavanderia.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnlavanderia.setText("LAVANDERIA");
        btnlavanderia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnlavanderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlavanderiaActionPerformed(evt);
            }
        });

        btnpicinas.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnpicinas.setText("PICINAS");
        btnpicinas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnpicinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpicinasActionPerformed(evt);
            }
        });

        btnparqueadero.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnparqueadero.setText("PARQUEADERO");
        btnparqueadero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnparqueadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnparqueaderoActionPerformed(evt);
            }
        });

        butsalir.setBackground(new java.awt.Color(153, 153, 153));
        butsalir.setText("SALIR");
        butsalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        butsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butsalirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\logo combugas.png")); // NOI18N

        lblapellidos.setText("jLabel3");

        lblidpersona.setText("jLabel4");

        lblacceso.setText("jLabel5");

        lblnombres.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(btnpicinas, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(butsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnmenuhotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnrestaurante, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnparqueadero, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(btnlavanderia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblnombres)
                            .addComponent(lblapellidos)
                            .addComponent(lblacceso)
                            .addComponent(lblidpersona))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblnombres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblapellidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblacceso)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnparqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmenuhotel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnrestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlavanderia, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnpicinas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(butsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmenuhotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuhotelActionPerformed

        Jmenuhotel form = new Jmenuhotel(
                Jmenuprin.lblidpersona.getText(),
                Jmenuprin.lblnombres.getText(),
                Jmenuprin.lblapellidos.getText(),
                Jmenuprin.lblacceso.getText());

        if (Jmenuhotel.lblacceso.getText().equals("General")) {
        // Si el usuario es administrador, simplemente se muestra el formulario
        form.setVisible(true);
    } else {
        // Si el usuario no es administrador, se deshabilitan los botones
        Jmenuhotel.btnconfiguracion.setEnabled(false);
        Jmenuhotel.btnavanzado.setEnabled(false);
        // Y luego se muestra el formulario
        form.setVisible(true);
    }
    }//GEN-LAST:event_btnmenuhotelActionPerformed

    private void btnpicinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpicinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpicinasActionPerformed

    private void btnlavanderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlavanderiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlavanderiaActionPerformed

    private void btnparqueaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnparqueaderoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnparqueaderoActionPerformed

    private void btnrestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestauranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnrestauranteActionPerformed

    private void butsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butsalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_butsalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Jmenuprin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlavanderia;
    private javax.swing.JButton btnmenuhotel;
    private javax.swing.JButton btnparqueadero;
    private javax.swing.JButton btnpicinas;
    private javax.swing.JButton btnrestaurante;
    private javax.swing.JButton butsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel lblacceso;
    public static javax.swing.JLabel lblapellidos;
    public static javax.swing.JLabel lblidpersona;
    public static javax.swing.JLabel lblnombres;
    // End of variables declaration//GEN-END:variables
}
