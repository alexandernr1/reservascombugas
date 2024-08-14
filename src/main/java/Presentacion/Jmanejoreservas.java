package Presentacion;

import java.sql.Date;
import Datos.Dhabitacion;
import Datos.Dreserva;
import Logica.Cconexion;
import Logica.Fhabitacion;
import Logica.Freserva;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public final class Jmanejoreservas extends javax.swing.JFrame {

    PreparedStatement pst;
    ResultSet rs;
    private static Jmanejoreservas instance;
    public Jmanejoreservas() {

        initComponents();
        setLocationRelativeTo(null);
        setTitle("RESERVAS");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mostrar("");
        inhabilitar();

    }
    private String accion = "guardar";
    public static int idusuario;

    public static Jmanejoreservas getInstance() {
        if (instance == null) {
            instance = new Jmanejoreservas();
        }
        return instance;
    }
    public void limpiarTabla(JTable tablalistadoreserva) {
        DefaultTableModel model = (DefaultTableModel) tablalistadoreserva.getModel();
        model.setRowCount(0);
    }

    public void limpiarcajas() {
        cajanumero.setText(null);

        txtnumero.setText(null);
        txtnumnoches.setText(null);
        txtcostoalojamiento.setText(null);
        comtipohabitacion.setSelectedItem(0);
        cajanumdocumento.setText(null);
        txtnumdocumento.setText(null);
        txtcliente.setText(null);
        txtclientet.setText(null);
        dcfechareserva.setDate(null);
        dcfechaingreso.setDate(null);
        dcfechasalida.setDate(null);
        comestado.setSelectedItem(0);
        comtiporeserva.setSelectedItem(0);
        dcfechasalida.setDate(null);
        txtnumpersonas.setText(null);
    }

   

    void inhabilitar() {
        txtidreserva.setVisible(false);
        txtidhabitacion.setVisible(false);
        txtidcliente.setVisible(false);
        txtidempleado.setVisible(false);

    }

  

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            Freserva func = new Freserva();
            modelo = func.mostrar(buscar);

//            tablalistadoreserva.setModel(modelo);
//            ocultar_columnas();
//            lbltotalregistros.setText("Total Registros " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jlnuevo = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtidhabitacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        txtnumnoches = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcostoalojamiento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        comtipohabitacion = new javax.swing.JComboBox();
        cajanumero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtidcliente = new javax.swing.JTextField();
        txtcliente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cajanumdocumento = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtnumdocumento = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtclientet = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtidempleado = new javax.swing.JTextField();
        txtempleado = new javax.swing.JTextField();
        Jpnreserva = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        comtiporeserva = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtnumpersonas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        comestado = new javax.swing.JComboBox<>();
        dcfechareserva = new com.toedter.calendar.JDateChooser();
        dcfechaingreso = new com.toedter.calendar.JDateChooser();
        dcfechasalida = new com.toedter.calendar.JDateChooser();
        txtidreserva = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manejo Reservas");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HABITACIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setText("N° Habitación:");

        txtidhabitacion.setText("IDHBI");
        txtidhabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidhabitacionActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("N° Noches:");

        txtnumero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });

        txtnumnoches.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setText("Costo Alojamiento:");

        txtcostoalojamiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel11.setText("Tipo Habitación:");

        comtipohabitacion.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        comtipohabitacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Individual", "Doble", "Triple" }));
        comtipohabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comtipohabitacionActionPerformed(evt);
            }
        });

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

        jLabel9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel9.setText("Buscar Habit:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cajanumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnumnoches, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcostoalojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comtipohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnumnoches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajanumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcostoalojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(comtipohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        txtidcliente.setText("IDCLI");
        txtidcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidclienteActionPerformed(evt);
            }
        });

        txtcliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclienteActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel18.setText("Cliente:");

        cajanumdocumento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cajanumdocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajanumdocumentoKeyPressed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel21.setText("N°Cedula:");

        txtnumdocumento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtnumdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumdocumentoActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel22.setText("Telefono:");

        txtclientet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtclientet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclientetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("Buscar cliente:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cajanumdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnumdocumento))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtclientet, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajanumdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtnumdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtclientet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OBSERVACIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel19.setText("Encargado");

        txtidempleado.setText("IDEM");
        txtidempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidempleadoActionPerformed(evt);
            }
        });

        txtempleado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtempleadoActionPerformed(evt);
            }
        });

        Jpnreserva.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " RESERVAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Fecha Reserva:");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Fecha ingreso:");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("Fecha Salida:");

        jLabel20.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel20.setText("Tipo reserva:");

        comtiporeserva.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        comtiporeserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reserva", " " }));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("N° Personas:");

        txtnumpersonas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel10.setText("Estado reserva:");

        comestado.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        comestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reserva estandar ", "Reserva pagada", "Anulada", " " }));

        dcfechareserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        dcfechaingreso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        dcfechasalida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout JpnreservaLayout = new javax.swing.GroupLayout(Jpnreserva);
        Jpnreserva.setLayout(JpnreservaLayout);
        JpnreservaLayout.setHorizontalGroup(
            JpnreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnreservaLayout.createSequentialGroup()
                .addGroup(JpnreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JpnreservaLayout.createSequentialGroup()
                        .addGroup(JpnreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JpnreservaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dcfechareserva, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10))
                            .addGroup(JpnreservaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JpnreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comtiporeserva, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JpnreservaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(JpnreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dcfechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JpnreservaLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dcfechasalida, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGap(19, 19, 19))
        );
        JpnreservaLayout.setVerticalGroup(
            JpnreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnreservaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpnreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpnreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(JpnreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(dcfechareserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGroup(JpnreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpnreservaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(JpnreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcfechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34))
                    .addGroup(JpnreservaLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(JpnreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comtiporeserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)))
                .addGroup(JpnreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpnreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnumpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpnreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(dcfechasalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        txtidreserva.setText("IDRE");
        txtidreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidreservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jpnreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jpnreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnguardar.setBackground(new java.awt.Color(204, 204, 204));
        btnguardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnlimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnlimpiar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.GIF"))); // NOI18N
        btnlimpiar.setText("NUEVO");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        jlnuevo.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlnuevo.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlnuevo.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlnuevo.setLayer(btnguardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlnuevo.setLayer(btnlimpiar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlnuevoLayout = new javax.swing.GroupLayout(jlnuevo);
        jlnuevo.setLayout(jlnuevoLayout);
        jlnuevoLayout.setHorizontalGroup(
            jlnuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlnuevoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlnuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlnuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jlnuevoLayout.createSequentialGroup()
                        .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jlnuevoLayout.setVerticalGroup(
            jlnuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlnuevoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jlnuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jlnuevoLayout.createSequentialGroup()
                        .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlnuevo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
        limpiarcajas();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (txtidhabitacion.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes Seleccionar una Habitación");
            txtidhabitacion.requestFocus();
            return;
        }
        if (txtidcliente.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes Seleccionar un Cliente");
            txtidcliente.requestFocus();
            return;
        }

        if (txtcostoalojamiento.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un precio del Alojamiento");
            txtcostoalojamiento.requestFocus();
            return;
        }

        if (txtnumpersonas.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar numero de personas");
            txtnumpersonas.requestFocus();
            return;
        }
        if (txtnumnoches.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar numero de noches a reservar");
            txtnumnoches.requestFocus();
            return;
        }
        Dreserva dts = new Dreserva();
        Freserva func = new Freserva();

        dts.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
        dts.setIdcliente(Integer.parseInt(txtidcliente.getText()));
        dts.setIdempleado(Integer.parseInt(txtidempleado.getText()));

        int seleccionado = comtiporeserva.getSelectedIndex();
        dts.setTiporeserva((String) comtiporeserva.getItemAt(seleccionado));

        Calendar cal;
        int d, m, a;
        cal = dcfechareserva.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFechareserva(new Date(a, m, d));

        cal = dcfechaingreso.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFechaingreso(new Date(a, m, d));

        cal = dcfechasalida.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dts.setFechasalida(new Date(a, m, d));

        dts.setCostoalojamiento(Double.valueOf(txtcostoalojamiento.getText()));
        dts.setNumnoches(Integer.parseInt(txtnumnoches.getText()));
        dts.setNumpersonas(Integer.parseInt(txtnumpersonas.getText()));
        seleccionado = comestado.getSelectedIndex();
        dts.setEstado((String) comestado.getItemAt(seleccionado));

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "La reserva fue registrada satisfactoriamente");
                mostrar("");
                inhabilitar();
                Fhabitacion func4 = new Fhabitacion();
                Dhabitacion dts4 = new Dhabitacion();

                dts4.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
                func4.reserva(dts4);
            }

        } else if (accion.equals("editar")) {
            dts.setIdreserva(Integer.parseInt(txtidreserva.getText()));
            dts.setIdempleado(Integer.parseInt(txtidempleado.getText()));
            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "La reserva fue Editada satisfactoriamente");
                mostrar("");
                inhabilitar();
                
            }
            this.dispose();
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtidreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidreservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidreservaActionPerformed

    private void txtempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtempleadoActionPerformed

    }//GEN-LAST:event_txtempleadoActionPerformed

    private void txtidempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidempleadoActionPerformed

    private void txtclientetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclientetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclientetActionPerformed

    private void txtnumdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumdocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumdocumentoActionPerformed

    private void txtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclienteActionPerformed

    private void txtidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidclienteActionPerformed

    private void comtipohabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comtipohabitacionActionPerformed
        // TODO add your handling code here:
        transferFocus();
    }//GEN-LAST:event_comtipohabitacionActionPerformed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtidhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidhabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidhabitacionActionPerformed

    private void cajanumdocumentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajanumdocumentoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Cconexion conexion = new Cconexion();

            try {
                Connection conectar = conexion.establecerConexion();

                pst = conectar.prepareStatement("select * from cliente where numdocumento=?");
                pst.setString(1, cajanumdocumento.getText());

                rs = pst.executeQuery();

                if (rs.next()) {
                    txtidcliente.setText(String.valueOf(rs.getInt("idcliente")));
                    txtcliente.setText(rs.getString("nombres") + " " + rs.getString("apellidos"));
                    txtnumdocumento.setText(rs.getString("numdocumento"));
                    txtclientet.setText(rs.getString("telefono"));

                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro el CLIENTE solicitado");
                }

            } catch (Exception ex) {
                System.err.println("Error" + ex);
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_cajanumdocumentoKeyPressed

    private void cajanumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajanumeroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Cconexion conexion = new Cconexion();

            try {
                Connection conectar = conexion.establecerConexion();

                pst = conectar.prepareStatement("select * from habitacion where numero=?");
                pst.setString(1, cajanumero.getText());

                rs = pst.executeQuery();

                if (rs.next()) {
                    txtidhabitacion.setText(String.valueOf(rs.getInt("idhabitacion")));
                    txtnumero.setText(rs.getString("numero"));
                    comtipohabitacion.setSelectedItem(rs.getString("tipohabitacion"));
                    txtcostoalojamiento.setText(rs.getString("precio"));

                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro el NUMERO solicitado");
                }
                conectar.close();

            } catch (Exception ex) {
                System.err.println("Error" + ex);
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_cajanumeroKeyPressed

    private void cajanumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajanumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajanumeroActionPerformed

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
        } catch (ClassNotFoundException e) {
            java.util.logging.Logger.getLogger(Jmanejoreservas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, e);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jmanejoreservas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jmanejoreservas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jmanejoreservas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Jmanejoreservas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpnreserva;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JTextField cajanumdocumento;
    private javax.swing.JTextField cajanumero;
    private javax.swing.JComboBox<String> comestado;
    private javax.swing.JComboBox comtipohabitacion;
    private javax.swing.JComboBox<String> comtiporeserva;
    private com.toedter.calendar.JDateChooser dcfechaingreso;
    private com.toedter.calendar.JDateChooser dcfechareserva;
    private com.toedter.calendar.JDateChooser dcfechasalida;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLayeredPane jlnuevo;
    public static javax.swing.JTextField txtcliente;
    public static javax.swing.JTextField txtclientet;
    public static javax.swing.JTextField txtcostoalojamiento;
    public static javax.swing.JTextField txtempleado;
    public static javax.swing.JTextField txtidcliente;
    public static javax.swing.JTextField txtidempleado;
    public static javax.swing.JTextField txtidhabitacion;
    private javax.swing.JTextField txtidreserva;
    public static javax.swing.JTextField txtnumdocumento;
    public static javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtnumnoches;
    private javax.swing.JTextField txtnumpersonas;
    // End of variables declaration//GEN-END:variables
}
