package Presentacion;

import Datos.Dabono;
import Logica.Cconexion;
import Logica.Fabonos;
import Logica.Fsalida;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Jabono extends javax.swing.JFrame {

    private static Jabono instance;

    public Jabono() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mostrar("");
        inhabilitar();
        mostrarnumeroturno();
        txtabonohabitacion.setText("0");
        txtdescuentos.setText("0");
        txtotroscobros.setText("0");
        txttotalabono.setText("0");
    }
    private String accion = "guardar";

    public static Jabono getInstance() {
        if (instance == null) {
            instance = new Jabono();
        }
        return instance;
    }

    public void mostrarnumeroturno() {
        Fsalida func = new Fsalida();
        String numeroturno = func.numeroturno();
        txtnumero_turno.setText(numeroturno);
    }

    public void limpiarTabla(JTable tablalistadosabonos) {
        DefaultTableModel model = (DefaultTableModel) tablalistadosabonos.getModel();
        model.setRowCount(0);
    }

    
    void ocultar_columnas() {
        tablalistadosabonos.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(0).setPreferredWidth(0);

        tablalistadosabonos.getColumnModel().getColumn(1).setMaxWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(1).setMinWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(1).setPreferredWidth(0);

        tablalistadosabonos.getColumnModel().getColumn(2).setMaxWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(2).setMinWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(2).setPreferredWidth(0);

        tablalistadosabonos.getColumnModel().getColumn(4).setMaxWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(4).setMinWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(4).setPreferredWidth(0);
    }

    public void limpiarcajas() {

        dcfechaabono.setDate(null);
        txtabonohabitacion.setText(null);
        txtdescuentos.setText(null);
        txtconcepto.setText(null);
        cboformaabono.setSelectedItem(0);
        txttotalabono.setText(null);
        cboprivilegiosadmon.setSelectedItem(0);
        cboprivilegiosrecep.setSelectedItem(0);
        txtotroscobros.setText(null);
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

            tablalistadosabonos.setModel(modelo);
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
        txtnumero = new javax.swing.JTextField();
        txtabonohabitacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtotroscobros = new javax.swing.JTextField();
        cajanumero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnImprimirComprobante4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtnumero_turno = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablalistadosabonos = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        lbltotalregistros = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();

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

        cboprivilegiosadmon.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cboprivilegiosadmon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboprivilegiosrecep.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cboprivilegiosrecep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txttotalabono.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        btnnuevo.setBackground(new java.awt.Color(204, 204, 204));
        btnnuevo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\reservascombugas\\Images\\nuevo.GIF")); // NOI18N
        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnguardar.setBackground(new java.awt.Color(204, 204, 204));
        btnguardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\reservascombugas\\Images\\guardar.png")); // NOI18N
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

        txtotroscobros.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtotroscobros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtotroscobrosActionPerformed(evt);
            }
        });

        cajanumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajanumeroKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel12.setText("Buscar Hbit");

        btnImprimirComprobante4.setBackground(new java.awt.Color(204, 204, 204));
        btnImprimirComprobante4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnImprimirComprobante4.setText("Imprimir");
        btnImprimirComprobante4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirComprobante4ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel13.setText("Numero Turno:");

        txtnumero_turno.setEditable(false);
        txtnumero_turno.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtnumero_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumero_turnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtdescuentos, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(txtotroscobros)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttotalabono, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtabonohabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(txtclientenu))))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboprivilegiosrecep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboformaabono, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboprivilegiosadmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dcfechaabono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cajanumero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnumero_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtconcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnnuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnImprimirComprobante4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtidabono, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajanumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtnumero_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtclientenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1)
                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtabonohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtdescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtotroscobros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txttotalabono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtconcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImprimirComprobante4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtidabono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtidingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(dcfechaabono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTA ABONOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N

        tablalistadosabonos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablalistadosabonos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadosabonosMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tablalistadosabonos);

        btneliminar.setBackground(new java.awt.Color(204, 204, 204));
        btneliminar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\reservascombugas\\Images\\eliminar.png")); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        lbltotalregistros.setText("Registros");

        btnlimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnlimpiar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnbuscar.setBackground(new java.awt.Color(204, 204, 204));
        btnbuscar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtbuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btneliminar)
                .addGap(18, 18, 18)
                .addComponent(btnlimpiar)
                .addGap(90, 90, 90))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimpiar)
                    .addComponent(btnbuscar)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltotalregistros))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdescuentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescuentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescuentosActionPerformed

    private void tablalistadosabonosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadosabonosMouseClicked

        btnguardar.setText("Editar");
        btneliminar.setEnabled(true);
        accion = "editar";

        int fila = tablalistadosabonos.rowAtPoint(evt.getPoint());
        txtidabono.setText(tablalistadosabonos.getValueAt(fila, 0).toString());
        txtidingreso.setText(tablalistadosabonos.getValueAt(fila, 1).toString());
        txtidhabitacion.setText(tablalistadosabonos.getValueAt(fila, 2).toString());
        txtnumero.setText(tablalistadosabonos.getValueAt(fila, 3).toString());
        txtidcliente.setText(tablalistadosabonos.getValueAt(fila, 4).toString());
        txtcliente.setText(tablalistadosabonos.getValueAt(fila, 5).toString());
        txtclientenu.setText(tablalistadosabonos.getValueAt(fila, 6).toString());
        dcfechaabono.setDate(Date.valueOf(tablalistadosabonos.getValueAt(fila, 7).toString()));
        txtabonohabitacion.setText(tablalistadosabonos.getValueAt(fila, 8).toString());
        txtdescuentos.setText(tablalistadosabonos.getValueAt(fila, 9).toString());
        txtconcepto.setText(tablalistadosabonos.getValueAt(fila, 10).toString());
        cboformaabono.setSelectedItem(tablalistadosabonos.getValueAt(fila, 11).toString());
        txttotalabono.setText(tablalistadosabonos.getValueAt(fila, 12).toString());
        cboprivilegiosadmon.setSelectedItem(tablalistadosabonos.getValueAt(fila, 13).toString());
        cboprivilegiosrecep.setSelectedItem(tablalistadosabonos.getValueAt(fila, 14).toString());
        txtotroscobros.setText(tablalistadosabonos.getValueAt(fila, 15).toString());

    }//GEN-LAST:event_tablalistadosabonosMouseClicked

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

        if (!txtidabono.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de Eliminar el abono seleccionado?", "Confirmar", 2);

            if (confirmacion == 0) {
                Fabonos func = new Fabonos();
                Dabono dts = new Dabono();

                dts.setIdabono(Integer.parseInt(txtidabono.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();

            }

        }
    }//GEN-LAST:event_btneliminarActionPerformed

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

        // Asumiendo que 'dts' es tu objeto de datos
        dts.setConceptodescuento(txtconcepto.getText());
        dts.setFormaAbono((String) cboformaabono.getSelectedItem());

        int abonohabitacion = Integer.parseInt(txtabonohabitacion.getText());
        dts.setAbonohabitacion(abonohabitacion);
        txtabonohabitacion.setText(String.valueOf(abonohabitacion));

        dts.setPrivilegiosAdmon(String.valueOf(seleccionadoAdmon));
        dts.setPrivilegiosrecepcion(String.valueOf(seleccionadoRecep));

        int descuentos = Integer.parseInt(txtdescuentos.getText());
        dts.setDescuentos(String.valueOf(descuentos));
        txtdescuentos.setText(String.valueOf(descuentos));

        int totalAbonos = Integer.parseInt(txttotalabono.getText());
        dts.setTotalAbonos(totalAbonos);
        txttotalabono.setText(String.valueOf(totalAbonos));

        int otrosCobros = Integer.parseInt(txtotroscobros.getText());
        dts.setOtroscobros(otrosCobros);
        txtotroscobros.setText(String.valueOf(otrosCobros));
        
        dts.setNumero_turno(Integer.parseInt(txtnumero_turno.getText()));
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

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclienteActionPerformed

    private void txtotroscobrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtotroscobrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtotroscobrosActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        limpiarcajas();        // TODO add your handling code here:
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void cajanumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajanumeroKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Cconexion conexion = new Cconexion();

            try {
                Connection conectar = conexion.establecerConexion();

                // Preparar la consulta SQL con un JOIN y subconsultas para obtener información del cliente
                String consultaSQL
                        = "SELECT i.idingreso, i.idhabitacion, h.numero, i.idcliente, "
                        + "(SELECT nombres FROM cliente WHERE idcliente = i.idcliente) AS clienten, "
                        + "(SELECT apellidos FROM cliente WHERE idcliente = i.idcliente) AS clienteap, "
                        + "(SELECT numdocumento FROM cliente WHERE idcliente = i.idcliente)AS clientenu FROM ingreso i INNER JOIN habitacion h ON i.idhabitacion = h.idhabitacion "
                        + "WHERE h.numero = ? AND i.estado = 'Activo'";

                PreparedStatement pst = conectar.prepareStatement(consultaSQL);
                pst.setString(1, cajanumero.getText());

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

        }
    }//GEN-LAST:event_cajanumeroKeyPressed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
        limpiarTabla(tablalistadosabonos);
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtnumero_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumero_turnoActionPerformed
        // Generar el número de turno
    }//GEN-LAST:event_txtnumero_turnoActionPerformed

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
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JTextField cajanumero;
    private javax.swing.JComboBox<String> cboformaabono;
    private javax.swing.JComboBox<String> cboprivilegiosadmon;
    private javax.swing.JComboBox<String> cboprivilegiosrecep;
    private com.toedter.calendar.JDateChooser dcfechaabono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTable tablalistadosabonos;
    public static javax.swing.JTextField txtabonohabitacion;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcliente;
    public static javax.swing.JTextField txtclientenu;
    private javax.swing.JTextField txtconcepto;
    private javax.swing.JTextField txtdescuentos;
    private javax.swing.JTextField txtidabono;
    private javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtidhabitacion;
    private javax.swing.JTextField txtidingreso;
    public static javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtnumero_turno;
    private javax.swing.JTextField txtotroscobros;
    private javax.swing.JTextField txttotalabono;
    // End of variables declaration//GEN-END:variables
}
