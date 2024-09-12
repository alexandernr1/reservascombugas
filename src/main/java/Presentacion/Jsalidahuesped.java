package Presentacion;

import Datos.Dacompañante;
import Datos.Dcambio;
import Datos.Dfactura_electronica;
import Datos.Dhabitacion;
import Datos.Dingreso;
import Datos.Dsalida;
import Datos.Tiempopro;
import Logica.Facompañante;
import Logica.Fcambio;
import Logica.Fhabitacion;
import Logica.Fingreso;
import Logica.Fsalida;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

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
        agregarWindowFocusListener();
        txtcobrosfraccion.setText("0");
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
    public static String costoalojamiento = "";
    public static String valor_total = "";

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

    private void agregarWindowFocusListener() {
        this.addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                mostrarnumeroturno();  // Actualiza el número de turno cuando la ventana recibe el foco
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                // No hacer nada cuando la ventana pierde el foco
            }
        });
    }

    private void mostrarTiempo() {

        txtfecha_hora_salida.setText(time.getFechacomp() + " " + time.getHoracomp());
    }

    void limpiarcajas() {
        txtcajabuscar.setText("");
        txtcliente.setText("");
        txtdocumento.setText("");
        txtnumnoches.setText("");
        txtcostoalojamiento.setText("");
        txtfecha_hora_ingreso.setText("");
        txtfecha_hora_salida.setText("");
        txtnumero.setText("");
        cbotipo_cliente.setSelectedItem(0);
        txtcliente.setText("");
        txtvalor_noches.setText("");
        txtabonos.setText("");
        txtvalor_total.setText("");
        txttotaldescuentos.setText("");
        txtcobrosfraccion.setText("");
        txtotros_cobros.setText("");
        txttotal_pago.setText("");
        txtdeudaanterior.setText("");
        txtDocumento.setText("");
        txtcorreo.setText("");
        txtrazon_social.setText("");

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
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtvalor_noches = new javax.swing.JTextField();
        txttotaldescuentos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtabonos = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtotros_cobros = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtvalor_total = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txttotal_pago = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtcobrosfraccion = new javax.swing.JTextField();
        txtreten4 = new javax.swing.JTextField();
        txtvalorSinIVA = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        deudaanterior = new javax.swing.JLabel();
        txtdeudaanterior = new javax.swing.JTextField();
        txtIVA_19 = new javax.swing.JTextField();
        txtreten_35 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        calcular35 = new javax.swing.JButton();
        calcular4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        telefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cbotipo_cliente = new javax.swing.JComboBox<>();
        txtdocumento = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        txtcostoalojamiento = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtfecha_hora_salida = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtfecha_hora_ingreso = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtcajabuscar = new javax.swing.JTextField();
        txtnumnoches = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtidcliente = new javax.swing.JTextField();
        txtidingreso = new javax.swing.JTextField();
        txtidhabitacion = new javax.swing.JTextField();
        txtidempleado = new javax.swing.JTextField();
        txtidsalida = new javax.swing.JTextField();
        txtidabono = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btncambiohabit = new javax.swing.JButton();
        factura = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtrazon_social = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        txtempleado = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtnumero_turno = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(244, 244, 244));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SALIDA HUESPED", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COBROS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Valor noches:");

        txtvalor_noches.setEditable(false);
        txtvalor_noches.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtvalor_noches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalor_nochesActionPerformed(evt);
            }
        });

        txttotaldescuentos.setEditable(false);
        txttotaldescuentos.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Descuentos:");
        jLabel10.setToolTipText("");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Otros cobros:");

        txtabonos.setEditable(false);
        txtabonos.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Abonos:");
        jLabel14.setToolTipText("");

        txtotros_cobros.setEditable(false);
        txtotros_cobros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Valor total:");

        txtvalor_total.setEditable(false);
        txtvalor_total.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtvalor_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalor_totalActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("Total Pago:");

        txttotal_pago.setEditable(false);
        txttotal_pago.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setText("IVA(19.00%):");

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setText("Reten (3.5%):");

        txtcobrosfraccion.setEditable(false);
        txtcobrosfraccion.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtcobrosfraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcobrosfraccionActionPerformed(evt);
            }
        });

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

        txtvalorSinIVA.setEditable(false);
        txtvalorSinIVA.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setText("Valor antes de IVA:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Cobro fraccion:");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setText("Subtotal:");

        deudaanterior.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        deudaanterior.setText("Deuda Anterior:");

        txtdeudaanterior.setEditable(false);
        txtdeudaanterior.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

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

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setText("Reten (4%):");

        txtsubtotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtsubtotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsubtotalKeyPressed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deudaanterior)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24)
                            .addComponent(jLabel9)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtreten_35, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIVA_19, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtcobrosfraccion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtreten4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtdeudaanterior, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtsubtotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtvalorSinIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtotros_cobros, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttotal_pago, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtvalor_noches)
                                    .addComponent(txtabonos)
                                    .addComponent(txttotaldescuentos)
                                    .addComponent(txtvalor_total))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calcular35)
                    .addComponent(calcular4)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtvalor_noches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtabonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txttotaldescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtvalor_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtotros_cobros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txttotal_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(txtvalorSinIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtIVA_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtreten_35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtreten4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcular4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcobrosfraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deudaanterior)
                    .addComponent(txtdeudaanterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(calcular35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HUESPED", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 12))); // NOI18N

        telefono.setEditable(false);
        telefono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Telefono:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Cliente:");

        txtcliente.setEditable(false);
        txtcliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Docuemento:");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("Tipo cliente:");

        cbotipo_cliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbotipo_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "General", "Administrativo" }));

        txtdocumento.setEditable(false);
        txtdocumento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdocumentoActionPerformed(evt);
            }
        });

        txtnumero.setEditable(false);
        txtnumero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });

        txtcostoalojamiento.setEditable(false);
        txtcostoalojamiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("Valor noche:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Habitación:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Fecha de ingreso:");

        txtfecha_hora_salida.setEditable(false);
        txtfecha_hora_salida.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtfecha_hora_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfecha_hora_salidaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Fecha de salida:");

        txtfecha_hora_ingreso.setEditable(false);
        txtfecha_hora_ingreso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtfecha_hora_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfecha_hora_ingresoActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N

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

        txtnumnoches.setEditable(false);
        txtnumnoches.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtnumnoches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumnochesActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("N° Noches:");

        txtidcliente.setText("DIC");
        txtidcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidclienteActionPerformed(evt);
            }
        });

        txtidingreso.setText("IDI");

        txtidhabitacion.setText("DIH");
        txtidhabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidhabitacionActionPerformed(evt);
            }
        });

        txtidempleado.setText("IDE");

        txtidsalida.setText("IDS");

        txtidabono.setText("IDA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcajabuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfecha_hora_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfecha_hora_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtidsalida, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtidabono, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel18))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(cbotipo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcostoalojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnumnoches, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtcajabuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(txtnumnoches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcostoalojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtfecha_hora_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtfecha_hora_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidabono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidsalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbotipo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(13, 13, 13))
        );

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista-de-verificacion.png"))); // NOI18N
        jButton1.setText("Nuevo");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnguardar.setBackground(new java.awt.Color(204, 204, 204));
        btnguardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida-de-emergencia.png"))); // NOI18N
        btnguardar.setText("Salida");
        btnguardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnguardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncambiohabit.setBackground(new java.awt.Color(204, 204, 204));
        btncambiohabit.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btncambiohabit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/habitaciones.png"))); // NOI18N
        btncambiohabit.setText("Cambio habit");
        btncambiohabit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncambiohabit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btncambiohabit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncambiohabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncambiohabitActionPerformed(evt);
            }
        });

        factura.setBackground(new java.awt.Color(204, 204, 204));
        factura.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facturacion.png"))); // NOI18N
        factura.setText("Facturar");
        factura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        factura.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        factura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturaActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS FACTURACION ELECTRONICA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 12))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("NIT/CC:");

        txtrazon_social.setEditable(false);
        txtrazon_social.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Razon Social:");

        txtcorreo.setEditable(false);
        txtcorreo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("Correo:");

        txtDocumento.setEditable(false);
        txtDocumento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel20))
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtrazon_social, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 66, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        txtempleado.setEditable(false);
        txtempleado.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtempleadoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Responsable salida:");

        txtnumero_turno.setEditable(false);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Turno:");
        jLabel17.setToolTipText("");

        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnguardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btncambiohabit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(factura, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtempleado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtnumero_turno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnguardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(factura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btncambiohabit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(458, 458, 458)
                                .addComponent(jLabel17)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnumero_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(76, 76, 76))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnguardar)
                                .addComponent(factura))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15)
                                        .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(txtnumero_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(btncambiohabit)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
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

//        if (txttotal_pago.getText().length() == 0) {
//            JOptionPane.showConfirmDialog(rootPane, "Porfavor cobrar el valor para porder darle salida");
//            txttotal_pago.requestFocus();
//            return;
//
//        }
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
        dts.setCobros_extra(Integer.parseInt(txtcobrosfraccion.getText()));
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
                
                Facompañante funci = new Facompañante();
                Dacompañante datos = new Dacompañante();
                
                datos.setIdcliente(Integer.parseInt(txtidcliente.getText()));
                funci.desocuparacompañante(datos);

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

    private void txtcobrosfraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcobrosfraccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcobrosfraccionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarcajas();           // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcajabuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcajabuscarKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            txtotros_cobros.setText("0");
            txtcobrosfraccion.setText("0");

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

// Parsear la fecha de ingreso
                    LocalDateTime fechaIngreso = LocalDateTime.parse(fechaHoraIngreso, DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a", Locale.ENGLISH));

// Obtener la fecha y hora actual
                    LocalDateTime fechaHoraActual = LocalDateTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a", Locale.ENGLISH);
                    String fechaHoraActualFormateada = fechaHoraActual.format(formatter);
                    txtfecha_hora_salida.setText(fechaHoraActualFormateada); // Establecer la fecha de salida en el campo

// Calcular la diferencia en días entre la fecha de ingreso y la fecha actual
                    long numNoches = ChronoUnit.DAYS.between(fechaIngreso.toLocalDate(), fechaHoraActual.toLocalDate());

// Si ingresó y salió el mismo día, cobrar una sola noche
                    if (numNoches == 0) {
                        numNoches = 1;
                    } else {
                        // Si pasó al menos una noche, verificar si la salida es después de las 3:00 PM
                        LocalTime horaLimiteCobro = LocalTime.of(15, 0); // 3:00 PM

                        // Verificar si la salida es después de las 3:00 PM y ha pasado al menos un día completo
                        if (fechaHoraActual.toLocalTime().isAfter(horaLimiteCobro)) {
                            numNoches += 1; // Cobrar una noche adicional si la salida es después de las 3:00 PM
                        }
                    }

// Establecer el número de noches en el campo correspondiente
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

//                    int descuentoTotal = (int) (descuento * numNoches);
//                    int descuentoTotalEntero = (int) Math.round(descuentoTotal);
                    txttotaldescuentos.setText(String.valueOf(descuento));

                    int nuemero = Integer.parseInt(txtnumero.getText());
                    Fsalida funa = new Fsalida();
                    int suma = funa.sumaAbono(nuemero);
                    txtabonos.setText(String.valueOf(suma));
                    
                    int Nuevovalortotal = (int) nuevoCostoAlojamiento - suma - descuento;

                    txtvalor_total.setText(String.valueOf(Nuevovalortotal));

                    int costoFraccionEntero = 0;

                    // Establecer la hora estándar de check-out a las 11:00 AM
                    LocalDateTime checkOutStandard = fechaHoraActual.toLocalDate().atTime(11, 10);

                    // Verificar si la hora actual está dentro del período de cobro extra (hasta 4 horas después del check-out estándar)
                    if (fechaHoraActual.isBefore(checkOutStandard.plusHours(4))) {

                        if (fechaHoraActual.isAfter(checkOutStandard)) {
                            long horasAdicionales = ChronoUnit.HOURS.between(checkOutStandard, fechaHoraActual);

                            // Redondear hacia arriba si hay fracción de hora
                            if (fechaHoraActual.getMinute() > 11) {
                                horasAdicionales = +1;
                            }

                            // Calcular el costo adicional
                            int costoFraccion = (int) (horasAdicionales * 0.10 * costoAlojamiento);
                            costoFraccionEntero = (int) Math.round(costoFraccion);
                            txtcobrosfraccion.setText(String.valueOf(costoFraccionEntero));

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
                        int totalAPagar = Nuevovalortotal /*+ descuento*/;
                        if (totalAPagar < 0) {
                            totalAPagar = 0;
                        }
                        txttotal_pago.setText(String.valueOf(totalAPagar));

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el CLIENTE solicitado");
                }
            } catch (HeadlessException | SQLException ex) {
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

    private void facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturaActionPerformed
        // TODO add your handling code here:
        razon_social = txtrazon_social.getText();
        documento = txtDocumento.getText();
        correo = txtcorreo.getText();
        numero_noches = txtnumnoches.getText();
        habitacion = txtnumero.getText();
        totaldescuentos = txttotaldescuentos.getText();
        cobros_extra = txtcobrosfraccion.getText();
        pagototal = txttotal_pago.getText();
        empleado = txtempleado.getText();
        numero_turno = txtnumero_turno.getText();
        deuda_anterior = txtdeudaanterior.getText();
        idcliente = txtidcliente.getText();
        costoalojamiento = txtcostoalojamiento.getText();
        valor_total = txtvalor_total.getText();
        Jpago pago = new Jpago();
        pago.toFront();
        pago.setVisible(true);

    }//GEN-LAST:event_facturaActionPerformed

    private void txtIVA_19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIVA_19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIVA_19ActionPerformed

    private void txtIVA_19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIVA_19KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIVA_19KeyPressed

    private void txtreten_35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreten_35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreten_35ActionPerformed

    private void txtreten_35KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtreten_35KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreten_35KeyPressed

    private void txtreten4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreten4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreten4ActionPerformed

    private void txtreten4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtreten4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreten4KeyPressed

    private void txtsubtotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsubtotalKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                // Obtener los valores de los campos de texto y convertirlos a enteros
                int valoracobrar = Integer.parseInt(txtvalorSinIVA.getText());
                int Iva19 = Integer.parseInt(txtIVA_19.getText());
                int reten35 = Integer.parseInt(txtreten_35.getText());
                int reten4 = Integer.parseInt(txtreten4.getText());
                int fraccion = Integer.parseInt(txtcobrosfraccion.getText());
                int deudaanterior = Integer.parseInt(txtdeudaanterior.getText());

                int subtotal = valoracobrar + Iva19 - reten35 - reten4 + fraccion + deudaanterior;

                txtsubtotal.setText(String.valueOf(subtotal));

            } catch (NumberFormatException e) {
                // Manejar la excepción si alguno de los campos de texto no contiene un número válido
                System.err.println("Error: uno o más campos no contienen un número válido");
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_txtsubtotalKeyPressed

    private void calcular4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcular4ActionPerformed
        // TODO add your handling code here:
        int valorcobrar = Integer.parseInt(txtvalorSinIVA.getText());
        int reten4 = (int) (valorcobrar * 0.04);
        txtreten4.setText(String.valueOf(reten4));
    }//GEN-LAST:event_calcular4ActionPerformed

    private void calcular35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcular35ActionPerformed
        // TODO add your handling code here:
        int valorcobrar = Integer.parseInt(txtvalorSinIVA.getText());
        int Reten35 = (int) (valorcobrar * 0.035);
        txtreten_35.setText(String.valueOf(Reten35));
    }//GEN-LAST:event_calcular35ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> {
            new Jsalidahuesped().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncambiohabit;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton calcular35;
    private javax.swing.JButton calcular4;
    private javax.swing.JComboBox<String> cbotipo_cliente;
    private javax.swing.JLabel deudaanterior;
    private javax.swing.JButton factura;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JTextField txtIVA_19;
    private javax.swing.JTextField txtabonos;
    private javax.swing.JTextField txtcajabuscar;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtcobrosfraccion;
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
    private javax.swing.JTextField txtreten4;
    private javax.swing.JTextField txtreten_35;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttotal_pago;
    private javax.swing.JTextField txttotaldescuentos;
    private javax.swing.JTextField txtvalorSinIVA;
    private javax.swing.JTextField txtvalor_noches;
    private javax.swing.JTextField txtvalor_total;
    // End of variables declaration//GEN-END:variables
}
