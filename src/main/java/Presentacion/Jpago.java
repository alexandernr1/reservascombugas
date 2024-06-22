package Presentacion;

import Datos.Dpago;
import Datos.Tiempopro;
import Logica.Fpago;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Jpago extends javax.swing.JFrame {

    Tiempopro time = new Tiempopro();

    @SuppressWarnings("static-access")
    public Jpago() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("PAGOS");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mostrar("");
        inhabilitar();
        mostrarTiempo();
        generarnumero();
//        txtnumcomprobante.setText("0");

        Jsalidahuesped pago = new Jsalidahuesped();

        txtcliente.setText(pago.cliente);
        txthabitacion.setText(pago.habitacion);
        txtdescuentos.setText(pago.totaldescuentos);
        txtcobrosfraccion.setText(pago.cobros_extra);
        txtvaloracobrar.setText(pago.pagototal);
        txtempleado.setText(pago.empleado);
        txtnumero_turno.setText(pago.numero_turno);
        txtdeudaanterior.setText(pago.deuda_anterior);

    }
    private String accion = "guardar";

    private void mostrarTiempo() {

        txtfechaemision.setText(time.getFechacomp());
    }

    public void generarnumero() {
        Fpago func = new Fpago();
        int numeroTurno = func.generarComprobante();
        String numero = Integer.toString(numeroTurno);
        txtnumcomprobante.setText(numero);
    }

    void ocultar_columnas() {
        tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);

        tablalistado.getColumnModel().getColumn(1).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(1).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(1).setPreferredWidth(0);
    }

    void inhabilitar() {
        txtidpago.setVisible(false);

    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            Fpago func = new Fpago();
            modelo = func.mostrar(buscar);

            tablalistado.setModel(modelo);
            ocultar_columnas();
            lbltotalregistros.setText("Total Pagos " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txthabitacion = new javax.swing.JTextField();
        txtnumcomprobante = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbotipocomprobante = new javax.swing.JComboBox<>();
        txtcliente = new javax.swing.JTextField();
        txtfechaemision = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtvaloracobrar = new javax.swing.JTextField();
        txtempleado = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtnumero_turno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboestado = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtdescuentos = new javax.swing.JTextField();
        txtcobrosfraccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtefectivo = new javax.swing.JTextField();
        txttarjeta = new javax.swing.JTextField();
        txttransferencia = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtnetoapagar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        txtdeudaanterior = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        lbltotalregistros = new javax.swing.JLabel();
        btnImprimirComprobante = new javax.swing.JButton();
        txtidpago = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DE PAGOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Habitación:");

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("Tipo Comprobante:");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("N° Comprobante: ");

        txthabitacion.setEditable(false);
        txthabitacion.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txthabitacion.setText("\n");
        txthabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthabitacionActionPerformed(evt);
            }
        });

        txtnumcomprobante.setEditable(false);
        txtnumcomprobante.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtnumcomprobante.setText(" ");
        txtnumcomprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumcomprobanteActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel19.setText("Cliente:");

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setText("Fecha Emision:");

        cbotipocomprobante.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cbotipocomprobante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recibo", "Factura", "Otros" }));

        txtcliente.setEditable(false);
        txtcliente.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtcliente.setText("\n");
        txtcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclienteActionPerformed(evt);
            }
        });

        txtfechaemision.setEditable(false);
        txtfechaemision.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtfechaemision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaemisionActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel17.setText("Valor a Cobrar:");

        txtvaloracobrar.setEditable(false);
        txtvaloracobrar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        txtempleado.setEditable(false);
        txtempleado.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel20.setText("Responsable:");

        txtnumero_turno.setEditable(false);
        txtnumero_turno.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        txtnumero_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumero_turnoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setText("Numero turno:");

        jLabel9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel9.setText("Estado:");

        cboestado.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagado", "Pendiente" }));

        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txthabitacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtnumcomprobante, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cbotipocomprobante, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtcliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtfechaemision, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtvaloracobrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtempleado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtnumero_turno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cboestado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel5)
                    .addComponent(jLabel20))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtempleado))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtvaloracobrar))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(txtnumcomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 95, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfechaemision, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbotipocomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txthabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumero_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtnumero_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txthabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtfechaemision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbotipocomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnumcomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtvaloracobrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORMA DE PAGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel15.setText("Descuentos:");

        txtdescuentos.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        txtcobrosfraccion.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("Transferencia:");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Tarjeta:");

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("Efectivo:");

        jLabel18.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel18.setText("Neto a Pagar:");

        txtnetoapagar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtnetoapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnetoapagarActionPerformed(evt);
            }
        });
        txtnetoapagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnetoapagarKeyPressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel13.setText(" Cobros  fraccion:");

        Btnnuevo.setBackground(new java.awt.Color(204, 204, 204));
        Btnnuevo.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Btnnuevo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\reservascombugas\\reservascombugas\\src\\main\\java\\File\\nuevo.GIF")); // NOI18N
        Btnnuevo.setText("NUEVO");
        Btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnnuevoActionPerformed(evt);
            }
        });

        btnguardar.setBackground(new java.awt.Color(204, 204, 204));
        btnguardar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\reservascombugas\\reservascombugas\\src\\main\\java\\File\\guardar.png")); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        txtdeudaanterior.setEditable(false);
        txtdeudaanterior.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel21.setText("Deuda Anterior:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel21)
                                .addComponent(jLabel1)
                                .addComponent(jLabel13))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel18)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtefectivo)
                    .addComponent(txttarjeta)
                    .addComponent(txttransferencia)
                    .addComponent(txtdescuentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(txtnetoapagar)
                    .addComponent(txtdeudaanterior)
                    .addComponent(txtcobrosfraccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btnnuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnguardar)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtefectivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttarjeta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txttransferencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtdescuentos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcobrosfraccion)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdeudaanterior)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnetoapagar)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(244, 244, 244));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTADO DE PAGOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N

        tablalistado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablalistado);

        btneliminar.setBackground(new java.awt.Color(204, 204, 204));
        btneliminar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        lbltotalregistros.setText("Registros");

        btnImprimirComprobante.setBackground(new java.awt.Color(204, 204, 204));
        btnImprimirComprobante.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnImprimirComprobante.setText("Imprimir");
        btnImprimirComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirComprobanteActionPerformed(evt);
            }
        });

        txtidpago.setText("IDP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnImprimirComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtidpago, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnImprimirComprobante, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtidpago, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltotalregistros))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txthabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthabitacionActionPerformed

    private void txtnumcomprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumcomprobanteActionPerformed


    }//GEN-LAST:event_txtnumcomprobanteActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked

