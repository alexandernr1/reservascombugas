package Presentacion;

import Datos.Dcambio;
import Datos.Dfactura_electronica;
import Datos.Dhabitacion;
import Datos.Dingreso;
import Datos.Dsalida;
import Datos.Tiempopro;
import Logica.Fcambio;
import Logica.Fhabitacion;
import Logica.Fingreso;
import Logica.Fsalida;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public final class Jsalidahuesped extends javax.swing.JFrame {

    Tiempopro time = new Tiempopro();
    private static Jsalidahuesped instance;

    public Jsalidahuesped() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("SALIDA");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mostrarTiempo();
        inhabilitar();
        mostrarnumeroturno();
        txtcobros_extra.setText("0");
        txtotros_cobros.setText("0");
        txtvalor_noches.setText("0");
        txtabonos.setText("0");
        txtvalor_total.setText("0");
        txttotaldescuentos.setText("0");
        txtotros_cobros.setText("0");
        txttotal_pago.setText("0");

    }
    public static int idusuario;
    private String accion = "guardar";

    public static String razon_social = "";
    public static String documento = "";
    public static String correo;
    public static String numero_noches;
    public static String habitacion = "";
    public static String totaldescuentos = "";
    public static String cobros_extra = "";
    public static String pagototal = "";
    public static String empleado = "";
    public static String numero_turno = "";
    public static String deuda_anterior = "";
    public static String idcliente = "";

    public static Jsalidahuesped getInstance() {
        if (instance == null) {
            instance = new Jsalidahuesped();
        }
        return instance;
    }

    public void mostrarnumeroturno() {
        Fsalida func = new Fsalida();
        String numeroturno = func.numeroturno();
        txtnumero_turno.setText(numeroturno);
    }

    private void mostrarTiempo() {

        txtfecha_hora_salida.setText(time.getFechacomp() + " " + time.getHoracomp());
    }

    void limpiarcajas() {
        txtcajabuscar.setText(null);
        txtcliente.setText(null);
        txtdocumento.setText(null);
        txtnumnoches.setText(null);
        txtcostoalojamiento.setText(null);
        txtfecha_hora_ingreso.setText(null);
        txtfecha_hora_salida.setText(null);
        txtnumero.setText(null);
        cbotipo_cliente.setSelectedItem(0);
        txtcliente.setText(null);
        txtvalor_noches.setText(null);
        txtabonos.setText(null);
        txtvalor_total.setText(null);
        txttotaldescuentos.setText(null);
        txtcobros_extra.setText(null);
        txtotros_cobros.setText(null);
        txttotal_pago.setText(null);
        txtdeudaanterior.setText(null);
        txtDocumento.setText(null);
        txtcorreo.setText(null);
        txtrazon_social.setText(null);
        

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
        txttotaldescuentos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtcobros_extra = new javax.swing.JTextField();
        txtabonos = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtotros_cobros = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtvalor_total = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txttotal_pago = new javax.swing.JTextField();
        deudaanterior = new javax.swing.JLabel();
        txtdeudaanterior = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        telefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cbotipo_cliente = new javax.swing.JComboBox<>();
        txtdocumento = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtempleado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtfecha_hora_ingreso = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtcostoalojamiento = new javax.swing.JTextField();
        txtidingreso = new javax.swing.JTextField();
        txtidabono = new javax.swing.JTextField();
        txtidempleado = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtnumnoches = new javax.swing.JTextField();
        txtidhabitacion = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();
        txtcajabuscar = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtnumero_turno = new javax.swing.JTextField();
        btncambiohabit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtrazon_social = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(244, 244, 244));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("SALIDA HUESPED"));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Habitación:");

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setText("Fecha de ingreso:");

        txtidsalida.setText("IDS");

        txtnumero.setEditable(false);
        txtnumero.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });

        txtfecha_hora_salida.setEditable(false);
        txtfecha_hora_salida.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtfecha_hora_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfecha_hora_salidaActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COBROS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setText("Valor noches:");

        txtvalor_noches.setEditable(false);
        txtvalor_noches.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtvalor_noches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalor_nochesActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel9.setText("Cobro fraccion:");

        txttotaldescuentos.setEditable(false);
        txttotaldescuentos.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel10.setText("Descuentos:");
        jLabel10.setToolTipText("");

        jLabel16.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel16.setText("Otros cobros:");

        txtcobros_extra.setEditable(false);
        txtcobros_extra.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtcobros_extra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcobros_extraActionPerformed(evt);
            }
        });

        txtabonos.setEditable(false);
        txtabonos.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel14.setText("Abonos:");
        jLabel14.setToolTipText("");

        txtotros_cobros.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel13.setText("Valor total:");

        txtvalor_total.setEditable(false);
        txtvalor_total.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtvalor_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalor_totalActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel21.setText("Total Pago:");

        txttotal_pago.setEditable(false);
        txttotal_pago.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        deudaanterior.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        deudaanterior.setText("Deuda Anterior:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttotal_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel14))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtvalor_noches, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtabonos, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9))
                    .addComponent(deudaanterior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtcobros_extra)
                    .addComponent(txttotaldescuentos, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(txtdeudaanterior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtvalor_total, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtotros_cobros)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtvalor_noches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtabonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txttotaldescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtvalor_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(txtotros_cobros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txtcobros_extra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txttotal_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deudaanterior)
                    .addComponent(txtdeudaanterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HUESPED", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 12))); // NOI18N

        telefono.setEditable(false);
        telefono.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel11.setText("Telefono:");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Cliente:");

        txtcliente.setEditable(false);
        txtcliente.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("Identificación:");

        jLabel18.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel18.setText("Tipo de cliente:");

        cbotipo_cliente.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cbotipo_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Administrativo" }));

        txtdocumento.setEditable(false);
        txtdocumento.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdocumentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbotipo_cliente, 0, 131, Short.MAX_VALUE)
                    .addComponent(telefono))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(cbotipo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.GIF"))); // NOI18N
        jButton1.setText("NUEVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnguardar.setBackground(new java.awt.Color(153, 153, 153));
        btnguardar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel15.setText("Responsable salida");

        txtempleado.setEditable(false);
        txtempleado.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtempleadoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel12.setText("Fecha de salida:");

        txtfecha_hora_ingreso.setEditable(false);
        txtfecha_hora_ingreso.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtfecha_hora_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfecha_hora_ingresoActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel19.setText("Costo alojamiento:");

        txtcostoalojamiento.setEditable(false);
        txtcostoalojamiento.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        txtidingreso.setText("IDI");

        txtidabono.setText("IDA");

        txtidempleado.setText("IDE");

        jLabel22.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel22.setText("Numero Noches");

        txtnumnoches.setEditable(false);
        txtnumnoches.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtnumnoches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumnochesActionPerformed(evt);
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

        txtcajabuscar.setMinimumSize(new java.awt.Dimension(70, 30));
        txtcajabuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcajabuscarActionPerformed(evt);
            }
        });
        txtcajabuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcajabuscarKeyPressed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel23.setText("Buscar Habit:");

        jLabel17.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel17.setText("Turno:");
        jLabel17.setToolTipText("");

        btncambiohabit.setBackground(new java.awt.Color(153, 153, 153));
        btncambiohabit.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btncambiohabit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/habitaciones.png"))); // NOI18N
        btncambiohabit.setText("CAMBIO HABIT");
        btncambiohabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncambiohabitActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS FACTURACION ELECTRONICA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 12))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("NIT/CC:");

        txtrazon_social.setEditable(false);
        txtrazon_social.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("Razon Social:");

        txtcorreo.setEditable(false);
        txtcorreo.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel20.setText("Correo:");

        txtDocumento.setEditable(false);
        txtDocumento.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtrazon_social, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtrazon_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtidsalida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtnumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtfecha_hora_salida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnguardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtempleado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtfecha_hora_ingreso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtcostoalojamiento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtidingreso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtidabono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtidempleado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtnumnoches, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtidhabitacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtidcliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtcajabuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtnumero_turno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btncambiohabit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtnumero)
                                            .addComponent(txtcostoalojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel12)))
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(txtcajabuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel22)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnumnoches, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfecha_hora_ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(txtfecha_hora_salida))
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(txtidingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtidsalida, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtidabono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnguardar)
                                        .addGap(316, 316, 316)
                                        .addComponent(btncambiohabit))
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtnumero_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidabono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidsalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtnumnoches, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcajabuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(txtcostoalojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtfecha_hora_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfecha_hora_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtnumero_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncambiohabit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtfecha_hora_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfecha_hora_salidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfecha_hora_salidaActionPerformed

    private void txtdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdocumentoActionPerformed

    private void txtfecha_hora_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfecha_hora_ingresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfecha_hora_ingresoActionPerformed

    private void txtempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtempleadoActionPerformed

    private void txtnumnochesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumnochesActionPerformed
//        mostradias();

    }//GEN-LAST:event_txtnumnochesActionPerformed

    private void txtvalor_nochesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalor_nochesActionPerformed


    }//GEN-LAST:event_txtvalor_nochesActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        Dsalida dts = new Dsalida();
        Fsalida func = new Fsalida();
        dts.setIdingreso(Integer.parseInt(txtidingreso.getText()));
        dts.setIdcliente(Integer.parseInt(txtidcliente.getText()));
        dts.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
        dts.setIdabono(Integer.parseInt(txtidabono.getText()));
        dts.setEmpleado(String.valueOf(txtempleado.getText()));
        dts.setNumero(Integer.parseInt(txtnumero.getText()));
        dts.setCliente(String.valueOf(txtcliente.getText()));
        dts.setNumnoches(Integer.parseInt(txtnumnoches.getText()));
        dts.setCostoalojamiento(Integer.parseInt(txtcostoalojamiento.getText()));
        dts.setFechaingreso(String.valueOf(txtfecha_hora_ingreso.getText()));
        dts.setFechasalida(String.valueOf(txtfecha_hora_salida.getText()));

        String seleccionadoTipocliente = (String) cbotipo_cliente.getSelectedItem();
        dts.setTipocliente(seleccionadoTipocliente);

        dts.setValor_noches(Integer.parseInt(txtvalor_noches.getText()));
        dts.setAbonos(Integer.parseInt(txtabonos.getText()));
        dts.setValor_total(Integer.parseInt(txtvalor_total.getText()));
        dts.setDescuentos(Integer.parseInt(txttotaldescuentos.getText()));
        dts.setCobros_extra(Integer.parseInt(txtcobros_extra.getText()));
        dts.setOtros_cobros(Integer.parseInt(txtotros_cobros.getText()));
        dts.setTotalpago(Double.valueOf(txttotal_pago.getText()));
        dts.setDeuda_anterior(Integer.parseInt(txtdeudaanterior.getText()));

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {

                inhabilitar();

                Fhabitacion func2 = new Fhabitacion();
                Dhabitacion dts2 = new Dhabitacion();

                dts2.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
                func2.desocupar(dts2);

                Fingreso fnc = new Fingreso();
                Dingreso dts3 = new Dingreso();

                dts3.setIdingreso(Integer.parseInt(txtidingreso.getText()));
                fnc.finalizar(dts3);

                Fcambio func3 = new Fcambio();
                Dcambio dts4 = new Dcambio();

                dts4.setNumero_habita(Integer.parseInt(txtnumero.getText()));
                func3.finalizar(dts4);

                int respuesta = JOptionPane.showConfirmDialog(rootPane, "SALIDA DE HUESPED EXITO. ¿Deseas asignar limpeza?", "confirmación", JOptionPane.YES_NO_OPTION);
                limpiarcajas();
                if (respuesta == JOptionPane.YES_NO_OPTION) {

                    Jlimpieza limpieza = new Jlimpieza();
                    limpieza.toFront();
                    limpieza.setVisible(true);

                }
            }

        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtidhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidhabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidhabitacionActionPerformed

    private void txtidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidclienteActionPerformed

    private void txtvalor_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalor_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalor_totalActionPerformed

    private void txtcobros_extraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcobros_extraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcobros_extraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarcajas();           // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcajabuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcajabuscarKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            txtotros_cobros.setText("0");
            txtcobros_extra.setText("0");

            try {
                ResultSet rs = new Fsalida().realizarConsulta(txtcajabuscar.getText());
               
                if (rs.next()) {
                    txtidingreso.setText(String.valueOf(rs.getInt("idingreso")));
                    txtidcliente.setText(String.valueOf(rs.getInt("idcliente")));
                    txtidabono.setText(String.valueOf(rs.getInt("idabono")));
//                    txtabonos.setText(String.valueOf(rs.getInt("abonohabitacion")));

                    txtidhabitacion.setText(String.valueOf(rs.getInt("idhabitacion")));
                    txtcliente.setText(rs.getString("clienten") + " " + rs.getString("clienteap"));
                    telefono.setText(rs.getString("clientete"));
                    cbotipo_cliente.setSelectedItem(String.valueOf(rs.getString("tipo_cliente")));

                    // Formatear el costo de alojamiento
                    int costoAlojamiento = rs.getInt("costoalojamiento");
                    txtcostoalojamiento.setText(String.valueOf(costoAlojamiento));

                    txtnumero.setText(String.valueOf(rs.getInt("numero")));
                    txtdocumento.setText(String.valueOf(rs.getString("clientenu")));
                    txtfecha_hora_ingreso.setText(String.valueOf(rs.getString("fecha_hora_ingreso")));

                    String fechaHoraIngreso = rs.getString("fecha_hora_ingreso").trim();
                    fechaHoraIngreso = fechaHoraIngreso.replace("p. m.", "pm").replace("a. m.", "am");
                    LocalDateTime fechaIngreso = LocalDateTime.parse(fechaHoraIngreso, DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a", Locale.ENGLISH));
                    LocalDateTime fechaHoraActual = LocalDateTime.now(); // Obtener la fecha y hora actual
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a", Locale.ENGLISH);
                    String fechaHoraActualFormateada = fechaHoraActual.format(formatter);
                    txtfecha_hora_salida.setText(fechaHoraActualFormateada); // Establecer el texto en txtfecha_hora_salida

                    // Calcular la diferencia en días entre la fecha de ingreso y la fecha actual
                    long numNoches = ChronoUnit.DAYS.between(fechaIngreso.toLocalDate(), fechaHoraActual.toLocalDate());
                    numNoches = (numNoches == 0) ? 1 : numNoches;
                    txtnumnoches.setText(String.valueOf(numNoches));

                    // Calcular nuevo costo de alojamiento
                    int numeroNoches = Integer.parseInt(txtnumnoches.getText());
                    int nuevoCostoAlojamiento = costoAlojamiento * numeroNoches;
                    txtvalor_noches.setText(String.valueOf(nuevoCostoAlojamiento));

                    // Obtener el valor del descuento base de la base de datos
                    String descuentosStr = rs.getString("descuentos");
                    int descuento = 0; // Valor predeterminado si no hay descuento

                    if (descuentosStr != null && !descuentosStr.trim().isEmpty()) {
                        try {
                            descuento = Integer.parseInt(descuentosStr.trim());
                        } catch (NumberFormatException e) {
                            // Manejar la excepción si el valor no es un número válido
                            descuento = 0;
                        }
                    }

                    int descuentoTotal = (int) (descuento * numNoches);
                    int descuentoTotalEntero = (int) Math.round(descuentoTotal);

                    txttotaldescuentos.setText(String.valueOf(descuentoTotalEntero));

                    int valorTotal = (int) Math.round(rs.getInt("abonohabitacion"));
                    System.out.print("este es abono" + valorTotal);
                    txtabonos.setText(String.valueOf(valorTotal));

                    int Nuevovalortotal = (int) nuevoCostoAlojamiento - valorTotal + descuentoTotalEntero;

                    txtvalor_total.setText(String.valueOf(Nuevovalortotal));

                    int costoFraccionEntero = 0;

                    // Establecer la hora estándar de check-out a las 11:00 AM
                    LocalDateTime checkOutStandard = fechaHoraActual.toLocalDate().atTime(11, 0);

                    // Verificar si la hora actual está dentro del período de cobro extra (hasta 4 horas después del check-out estándar)
                    if (fechaHoraActual.isBefore(checkOutStandard.plusHours(4))) {

                        if (fechaHoraActual.isAfter(checkOutStandard)) {
                            long horasAdicionales = ChronoUnit.HOURS.between(checkOutStandard, fechaHoraActual);

                            // Redondear hacia arriba si hay fracción de hora
                            if (fechaHoraActual.getMinute() > 11) {
                                horasAdicionales += 1;
                            }

                            // Calcular el costo adicional
                            int costoFraccion = (int) (horasAdicionales * 0.10 * costoAlojamiento);
                            costoFraccionEntero = (int) Math.round(costoFraccion);
                            txtcobros_extra.setText(String.valueOf(costoFraccionEntero));

                        }

                    }

                    Fsalida func = new Fsalida();
                    String documento = txtdocumento.getText();
                    int deudaanterior = func.deudaanterior(documento);
                    txtdeudaanterior.setText(String.valueOf(deudaanterior));

                    //DATOS DE CLIENTE FACTURA ELECTRONICA
                    int factura = Integer.parseInt(txtidcliente.getText());
                    Dfactura_electronica clienteF = new Fsalida().cleinteFacturar(factura);
                    if (clienteF != null) {
                        txtrazon_social.setText(clienteF.getRazon_social());
                        txtcorreo.setText(clienteF.getEmail());
                        txtDocumento.setText(String.valueOf(clienteF.getDocumento()));
                    }

                    int netocobros = Integer.parseInt(txtnumero_turno.getText());
                    int otroscobros = func.otroscobros(netocobros);
                    txtotros_cobros.setText(String.valueOf(otroscobros));

                    // Calcular total a pagar
                    String tipoCliente = rs.getString("tipo_cliente");
                    if (!"Administrativo".equalsIgnoreCase(tipoCliente)) {
                        int totalAPagar = Nuevovalortotal + costoFraccionEntero + deudaanterior /*+  otroscobros*/;
                        if (totalAPagar < 0) {
                            totalAPagar = 0;
                        }
                        txttotal_pago.setText(String.valueOf(totalAPagar));

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el CLIENTE solicitado");
                }
            } catch (HeadlessException | SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Ocurrió un error al procesar la información del cliente.");

            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_txtcajabuscarKeyPressed

    private void btncambiohabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncambiohabitActionPerformed
        // TODO add your handling code here:
        pagototal = txttotal_pago.getText();
        empleado = txtempleado.getText();
        numero_turno = txtnumero_turno.getText();
        JcambioHabit cambio = new JcambioHabit();
        cambio.toFront();
        cambio.setVisible(true);
    }//GEN-LAST:event_btncambiohabitActionPerformed

    private void txtcajabuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcajabuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcajabuscarActionPerformed

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

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
    private javax.swing.JButton btncambiohabit;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox<String> cbotipo_cliente;
    private javax.swing.JLabel deudaanterior;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtabonos;
    private javax.swing.JTextField txtcajabuscar;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtcobros_extra;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtcostoalojamiento;
    private javax.swing.JTextField txtdeudaanterior;
    private javax.swing.JTextField txtdocumento;
    public static javax.swing.JTextField txtempleado;
    private javax.swing.JTextField txtfecha_hora_ingreso;
    private javax.swing.JTextField txtfecha_hora_salida;
    private javax.swing.JTextField txtidabono;
    private javax.swing.JTextField txtidcliente;
    public static javax.swing.JTextField txtidempleado;
    private javax.swing.JTextField txtidhabitacion;
    private javax.swing.JTextField txtidingreso;
    private javax.swing.JTextField txtidsalida;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtnumero_turno;
    private javax.swing.JTextField txtnumnoches;
    private javax.swing.JTextField txtotros_cobros;
    private javax.swing.JTextField txtrazon_social;
    private javax.swing.JTextField txttotal_pago;
    private javax.swing.JTextField txttotaldescuentos;
    private javax.swing.JTextField txtvalor_noches;
    private javax.swing.JTextField txtvalor_total;
    // End of variables declaration//GEN-END:variables
}
