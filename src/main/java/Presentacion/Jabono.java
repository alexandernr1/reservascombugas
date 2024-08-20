package Presentacion;

import Datos.Dabono;
import Datos.Dfactura_electronica;
import Datos.Tiempopro;
import Logica.Cconexion;
import Logica.Fabonos;
import Logica.Fsalida;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Jabono extends javax.swing.JFrame {

    private static Jabono instance;
    Tiempopro time = new Tiempopro();

    public Jabono() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mostrar("");
        inhabilitar();
        mostrarTiempo();
        mostrarnumeroturno();
        generarnumero();
        txtabonohabitacion.setText("0");
        txtdescuentos.setText("0");
        txtotroscobros.setText("0");
        txttotalapagar.setText("0");
    }
    private String accion = "guardar";

    public static Jabono getInstance() {
        if (instance == null) {
            instance = new Jabono();
        }
        return instance;
    }

    public void generarnumero() {
        Fabonos func = new Fabonos();
        int numerocomparobante = func.generarComprobante();
      
        txtnumcomprobante.setText(String.valueOf(numerocomparobante));
    }

    private void mostrarTiempo() {

        txtfecha_abono.setText(time.getFechacomp());
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
        
         tablalistadosabonos.getColumnModel().getColumn(10).setMaxWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(10).setMinWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(10).setPreferredWidth(0);
        
         tablalistadosabonos.getColumnModel().getColumn(12).setMaxWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(12).setMinWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(12).setPreferredWidth(0);
        
         tablalistadosabonos.getColumnModel().getColumn(13).setMaxWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(13).setMinWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(13).setPreferredWidth(0);
        
         tablalistadosabonos.getColumnModel().getColumn(15).setMaxWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(15).setMinWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(15).setPreferredWidth(0);
        
         tablalistadosabonos.getColumnModel().getColumn(19).setMaxWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(19).setMinWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(19).setPreferredWidth(0);
        
         tablalistadosabonos.getColumnModel().getColumn(20).setMaxWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(20).setMinWidth(0);
        tablalistadosabonos.getColumnModel().getColumn(20).setPreferredWidth(0);
    }

    public void limpiarcajas() {
        txtnumero.setText( "");
        txtcliente.setText("");
        txtclientenu.setText( "");
        cajanumero.setText("");
        txtfecha_abono.setText("");
        txtabonohabitacion.setText("");
        txtdescuentos.setText("");
        txtconcepto.setText("");
        txttotalapagar.setText("");
        cboprivilegiosadmon.setSelectedItem("Seleccionar");
        cboprivilegiosrecep.setSelectedItem("Seleccionar");
        txtotroscobros.setText("");
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
        txtcliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtclientenu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cajanumero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtnumero_turno = new javax.swing.JTextField();
        txtfecha_abono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtidcliente = new javax.swing.JTextField();
        txtidabono = new javax.swing.JTextField();
        txtidhabitacion = new javax.swing.JTextField();
        txtidingreso = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtdocumento = new javax.swing.JTextField();
        txtrazon_social = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtdescuentos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtotroscobros = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txttotalapagar = new javax.swing.JTextField();
        txtabonohabitacion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtefectivo = new javax.swing.JTextField();
        txttarjeta = new javax.swing.JTextField();
        txttransferencia = new javax.swing.JTextField();
        txtvalordescuento = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtvalorbruto = new javax.swing.JTextField();
        txtIVA_19 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtreten4 = new javax.swing.JTextField();
        txtreten_35 = new javax.swing.JTextField();
        calcular35 = new javax.swing.JButton();
        calcular4 = new javax.swing.JButton();
        txtsubtotal = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtcostoalojamiento = new javax.swing.JTextField();
        txtnumeronoches = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cboprivilegiosadmon = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboprivilegiosrecep = new javax.swing.JComboBox<>();
        txtconcepto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnumcomprobante = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        cbotipocomprobante = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btneliminar = new javax.swing.JButton();
        lbltotalregistros = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablalistadosabonos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL HUESPED", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        txtcliente.setEditable(false);
        txtcliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Cliente:");

        txtclientenu.setEditable(false);
        txtclientenu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Idenficación:");

        txtnumero.setEditable(false);
        txtnumero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("N° Habitación:");

        cajanumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajanumeroActionPerformed(evt);
            }
        });
        cajanumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajanumeroKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Buscar Hbit");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Numero Turno:");

        txtnumero_turno.setEditable(false);
        txtnumero_turno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtnumero_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumero_turnoActionPerformed(evt);
            }
        });

        txtfecha_abono.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Fecha:");

        txtidcliente.setText("IDC");

        txtidabono.setText("IDA");
        txtidabono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidabonoActionPerformed(evt);
            }
        });

        txtidhabitacion.setText("IDH");

        txtidingreso.setText("IDI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtclientenu, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtidabono, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtidingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajanumero, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumero_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtfecha_abono, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajanumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(txtnumero_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtfecha_abono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtclientenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidabono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DE FACTURA LEECTRONICA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("NIT/C.C:");

        txtdocumento.setEditable(false);
        txtdocumento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtdocumento.setText(" ");
        txtdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdocumentoActionPerformed(evt);
            }
        });

        txtrazon_social.setEditable(false);
        txtrazon_social.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtrazon_social.setText(" ");
        txtrazon_social.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrazon_socialActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("Cliente:");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Correo:");

        txtemail.setEditable(false);
        txtemail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtemail.setText(" ");
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtrazon_social, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtrazon_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ABONOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Abono Habitación:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Descuentos:");

        txtdescuentos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtdescuentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescuentosActionPerformed(evt);
            }
        });
        txtdescuentos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdescuentosKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Otros cobros:");

        txtotroscobros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtotroscobros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtotroscobrosActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("total apagar:");

        txttotalapagar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txttotalapagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttotalapagarKeyPressed(evt);
            }
        });

        txtabonohabitacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtabonohabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtabonohabitacionKeyPressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Efectivo:");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Tarjeta:");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("Ttransferencia:");

        txtefectivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txttarjeta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txttransferencia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txtvalordescuento.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("valor del descuento:");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("Total Bruto:");

        txtvalorbruto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtvalorbruto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtvalorbrutoKeyPressed(evt);
            }
        });

        txtIVA_19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtIVA_19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIVA_19ActionPerformed(evt);
            }
        });
        txtIVA_19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIVA_19KeyPressed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setText("IVA(19.00%):");

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setText("Descuento Reten (3.5%):");

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setText("Descuento Reten (4%):");

        txtreten4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtreten4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreten4ActionPerformed(evt);
            }
        });
        txtreten4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtreten4KeyPressed(evt);
            }
        });

        txtreten_35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtreten_35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreten_35ActionPerformed(evt);
            }
        });
        txtreten_35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtreten_35KeyPressed(evt);
            }
        });

        calcular35.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        calcular35.setText("Calcular");
        calcular35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular35ActionPerformed(evt);
            }
        });

        calcular4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        calcular4.setText("Calcular");
        calcular4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular4ActionPerformed(evt);
            }
        });

        txtsubtotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtsubtotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsubtotalKeyPressed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setText("Subtotal:");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("Costo Alojamiento:");

        txtcostoalojamiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txtnumeronoches.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtnumeronoches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeronochesActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setText("# Noches:");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtdescuentos, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addComponent(txtotroscobros)
                        .addComponent(txtvalorbruto)
                        .addComponent(txtabonohabitacion))
                    .addComponent(txtcostoalojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumeronoches, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtvalordescuento, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtIVA_19, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtreten_35, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(txtreten4)
                            .addComponent(txtsubtotal)
                            .addComponent(txtefectivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calcular35)
                            .addComponent(calcular4)))
                    .addComponent(txttarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotalapagar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIVA_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtreten_35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcular35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtreten4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcular4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtsubtotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtefectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txttarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtotroscobros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txttransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txttotalapagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtvalorbruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnumeronoches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtvalordescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtcostoalojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtabonohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(137, 137, 137))))
        );

        cboprivilegiosadmon.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboprivilegiosadmon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Negociar descuentos por volumen.", "Adicion de cama a habitacion." }));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("privilegios recepcion:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("privilegios de admon:");

        cboprivilegiosrecep.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboprivilegiosrecep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Ninguno" }));

        txtconcepto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Concepto del descuento");

        txtnumcomprobante.setEditable(false);
        txtnumcomprobante.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtnumcomprobante.setText(" ");
        txtnumcomprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumcomprobanteActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setText("N° Comprobante: ");

        cbotipocomprobante.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbotipocomprobante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Recibo", "Factura", "Otros" }));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setText("Tipo Comprobante:");

        btnnuevo.setBackground(new java.awt.Color(204, 204, 204));
        btnnuevo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.GIF"))); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnuevo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnnuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnguardar.setBackground(new java.awt.Color(204, 204, 204));
        btnguardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnguardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jPanel2.setForeground(new java.awt.Color(51, 153, 255));

        btneliminar.setBackground(new java.awt.Color(204, 204, 204));
        btneliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btneliminar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btneliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        lbltotalregistros.setText("Registros");

        btnbuscar.setBackground(new java.awt.Color(204, 204, 204));
        btnbuscar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnbuscar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnbuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnbuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btneliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btneliminar)
                        .addComponent(btnbuscar)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbltotalregistros, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboprivilegiosadmon, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtconcepto))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cboprivilegiosrecep, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbotipocomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(btnguardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnnuevo))
                            .addComponent(txtnumcomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cboprivilegiosadmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboprivilegiosrecep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtconcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbotipocomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtnumcomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnnuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnguardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        txtfecha_abono.setText(tablalistadosabonos.getValueAt(fila, 7).toString());
        txtabonohabitacion.setText(tablalistadosabonos.getValueAt(fila, 8).toString());
        txtdescuentos.setText(tablalistadosabonos.getValueAt(fila, 9).toString());
        txtconcepto.setText(tablalistadosabonos.getValueAt(fila, 10).toString());
        txttotalapagar.setText(tablalistadosabonos.getValueAt(fila, 12).toString());
        cboprivilegiosadmon.setSelectedItem(tablalistadosabonos.getValueAt(fila, 13).toString());
        cboprivilegiosrecep.setSelectedItem(tablalistadosabonos.getValueAt(fila, 14).toString());
        txtotroscobros.setText(tablalistadosabonos.getValueAt(fila, 15).toString());

    }//GEN-LAST:event_tablalistadosabonosMouseClicked

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

       Dabono dts = new Dabono();
    Fabonos func = new Fabonos();

    // Establecer datos básicos
    dts.setIdingreso(Integer.parseInt(txtidingreso.getText()));
    dts.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
    dts.setIdcliente(Integer.parseInt(txtidcliente.getText()));
    dts.setFechaabono(txtfecha_abono.getText());

    // Establecer datos adicionales
    dts.setConceptodescuento(txtconcepto.getText());

    int abonohabitacion = Integer.parseInt(txtabonohabitacion.getText());
    dts.setAbonohabitacion(abonohabitacion);
    txtabonohabitacion.setText(String.valueOf(abonohabitacion));

    int seleccionadoAdmon = cboprivilegiosadmon.getSelectedIndex();
    int seleccionadoRecep = cboprivilegiosrecep.getSelectedIndex();
    dts.setPrivilegiosAdmon(String.valueOf(seleccionadoAdmon));
    dts.setPrivilegiosrecepcion(String.valueOf(seleccionadoRecep));

    int descuentos = Integer.parseInt(txtdescuentos.getText());
    dts.setDescuentos(String.valueOf(descuentos));
    txtdescuentos.setText(String.valueOf(descuentos));

    int totalAbonos = Integer.parseInt(txttotalapagar.getText());
    dts.setTotalAbonos(totalAbonos);
    txttotalapagar.setText(String.valueOf(totalAbonos));

    int otrosCobros = Integer.parseInt(txtotroscobros.getText());
    dts.setOtroscobros(otrosCobros);
    txtotroscobros.setText(String.valueOf(otrosCobros));

    dts.setNumero_turno(Integer.parseInt(txtnumero_turno.getText()));

    // Establecer los nuevos campos
    dts.setHabitacion(Integer.parseInt(txtnumero.getText())); 
    dts.setCliente(txtcliente.getText()); 
    dts.setDocumento(txtdocumento.getText()); 
    dts.setRazon_social(txtrazon_social.getText()); 
    dts.setEmail(txtemail.getText()); // Asegúrate de que txtemail existe
    dts.setNumeronoches(Integer.parseInt(txtnumeronoches.getText())); 
    dts.setValordescuento(Integer.parseInt(txtvalordescuento.getText()));
    int tipocomprobante = cbotipocomprobante.getSelectedIndex();
    dts.setTipocomprobante(String.valueOf(tipocomprobante)); 
    dts.setNumerocomprobante(txtnumcomprobante.getText()); 
    dts.setIva19(Integer.parseInt(txtIVA_19.getText())); 
    dts.setRetencion35(Integer.parseInt(txtreten_35.getText())); 
    dts.setRetencion4(Integer.parseInt(txtreten4.getText())); 
    dts.setSubtotal(Integer.parseInt(txtsubtotal.getText()));
    dts.setEfectivo(Integer.parseInt(txtefectivo.getText())); 
    dts.setTarjeta(Integer.parseInt(txttarjeta.getText()));
    dts.setTransferencia(Integer.parseInt(txttransferencia.getText())); 
    dts.setTotalapagar(Integer.parseInt(txttotalapagar.getText())); 

    if (accion.equals("guardar")) {
        if (func.insertar(dts)) {
            JOptionPane.showMessageDialog(rootPane, "El abono fue registrado satisfactoriamente");
            mostrar("");
            inhabilitar();
            this.dispose();
        }
    } else if (accion.equals("editar")) {
        dts.setIdabono(Integer.parseInt(txtidabono.getText()));

        if (func.editar(dts)) {
            JOptionPane.showMessageDialog(rootPane, "El abono del Sr. " + txtcliente.getText() + " ha sido modificado correctamente");
            mostrar("");
            inhabilitar();
            this.dispose();
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

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        limpiarcajas();        // TODO add your handling code here:
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void cajanumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajanumeroKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Cconexion conexion = new Cconexion();

            try ( Connection conectar = conexion.establecerConexion()) {
                String consultaSQL = "SELECT i.idingreso, i.idhabitacion, h.numero, h.precio, i.idcliente, "
                        + "(SELECT nombres FROM cliente WHERE idcliente = i.idcliente) AS clienten, "
                        + "(SELECT apellidos FROM cliente WHERE idcliente = i.idcliente) AS clienteap, "
                        + "(SELECT numdocumento FROM cliente WHERE idcliente = i.idcliente) AS clientenu "
                        + "FROM ingreso i "
                        + "INNER JOIN habitacion h ON i.idhabitacion = h.idhabitacion "
                        + "WHERE h.numero = ? AND i.estado = 'Activo'";

                try ( PreparedStatement pst = conectar.prepareStatement(consultaSQL)) {
                    pst.setString(1, cajanumero.getText());

                    try ( ResultSet rs = pst.executeQuery()) {
                        if (rs.next()) {
                            // Mostrar datos en los JTextField correspondientes
                            txtidingreso.setText(String.valueOf(rs.getInt("idingreso")));
                            txtidhabitacion.setText(String.valueOf(rs.getInt("idhabitacion")));
                            txtidcliente.setText(String.valueOf(rs.getInt("idcliente")));
                            txtcliente.setText(rs.getString("clienten") + " " + rs.getString("clienteap"));
                            txtcostoalojamiento.setText(String.valueOf(rs.getInt("precio")));
                            txtnumero.setText(String.valueOf(rs.getInt("numero")));
                            txtclientenu.setText(String.valueOf(rs.getString("clientenu")));
//                            txtdeudaanterior.setText(String.valueOf(rs.getInt("deuda_anterior")));

                            int factura = Integer.parseInt(txtidcliente.getText());
                            Dfactura_electronica clienteF = new Fsalida().cleinteFacturar(factura);
                            if (clienteF != null) {
                                txtrazon_social.setText(clienteF.getRazon_social());
                                txtemail.setText(clienteF.getEmail());
                                txtdocumento.setText(String.valueOf(clienteF.getDocumento()));
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "No se encontró el CLIENTE solicitado.");
                        }
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al obtener los datos: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_cajanumeroKeyPressed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtnumero_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumero_turnoActionPerformed
        // Generar el número de turno
    }//GEN-LAST:event_txtnumero_turnoActionPerformed

    private void txtdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdocumentoActionPerformed

    private void txtrazon_socialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrazon_socialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrazon_socialActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void cajanumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajanumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajanumeroActionPerformed

    private void txtIVA_19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIVA_19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIVA_19ActionPerformed

    private void txtIVA_19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIVA_19KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIVA_19KeyPressed

    private void txtreten4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreten4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreten4ActionPerformed

    private void txtreten4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtreten4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreten4KeyPressed

    private void txtreten_35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreten_35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreten_35ActionPerformed

    private void txtreten_35KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtreten_35KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreten_35KeyPressed

    private void calcular35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcular35ActionPerformed
        // TODO add your handling code here:
        int valorcobrar = Integer.parseInt(txtvalorbruto.getText());
        int valorConIVA = Integer.parseInt(txtIVA_19.getText());
        int Suma = (int) (valorcobrar + valorConIVA);
        int Reten35 = (int) (Suma * 0.035);
        txtreten_35.setText(String.valueOf(Reten35));
    }//GEN-LAST:event_calcular35ActionPerformed

    private void calcular4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcular4ActionPerformed
        // TODO add your handling code here:
        int valorcobrar = Integer.parseInt(txtvalorbruto.getText());
        int valorConIVA = Integer.parseInt(txtIVA_19.getText());
        int Suma = (int) (valorcobrar + valorConIVA);
        int reten4 = (int) (Suma * 0.04);
        txtreten4.setText(String.valueOf(reten4));
    }//GEN-LAST:event_calcular4ActionPerformed

    private void txtsubtotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsubtotalKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                // Obtener los valores de los campos de texto y convertirlos a enteros
                int valoracobrar = Integer.parseInt(txtvalorbruto.getText());
                int Iva19 = Integer.parseInt(txtIVA_19.getText());
                int reten35 = Integer.parseInt(txtreten_35.getText());
                int reten4 = Integer.parseInt(txtreten4.getText());

                int subtotal = valoracobrar + Iva19 - reten35 - reten4;
                txtsubtotal.setText(String.valueOf(subtotal));

            } catch (NumberFormatException e) {
                // Manejar la excepción si alguno de los campos de texto no contiene un número válido
                System.err.println("Error: uno o más campos no contienen un número válido");
                e.printStackTrace();
            }

        }

    }//GEN-LAST:event_txtsubtotalKeyPressed

    private void txtnumeronochesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeronochesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeronochesActionPerformed

    private void txtotroscobrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtotroscobrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtotroscobrosActionPerformed

    private void txtdescuentosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescuentosKeyPressed
