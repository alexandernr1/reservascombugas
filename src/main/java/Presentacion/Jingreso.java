package Presentacion;

import Datos.Dhabitacion;
import Datos.Dingreso;
import Datos.Tiempopro;
import Logica.Cconexion;
import Logica.Fhabitacion;
import Logica.Fingreso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Jingreso extends javax.swing.JFrame {

    PreparedStatement pst;
    ResultSet rs;
    Tiempopro time = new Tiempopro();
    private String cod;
    private String numero;
    private String costoalojamiento;

    public Jingreso() {
        initComponents();
        mostrar("");
        setLocationRelativeTo(null);
        setTitle("INGRESO DE HUESPED");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inhabilitar();
        mostrarTiempo();

    }

    private String accion = "guardar";
    public static int idusuario;

    private void mostrarTiempo() {

        jdfechaingreso.setText(time.getFechacomp() + " " + time.getHoracomp());
    }

    public Jingreso(String cod, String numero, String costoalojamiento) {
        this.cod = cod;
        this.numero = numero;
        this.costoalojamiento = costoalojamiento;

    }

    public void mostrarDatosSeleccionados() {
        txtidhabitacion.setText(cod);
        txtnumero.setText(numero);
        txtcostoalojamiento.setText(costoalojamiento);
    }

    public void limpiarcajas() {

        txtnum_personas.setText(null);
        txtnumero.setText(null);
        txtcostoalojamiento.setText(null);
        txtcliente.setText(null);
        txttelefono.setText(null);
        cbotipo_cliente.setSelectedItem(0);
        comestado.setSelectedItem(0);
        txtmotivo_viaje.setText(null);
        txtnumdocumento.setText(null);
    }

    void ocultar_columnas() {
        tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);

        tablalistado.getColumnModel().getColumn(1).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(1).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(1).setPreferredWidth(0);

        tablalistado.getColumnModel().getColumn(3).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(3).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(3).setPreferredWidth(0);

    }

    void habilitar() {
        txtidingreso.setVisible(true);
        txtidhabitacion.setVisible(true);
        txtidcliente.setVisible(true);
        jdfechaingreso.setVisible(true);
        txtnum_personas.setVisible(true);
        cbotipo_cliente.setVisible(true);
        txtcostoalojamiento.setVisible(true);
        txtmotivo_viaje.setVisible(true);
        comestado.setVisible(true);
    }

    static void inhabilitar() {
        txtidempleado.setVisible(false);
        txtidhabitacion.setVisible(false);
        txtidcliente.setVisible(false);
        txtidingreso.setVisible(false);
    }

    public void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            Fingreso func = new Fingreso();
            modelo = func.mostrar(buscar);

            tablalistado.setModel(modelo);
            ocultar_columnas();
            lbltotalregistro.setText("Total Registros " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnum_personas = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtmotivo_viaje = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtempleado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        btnvistacliente = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        comestado = new javax.swing.JComboBox<>();
        txtnumdocumento = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cbotipo_cliente = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnvistahabitacion = new javax.swing.JButton();
        txtcostoalojamiento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        txttipohabitacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnsalida = new javax.swing.JButton();
        btningresar = new javax.swing.JButton();
        btnabonos = new javax.swing.JButton();
        txtidingreso = new javax.swing.JTextField();
        btnlimpiar = new javax.swing.JButton();
        txtidhabitacion = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();
        jdfechaingreso = new javax.swing.JTextField();
        txtidempleado = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        lbltotalregistros = new javax.swing.JLabel();
        btnrealizarpagos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        lbltotalregistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(204, 204, 204));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("INGRESO HUESPED"));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Numero Personas:");

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setText("Fecha de ingreso:");

        txtnum_personas.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtnum_personas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum_personasActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("CLIENTE"));

        jLabel13.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel13.setText("Principal motivo del viaje:");

        txtmotivo_viaje.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtmotivo_viaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmotivo_viajeActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel14.setText("Responsable:");

        txtempleado.setEditable(false);
        txtempleado.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Cliente:");

        txtcliente.setEditable(false);
        txtcliente.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("Telefono:");

        txttelefono.setEditable(false);
        txttelefono.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });

        btnvistacliente.setText("Buscar cliente");
        btnvistacliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvistaclienteActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel11.setText("Estado:");

        comestado.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        comestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente ", "Pagada", "Anulada", " " }));

        txtnumdocumento.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtnumdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumdocumentoActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel18.setText("Tipo de cliente:");

        cbotipo_cliente.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cbotipo_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Administrativo", "Otros" }));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("Documento:");

        jLabel9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel9.setText("Costo Alojameinto:");

        btnvistahabitacion.setText("Buscar Habita");
        btnvistahabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvistahabitacionActionPerformed(evt);
            }
        });

        txtcostoalojamiento.setEditable(false);
        txtcostoalojamiento.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setText("N° Habitación:");

        txtnumero.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });

        jLabel5.setText("TIPO HBITACION:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtmotivo_viaje, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(309, 309, 309)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(comestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbotipo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnumdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnvistahabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(237, 237, 237))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnvistacliente)
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttipohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcostoalojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnvistahabitacion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttipohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtcostoalojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(btnvistacliente)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnumdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(comestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cbotipo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtmotivo_viaje, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtempleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnsalida.setBackground(new java.awt.Color(153, 153, 153));
        btnsalida.setText("SALIDA");
        btnsalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalidaActionPerformed(evt);
            }
        });

        btningresar.setBackground(new java.awt.Color(153, 153, 153));
        btningresar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\nuevo.GIF")); // NOI18N
        btningresar.setText("GUARDAR");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });

        btnabonos.setBackground(new java.awt.Color(153, 153, 153));
        btnabonos.setText("EDITAR");
        btnabonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnabonosActionPerformed(evt);
            }
        });

        txtidingreso.setText("IDI");

        btnlimpiar.setBackground(new java.awt.Color(153, 153, 153));
        btnlimpiar.setText("NUEVO");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        txtidhabitacion.setText("IDH");
        txtidhabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidhabitacionActionPerformed(evt);
            }
        });

        txtidcliente.setText("IDC");

        jdfechaingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdfechaingresoActionPerformed(evt);
            }
        });

        txtidempleado.setText("IDEM");

        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtnum_personas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnsalida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btningresar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnabonos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtidingreso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnlimpiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtidhabitacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtidcliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jdfechaingreso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtidempleado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdfechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(txtidingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnum_personas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btningresar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnlimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnabonos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsalida)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtnum_personas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jdfechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnabonos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnlimpiar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btningresar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Reservas"));

        jLabel10.setText("Buscar");

        btnbuscar.setBackground(new java.awt.Color(51, 51, 51));
        btnbuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
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

        btnsalir.setBackground(new java.awt.Color(51, 51, 51));
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        lbltotalregistros.setText("Registros");

        btnrealizarpagos.setText("Realizar Pagos");
        btnrealizarpagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrealizarpagosActionPerformed(evt);
            }
        });

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero", "Cliente", "Identificación", "Telefono", "Fecha Ingreso", "N° Personas", "Tipo Cliente", "Costo", "Motivo de Viaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablalistado);

        lbltotalregistro.setText("Total registro");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbltotalregistro)
                        .addGap(235, 235, 235)
                        .addComponent(btnrealizarpagos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnsalir)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar)
                    .addComponent(btneliminar)
                    .addComponent(btnsalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltotalregistros)
                    .addComponent(btnrealizarpagos)
                    .addComponent(lbltotalregistro)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnum_personasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum_personasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum_personasActionPerformed

    private void txtmotivo_viajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmotivo_viajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmotivo_viajeActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void btnvistahabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvistahabitacionActionPerformed
