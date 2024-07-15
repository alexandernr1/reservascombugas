package Presentacion;

import Datos.Dacompañante;
import Logica.Cconexion;
import Logica.Facompañante;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Jacompañante extends javax.swing.JFrame {

    PreparedStatement pst;
    ResultSet rs;

    public Jacompañante() {
        initComponents();

        mostraracompañante("");
        setLocationRelativeTo(null);
        setTitle("INGRESO DE ACOMPAÑANTE");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Jingreso ingreso = new Jingreso();
        txtidcliente.setText(ingreso.idcliente);

    }
    private String accion = "guardar";

    public void limpiarcampo() {
        txtacompañante.setText(null);
        cbo_tipoDocumento.setSelectedItem(0);
        txtdocumentos.setText(null);
        cboparentesco.setSelectedItem(0);
        txtnumero_habitacion.setText(null);
    }

    void ocultarcolumnas() {
        tablalistadoacompañante.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistadoacompañante.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistadoacompañante.getColumnModel().getColumn(0).setPreferredWidth(0);

        tablalistadoacompañante.getColumnModel().getColumn(1).setMaxWidth(0);
        tablalistadoacompañante.getColumnModel().getColumn(1).setMinWidth(0);
        tablalistadoacompañante.getColumnModel().getColumn(1).setPreferredWidth(0);
    }

    public void mostraracompañante(String buscar) {
        try {
            DefaultTableModel modelo;
            Facompañante func = new Facompañante();
            modelo = func.mostraracompañante(buscar);

            tablalistadoacompañante.setModel(modelo);
            ocultarcolumnas();
            lbltotalregistroacompañante.setText("Total Registros " + Integer.toString(func.totalregistros));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtacompañante = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtdocumentos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtnumero_habitacion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnGuardarAcomp = new javax.swing.JButton();
        cboparentesco = new javax.swing.JComboBox<>();
        cbo_tipoDocumento = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        dcCheckin = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        txtciudad_recidencia = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtciudad_procedencia = new javax.swing.JTextField();
        txtnum_principal = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtidacompañante = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablalistadoacompañante = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        txtbuscaracompañante = new javax.swing.JTextField();
        btneliminaracompañante = new javax.swing.JButton();
        btnbuscaracompañante = new javax.swing.JButton();
        lbltotalregistroacompañante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS ACOMPAÑANTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N

        txtacompañante.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("Nmbre completo:");

        txtdocumentos.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel10.setText("Documento:");

        jLabel12.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel12.setText("Parentesco:");

        txtnumero_habitacion.setEditable(false);
        txtnumero_habitacion.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtnumero_habitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumero_habitacionActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel15.setText("N°  Habita:");

        btnGuardarAcomp.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarAcomp.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnGuardarAcomp.setText("Ingresar Acompañente");
        btnGuardarAcomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAcompActionPerformed(evt);
            }
        });

        cboparentesco.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cboparentesco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Esposo/a", "Padre", "Madre", "Hijo/a", "Familiar", "Compeñero de Trabajo" }));

        cbo_tipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula de ciudadania", "Cedula de extragria", "Pasaporte", "Tarjeta de identidad" }));

        jLabel17.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel17.setText("Tipo Documento:");

        jLabel20.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel20.setText("check IN :");

        txtciudad_recidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtciudad_recidenciaActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel21.setText("Ciudad de Residencia:");

        jLabel22.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel22.setText("Ciudad de Procedencia:");

        txtciudad_procedencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtciudad_procedenciaActionPerformed(evt);
            }
        });

        txtnum_principal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnum_principalKeyPressed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel23.setText("N° huesped principal");

        txtidacompañante.setText("IDAC");
        txtidacompañante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidacompañanteActionPerformed(evt);
            }
        });

        txtidcliente.setEditable(false);
        txtidcliente.setText("IDC");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel10))
                    .addComponent(jLabel17)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbo_tipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 416, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(dcCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(txtnum_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtacompañante, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtnumero_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtdocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(312, 312, 312)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidacompañante, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(cboparentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addGap(18, 18, 18)
                            .addComponent(txtciudad_recidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtciudad_procedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnGuardarAcomp))
                .addContainerGap(353, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dcCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(txtnum_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtacompañante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtnumero_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidacompañante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_tipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cboparentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtciudad_recidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtciudad_procedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarAcomp)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTADO ACOMPAÑANTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N

        tablalistadoacompañante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Tipo Documento", "Documento", "Parentesco", "N° Habita"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablalistadoacompañante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoacompañanteMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tablalistadoacompañante);

        jLabel24.setText("Buscar");

        txtbuscaracompañante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscaracompañanteActionPerformed(evt);
            }
        });

        btneliminaracompañante.setBackground(new java.awt.Color(204, 204, 204));
        btneliminaracompañante.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btneliminaracompañante.setText("Eliminar");
        btneliminaracompañante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminaracompañanteActionPerformed(evt);
            }
        });

        btnbuscaracompañante.setBackground(new java.awt.Color(204, 204, 204));
        btnbuscaracompañante.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnbuscaracompañante.setText("Buscar");
        btnbuscaracompañante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaracompañanteActionPerformed(evt);
            }
        });

        lbltotalregistroacompañante.setText("Total registro");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbltotalregistroacompañante))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbuscaracompañante, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btneliminaracompañante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscaracompañante, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtbuscaracompañante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscaracompañante)
                    .addComponent(btneliminaracompañante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltotalregistroacompañante)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumero_habitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumero_habitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumero_habitacionActionPerformed

    private void btnGuardarAcompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAcompActionPerformed
        // TODO add your handling code here:
        Facompañante func = new Facompañante();
        Dacompañante dts = new Dacompañante();

        dts.setIdcliente(Integer.parseInt(txtidcliente.getText()));
        dts.setNombre_apellido(txtacompañante.getText());
        int seleccionado = cbo_tipoDocumento.getSelectedIndex();
        dts.setTipo_documento((String) cbo_tipoDocumento.getItemAt(seleccionado));
        dts.setDocumento(Integer.parseInt(txtdocumentos.getText()));
        int parentesco = cboparentesco.getSelectedIndex();
        dts.setParentesco((String) cboparentesco.getItemAt(parentesco));
        dts.setNum_habitacion(Integer.parseInt(txtnumero_habitacion.getText()));
        Calendar cal;
        int d, m, a;
        cal = dcCheckin.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setCheckin(new Date(a, m, d));
        
       dts.setNum_huesped_principal(Integer.parseInt(txtnum_principal.getText()));
       dts.setCiudad_de_residencia(txtciudad_recidencia.getText());
       dts.setCiudad_de_procedencia(txtciudad_procedencia.getText());

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                mostraracompañante("");

                int respuesta = JOptionPane.showConfirmDialog(rootPane, "ACOMPAÑANTE REGISTRADO.Deseas ingresar otro", "comfirmar", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_NO_OPTION) {
                    limpiarcampo();

                }

            }

        }
    }//GEN-LAST:event_btnGuardarAcompActionPerformed

    private void txtciudad_recidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtciudad_recidenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_recidenciaActionPerformed

    private void txtciudad_procedenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtciudad_procedenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudad_procedenciaActionPerformed

    private void tablalistadoacompañanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoacompañanteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablalistadoacompañanteMouseClicked

    private void txtbuscaracompañanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscaracompañanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscaracompañanteActionPerformed

    private void btneliminaracompañanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminaracompañanteActionPerformed
        // TODO add your handling code here:
        if (!txtidacompañante.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de Eliminar el ACOMPAÑANTE?", "Confirmar", 2);

            if (confirmacion == 0) {
                Facompañante func = new Facompañante();
                Dacompañante dts = new Dacompañante();

                dts.setIdacompañante(Integer.parseInt(txtidacompañante.getText()));
                func.eliminar(dts);
                mostraracompañante("");

            }

        }
    }//GEN-LAST:event_btneliminaracompañanteActionPerformed

    private void btnbuscaracompañanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaracompañanteActionPerformed
        // TODO add your handling code here:
        mostraracompañante(txtbuscaracompañante.getText());
    }//GEN-LAST:event_btnbuscaracompañanteActionPerformed

    private void txtidacompañanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidacompañanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidacompañanteActionPerformed

    private void txtnum_principalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnum_principalKeyPressed
        // TODO add your handling code here:
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
    Cconexion conexion = new Cconexion();

    try {
        Connection conectar = conexion.establecerConexion();

        // Primera consulta: obtener el idcliente basado en el numdocumento
        PreparedStatement pst1 = conectar.prepareStatement("select idcliente from cliente where numdocumento=?");
        pst1.setString(1, txtnum_principal.getText());

        ResultSet rs1 = pst1.executeQuery();

        if (rs1.next()) {
            int idCliente = rs1.getInt("idcliente");

            // Segunda consulta: obtener el num_habitacion basado en el idcliente
            PreparedStatement pst2 = conectar.prepareStatement("select num_habitacion from ingreso where idcliente=?  and estado = 'Activo'");
            pst2.setInt(1, idCliente);

            ResultSet rs2 = pst2.executeQuery();

            if (rs2.next()) {
                txtidcliente.setText(String.valueOf(idCliente));
                txtnumero_habitacion.setText(rs2.getString("num_habitacion"));
//                txtcliente.setText(rs1.getString("nombres") + " " + rs1.getString("apellidos"));

            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la habitación para el CLIENTE solicitado");
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el CLIENTE solicitado");
        }

    } catch (Exception ex) {
        System.err.println("Error: " + ex);
    }
}

    }//GEN-LAST:event_txtnum_principalKeyPressed

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
            java.util.logging.Logger.getLogger(Jacompañante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jacompañante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jacompañante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jacompañante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jacompañante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarAcomp;
    private javax.swing.JButton btnbuscaracompañante;
    private javax.swing.JButton btneliminaracompañante;
    private javax.swing.JComboBox<String> cbo_tipoDocumento;
    private javax.swing.JComboBox<String> cboparentesco;
    private com.toedter.calendar.JDateChooser dcCheckin;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lbltotalregistroacompañante;
    private javax.swing.JTable tablalistadoacompañante;
    private javax.swing.JTextField txtacompañante;
    private javax.swing.JTextField txtbuscaracompañante;
    private javax.swing.JTextField txtciudad_procedencia;
    private javax.swing.JTextField txtciudad_recidencia;
    private javax.swing.JTextField txtdocumentos;
    private static javax.swing.JTextField txtidacompañante;
    public static javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtnum_principal;
    private javax.swing.JTextField txtnumero_habitacion;
    // End of variables declaration//GEN-END:variables
}
