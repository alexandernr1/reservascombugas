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

        escritorio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblidpersona = new javax.swing.JLabel();
        lblnombres = new javax.swing.JLabel();
        lblapellidos = new javax.swing.JLabel();
        lblacceso = new javax.swing.JLabel();
        butsalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnmenuhotel = new javax.swing.JButton();
        btnrestaurante = new javax.swing.JButton();
        btnlavanderia = new javax.swing.JButton();
        btnpicinas = new javax.swing.JButton();
        btnparqueadero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\logo combugas.png")); // NOI18N

        lblidpersona.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblidpersona.setText("jLabel3");

        lblnombres.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblnombres.setText("jLabel4");

        lblapellidos.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblapellidos.setText("jLabel5");

        lblacceso.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblacceso.setText("jLabel6");

        butsalir.setBackground(new java.awt.Color(153, 153, 153));
        butsalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\COMBUGAS\\Complementos\\Images\\salir.gif")); // NOI18N
        butsalir.setText("SALIR");
        butsalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        butsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblacceso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(lblnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(butsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblidpersona)
                        .addGap(10, 10, 10)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnombres)
                            .addComponent(lblapellidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblacceso)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                .addComponent(butsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENÚ PRINCIPAL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 24))); // NOI18N

        btnmenuhotel.setBackground(new java.awt.Color(204, 255, 153));
        btnmenuhotel.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnmenuhotel.setText("HOTEL");
        btnmenuhotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuhotelActionPerformed(evt);
            }
        });

        btnrestaurante.setBackground(new java.awt.Color(204, 255, 153));
        btnrestaurante.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnrestaurante.setText("RESTAURANTE");
        btnrestaurante.setEnabled(false);
        btnrestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestauranteActionPerformed(evt);
            }
        });

        btnlavanderia.setBackground(new java.awt.Color(204, 255, 153));
        btnlavanderia.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnlavanderia.setText("LAVANDERIA");
        btnlavanderia.setEnabled(false);
        btnlavanderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlavanderiaActionPerformed(evt);
            }
        });

        btnpicinas.setBackground(new java.awt.Color(204, 255, 153));
        btnpicinas.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnpicinas.setText("PICINAS");
        btnpicinas.setEnabled(false);
        btnpicinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpicinasActionPerformed(evt);
            }
        });

        btnparqueadero.setBackground(new java.awt.Color(204, 255, 153));
        btnparqueadero.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnparqueadero.setText("PARQUEADERO");
        btnparqueadero.setEnabled(false);
        btnparqueadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnparqueaderoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnlavanderia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnrestaurante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnparqueadero, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(btnmenuhotel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnpicinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(btnmenuhotel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnparqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnrestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlavanderia, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnpicinas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
    private javax.swing.JPanel escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel lblacceso;
    public static javax.swing.JLabel lblapellidos;
    public static javax.swing.JLabel lblidpersona;
    public static javax.swing.JLabel lblnombres;
    // End of variables declaration//GEN-END:variables
}