//        Jvistahabitacion form = new Jvistahabitacion();
//        form.toFront();
//        form.setVisible(true);           // TODO add your handling code here:

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
                txtcostoalojamiento.setText(rs.getString("precio"));

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el NUMERO solicitado");
            }
            conectar.close();

        } catch (Exception ex) {
            System.err.println("Error" + ex);
        }
    }//GEN-LAST:event_btnvistahabitacionActionPerformed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void btnsalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalidaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalidaActionPerformed

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        if (txtnum_personas.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar numero de personas");
            txtnum_personas.requestFocus();
            return;

        }

        if (txtmotivo_viaje.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes Seleccionar un Cliente");
            txtmotivo_viaje.requestFocus();
            return;
        }

        Dingreso dts = new Dingreso();
        Fingreso func = new Fingreso();

        dts.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
        dts.setIdcliente(Integer.parseInt(txtidcliente.getText()));

        dts.setFecha_hora_ingreso(jdfechaingreso.getText());

        dts.setNum_personas(Integer.parseInt(txtnum_personas.getText()));

        int seleccionado = cbotipo_cliente.getSelectedIndex();
        dts.setTipo_cliente((String) cbotipo_cliente.getItemAt(seleccionado));

        dts.setCostoalojamiento(Double.valueOf(txtcostoalojamiento.getText()));
        dts.setMotivo_viaje(txtmotivo_viaje.getText());

        dts.setEstado((String) comestado.getItemAt(seleccionado));

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                int opcion = JOptionPane.showConfirmDialog(rootPane, "Ingreso satisfactoriamente. ¿Desea realizar un abono?", "Confirmación", JOptionPane.YES_NO_OPTION);

                if (opcion == JOptionPane.YES_OPTION) {
                    // Abrir formulario de ab

                    Jabono formularioAbono = new Jabono();
                    formularioAbono.setVisible(true);
                }

                Fhabitacion func3 = new Fhabitacion();
                Dhabitacion dts3 = new Dhabitacion();

                dts3.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
                func3.ocupar(dts3);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error al guardar el ingreso");
            }
        }

    }//GEN-LAST:event_btningresarActionPerformed

    private void btnvistaclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvistaclienteActionPerformed
