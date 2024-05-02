package Presentacion;

import javax.swing.JFrame;

public final class Jmenuhotel extends javax.swing.JFrame {

    private String idpersona;
    private String nombres;
    private String apellidos;
    private String acceso;
    private Boolean sesionIniciada = false;
    private Juselogin Jturnos = null;
    private LoguinDeAdmin Javanzado;

    public Jmenuhotel(String idpersona, String nombres, String apellidos, String acceso) {

        initComponents();
        setTitle("MENU HOTEL");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.idpersona = idpersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.acceso = acceso;

        lblidpersona.setText(idpersona);
        lblnombres.setText(nombres);
        lblapellidos.setText(apellidos);
        lblacceso.setText(acceso);
        inhabilitar();
    }

    static void inhabilitar() {
        lblidpersona.setVisible(false);
        lblacceso.setVisible(false);

    }

//    public void cerrarTurno() {
//        if (Jturnos != null) {
//            Jturnos.finalizarTurno();
//            sesionIniciada = false; // Reinicia la variable de control
//        }
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btncambioturno = new javax.swing.JButton();
        btnlistaespera = new javax.swing.JButton();
        btnlimpieza = new javax.swing.JButton();
        btnconfiguracion = new javax.swing.JButton();
        btnsalidahuesped = new javax.swing.JButton();
        btningresohuesped = new javax.swing.JButton();
        btnregistro = new javax.swing.JButton();
        btnavanzado = new javax.swing.JButton();
        btnreservas = new javax.swing.JButton();
        btnpagos = new javax.swing.JButton();
        escritorio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblidpersona = new javax.swing.JLabel();
        lblnombres = new javax.swing.JLabel();
        lblapellidos = new javax.swing.JLabel();
        lblacceso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENÚ HOTEL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 24))); // NOI18N

        btncambioturno.setBackground(new java.awt.Color(204, 255, 153));
        btncambioturno.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        btncambioturno.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\cambio-de-turno.png")); // NOI18N
        btncambioturno.setText("CAMBIO DE TURNO");
        btncambioturno.setBorder(null);
        btncambioturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncambioturnoActionPerformed(evt);
            }
        });

        btnlistaespera.setBackground(new java.awt.Color(204, 255, 153));
        btnlistaespera.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        btnlistaespera.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\tiempo.png")); // NOI18N
        btnlistaespera.setText("LISTA DE ESPERA");
        btnlistaespera.setBorder(null);
        btnlistaespera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistaesperaActionPerformed(evt);
            }
        });

        btnlimpieza.setBackground(new java.awt.Color(204, 255, 153));
        btnlimpieza.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnlimpieza.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\limpieza.png")); // NOI18N
        btnlimpieza.setText("LiMPIEZA");
        btnlimpieza.setBorder(null);
        btnlimpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiezaActionPerformed(evt);
            }
        });

        btnconfiguracion.setBackground(new java.awt.Color(204, 255, 153));
        btnconfiguracion.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        btnconfiguracion.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\configuracion.png")); // NOI18N
        btnconfiguracion.setText("CONFIGURACION");
        btnconfiguracion.setBorder(null);
        btnconfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfiguracionActionPerformed(evt);
            }
        });

        btnsalidahuesped.setBackground(new java.awt.Color(204, 255, 153));
        btnsalidahuesped.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        btnsalidahuesped.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\salida.png")); // NOI18N
        btnsalidahuesped.setText("SALIDA HUESPED");
        btnsalidahuesped.setBorder(null);
        btnsalidahuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalidahuespedActionPerformed(evt);
            }
        });

        btningresohuesped.setBackground(new java.awt.Color(204, 255, 153));
        btningresohuesped.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        btningresohuesped.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\ingreso.png")); // NOI18N
        btningresohuesped.setText("INGRESO HUESPED");
        btningresohuesped.setBorder(null);
        btningresohuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresohuespedActionPerformed(evt);
            }
        });

        btnregistro.setBackground(new java.awt.Color(204, 255, 153));
        btnregistro.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        btnregistro.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\registro-en-linea.png")); // NOI18N
        btnregistro.setText("REGISTRO");
        btnregistro.setActionCommand("     REGISTRO");
        btnregistro.setBorder(null);
        btnregistro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistroActionPerformed(evt);
            }
        });

        btnavanzado.setBackground(new java.awt.Color(204, 255, 153));
        btnavanzado.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnavanzado.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\carrera-profesional.png")); // NOI18N
        btnavanzado.setText("AVANZADO");
        btnavanzado.setBorder(null);
        btnavanzado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnavanzadoActionPerformed(evt);
            }
        });

        btnreservas.setBackground(new java.awt.Color(204, 255, 153));
        btnreservas.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        btnreservas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\reserva.png")); // NOI18N
        btnreservas.setText("RESERVAS");
        btnreservas.setBorder(null);
        btnreservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreservasActionPerformed(evt);
            }
        });

        btnpagos.setBackground(new java.awt.Color(204, 255, 153));
        btnpagos.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnpagos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\metodo-de-pago.png")); // NOI18N
        btnpagos.setText("PAGOS");
        btnpagos.setBorder(null);
        btnpagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsalidahuesped, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(btnconfiguracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnlimpieza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnregistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnreservas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btningresohuesped, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(btncambioturno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnlistaespera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnavanzado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(btnpagos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnreservas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btningresohuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsalidahuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncambioturno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnlistaespera, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnpagos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlimpieza, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnavanzado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnconfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 540));

        escritorio.setBackground(new java.awt.Color(255, 255, 102));
        escritorio.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\logo combugas.png")); // NOI18N
        escritorio.add(jLabel1);
        jLabel1.setBounds(430, 0, 101, 100);

        lblidpersona.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblidpersona.setText("jLabel3");
        escritorio.add(lblidpersona);
        lblidpersona.setBounds(6, 6, 80, 20);

        lblnombres.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblnombres.setText("jLabel4");
        escritorio.add(lblnombres);
        lblnombres.setBounds(10, 30, 80, 20);

        lblapellidos.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblapellidos.setText("jLabel5");
        escritorio.add(lblapellidos);
        lblapellidos.setBounds(80, 30, 150, 20);

        lblacceso.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblacceso.setText("jLabel6");
        escritorio.add(lblacceso);
        lblacceso.setBounds(70, 10, 150, 20);

        jPanel2.add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 560, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalidahuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalidahuespedActionPerformed

        new Jsalidahuesped().setVisible(true);
        Jsalidahuesped.txtidempleado.setText(lblidpersona.getText());
        Jsalidahuesped.txtempleado.setText(lblnombres.getText() + " " + lblapellidos.getText());
        Jsalidahuesped.idusuario = Integer.parseInt(lblidpersona.getText());
    }//GEN-LAST:event_btnsalidahuespedActionPerformed

    private void btnregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistroActionPerformed

        new Jcliente().setVisible(true);

    }//GEN-LAST:event_btnregistroActionPerformed

    private void btnreservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservasActionPerformed

        Jmanejoreservas form = new Jmanejoreservas();
        form.toFront();
        form.setVisible(true);
        Jmanejoreservas.txtidempleado.setText(lblidpersona.getText());
        Jmanejoreservas.txtempleado.setText(lblnombres.getText() + " " + lblapellidos.getText());
        Jmanejoreservas.idusuario = Integer.parseInt(lblidpersona.getText());

    }//GEN-LAST:event_btnreservasActionPerformed

    private void btningresohuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresohuespedActionPerformed

        Jingreso form = new Jingreso();
        form.toFront();
        form.setVisible(true);
        Jingreso.txtidempleado.setText(lblidpersona.getText());
        Jingreso.txtempleado.setText(lblnombres.getText() + " " + lblapellidos.getText());
        Jingreso.idusuario = Integer.parseInt(lblidpersona.getText());

    }//GEN-LAST:event_btningresohuespedActionPerformed

    private void btnconfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfiguracionActionPerformed

    }//GEN-LAST:event_btnconfiguracionActionPerformed

    private void btnpagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagosActionPerformed

        new Jpago().setVisible(true);
    }//GEN-LAST:event_btnpagosActionPerformed

    private void btnavanzadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnavanzadoActionPerformed
        
            Javanzado = new LoguinDeAdmin();
            Javanzado.toFront();
            Javanzado.setVisible(true);

            sesionIniciada = true;
         