//        btnguardar.setText("Editar");
//        // habilitar();
//        btneliminar.setEnabled(true);
//        accion = "editar";
//
//        int fila = tablalistado.rowAtPoint(evt.getPoint());
//
//        txtidpago.setText(tablalistado.getValueAt(fila, 0).toString());
//        txtcliente.setText(tablalistado.getValueAt(fila, 2).toString());
//        txthabitacion.setText(tablalistado.getValueAt(fila, 3).toString());
//        txtfechaemision.setText(tablalistado.getValueAt(fila, 4).toString());
//        cbotipocomprobante.setSelectedItem(tablalistado.getValueAt(fila, 5).toString());
//        txtnumcomprobante.setText(tablalistado.getValueAt(fila, 6).toString());
//        txtefectivo.setText(tablalistado.getValueAt(fila, 7).toString());
//        txttarjeta.setText(tablalistado.getValueAt(fila, 8).toString());
//        txttransferencia.setText(tablalistado.getValueAt(fila, 9).toString());
//        txtdescuentos.setText(tablalistado.getValueAt(fila, 10).toString());
//        txtcobrosfraccion.setText(tablalistado.getValueAt(fila, 11).toString());
//        txtvaloracobrar.setText(tablalistado.getValueAt(fila, 12).toString());
//        txtnetoapagar.setText(tablalistado.getValueAt(fila, 13).toString());
//        txtempleado.setText(tablalistado.getValueAt(fila, 14).toString());
//        txtnumero_turno.setText(tablalistado.getValueAt(fila, 15).toString());
//        txtdeudaanterior.setText(tablalistado.getValueAt(fila, 16).toString());
//        cboestado.setSelectedItem(tablalistado.getValueAt(fila, 17).toString());

    }//GEN-LAST:event_tablalistadoMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        if (!txtidpago.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de Eliminar el Pago seleccionado?", "Confirmar", 2);

            if (confirmacion == 0) {
                Fpago func = new Fpago();
                Dpago dts = new Dpago();

                dts.setIdpago(Integer.parseInt(txtidpago.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();

            }

        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnImprimirComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirComprobanteActionPerformed
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
    }//GEN-LAST:event_btnImprimirComprobanteActionPerformed

    private void txtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclienteActionPerformed

    private void txtfechaemisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaemisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaemisionActionPerformed

    private void BtnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnnuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        if (txtvaloracobrar.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el total de pago del comprobante");
            txtvaloracobrar.requestFocus();
            return;
        }

        if (txtnumcomprobante.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Número de Comprobante del Pago");
            txtnumcomprobante.requestFocus();
            return;
        }

        Dpago dts = new Dpago();
        Fpago func = new Fpago();

        dts.setCliente(txtcliente.getText());
        dts.setNumero(Integer.parseInt(txthabitacion.getText()));
        dts.setFechaemision(txtfechaemision.getText());
        int seleccionado = cbotipocomprobante.getSelectedIndex();
        dts.setTipocomprobante((String) cbotipocomprobante.getItemAt(seleccionado));
        dts.setNumcomprobante(txtnumcomprobante.getText());
        dts.setEfectivo(Integer.parseInt(txtefectivo.getText()));
        dts.setTarjeta(Integer.parseInt(txttarjeta.getText()));
        dts.setTransferencia(Integer.parseInt(txttransferencia.getText()));
        dts.setDescuentos(Integer.parseInt(txtdescuentos.getText()));
        dts.setCobrosfraccion(Integer.parseInt(txtcobrosfraccion.getText()));
        dts.setValorcobrar(Integer.parseInt(txtvaloracobrar.getText()));
        dts.setNetoapagar(Integer.parseInt(txtnetoapagar.getText()));
        dts.setEmpleado(txtempleado.getText());
        dts.setNumero_turno(Integer.parseInt(txtnumero_turno.getText()));
        dts.setDeuda_anterior(Integer.parseInt(txtdeudaanterior.getText()));
        int estado = cboestado.getSelectedIndex();
        dts.setEstado((String) cboestado.getItemAt(estado));

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, " El pago por $. " + txtnetoapagar.getText()
                        + " del Sr. " + txtcliente.getText() + " Ha sido realizado con Éxito");
                mostrar("");
                inhabilitar();

                //Cancelar o pagar