//         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            try {
//                
//                int valordescuento = Integer.parseInt(txtvalordescuento.getText());
//                int numeronoches = Integer.parseInt(txtnumeronoches.getText());
//
//                // Validación adicional para evitar cálculos negativos
//                if (valordescuento < 0 || numeronoches < 0) {
//                    JOptionPane.showMessageDialog(null, "El número de noches y el valor del descuento deben ser positivos.");
//                    return;
//                }
//
//                int calculo = valordescuento * numeronoches;
//                txtdescuentos.setText(String.valueOf(calculo));
//            } catch (NumberFormatException e) {
//                JOptionPane.showMessageDialog(null, "Por favor, ingresa números válidos.");
//            }
//        }
    }//GEN-LAST:event_txtdescuentosKeyPressed

    private void txtdescuentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescuentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescuentosActionPerformed

    private void txtnumcomprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumcomprobanteActionPerformed

    }//GEN-LAST:event_txtnumcomprobanteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int valorCobrar = Integer.parseInt(txtvalorbruto.getText());
        int valorConIVA = (int) (valorCobrar * 0.19);
        txtIVA_19.setText(String.valueOf(valorConIVA));

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtvalorbrutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalorbrutoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                int costoalojamiento = Integer.parseInt(txtcostoalojamiento.getText());
                int numeronoches = Integer.parseInt(txtnumeronoches.getText());
                int valordescuento = Integer.parseInt(txtvalordescuento.getText());

                // Validación adicional para evitar cálculos negativos
                if (costoalojamiento < 0 || numeronoches < 0) {
                    JOptionPane.showMessageDialog(null, "El número de noches y el valor del descuento deben ser positivos.");
                    return;
                }

                int calculo1 = costoalojamiento * numeronoches;
                int calculo = valordescuento * numeronoches;
                txtabonohabitacion.setText(String.valueOf(calculo1));
                txtdescuentos.setText(String.valueOf(calculo));

                int nuevoabono = Integer.parseInt(txtabonohabitacion.getText());
                int nuevodescuent = Integer.parseInt(txtdescuentos.getText());
                int otroscobros = Integer.parseInt(txtotroscobros.getText());

                int nuevocalculo = nuevoabono - nuevodescuent + otroscobros;
                txtvalorbruto.setText(String.valueOf(nuevocalculo));

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa números válidos.");
            }
        }
    }//GEN-LAST:event_txtvalorbrutoKeyPressed

    private void txtabonohabitacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtabonohabitacionKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtabonohabitacionKeyPressed

    private void txttotalapagarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttotalapagarKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                // Obtener los valores de los campos de texto y convertirlos a enteros
                int efectivo = Integer.parseInt(txtefectivo.getText());
                int tarjeta = Integer.parseInt(txttarjeta.getText());
                int transferencia = Integer.parseInt(txttransferencia.getText());

                int totalPago = efectivo + tarjeta + transferencia;
                txttotalapagar.setText(String.valueOf(totalPago));

            } catch (NumberFormatException e) {
                // Manejar la excepción si alguno de los campos de texto no contiene un número válido
                JOptionPane.showMessageDialog(null, "Error: uno o más campos no contienen un número válido");
            }

        }
    }//GEN-LAST:event_txttotalapagarKeyPressed

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
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JTextField cajanumero;
    private javax.swing.JButton calcular35;
    private javax.swing.JButton calcular4;
    private javax.swing.JComboBox<String> cboprivilegiosadmon;
    private javax.swing.JComboBox<String> cboprivilegiosrecep;
    private javax.swing.JComboBox<String> cbotipocomprobante;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tablalistadosabonos;
    private javax.swing.JTextField txtIVA_19;
    public static javax.swing.JTextField txtabonohabitacion;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcliente;
    public static javax.swing.JTextField txtclientenu;
    private javax.swing.JTextField txtconcepto;
    private javax.swing.JTextField txtcostoalojamiento;
    private javax.swing.JTextField txtdescuentos;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtefectivo;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfecha_abono;
    private javax.swing.JTextField txtidabono;
    private javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtidhabitacion;
    private javax.swing.JTextField txtidingreso;
    private javax.swing.JTextField txtnumcomprobante;
    public static javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtnumero_turno;
    private javax.swing.JTextField txtnumeronoches;
    private javax.swing.JTextField txtotroscobros;
    private javax.swing.JTextField txtrazon_social;
    private javax.swing.JTextField txtreten4;
    private javax.swing.JTextField txtreten_35;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttarjeta;
    private javax.swing.JTextField txttotalapagar;
    private javax.swing.JTextField txttransferencia;
    private javax.swing.JTextField txtvalorbruto;
    private javax.swing.JTextField txtvalordescuento;
    // End of variables declaration//GEN-END:variables
}
