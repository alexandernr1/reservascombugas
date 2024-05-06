package Presentacion;

import Datos.Dsalida;
import Datos.Tiempopro;
import Logica.Cconexion;
import Logica.Fsalida;
import Logica.GenerarCodigo;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Jsalidahuesped extends javax.swing.JFrame {

    Tiempopro time = new Tiempopro();

    public Jsalidahuesped() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("MENU HOTEL");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mostrarTiempo();
        inhabilitar();
        GeneradorComprobante generador = new GeneradorComprobante();

        // Generar el número de comprobante y establecerlo en el campo de texto
        String numeroComprobante = generador.generarNumeroComprobante();
        txtnum_comprobante.setText(numeroComprobante);
    }
    public static int idusuario;
    private String accion = "guardar";

    private void mostrarTiempo() {

        txtfecha_hora_salida.setText(time.getFechacomp() + " " + time.getHoracomp());
    }

    public class GeneradorComprobante {

        private static final AtomicInteger contador = new AtomicInteger(1);

        public String generarNumeroComprobante() {
            int numeroComprobante = contador.getAndIncrement();
            return String.format("COMP-%04d", numeroComprobante); // Formato COMP-0001, COMP-0002, etc.
        }

    }

    void inhabilitar() {
        txtidingreso.setVisible(false);
        txtidabono.setVisible(false);
        txtidsalida.setVisible(false);
        txtidempleado.setVisible(false);
        txtidhabitacion.setVisible(false);
        txtidcliente.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtidsalida = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        txtfecha_hora_salida = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtvalor_noches = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtdescuentos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cboformapago = new javax.swing.JComboBox<>();
        txtcobros_extra = new javax.swing.JTextField();
        txttotalpago = new javax.swing.JTextField();
        txtabonos = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        dcfechaemision = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        txtotros_cobros = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbotipocomprobante = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtnum_comprobante = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtvalor_total = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        telefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnumdocumento = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cbotipocliente = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtempleado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtfecha_hora_ingreso = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtcostoalojamiento = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        Cajabuscar = new javax.swing.JComboBox<>();
        txtidingreso = new javax.swing.JTextField();
        txtidabono = new javax.swing.JTextField();
        txtidempleado = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtnumnoches = new javax.swing.JTextField();
        btnrealizarpagos = new javax.swing.JButton();
        txtidhabitacion = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(204, 204, 204));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("SALIDA HUESPED"));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Habitación:");

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setText("Fecha de ingreso:");

        txtidsalida.setText("IDS");

        txtnumero.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });

        txtfecha_hora_salida.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtfecha_hora_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfecha_hora_salidaActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COBROS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setText("Valor noches:");

        txtvalor_noches.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtvalor_noches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalor_nochesActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel9.setText("Cobro extra:");

        txtdescuentos.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel10.setText("Descuentos:");
        jLabel10.setToolTipText("");

        jLabel16.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel16.setText("Otros cobros:");

        jLabel17.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel17.setText("Forma de pago:");

        cboformapago.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cboformapago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta debito/credito", "Transferencia ", " ", " " }));

        txtcobros_extra.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        txttotalpago.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        txtabonos.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel14.setText("Abonos:");
        jLabel14.setToolTipText("");

        jLabel20.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel20.setText("Fecha Emisión:");

        jLabel21.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel21.setText("Total Pago:");

        txtotros_cobros.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("Tipo Comprobante:");

        cbotipocomprobante.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cbotipocomprobante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recibo", "Factura", "Otros" }));
        cbotipocomprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipocomprobanteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("Numero Comprobante: ");

        txtnum_comprobante.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtnum_comprobante.setText(" ");
        txtnum_comprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum_comprobanteActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel13.setText("Valor total:");

        txtvalor_total.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtvalor_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalor_totalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(dcfechaemision, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtvalor_total, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtvalor_noches, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboformapago, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbotipocomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel21))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addComponent(jLabel16)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotalpago, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtotros_cobros, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcobros_extra, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtabonos))
                        .addGap(458, 458, 458))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtnum_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtnum_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtvalor_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtabonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txttotalpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcfechaemision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtvalor_noches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(cboformapago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbotipocomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addContainerGap(19, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtdescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtcobros_extra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtotros_cobros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("CLIENTE"));

        telefono.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel11.setText("Telefono:");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("       Cliente:");

        txtcliente.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("Identificación:");

        txtnumdocumento.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtnumdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumdocumentoActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel18.setText("Tipo de cliente");

        cbotipocliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnumdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbotipocliente, 0, 131, Short.MAX_VALUE)
                    .addComponent(telefono))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(cbotipocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtnumdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton1.setText("NUEVO");

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton2.setText("GUARDAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton6.setText("SALIDA");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel15.setText("Responsable");

        txtempleado.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtempleadoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel12.setText("Fecha de salida:");

        txtfecha_hora_ingreso.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtfecha_hora_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfecha_hora_ingresoActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel19.setText("Costo alojamiento:");

        txtcostoalojamiento.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        buscar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        buscar.setText("Buscar ");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        Cajabuscar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Cajabuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "21", "22", "23", "24", "25", "26", "27", "28", "29", "210", "211", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "310", "311", "312", " " }));
        Cajabuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajabuscarActionPerformed(evt);
            }
        });

        txtidingreso.setText("IDI");

        txtidabono.setText("IDA");

        txtidempleado.setText("IDE");

        jLabel22.setText("Numero Noches");

        txtnumnoches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumnochesActionPerformed(evt);
            }
        });

        btnrealizarpagos.setBackground(new java.awt.Color(153, 153, 153));
        btnrealizarpagos.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnrealizarpagos.setText("REALIZAR PAGOS");
        btnrealizarpagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrealizarpagosActionPerformed(evt);
            }
        });

        txtidhabitacion.setText("DIH");
        txtidhabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidhabitacionActionPerformed(evt);
            }
        });

        txtidcliente.setText("DIC");
        txtidcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidclienteActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtidsalida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtnumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtfecha_hora_salida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtempleado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtfecha_hora_ingreso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtcostoalojamiento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(buscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Cajabuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtidingreso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtidabono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtidempleado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtnumnoches, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnrealizarpagos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtidhabitacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtidcliente, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnrealizarpagos)
                        .addGap(27, 27, 27)
                        .addComponent(jButton6)
                        .addGap(307, 307, 307))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1))))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnumero, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(txtcostoalojamiento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12)))))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(Cajabuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(txtnumnoches, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidabono, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(txtfecha_hora_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidsalida, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(txtfecha_hora_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buscar)
                        .addComponent(Cajabuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)
                        .addComponent(txtnumnoches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidabono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtcostoalojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtfecha_hora_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtidingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidsalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtfecha_hora_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnrealizarpagos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtfecha_hora_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfecha_hora_salidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfecha_hora_salidaActionPerformed

    private void txtnumdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumdocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumdocumentoActionPerformed

    private void txtfecha_hora_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfecha_hora_ingresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfecha_hora_ingresoActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        try {
            ResultSet rs = new Fsalida().realizarConsulta(Cajabuscar.getSelectedItem().toString());
            if (rs.next()) {
                txtidingreso.setText(String.valueOf(rs.getInt("idingreso")));
                txtidcliente.setText(String.valueOf(rs.getInt("idcliente")));
                txtidabono.setText(String.valueOf(rs.getInt("idabono")));
                
//                txtvalor_total.setText(String.valueOf(rs.getDouble("abonohabitacion")));
                int valorTotal = (int) Math.round(rs.getDouble("abonohabitacion"));
                txtvalor_total.setText(String.valueOf(valorTotal));

                txtidhabitacion.setText(String.valueOf(rs.getInt("idhabitacion")));
                txtcliente.setText(rs.getString("clienten") + " " + rs.getString("clienteap"));
                telefono.setText(rs.getString("clientete"));
                txtcostoalojamiento.setText(String.valueOf(rs.getDouble("costoalojamiento")));
                txtnumero.setText(String.valueOf(rs.getInt("numero")));
                txtnumdocumento.setText(String.valueOf(rs.getString("clientenu")));
                txtfecha_hora_ingreso.setText(String.valueOf(rs.getString("fecha_hora_ingreso")));

                String fechaHoraIngreso = rs.getString("fecha_hora_ingreso").trim();
                fechaHoraIngreso = fechaHoraIngreso.replace("p. m.", "pm").replace("a. m.", "am");

                LocalDateTime fechaIngreso = LocalDateTime.parse(fechaHoraIngreso, DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a", Locale.ENGLISH));

// Obtener la fecha y hora actual
                LocalDateTime fechaHoraActual = LocalDateTime.now();

// Formatear la fecha y hora actual en el formato correcto
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a", Locale.ENGLISH);
                String fechaHoraActualFormateada = fechaHoraActual.format(formatter);

// Establecer el texto en txtfecha_hora_salida
                txtfecha_hora_salida.setText(fechaHoraActualFormateada);

// Calcular la diferencia en días entre la fecha de ingreso y la fecha actual
                long numNoches = ChronoUnit.DAYS.between(fechaIngreso.toLocalDate(), fechaHoraActual.toLocalDate());

// Mostrar la diferencia en días en txtnumnoches
                txtnumnoches.setText(String.valueOf(numNoches));

                int numeroNoches = Integer.parseInt(txtnumnoches.getText());
// Obtener el número de noches desde algún componente de tu interfaz
                double costoAlojamiento = Double.parseDouble(txtcostoalojamiento.getText());
// Obtener el costo del alojamiento desde algún componente de tu interfaz

                double nuevoCostoAlojamiento = costoAlojamiento * numeroNoches;
// Actualizar el valor del costo del alojamiento en algún componente de tu interfaz
                int nuevoCostoEntero = (int) nuevoCostoAlojamiento;
                txtvalor_noches.setText(String.valueOf(nuevoCostoEntero));

                txtabonos.setText(rs.getString("totalabonos"));
                txtdescuentos.setText(rs.getString("descuentos"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el CLIENTE solicitado");
            }
        } catch (HeadlessException | SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        }

    }//GEN-LAST:event_buscarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:}
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void CajabuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajabuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajabuscarActionPerformed

    private void txtempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtempleadoActionPerformed

    private void txtnum_comprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum_comprobanteActionPerformed


    }//GEN-LAST:event_txtnum_comprobanteActionPerformed

    private void cbotipocomprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipocomprobanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbotipocomprobanteActionPerformed

    private void txtnumnochesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumnochesActionPerformed
//        mostradias();

    }//GEN-LAST:event_txtnumnochesActionPerformed

    private void txtvalor_nochesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalor_nochesActionPerformed


    }//GEN-LAST:event_txtvalor_nochesActionPerformed

    private void btnrealizarpagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrealizarpagosActionPerformed

//        int fila = tablalistado.getSelectedRow();
//
//        Jpago.idingreso = tablalistado.getValueAt(fila, 0).toString();
//        Jpago.cliente = tablalistado.getValueAt(fila, 4).toString();
//        Jpago.totalingreso = tablalistado.getValueAt(fila, 9).toString();
//
//        Jpago.idhabitacion = tablalistado.getValueAt(fila, 1).toString();
//        Jpago.habitacion = tablalistado.getValueAt(fila, 2).toString();
//
//        Jpago form = new Jpago();
//
//        form.toFront();
//        form.setVisible(true);
    }//GEN-LAST:event_btnrealizarpagosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (dcfechaemision.getDate() == null) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar la fecha de EMISION");
            dcfechaemision.requestFocus();
            return;
        }

        Dsalida dts = new Dsalida();
        Fsalida func = new Fsalida();
        dts.setIdingreso(Integer.parseInt(txtidingreso.getText()));
        dts.setIdcliente(Integer.parseInt(txtidcliente.getText()));
        dts.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
        dts.setIdabono(Integer.parseInt(txtidabono.getText()));
        dts.setIdempleado(idusuario);
        dts.setNumero(Integer.parseInt(txtnumero.getText()));
        dts.setCliente(String.valueOf(txtcliente.getText()));
        dts.setNumnoches(Integer.parseInt(txtnumnoches.getText()));
        dts.setCostoalojamiento(Double.valueOf(txtcostoalojamiento.getText()));
        dts.setFechaingreso(String.valueOf(txtfecha_hora_ingreso.getText()));
        dts.setFechasalida(String.valueOf(txtfecha_hora_salida.getText()));

        Calendar cal;
        int d, m, a;

        cal = dcfechaemision.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFechaemision(new Date(a, m, d));

        int seleccionadoTipocliente = cbotipocliente.getSelectedIndex();
        dts.setTipocliente(String.valueOf(seleccionadoTipocliente));
        int seleccionadoTipocomprobante = cbotipocomprobante.getSelectedIndex();
        dts.setTipocomprobante(String.valueOf(seleccionadoTipocomprobante));
        dts.setNum_comprobante(String.valueOf(txtnum_comprobante.getText()));
        int seleccionadoFormapago = cboformapago.getSelectedIndex();
        dts.setFormapago(String.valueOf(seleccionadoFormapago));

        dts.setValor_noches(Integer.parseInt(txtvalor_noches.getText()));
        dts.setAbonos(Integer.parseInt(txtabonos.getText()));
        dts.setValor_total(Integer.parseInt(txtvalor_total.getText()));
        dts.setDescuentos(Integer.parseInt(txtdescuentos.getText()));
        dts.setCobros_extra(Integer.parseInt(txtcobros_extra.getText()));
        dts.setOtros_cobros(Integer.parseInt(txtotros_cobros.getText()));
        dts.setTotalpago(Double.valueOf(txttotalpago.getText()));

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "el abono fue registrado satisfactoriamente");
//                JOptionPane.showMessageDialog(rootPane, " El pago por $. " + txttotalpago.getText()
//                    + " del Sr. " + txtcliente.getText() + " Ha sido realizado con Éxito");
//                mostrar("");
                inhabilitar();

            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtidhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidhabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidhabitacionActionPerformed

    private void txtidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidclienteActionPerformed

    private void txtvalor_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalor_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalor_totalActionPerformed

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
            java.util.logging.Logger.getLogger(Jsalidahuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jsalidahuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jsalidahuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jsalidahuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jsalidahuesped().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cajabuscar;
    private javax.swing.JButton btnrealizarpagos;
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<String> cboformapago;
    private javax.swing.JComboBox<String> cbotipocliente;
    private javax.swing.JComboBox<String> cbotipocomprobante;
    private com.toedter.calendar.JDateChooser dcfechaemision;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField txtabonos;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtcobros_extra;
    private javax.swing.JTextField txtcostoalojamiento;
    private javax.swing.JTextField txtdescuentos;
    public static javax.swing.JTextField txtempleado;
    private javax.swing.JTextField txtfecha_hora_ingreso;
    private javax.swing.JTextField txtfecha_hora_salida;
    private javax.swing.JTextField txtidabono;
    private javax.swing.JTextField txtidcliente;
    public static javax.swing.JTextField txtidempleado;
    private javax.swing.JTextField txtidhabitacion;
    private javax.swing.JTextField txtidingreso;
    private javax.swing.JTextField txtidsalida;
    private javax.swing.JTextField txtnum_comprobante;
    private javax.swing.JTextField txtnumdocumento;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtnumnoches;
    private javax.swing.JTextField txtotros_cobros;
    private javax.swing.JTextField txttotalpago;
    private javax.swing.JTextField txtvalor_noches;
    private javax.swing.JTextField txtvalor_total;
    // End of variables declaration//GEN-END:variables
}
