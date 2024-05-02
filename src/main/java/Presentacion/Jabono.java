package Presentacion;

import Datos.Dabono;
import Logica.Cconexion;
import Logica.Fabonos;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Jabono extends javax.swing.JFrame {

    public Jabono() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mostrar("");
        inhabilitar();
    }
    private String accion = "guardar";

    void ocultar_columnas() {
        tablalistados.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistados.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistados.getColumnModel().getColumn(0).setPreferredWidth(0);

        tablalistados.getColumnModel().getColumn(1).setMaxWidth(0);
        tablalistados.getColumnModel().getColumn(1).setMinWidth(0);
        tablalistados.getColumnModel().getColumn(1).setPreferredWidth(0);
        
         tablalistados.getColumnModel().getColumn(2).setMaxWidth(0);
        tablalistados.getColumnModel().getColumn(2).setMinWidth(0);
        tablalistados.getColumnModel().getColumn(2).setPreferredWidth(0);
        
         tablalistados.getColumnModel().getColumn(4).setMaxWidth(0);
        tablalistados.getColumnModel().getColumn(4).setMinWidth(0);
        tablalistados.getColumnModel().getColumn(4).setPreferredWidth(0);
    }

    private void inhabilitar() {
        txtidabono.setVisible(false);
        txtidingreso.setVisible(false);
         txtidhabitacion.setVisible(false);
          txtidcliente.setVisible(false);

    }
    

    private void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            Fabonos func = new Fabonos();
            modelo = func.mostrar(buscar);

            tablalistados.setModel(modelo);
            ocultar_columnas();
            lbltotalregistros.setText("Total Pagos " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtidabono = new javax.swing.JTextField();
        cboformaabono = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtidingreso = new javax.swing.JTextField();
        txtdescuentos = new javax.swing.JTextField();
        txtconcepto = new javax.swing.JTextField();
        cboprivilegiosadmon = new javax.swing.JComboBox<>();
        cboprivilegiosrecep = new javax.swing.JComboBox<>();
        txttotalabono = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        dcfechaabono = new com.toedter.calendar.JDateChooser();
        txtidhabitacion = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();
        txtcliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtclientenu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnbuscarcliente = new javax.swing.JButton();
        comnumero = new javax.swing.JComboBox<>();
        txtnumero = new javax.swing.JTextField();
        txtabonohabitacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtotroscobros = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablalistados = new javax.swing.JTable();
        btnImprimirComprobante4 = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnsalir4 = new javax.swing.JButton();
        lbltotalregistros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ABONOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        txtidabono.setText("IDA");
        txtidabono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidabonoActionPerformed(evt);
            }
        });

        cboformaabono.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cboformaabono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta debito/credito", "Transferencia ", " ", " " }));

        jLabel17.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel17.setText("Forma de abono: ");

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Fecha Abono:");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Descuentos:");

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("Concepto del descuento");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("privilegios de admon");

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("privilegios recepcion");

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setText("total abonos");

        txtidingreso.setText("IDI");

        txtdescuentos.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtdescuentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescuentosActionPerformed(evt);
            }
        });

        txtconcepto.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        cboprivilegiosadmon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboprivilegiosrecep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txttotalabono.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        btnnuevo.setBackground(new java.awt.Color(153, 153, 153));
        btnnuevo.setText("NUEVO");

        btnguardar.setBackground(new java.awt.Color(153, 153, 153));
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        dcfechaabono.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        txtidhabitacion.setText("IDH");

        txtidcliente.setText("IDC");

        txtcliente.setEditable(false);
        txtcliente.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("Cliente:");

        txtclientenu.setEditable(false);
        txtclientenu.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setText("Idenficación:");

        btnbuscarcliente.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnbuscarcliente.setText("Buscar Habit");
        btnbuscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarclienteActionPerformed(evt);
            }
        });

        comnumero.setEditable(true);
        comnumero.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        comnumero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "21", "22", "23", "24", "25", "26", "27", "28", "29", "210", "211", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "310", "311", "312", " " }));
        comnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comnumeroActionPerformed(evt);
            }
        });

        txtnumero.setEditable(false);
        txtnumero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });

        txtabonohabitacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel9.setText("Abono Habitación");

        jLabel10.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel10.setText("N° Habitación");

        jLabel11.setText("Otros cobros:");

        txtotroscobros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtotroscobrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnbuscarcliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(9, 9, 9)
                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtidabono, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtconcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cboprivilegiosadmon, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboprivilegiosrecep, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txttotalabono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboformaabono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnnuevo)
                                .addGap(18, 18, 18)
                                .addComponent(btnguardar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtclientenu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtdescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtotroscobros, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtabonohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11))
                            .addComponent(dcfechaabono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidabono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnbuscarcliente)
                        .addComponent(comnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtclientenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcfechaabono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtabonohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtotroscobros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cboformaabono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboprivilegiosadmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboprivilegiosrecep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txttotalabono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtconcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        tablalistados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14", "Title 15"
            }
        ));
        tablalistados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadosMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tablalistados);

        btnImprimirComprobante4.setBackground(new java.awt.Color(51, 51, 51));
        btnImprimirComprobante4.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimirComprobante4.setText("Imprimir");
        btnImprimirComprobante4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirComprobante4ActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(51, 51, 51));
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnsalir4.setBackground(new java.awt.Color(51, 51, 51));
        btnsalir4.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir4.setText("Salir");
        btnsalir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir4ActionPerformed(evt);
            }
        });

        lbltotalregistros.setText("Registros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(btnImprimirComprobante4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                    .addComponent(btneliminar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnsalir4)
                    .addGap(9, 9, 9)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(lbltotalregistros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btneliminar)
                        .addComponent(btnsalir4)
                        .addComponent(btnImprimirComprobante4))
                    .addContainerGap(393, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdescuentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescuentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescuentosActionPerformed

    private void tablalistadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadosMouseClicked

        btnguardar.setText("Editar");
//         habilitar();
        btneliminar.setEnabled(true);
        accion = "editar";

        int fila = tablalistados.rowAtPoint(evt.getPoint());
        txtidabono.setText(tablalistados.getValueAt(fila, 0).toString());
        txtidingreso.setText(tablalistados.getValueAt(fila, 1).toString());
        txtidhabitacion.setText(tablalistados.getValueAt(fila, 2).toString());
        txtnumero.setText(tablalistados.getValueAt(fila, 3).toString());
        txtidcliente.setText(tablalistados.getValueAt(fila, 4).toString());
        txtcliente.setText(tablalistados.getValueAt(fila, 5).toString());
        txtclientenu.setText(tablalistados.getValueAt(fila, 6).toString());
        dcfechaabono.setDate(Date.valueOf(tablalistados.getValueAt(fila, 7).toString()));
        txtabonohabitacion.setText(tablalistados.getValueAt(fila, 8).toString());
        txtdescuentos.setText(tablalistados.getValueAt(fila, 9).toString());
        txtconcepto.setText(tablalistados.getValueAt(fila, 10).toString());
        cboformaabono.setSelectedItem(tablalistados.getValueAt(fila, 11).toString());
        txttotalabono.setText(tablalistados.getValueAt(fila, 12).toString());
        cboprivilegiosadmon.setSelectedItem(tablalistados.getValueAt(fila, 13).toString());
        cboprivilegiosrecep.setSelectedItem(tablalistados.getValueAt(fila, 14).toString());
        txtotroscobros.setText(tablalistados.getValueAt(fila, 15).toString());

    }//GEN-LAST:event_tablalistadosMouseClicked

    private void btnImprimirComprobante4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirComprobante4ActionPerformed
        /* if (!txtidpago.getText().equals("")) {
            Map p = new HashMap();
            p.put("idpago", txtidpago.getText());
            JasperReport report;
            JasperPrint print;

            try {
                report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/Reportes/rptComprobante.jrxml");
                print = JasperFillManager.fillReport(report, p, connection);
                JasperViewer view = new JasperViewer(print, false);
                view.setTitle("Comprobante");
                view.setVisible(true);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }  */
    }//GEN-LAST:event_btnImprimirComprobante4ActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

