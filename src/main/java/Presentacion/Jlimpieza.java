package Presentacion;

import Datos.Dhabitacion;
import Datos.Dlimpieza;
import Logica.Cconexion;
import Logica.Fhabitacion;
import javax.swing.JFrame;
import Logica.Flimpieza;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Jlimpieza extends javax.swing.JFrame {

    private static Jlimpieza instance;
    PreparedStatement pst;
    ResultSet rs;

    public Jlimpieza() {
        initComponents();
        setTitle("LIMPIEZA");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mostrar("");

        inhabilitar();
    }
    private String accion = "guardar";
    public static int idusuario;

    public static Jlimpieza getInstance() {
        if (instance == null) {
            instance = new Jlimpieza();
        }
        return instance;
    }

    static void inhabilitar() {
        txtidempleado.setVisible(false);
        txtidlimpieza.setVisible(false);
        txtidhabitacion.setVisible(false);

    }

    void habilitar() {
        txtidlimpieza.setVisible(false);
        txtidempleado.setVisible(false);

        txtempleado.setEnabled(true);
        txtnumero.setEnabled(true);
        dcfecha.setEnabled(true);
        txttipohabitacion.setEnabled(true);
        cboestado.setEnabled(true);
        cboturno.setEnabled(true);

        btnguardar.setEnabled(true);
        btneliminar.setEnabled(true);

        txtidlimpieza.setText("");
        txtidempleado.setText("");
        txtnumero.setEnabled(true);

    }

    void ocultar_columnas() {
        tablalistadolimpieza.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistadolimpieza.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistadolimpieza.getColumnModel().getColumn(0).setPreferredWidth(0);

        tablalistadolimpieza.getColumnModel().getColumn(1).setMaxWidth(0);
        tablalistadolimpieza.getColumnModel().getColumn(1).setMinWidth(0);
        tablalistadolimpieza.getColumnModel().getColumn(1).setPreferredWidth(0);

    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            Flimpieza func = new Flimpieza();
            modelo = func.mostrar(buscar);

            tablalistadolimpieza.setModel(modelo);
            ocultar_columnas();
            lbltotalregistros.setText("Total Registros " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtidlimpieza = new javax.swing.JTextField();
        cboestado = new javax.swing.JComboBox<>();
        txtidempleado = new javax.swing.JTextField();
        butnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        txtempleado = new javax.swing.JTextField();
        btnbuscarempleado = new javax.swing.JButton();
        cboturno = new javax.swing.JComboBox<>();
        dcfecha = new com.toedter.calendar.JDateChooser();
        txtidhabitacion = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        txttipohabitacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablalistadolimpieza = new javax.swing.JTable();
        lbltotalregistros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PROGRAMACIÓN DE LIMPIEZA"));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("N° Habitación:");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Estado:");

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("Encargado:");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("Fecha:");

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("Tipo Habitación:");

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setText("turno:");

        txtidlimpieza.setText("IDL");

        cboestado.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En Limpieza", "Disponible", " " }));

        txtidempleado.setText("IDE");
        txtidempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidempleadoActionPerformed(evt);
            }
        });

        butnuevo.setBackground(new java.awt.Color(204, 204, 204));
        butnuevo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\reservascombugas\\Images\\nuevo.GIF")); // NOI18N
        butnuevo.setText("NUEVO");
        butnuevo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        butnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butnuevoActionPerformed(evt);
            }
        });

        btnguardar.setBackground(new java.awt.Color(204, 204, 204));
        btnguardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\reservascombugas\\Images\\guardar.png")); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        txtempleado.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtempleadoActionPerformed(evt);
            }
        });

        btnbuscarempleado.setText("Bus encargado");
        btnbuscarempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarempleadoActionPerformed(evt);
            }
        });

        cboturno.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cboturno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turno 1", "Turno 2", "Turno 3", " " }));

        txtidhabitacion.setText("IDH");

        txtnumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnumeroKeyPressed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado "));

        jLabel9.setText("Buscar:");

        btnbuscar.setBackground(new java.awt.Color(204, 204, 204));
        btnbuscar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnbuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\reservascombugas\\Images\\buscar.png")); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(204, 204, 204));
        btneliminar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\reservascombugas\\Images\\eliminar.png")); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        tablalistadolimpieza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "N° Habitacion", "Fecha", "Tipo Habitacion", "Encargado", "Estado", "Turno"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablalistadolimpieza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadolimpiezaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablalistadolimpieza);

        lbltotalregistros.setText("Total Registros");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbltotalregistros))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnbuscar)
                        .addComponent(btneliminar))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltotalregistros)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtidlimpieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboturno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(butnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnbuscarempleado))
                                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttipohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dcfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(74, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtidlimpieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dcfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttipohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cboturno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnbuscarempleado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butnuevoActionPerformed

        habilitar();
        btnguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_butnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        Dlimpieza dts = new Dlimpieza();
        Flimpieza func = new Flimpieza();

        // Asignar valores a los campos de Dlimpieza
        dts.setIdempleado(Integer.parseInt(txtidempleado.getText()));
        dts.setNumero(Integer.parseInt(txtnumero.getText()));
        dts.setTipo_habitacion(txttipohabitacion.getText());
        Calendar cal;
        int d, m, a;
        cal = dcfecha.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFecha(new Date(a, m, d));

        dts.setEstado(cboestado.getSelectedItem().toString());
        dts.setTurno(cboturno.getSelectedItem().toString());
        dts.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));

        // Insertar datos
        if (accion.equals("guardar")) {

            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El registro fue almacenado satisfactoriamente");
                mostrar("");
                inhabilitar();
                Fhabitacion fnc = new Fhabitacion();
                Dhabitacion dts1 = new Dhabitacion();

                dts1.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
                fnc.limpieza(dts1);

            }
        } else if (accion.equals("editar")) {
            dts.setIdlimpieza(Integer.parseInt(txtidlimpieza.getText()));
            dts.setIdempleado(Integer.parseInt(txtidempleado.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "Editado satisfactoriamente");
                mostrar("");
                inhabilitar();
                Fhabitacion func2 = new Fhabitacion();
                Dhabitacion dts2 = new Dhabitacion();

                dts2.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
                func2.disponible(dts2);
            }
        }

    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnbuscarempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarempleadoActionPerformed
        Jvistaempleado form = new Jvistaempleado();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnbuscarempleadoActionPerformed

    private void txtempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtempleadoActionPerformed

    private void txtidempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidempleadoActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        if (!txtidlimpieza.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de Eliminar el registro?", "Confirmar", 2);

            if (confirmacion == 0) {
                Flimpieza func = new Flimpieza();
                Dlimpieza dts = new Dlimpieza();

                dts.setIdlimpieza(Integer.parseInt(txtidlimpieza.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();

            }

        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void tablalistadolimpiezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadolimpiezaMouseClicked

        btnguardar.setText("Editar");
        habilitar();
        btneliminar.setEnabled(true);
        accion = "editar";

        int fila = tablalistadolimpieza.rowAtPoint(evt.getPoint());

        txtidlimpieza.setText(tablalistadolimpieza.getValueAt(fila, 0).toString());
        txtidempleado.setText(tablalistadolimpieza.getValueAt(fila, 1).toString());
        txtempleado.setText(tablalistadolimpieza.getValueAt(fila, 2).toString());
        txtnumero.setText(tablalistadolimpieza.getValueAt(fila, 3).toString());
        dcfecha.setDate(Date.valueOf(tablalistadolimpieza.getValueAt(fila, 4).toString()));
        txttipohabitacion.setText(tablalistadolimpieza.getValueAt(fila, 5).toString());
        cboestado.setSelectedItem(tablalistadolimpieza.getValueAt(fila, 6).toString());
        cboturno.setSelectedItem(tablalistadolimpieza.getValueAt(fila, 7).toString());
        txtidhabitacion.setText(tablalistadolimpieza.getValueAt(fila, 8).toString());

    }//GEN-LAST:event_tablalistadolimpiezaMouseClicked

    private void txtnumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Cconexion conexion = new Cconexion();

            try {
                Connection conectar = conexion.establecerConexion();

                pst = conectar.prepareStatement("select * from habitacion where numero=?");
                pst.setString(1, txtnumero.getText());

                rs = pst.executeQuery();

                if (rs.next()) {
                    txtidhabitacion.setText(String.valueOf(rs.getInt("idhabitacion")));
                    txtnumero.setText(rs.getString("numero"));
                    txttipohabitacion.setText(rs.getString("tipohabitacion"));
//                txtcostoalojamiento.setText(rs.getString("precio"));

                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro el NUMERO solicitado");
                }
                conectar.close();

            } catch (HeadlessException | SQLException ex) {
                System.err.println("Error" + ex);
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroKeyPressed

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
            java.util.logging.Logger.getLogger(Jlimpieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jlimpieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jlimpieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jlimpieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Jlimpieza().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    public static javax.swing.JButton btnbuscarempleado;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton butnuevo;
    private javax.swing.JComboBox<String> cboestado;
    private javax.swing.JComboBox<String> cboturno;
    private com.toedter.calendar.JDateChooser dcfecha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    private final javax.swing.JPanel jPanel5 = new javax.swing.JPanel();
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tablalistadolimpieza;
    private javax.swing.JTextField txtbuscar;
    public static javax.swing.JTextField txtempleado;
    public static javax.swing.JTextField txtidempleado;
    public static javax.swing.JTextField txtidhabitacion;
    public static javax.swing.JTextField txtidlimpieza;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txttipohabitacion;
    // End of variables declaration//GEN-END:variables

}