//        new Javanzado().setVisible(true);
    }//GEN-LAST:event_btnavanzadoActionPerformed

    private void btnlistaesperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistaesperaActionPerformed
        new Jlistaespera().setVisible(true);
    }//GEN-LAST:event_btnlistaesperaActionPerformed

    private void btncambioturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncambioturnoActionPerformed

        if (!sesionIniciada) {
            Jturnos = new Juselogin();
            Jturnos.toFront();
            Jturnos.setVisible(true);

            sesionIniciada = true;
        } 
        

//        cerrarTurno();

    }//GEN-LAST:event_btncambioturnoActionPerformed

    private void btnlimpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiezaActionPerformed
        Jlimpieza form = new Jlimpieza();
        form.toFront();
        form.setVisible(true);

    }//GEN-LAST:event_btnlimpiezaActionPerformed

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
            java.util.logging.Logger.getLogger(Jmenuhotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jmenuhotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jmenuhotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jmenuhotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            // new Jmenuhotel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnavanzado;
    private javax.swing.JButton btncambioturno;
    public static javax.swing.JButton btnconfiguracion;
    private javax.swing.JButton btningresohuesped;
    private javax.swing.JButton btnlimpieza;
    private javax.swing.JButton btnlistaespera;
    private javax.swing.JButton btnpagos;
    private javax.swing.JButton btnregistro;
    private javax.swing.JButton btnreservas;
    private javax.swing.JButton btnsalidahuesped;
    public static javax.swing.JPanel escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel lblacceso;
    public static javax.swing.JLabel lblapellidos;
    public static javax.swing.JLabel lblidpersona;
    public static javax.swing.JLabel lblnombres;
    // End of variables declaration//GEN-END:variables

}