//        Jvistacliente form = new Jvistacliente();
//        form.toFront();
//        form.setVisible(true);
Cconexion conexion = new Cconexion();

        try {
            Connection conectar = conexion.establecerConexion();

            pst = conectar.prepareStatement("select * from cliente where numdocumento=?");
            pst.setString(1, txtnumdocumento.getText());

            rs = pst.executeQuery();

            if (rs.next()) {
                txtidcliente.setText(String.valueOf(rs.getInt("idcliente")));
                txtcliente.setText(rs.getString("nombres") + " " + rs.getString("apellidos"));
                txtnumdocumento.setText(rs.getString("numdocumento"));
                txttelefono.setText(rs.getString("telefono"));

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el CLIENTE solicitado");
            }

        } catch (Exception ex) {
            System.err.println("Error" + ex);
        }
    }//GEN-LAST:event_btnvistaclienteActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        if (!txtidingreso.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de Eliminar el ingreso?", "Confirmar", 2);

            if (confirmacion == 0) {
                Fingreso func = new Fingreso();
                Dingreso dts = new Dingreso();

                dts.setIdingreso(Integer.parseInt(txtidingreso.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();

            }

        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

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

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        // TODO add your handling code here:
//        btningresar.setText("Editar");
        habilitar();
        btneliminar.setEnabled(true);
        accion = "editar";

        int fila = tablalistado.rowAtPoint(evt.getPoint());

        txtidingreso.setText(tablalistado.getValueAt(fila, 0).toString());
        txtidhabitacion.setText(tablalistado.getValueAt(fila, 1).toString());
        txtnumero.setText(tablalistado.getValueAt(fila, 2).toString());
        txtidcliente.setText(tablalistado.getValueAt(fila, 3).toString());
        txtcliente.setText(tablalistado.getValueAt(fila, 4).toString());
        txttelefono.setText(tablalistado.getValueAt(fila, 5).toString());
        txtnumdocumento.setText(tablalistado.getValueAt(fila, 6).toString());
        jdfechaingreso.setText(tablalistado.getValueAt(fila, 7).toString());
        txtnum_personas.setText(tablalistado.getValueAt(fila, 8).toString());
        cbotipo_cliente.setSelectedItem(tablalistado.getValueAt(fila, 9).toString());

        txtcostoalojamiento.setText(tablalistado.getValueAt(fila, 10).toString());
        txtmotivo_viaje.setText(tablalistado.getValueAt(fila, 11).toString());
        comestado.setSelectedItem(tablalistado.getValueAt(fila, 12).toString());
//        txtnumnoches.setText(tablalistado.getValueAt(fila, 13).toString());


    }//GEN-LAST:event_tablalistadoMouseClicked

    private void txtidhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidhabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidhabitacionActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
        limpiarcajas();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void txtnumdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumdocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumdocumentoActionPerformed

    private void jdfechaingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdfechaingresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdfechaingresoActionPerformed

    private void btnabonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnabonosActionPerformed

        if (txtidingreso.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes seleccionar un ingreso para editar");
            return;
        }

        Dingreso dts = new Dingreso();
        Fingreso func = new Fingreso();

        dts.setIdingreso(Integer.parseInt(txtidingreso.getText()));
        dts.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
        dts.setIdcliente(Integer.parseInt(txtidcliente.getText()));
        dts.setFecha_hora_ingreso(jdfechaingreso.getText());
        dts.setNum_personas(Integer.parseInt(txtnum_personas.getText()));
        int seleccionado = cbotipo_cliente.getSelectedIndex();
        dts.setTipo_cliente((String) cbotipo_cliente.getItemAt(seleccionado));
        dts.setCostoalojamiento(Double.valueOf(txtcostoalojamiento.getText()));
        dts.setMotivo_viaje(txtmotivo_viaje.getText());
        dts.setEstado((String) comestado.getItemAt(seleccionado));

        if (func.editar(dts)) {
            JOptionPane.showMessageDialog(rootPane, "El ingreso fue editado satisfactoriamente");
            mostrar("");
            inhabilitar();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error al editar el ingreso");
        }


    }//GEN-LAST:event_btnabonosActionPerformed

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
            java.util.logging.Logger.getLogger(Jingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Jingreso().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnabonos;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btningresar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnrealizarpagos;
    private javax.swing.JButton btnsalida;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnvistacliente;
    public static javax.swing.JButton btnvistahabitacion;
    private javax.swing.JComboBox<String> cbotipo_cliente;
    private javax.swing.JComboBox<String> comestado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jdfechaingreso;
    private javax.swing.JLabel lbltotalregistro;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtbuscar;
    public static javax.swing.JTextField txtcliente;
    public static javax.swing.JTextField txtcostoalojamiento;
    public static javax.swing.JTextField txtempleado;
    public static javax.swing.JTextField txtidcliente;
    public static javax.swing.JTextField txtidempleado;
    public static javax.swing.JTextField txtidhabitacion;
    public static javax.swing.JTextField txtidingreso;
    private javax.swing.JTextField txtmotivo_viaje;
    private javax.swing.JTextField txtnum_personas;
    public static javax.swing.JTextField txtnumdocumento;
    public static javax.swing.JTextField txtnumero;
    public static javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttipohabitacion;
    // End of variables declaration//GEN-END:variables

}
