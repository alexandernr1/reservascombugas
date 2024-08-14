package Presentacion;

import Datos.Dinicioturno;
import Datos.Dsalidaturno;
import Datos.Tiempopro;
import Impresion.ImprimirCierreTurno;
import Logica.Cconexion;
import Logica.Finicioturno;
import Logica.Fsalidaturno;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Jsalidaturno extends javax.swing.JFrame {

    private static Jsalidaturno instance;
    Tiempopro time = new Tiempopro();
    public Boolean sesionIniciada = true;

    public Jsalidaturno() {
        initComponents();
        setTitle("CAMBIO DE TURNOS");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fechacbo();
        mostrarTiempo();
        txtbase.setText("0");
        mostrarnumeroturno();
        inhabilitar();
        txtotros_ingresos.setText("0");
        txttotal_recibos.setText("0");

    }
    public static int idusuario;
    private String accion = "guardar";

    static void inhabilitar() {
        txtidinicioturno.setVisible(false);
        txtidempleado.setVisible(false);

    }

    public void mostrarnumeroturno() {
        Fsalidaturno func = new Fsalidaturno();
        String numeroturno = func.numeroturno();
        txtnumero_turno.setText(numeroturno);
    }

    public static Jsalidaturno getInstance() {
        if (instance == null) {
            instance = new Jsalidaturno();
        }
        return instance;
    }

    public void actualizarTurno(String fecha_hora_inicio, String turno) {

        txtfecha_hora_inicio.setText(fecha_hora_inicio);
        cboturnos.setSelectedItem(turno);
    }

    private void fechacbo() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaActual = LocalDate.now().format(formatter);
        cboturnos.addItem("Turno 1" + " " + fechaActual);
        cboturnos.addItem("Turno 2" + " " + fechaActual);
        cboturnos.addItem("Turno 3" + " " + fechaActual);

    }

    private void mostrarTiempo() {

        txtfecha_hora_salida.setText(time.getFechacomp() + " " + time.getHoracomp());
    }

    public void finalizarTurno() {
        Jmenuhotel.sesionIniciada = false; // Cambiar el estado de la sesión
        Jmenuhotel.limpiarDatosUsuario();
        Finicioturno func1 = new Finicioturno();
        Dinicioturno dts1 = new Dinicioturno();

        dts1.setNumero_turno(Integer.parseInt(txtnumero_turno.getText()));
        func1.finalizarturno(dts1);
        JOptionPane.showMessageDialog(this, "Turno cerrado");
        this.setVisible(false); // Oculta el formulario
        this.dispose(); // Libera los recursos

        Jinicioturno inicio = new Jinicioturno();
        inicio.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtidturnos = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txthabitaciones_ocupadas = new javax.swing.JTextField();
        txtempleado = new javax.swing.JTextField();
        txtfecha_hora_salida = new javax.swing.JTextField();
        txtfecha_hora_inicio = new javax.swing.JTextField();
        cboturnos = new javax.swing.JComboBox<>();
        txtnumero_turno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cboestado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        buscarnumeroturno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txttotal_recibos = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtbase = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txttransferencia = new javax.swing.JTextField();
        txttarjeta = new javax.swing.JTextField();
        txtefectivo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txttotal_abonos = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txttotalhabitaciones = new javax.swing.JTextField();
        txttotal_efectivo = new javax.swing.JTextField();
        txtotros_ingresos = new javax.swing.JTextField();
        txttotal_recaudo = new javax.swing.JTextField();
        txtobservaciones = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtentrega_admon = new javax.swing.JTextField();
        txtidinicioturno = new javax.swing.JTextField();
        txtidempleado = new javax.swing.JTextField();

        txtidturnos.setText("IDT");
        txtidturnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidturnosActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(204, 204, 204));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CIERRE DE TURNO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Turno:");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Responsable:");

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("Fecha y hora de inicio:");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("Fecha y hora de salida:");

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setText("Hbitaciones ocupadas:");

        txthabitaciones_ocupadas.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txthabitaciones_ocupadas.setText("\n");
        txthabitaciones_ocupadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthabitaciones_ocupadasActionPerformed(evt);
            }
        });

        txtempleado.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        txtfecha_hora_salida.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        txtfecha_hora_inicio.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        cboturnos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboturnosKeyPressed(evt);
            }
        });

        txtnumero_turno.setEditable(false);
        txtnumero_turno.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtnumero_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumero_turnoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("Numero Turno:");

        cboestado.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Finalizado" }));
        cboestado.setEnabled(false);
        cboestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboestadoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel10.setText("Estado:");

        buscarnumeroturno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        buscarnumeroturno.setText("BUSCAR");
        buscarnumeroturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarnumeroturnoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("Total Recibos");

        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txthabitaciones_ocupadas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtempleado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtfecha_hora_salida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtfecha_hora_inicio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cboturnos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtnumero_turno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cboestado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(buscarnumeroturno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txttotal_recibos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfecha_hora_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(txtfecha_hora_salida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txthabitaciones_ocupadas, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(txttotal_recibos)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(cboturnos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addGap(6, 6, 6)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(txtnumero_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscarnumeroturno)))))
                .addGap(54, 54, 54))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboturnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtnumero_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buscarnumeroturno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addGap(5, 5, 5)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtfecha_hora_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txthabitaciones_ocupadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtfecha_hora_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txttotal_recibos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "FORMA DE PAGO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N

        txtbase.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtbase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbaseActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setText("Base:");

        jLabel9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel9.setText("Transferencias:");

        jLabel11.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel11.setText("Tarjetas:");

        txttransferencia.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        txttarjeta.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        txtefectivo.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel19.setText("Efectivo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbase, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtefectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtefectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txttarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "VALORES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N

        txttotal_abonos.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel12.setText("Total habitaciones:");

        jLabel13.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel13.setText("Total abonos:");

        jLabel14.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel14.setText("Otros ingresos:");

        jLabel15.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel15.setText("Total recaudado:");

        jLabel16.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel16.setText("Efectivo liquido:");

        jLabel17.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel17.setText("Total cambio habit:");

        jLabel18.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel18.setText("Observaciones:");

        txttotalhabitaciones.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        txttotal_efectivo.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txttotal_efectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotal_efectivoActionPerformed(evt);
            }
        });

        txtotros_ingresos.setEditable(false);
        txtotros_ingresos.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        txttotal_recaudo.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        txtobservaciones.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.GIF"))); // NOI18N
        jButton1.setText("NUEVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        jButton2.setText("GUARDAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtentrega_admon.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtentrega_admon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtentrega_admonActionPerformed(evt);
            }
        });

        txtidinicioturno.setText("IDI");
        txtidinicioturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidinicioturnoActionPerformed(evt);
            }
        });

        txtidempleado.setText("IDE");
        txtidempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidempleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttotalhabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(txttotal_abonos)
                            .addComponent(txtentrega_admon))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttotal_recaudo, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(txtotros_ingresos)
                            .addComponent(txttotal_efectivo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtobservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtidinicioturno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txttotalhabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtotros_ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txttotal_abonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotal_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txtentrega_admon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txttotal_recaudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(txtobservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtidinicioturno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txthabitaciones_ocupadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthabitaciones_ocupadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthabitaciones_ocupadasActionPerformed

    private void txtidturnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidturnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidturnosActionPerformed

    private void txtbaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbaseActionPerformed

    }//GEN-LAST:event_txtbaseActionPerformed

    private void txtentrega_admonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtentrega_admonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtentrega_admonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Dsalidaturno dts = new Dsalidaturno();
        Fsalidaturno func = new Fsalidaturno();

        dts.setEmpleado(txtempleado.getText());

        int seleccionado = cboturnos.getSelectedIndex();
        dts.setTurno((String) cboturnos.getItemAt(seleccionado));

        dts.setFecha_hora_inicio(txtfecha_hora_inicio.getText());
        dts.setFecha_hora_salida(txtfecha_hora_salida.getText());
        dts.setHabitaciones_ocupadas(Integer.parseInt(txthabitaciones_ocupadas.getText()));
        dts.setTotal_recibos(Integer.parseInt(txttotal_recibos.getText()));
        dts.setBase(Integer.parseInt(txtbase.getText()));
        dts.setTarjetas(Integer.parseInt(txttarjeta.getText()));
        dts.setEfectivo(Integer.parseInt(txtefectivo.getText()));
        dts.setTransferencias(Integer.parseInt(txttransferencia.getText()));
        dts.setTotalhabitaciones(Double.parseDouble(txttotalhabitaciones.getText()));
        dts.setTotal_abonos(Integer.parseInt(txttotal_abonos.getText()));
        dts.setOtros_ingresos(Integer.parseInt(txtotros_ingresos.getText()));
        dts.setTotal_recaudo(Integer.parseInt(txttotal_recaudo.getText()));
        dts.setEntrega_admon(Integer.parseInt(txtentrega_admon.getText()));
        dts.setTotal_efectivo(Integer.parseInt(txttotal_efectivo.getText()));
        dts.setObservaciones(txtobservaciones.getText());
        dts.setNumero_turno(Integer.parseInt(txtnumero_turno.getText()));
//        dts.setEstado((String) cboestado.getItemAt(seleccionado));

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
//                JOptionPane.showMessageDialog(rootPane, "Salida de turno satisfactoriamente");

                finalizarTurno();
                ImprimirCierreTurno imprimir = new ImprimirCierreTurno();
                imprimir.ImprimirCierreTurno();
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cboturnosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboturnosKeyPressed

// TODO add your handling code here:
    }//GEN-LAST:event_cboturnosKeyPressed

    private void txtidinicioturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidinicioturnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidinicioturnoActionPerformed

    private void txtnumero_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumero_turnoActionPerformed
        // Generar el número de turno
    }//GEN-LAST:event_txtnumero_turnoActionPerformed

    private void cboestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboestadoActionPerformed

    private void buscarnumeroturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarnumeroturnoActionPerformed

        try {
            Fsalidaturno func = new Fsalidaturno();

            ResultSet rs = new Fsalidaturno().realizarConsulta(txtnumero_turno.getText());
            if (rs.next()) {
                //obtener datos inicio de turno.

                txtidinicioturno.setText(String.valueOf(rs.getInt("idinicioturno")));
                txtnumero_turno.setText(String.valueOf(rs.getString("numero_turno")));
                txtfecha_hora_inicio.setText(rs.getString("fecha_hora_inicio"));
                txtempleado.setText(String.valueOf(rs.getString("empleado")));
                String estado = rs.getString("estado");
                cboestado.setSelectedItem(estado);
                // Actualizar los JLabel en Jmenuhotel
                Jmenuhotel.actualizarFecha(txtfecha_hora_inicio.getText());
                Jmenuhotel.actualizarTurno(txtnumero_turno.getText());
                Jmenuhotel.actualizarEmpleado(txtempleado.getText());
                Jmenuhotel.actualizarEstado((String) cboestado.getSelectedItem());

                estado = func.estadoturno();
                cboestado.setSelectedItem(estado);

                //obtener numero de habitaciones ocupadas.
                int totalHabitacionesOcupadas = func.obtenerTotalHabitacionesOcupadas();
                txthabitaciones_ocupadas.setText(String.valueOf(totalHabitacionesOcupadas));

                //obtener precio de habitaciones ocupadas.
                double preciohabitacionesocupadas = func.obtenerCostoTotalAlojamiento();
                txttotalhabitaciones.setText(String.valueOf(preciohabitacionesocupadas));

                String numeroTurnoActualizado = func.numeroturno();
                txtnumero_turno.setText(numeroTurnoActualizado);

                int numeroturno = Integer.parseInt(txtnumero_turno.getText());
                int[] totalesMediosPago = func.totalmedio_pagos(numeroturno);
                txtefectivo.setText(String.valueOf(totalesMediosPago[0]));
                txttarjeta.setText(String.valueOf(totalesMediosPago[1]));
                txttransferencia.setText(String.valueOf(totalesMediosPago[2]));

                int entregaadmon = Integer.parseInt(txtefectivo.getText());
                txtentrega_admon.setText((String.valueOf(entregaadmon)));

                int numero = Integer.parseInt(txtnumero_turno.getText());

                int totalAbono = func.totalAbonos(numero);
                txttotal_abonos.setText((String.valueOf(totalAbono)));

                int otrosCobros = Integer.parseInt(txtotros_ingresos.getText());

                int inicioturno3 = Integer.parseInt(txtnumero_turno.getText());
                int deuda_anterior = func.sumaDeudaAnterior(inicioturno3);
                txttotal_efectivo.setText((String.valueOf(deuda_anterior)));
                
                // calculo de suma de toteles deuda anterior
                int inicioturno2 = Integer.parseInt(txtnumero_turno.getText());
                int netorecaudado = func.sumatotales(inicioturno2);

                int totalrecaudo = (totalesMediosPago[0] + totalesMediosPago[1] + totalesMediosPago[2] + totalAbono + otrosCobros + netorecaudado);
                txttotal_recaudo.setText((String.valueOf(totalrecaudo)));

                int inicioturno1 = Integer.parseInt(txtnumero_turno.getText());
                String empleado1 = func.Consultaempleado(inicioturno1);
                txtempleado.setText((String.valueOf(empleado1)));

            }

        } catch (HeadlessException | SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        }

    }//GEN-LAST:event_buscarnumeroturnoActionPerformed

    private void txtidempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidempleadoActionPerformed

    private void txttotal_efectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotal_efectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotal_efectivoActionPerformed



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
            java.util.logging.Logger.getLogger(Jsalidaturno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jsalidaturno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jsalidaturno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jsalidaturno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Jsalidaturno().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarnumeroturno;
    private javax.swing.JComboBox<String> cboestado;
    private javax.swing.JComboBox<String> cboturnos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextField txtbase;
    private javax.swing.JTextField txtefectivo;
    public static javax.swing.JTextField txtempleado;
    private javax.swing.JTextField txtentrega_admon;
    private javax.swing.JTextField txtfecha_hora_inicio;
    private javax.swing.JTextField txtfecha_hora_salida;
    private javax.swing.JTextField txthabitaciones_ocupadas;
    public static javax.swing.JTextField txtidempleado;
    public static javax.swing.JTextField txtidinicioturno;
    private javax.swing.JTextField txtidturnos;
    private javax.swing.JTextField txtnumero_turno;
    private javax.swing.JTextField txtobservaciones;
    private javax.swing.JTextField txtotros_ingresos;
    private javax.swing.JTextField txttarjeta;
    private javax.swing.JTextField txttotal_abonos;
    private javax.swing.JTextField txttotal_efectivo;
    private javax.swing.JTextField txttotal_recaudo;
    private javax.swing.JTextField txttotal_recibos;
    private javax.swing.JTextField txttotalhabitaciones;
    private javax.swing.JTextField txttransferencia;
    // End of variables declaration//GEN-END:variables
}