//                Fpago func3 = new Fpago();
//                Dpago dts3 = new Dpago();
//
//                dts3.setIdpago(Integer.parseInt(txtidpago.getText()));
//                func3.pagar(dts3);
            }

//        } else if (accion.equals("editar")) {
//            dts.setIdpago(Integer.parseInt(txtidpago.getText()));
//
//            if (func.editar(dts)) {
//                JOptionPane.showMessageDialog(rootPane, "El pago del Sr. "
//                        + txtcliente.getText() + " Ha sido Modificado Correctamente");
//                mostrar("");
//                inhabilitar();
//            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtnetoapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnetoapagarActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtnetoapagarActionPerformed

    private void txtnetoapagarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnetoapagarKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                // Obtener los valores de los campos de texto y convertirlos a enteros
                int efectivo = Integer.parseInt(txtefectivo.getText());
                int tarjeta = Integer.parseInt(txttarjeta.getText());
                int transferencia = Integer.parseInt(txttransferencia.getText());
                int deudaanterior = Integer.parseInt(txtdeudaanterior.getText());

                // Sumar los valores
                int totalPago = efectivo + tarjeta + transferencia + deudaanterior;

                // Asignar el resultado al campo de texto txtTotalPago
                txtnetoapagar.setText(String.valueOf(totalPago));

                // Imprimir para verificar el valor que se asignó
//                System.out.println("Valor asignado a txtTotalPago: " + txtnetoapagar.getText());
            } catch (NumberFormatException e) {
                // Manejar la excepción si alguno de los campos de texto no contiene un número válido
                System.err.println("Error: uno o más campos no contienen un número válido");
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_txtnetoapagarKeyPressed

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
            java.util.logging.Logger.getLogger(Jpago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jpago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jpago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jpago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jpago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnnuevo;
    private javax.swing.JButton btnImprimirComprobante;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboestado;
    private javax.swing.JComboBox<String> cbotipocomprobante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtcobrosfraccion;
    private javax.swing.JTextField txtdescuentos;
    private javax.swing.JTextField txtdeudaanterior;
    private javax.swing.JTextField txtefectivo;
    private javax.swing.JTextField txtempleado;
    private javax.swing.JTextField txtfechaemision;
    private javax.swing.JTextField txthabitacion;
    private javax.swing.JTextField txtidpago;
    private javax.swing.JTextField txtnetoapagar;
    private javax.swing.JTextField txtnumcomprobante;
    private javax.swing.JTextField txtnumero_turno;
    private javax.swing.JTextField txttarjeta;
    private javax.swing.JTextField txttransferencia;
    private javax.swing.JTextField txtvaloracobrar;
    // End of variables declaration//GEN-END:variables
}