//        if (!txtidpago.getText().equals("")) {
//            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de Eliminar el Pago seleccionado?", "Confirmar", 2);
//
//            if (confirmacion == 0) {
//                Fpago func = new Fpago();
//                Dpago dts = new Dpago();
//
//                dts.setIdpago(Integer.parseInt(txtidpago.getText()));
//                func.eliminar(dts);
//                mostrar(idingreso);
//                inhabilitar();
//
//            }
//
//        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnsalir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnsalir4ActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        if (dcfechaabono.getDate() == null) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar la fecha a abonar");
            dcfechaabono.requestFocus();
            return;
        }

        Dabono dts = new Dabono();
        Fabonos func = new Fabonos();

       dts.setIdingreso(Integer.parseInt(txtidingreso.getText()));
       dts.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
       dts.setIdcliente(Integer.parseInt(txtidcliente.getText()));
        Calendar cal;
        int d, m, a;

        cal = dcfechaabono.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFechaabono(new Date(a, m, d));
        
        int seleccionadoAdmon = cboprivilegiosadmon.getSelectedIndex();
        int seleccionadoRecep = cboprivilegiosrecep.getSelectedIndex();
        dts.setConceptodescuento(txtconcepto.getText());
        dts.setFormaAbono((String) cboformaabono.getSelectedItem());
        dts.setAbonohabitacion(Double.valueOf(txtabonohabitacion.getText()));
        dts.setPrivilegiosAdmon(String.valueOf(seleccionadoAdmon));
        dts.setPrivilegiosrecepcion(String.valueOf(seleccionadoRecep));
        dts.setDescuentos(txtdescuentos.getText());
        dts.setTotalAbonos(Integer.parseInt(txttotalabono.getText()));
        dts.setOtroscobros(Integer.parseInt(txtotroscobros.getText()));

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "el abono fue registrado satisfactoriamente");
//                JOptionPane.showMessageDialog(rootPane, " El pago por $. " + txttotalpago.getText()
//                    + " del Sr. " + txtcliente.getText() + " Ha sido realizado con Éxito");
                mostrar("");
                inhabilitar();

 
            }

        } else if (accion.equals("editar")) {
            dts.setIdabono(Integer.parseInt(txtidabono.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El abono del Sr. "
                    + txtcliente.getText() + " Ha sido Modificado Correctamente");
                mostrar("");
                inhabilitar();
            }
        }

    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtidabonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidabonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidabonoActionPerformed

    private void btnbuscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarclienteActionPerformed
        Cconexion conexion = new Cconexion();

        try {
            Connection conectar = conexion.establecerConexion();

            // Preparar la consulta SQL con un JOIN y subconsultas para obtener información del cliente
            String consultaSQL
                    = "SELECT i.idingreso, i.idhabitacion, h.numero, i.idcliente, "
                    + "(SELECT nombres FROM cliente WHERE idcliente = i.idcliente) AS clienten, "
                    + "(SELECT apellidos FROM cliente WHERE idcliente = i.idcliente) AS clienteap, "
                    + "(SELECT numdocumento FROM cliente WHERE idcliente = i.idcliente)AS clientenu FROM ingreso i INNER JOIN habitacion h ON i.idhabitacion = h.idhabitacion "
                    + "WHERE h.numero = ?";

            PreparedStatement pst = conectar.prepareStatement(consultaSQL);
            pst.setString(1, comnumero.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtidingreso.setText(String.valueOf(rs.getInt("idingreso")));
                txtidhabitacion.setText(String.valueOf(rs.getInt("idhabitacion")));
                txtidcliente.setText(String.valueOf(rs.getInt("idcliente")));
                txtcliente.setText(rs.getString("clienten") + " " + rs.getString("clienteap"));
//                txtabonohabitacion.setText(String.valueOf(rs.getDouble("costoalojamiento")));
                txtnumero.setText(String.valueOf(rs.getInt("numero")));
                txtclientenu.setText(String.valueOf(rs.getString("clientenu")));
                

            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el CLIENTE solicitado");
            }

        } catch (HeadlessException | SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnbuscarclienteActionPerformed

    private void comnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comnumeroActionPerformed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclienteActionPerformed

    private void txtotroscobrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtotroscobrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtotroscobrosActionPerformed

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
            java.util.logging.Logger.getLogger(Jabono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jabono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jabono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jabono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jabono().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimirComprobante4;
    private javax.swing.JButton btnbuscarcliente;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir4;
    private javax.swing.JComboBox<String> cboformaabono;
    private javax.swing.JComboBox<String> cboprivilegiosadmon;
    private javax.swing.JComboBox<String> cboprivilegiosrecep;
    private javax.swing.JComboBox<String> comnumero;
    private com.toedter.calendar.JDateChooser dcfechaabono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tablalistados;
    public static javax.swing.JTextField txtabonohabitacion;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtclientenu;
    private javax.swing.JTextField txtconcepto;
    private javax.swing.JTextField txtdescuentos;
    private javax.swing.JTextField txtidabono;
    private javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtidhabitacion;
    private javax.swing.JTextField txtidingreso;
    public static javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtotroscobros;
    private javax.swing.JTextField txttotalabono;
    // End of variables declaration//GEN-END:variables
}
