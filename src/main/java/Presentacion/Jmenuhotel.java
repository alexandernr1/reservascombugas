package Presentacion;

import Logica.ActualizadorColores;
import Logica.Fhabitacion;
import Logica.Finicioturno;
import static Presentacion.Jmenuprin.lblacceso;
import static Presentacion.Jmenuprin.lblapellidos;
import static Presentacion.Jmenuprin.lblidpersona;
import static Presentacion.Jmenuprin.lblnombres;
import java.awt.Color;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

public final class Jmenuhotel extends javax.swing.JInternalFrame {

    public static Boolean sesionIniciada = false;
    public Fhabitacion fcn;
    private static Jmenuhotel instance;
    private Jcliente clienteFormulario;
    private Jmanejoreservas reservaFormulario;
    private Jingreso ingresoFormulario;
    private Jabono abonoFormulario;
    private Jlistaespera esperaFormulario;
    private Jsalidahuesped salidaFormulario;
    private Jlimpieza limpiezaFormulario;
    private Jsalidaturno salidaturno;

    public Jmenuhotel() {

        initComponents();

        this.fcn = new Fhabitacion();

        inhabilitar();
        ActualizadorColores actualizador = new ActualizadorColores(this);
        Thread thread = new Thread(actualizador);
        actualizador.iniciarHilo();
        thread.start();

    }

    public static Jmenuhotel getInstance() {
        if (instance == null) {
            instance = new Jmenuhotel();
        }
        return instance;
    }

    static void actualizarDatosUsuario1(String fecha, String turno, String empleado, String estado) {
        lblfecha.setText(fecha);
        lblturnos.setText(turno);
        lblempleado.setText(empleado);
        lblestado.setText(estado);

    }

    public static void limpiarDatosUsuario() {
        lblfecha.setText("");
        lblturnos.setText("");
        lblempleado.setText("");
        lblestado.setText("");
    }

    // Métodos para actualizar los JLabel
    public static void actualizarFecha(String fecha) {
        lblfecha.setText(fecha);
    }

    public static void actualizarTurno(String turno) {
        lblturnos.setText(turno);
    }

    public static void actualizarEmpleado(String empleado) {
        lblempleado.setText(empleado);
    }

    public static void actualizarEstado(String estado) {
        lblestado.setText(estado);
    }

    public static int idusuario;

    static void inhabilitar() {
        lblidpersona.setVisible(false);
        lblacceso.setVisible(false);

    }

    public void metodoDondeSeNecesitaFormLogin() {
        // Inicialización de formLogin
        Jinicioturno formLogin = new Jinicioturno();

        // Intento de deshabilitar formLogin
        formLogin.setEnabled(false);
    }

    public void actualizarColoresBotones() {

        Component[] componentes = pnlBotones.getComponents();
        Pattern pattern = Pattern.compile("\\d+"); // Patrón para solo números

        for (Component componente : componentes) {
            if (componente instanceof JToggleButton boton) {
                String nombreBoton = boton.getText();
                if (pattern.matcher(nombreBoton).matches()) { // Verifica si el texto es solo números
                    int idHabitacion = Integer.parseInt(nombreBoton);
                    String estadoHabitacion = fcn.obtenerEstadoHabitacion(idHabitacion);

                    switch (estadoHabitacion) {
                        case "Disponible" ->
                            boton.setBackground(Color.green);
                        case "Ocupado" ->
                            boton.setBackground(Color.RED);
                        case "Reserva" ->
                            boton.setBackground(Color.YELLOW);
                        case "Mantenimiento" ->
                            boton.setBackground(Color.orange);
                        case "Limpieza" ->
                            boton.setBackground(Color.BLUE);
                        default ->
                            boton.setBackground(Color.WHITE);
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jpmenu = new javax.swing.JPanel();
        btncambioturno = new javax.swing.JButton();
        btnlistaespera = new javax.swing.JButton();
        btnlimpieza = new javax.swing.JButton();
        btnsalidahuesped = new javax.swing.JButton();
        btningresohuesped = new javax.swing.JButton();
        btnregistro = new javax.swing.JButton();
        btnreservas = new javax.swing.JButton();
        btnsalidaAcompañante = new javax.swing.JButton();
        btnpagos = new javax.swing.JButton();
        pnlBotones = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton21 = new javax.swing.JToggleButton();
        jToggleButton22 = new javax.swing.JToggleButton();
        jToggleButton23 = new javax.swing.JToggleButton();
        jToggleButton24 = new javax.swing.JToggleButton();
        jToggleButton27 = new javax.swing.JToggleButton();
        jToggleButton28 = new javax.swing.JToggleButton();
        jToggleButton25 = new javax.swing.JToggleButton();
        jToggleButton26 = new javax.swing.JToggleButton();
        jToggleButton29 = new javax.swing.JToggleButton();
        jToggleButton = new javax.swing.JToggleButton();
        jToggleButton210 = new javax.swing.JToggleButton();
        jToggleButton38 = new javax.swing.JToggleButton();
        jToggleButton39 = new javax.swing.JToggleButton();
        jToggleButton312 = new javax.swing.JToggleButton();
        jToggleButton311 = new javax.swing.JToggleButton();
        jToggleButton310 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jToggleButtonrojo = new javax.swing.JToggleButton();
        jToggleButtonamarillo = new javax.swing.JToggleButton();
        jToggleButtonnaranja = new javax.swing.JToggleButton();
        jToggleButtonverde = new javax.swing.JToggleButton();
        jToggleButtonazul = new javax.swing.JToggleButton();
        jToggleButton32 = new javax.swing.JToggleButton();
        jToggleButton33 = new javax.swing.JToggleButton();
        jToggleButton031 = new javax.swing.JToggleButton();
        jToggleButton36 = new javax.swing.JToggleButton();
        jToggleButton35 = new javax.swing.JToggleButton();
        jToggleButton34 = new javax.swing.JToggleButton();
        jToggleButton37 = new javax.swing.JToggleButton();
        lblfecha = new javax.swing.JLabel();
        lblturnos = new javax.swing.JLabel();
        lblempleado = new javax.swing.JLabel();
        lblestado = new javax.swing.JLabel();
        cboinformes = new javax.swing.JComboBox<>();
        btnconsultas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setVisible(true);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jpmenu.setBackground(new java.awt.Color(0, 204, 204));
        jpmenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncambioturno.setBackground(new java.awt.Color(0, 204, 204));
        btncambioturno.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btncambioturno.setForeground(new java.awt.Color(0, 0, 102));
        btncambioturno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rotacion.png"))); // NOI18N
        btncambioturno.setText("CAMBIO DE TURNO");
        btncambioturno.setBorder(null);
        btncambioturno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btncambioturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncambioturnoActionPerformed(evt);
            }
        });
        jpmenu.add(btncambioturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 180, 40));

        btnlistaespera.setBackground(new java.awt.Color(0, 204, 204));
        btnlistaespera.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnlistaespera.setForeground(new java.awt.Color(0, 0, 102));
        btnlistaespera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gestion_del_tiempo.png"))); // NOI18N
        btnlistaespera.setText("LISTA DE ESPERA");
        btnlistaespera.setBorder(null);
        btnlistaespera.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnlistaespera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistaesperaActionPerformed(evt);
            }
        });
        jpmenu.add(btnlistaespera, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 180, 40));

        btnlimpieza.setBackground(new java.awt.Color(0, 204, 204));
        btnlimpieza.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnlimpieza.setForeground(new java.awt.Color(0, 0, 102));
        btnlimpieza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpieza.png"))); // NOI18N
        btnlimpieza.setText("LiMPIEZA");
        btnlimpieza.setBorder(null);
        btnlimpieza.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnlimpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiezaActionPerformed(evt);
            }
        });
        jpmenu.add(btnlimpieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 180, 40));

        btnsalidahuesped.setBackground(new java.awt.Color(0, 204, 204));
        btnsalidahuesped.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnsalidahuesped.setForeground(new java.awt.Color(0, 0, 102));
        btnsalidahuesped.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida-de-emergencia.png"))); // NOI18N
        btnsalidahuesped.setText("SALIDA HUESPED");
        btnsalidahuesped.setBorder(null);
        btnsalidahuesped.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnsalidahuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalidahuespedActionPerformed(evt);
            }
        });
        jpmenu.add(btnsalidahuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 180, 40));

        btningresohuesped.setBackground(new java.awt.Color(0, 204, 204));
        btningresohuesped.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btningresohuesped.setForeground(new java.awt.Color(0, 0, 102));
        btningresohuesped.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrada_del_metro.png"))); // NOI18N
        btningresohuesped.setText("INGRESO HUESPED");
        btningresohuesped.setBorder(null);
        btningresohuesped.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btningresohuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresohuespedActionPerformed(evt);
            }
        });
        jpmenu.add(btningresohuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, 40));

        btnregistro.setBackground(new java.awt.Color(0, 204, 204));
        btnregistro.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnregistro.setForeground(new java.awt.Color(0, 0, 102));
        btnregistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.png"))); // NOI18N
        btnregistro.setText("REGISTRO");
        btnregistro.setActionCommand("     REGISTRO");
        btnregistro.setBorder(null);
        btnregistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnregistro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistroActionPerformed(evt);
            }
        });
        jpmenu.add(btnregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, 40));

        btnreservas.setBackground(new java.awt.Color(0, 204, 204));
        btnreservas.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnreservas.setForeground(new java.awt.Color(0, 0, 102));
        btnreservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reserva.png"))); // NOI18N
        btnreservas.setText("RESERVAS");
        btnreservas.setBorder(null);
        btnreservas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnreservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreservasActionPerformed(evt);
            }
        });
        jpmenu.add(btnreservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 180, 40));

        btnsalidaAcompañante.setBackground(new java.awt.Color(0, 204, 204));
        btnsalidaAcompañante.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnsalidaAcompañante.setForeground(new java.awt.Color(0, 0, 102));
        btnsalidaAcompañante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amistoso.png"))); // NOI18N
        btnsalidaAcompañante.setText("SALIDA ACOMPAÑANTE");
        btnsalidaAcompañante.setBorder(null);
        btnsalidaAcompañante.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnsalidaAcompañante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalidaAcompañanteActionPerformed(evt);
            }
        });
        jpmenu.add(btnsalidaAcompañante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 180, 40));

        btnpagos.setBackground(new java.awt.Color(0, 204, 204));
        btnpagos.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnpagos.setForeground(new java.awt.Color(0, 0, 102));
        btnpagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarjeta_de_debito.png"))); // NOI18N
        btnpagos.setText("ABONOS");
        btnpagos.setBorder(null);
        btnpagos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnpagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagosActionPerformed(evt);
            }
        });
        jpmenu.add(btnpagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 180, 40));

        pnlBotones.setBackground(new java.awt.Color(225, 238, 247));
        pnlBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton1.setText("1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 148, 60, 47));

        jToggleButton2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton2.setText("2");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 148, 60, 47));

        jToggleButton3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton3.setText("3");
        pnlBotones.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 148, 59, 47));

        jToggleButton4.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton4.setText("4");
        pnlBotones.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 148, 60, 47));

        jToggleButton5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton5.setText("5");
        pnlBotones.add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 148, 59, 47));

        jToggleButton6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton6.setText("6");
        pnlBotones.add(jToggleButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 65, 47));

        jToggleButton7.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton7.setText("7");
        pnlBotones.add(jToggleButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 203, 65, 36));

        jToggleButton8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton8.setText("8");
        pnlBotones.add(jToggleButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 106, 126, 37));

        jToggleButton9.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton9.setText("9");
        pnlBotones.add(jToggleButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 106, 59, 37));

        jLabel3.setBackground(new java.awt.Color(0, 255, 255));
        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("SEGUNDO PISO");
        pnlBotones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 71, 103, 28));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("PRIMER PISO");
        pnlBotones.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 71, 103, 28));

        jToggleButton10.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton10.setText("10");
        pnlBotones.add(jToggleButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 105, 60, -1));

        jToggleButton11.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton11.setText("11");
        pnlBotones.add(jToggleButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 105, 59, -1));

        jToggleButton12.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton12.setText("12");
        pnlBotones.add(jToggleButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, 65, -1));

        jToggleButton21.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton21.setText("21");
        jToggleButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton21ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 161, 64, 47));

        jToggleButton22.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton22.setText("22");
        jToggleButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton22ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 161, 65, 47));

        jToggleButton23.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton23.setText("23");
        pnlBotones.add(jToggleButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 161, 64, 47));

        jToggleButton24.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton24.setText("24");
        pnlBotones.add(jToggleButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 161, 64, 47));

        jToggleButton27.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton27.setText("27");
        pnlBotones.add(jToggleButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 105, 64, 50));

        jToggleButton28.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton28.setText("28");
        pnlBotones.add(jToggleButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 105, 65, 50));

        jToggleButton25.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton25.setText("25");
        pnlBotones.add(jToggleButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 161, 60, 47));

        jToggleButton26.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton26.setText("26");
        pnlBotones.add(jToggleButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 161, 80, 65));

        jToggleButton29.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton29.setText("29");
        pnlBotones.add(jToggleButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 105, 64, 50));

        jToggleButton.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton.setText("211");
        pnlBotones.add(jToggleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 105, 80, 50));

        jToggleButton210.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton210.setText("210");
        pnlBotones.add(jToggleButton210, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 105, 130, 50));

        jToggleButton38.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton38.setText("38");
        pnlBotones.add(jToggleButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 297, 114, 40));

        jToggleButton39.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton39.setText("39");
        jToggleButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton39ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 297, 61, 40));

        jToggleButton312.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton312.setText("312");
        pnlBotones.add(jToggleButton312, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 297, -1, -1));

        jToggleButton311.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton311.setText("311");
        pnlBotones.add(jToggleButton311, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 297, -1, -1));

        jToggleButton310.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton310.setText("310");
        pnlBotones.add(jToggleButton310, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 297, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("TERCER PISO");
        pnlBotones.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 257, 103, 28));

        jToggleButtonrojo.setBackground(new java.awt.Color(255, 0, 0));
        jToggleButtonrojo.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButtonrojo.setText("OCUPADA");

        jToggleButtonamarillo.setBackground(new java.awt.Color(255, 255, 0));
        jToggleButtonamarillo.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButtonamarillo.setText("RESERVADA");

        jToggleButtonnaranja.setBackground(new java.awt.Color(255, 102, 0));
        jToggleButtonnaranja.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButtonnaranja.setText("MANTENIMIENTO");

        jToggleButtonverde.setBackground(new java.awt.Color(0, 204, 0));
        jToggleButtonverde.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButtonverde.setText("DISPONIBLE");

        jToggleButtonazul.setBackground(new java.awt.Color(51, 0, 255));
        jToggleButtonazul.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonazul.setText("LIMPIEZA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButtonrojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButtonamarillo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButtonnaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonverde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButtonazul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButtonverde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButtonrojo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButtonamarillo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButtonnaranja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButtonazul)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnlBotones.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 268, -1, -1));

        jToggleButton32.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton32.setText("32");
        jToggleButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton32ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 396, -1, 50));

        jToggleButton33.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton33.setText("33");
        pnlBotones.add(jToggleButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 343, -1, 47));

        jToggleButton031.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton031.setText("31");
        jToggleButton031.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton031ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton031, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 343, -1, 47));

        jToggleButton36.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton36.setText("36");
        pnlBotones.add(jToggleButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 343, 66, 47));

        jToggleButton35.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton35.setText("35");
        pnlBotones.add(jToggleButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 343, 65, 47));

        jToggleButton34.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton34.setText("34");
        pnlBotones.add(jToggleButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 343, 61, 47));

        jToggleButton37.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton37.setText("37");
        pnlBotones.add(jToggleButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 343, 66, 60));

        lblfecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblfecha.setText("fecha");

        lblturnos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblturnos.setText("turnos");

        lblempleado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblempleado.setText("empleado");

        lblestado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblestado.setText("estado");

        cboinformes.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cboinformes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reservas", "Salidas", " ", " " }));
        cboinformes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboinformesMouseClicked(evt);
            }
        });
        cboinformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboinformesActionPerformed(evt);
            }
        });

        btnconsultas.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnconsultas.setText("CONSULTAR");
        btnconsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultasActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\logo combugas.png")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("Fecha:");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setText("Empleado:");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setText("Estado:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel10.setText("Turno:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel10))
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblempleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(280, 280, 280))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblturnos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(cboinformes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnconsultas))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblestado, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboinformes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnconsultas)))
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblfecha)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblturnos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblempleado)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblestado)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalidahuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalidahuespedActionPerformed

        if (salidaFormulario == null || !salidaFormulario.isVisible()) {
            // Si no está abierto, crea una nueva instancia o usa el Singleton
            salidaFormulario = Jsalidahuesped.getInstance(); // Usando Singleton
            salidaFormulario.setVisible(true);
        } else {
            // Si ya está abierto, enfócalo
            salidaFormulario.setExtendedState(JFrame.NORMAL); // Restaurar si está minimizado
            salidaFormulario.toFront(); // Traer al frente
            salidaFormulario.requestFocus(); // Solicitar foco
        }

        Jsalidahuesped.txtempleado.setText(lblempleado.getText());

    }//GEN-LAST:event_btnsalidahuespedActionPerformed

    private void btnregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistroActionPerformed

        if (clienteFormulario == null || !clienteFormulario.isVisible()) {
            // Si no está abierto, crea una nueva instancia o usa el Singleton
            clienteFormulario = Jcliente.getInstance(); // Usando Singleton
            clienteFormulario.setVisible(true);
        } else {
            // Si ya está abierto, enfócalo
            clienteFormulario.setExtendedState(JFrame.NORMAL); // Restaurar si está minimizado
            clienteFormulario.toFront(); // Traer al frente
            clienteFormulario.requestFocus(); // Solicitar foco
        }

    }//GEN-LAST:event_btnregistroActionPerformed

    private void btnreservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservasActionPerformed

        if (reservaFormulario == null || !reservaFormulario.isVisible()) {
            // Si no está abierto, crea una nueva instancia o usa el Singleton
            reservaFormulario = Jmanejoreservas.getInstance(); // Usando Singleton
            reservaFormulario.setVisible(true);
        } else {
            // Si ya está abierto, enfócalo
            reservaFormulario.setExtendedState(JFrame.NORMAL); // Restaurar si está minimizado
            reservaFormulario.toFront(); // Traer al frente
            reservaFormulario.requestFocus(); // Solicitar foco
        }

        Jmanejoreservas.txtempleado.setText(lblempleado.getText());


    }//GEN-LAST:event_btnreservasActionPerformed

    private void btningresohuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresohuespedActionPerformed

        if (ingresoFormulario == null || !ingresoFormulario.isVisible()) {
            // Si no está abierto, crea una nueva instancia o usa el Singleton
            ingresoFormulario = Jingreso.getInstance(); // Usando Singleton
            ingresoFormulario.setVisible(true);
        } else {
            // Si ya está abierto, enfócalo
            ingresoFormulario.setExtendedState(JFrame.NORMAL); // Restaurar si está minimizado
            ingresoFormulario.toFront(); // Traer al frente
            ingresoFormulario.requestFocus(); // Solicitar foco
        }

        Jingreso.txtempleado.setText(lblempleado.getText());


    }//GEN-LAST:event_btningresohuespedActionPerformed

    private void btnpagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagosActionPerformed

        if (abonoFormulario == null || !abonoFormulario.isVisible()) {
            // Si no está abierto, crea una nueva instancia o usa el Singleton
            abonoFormulario = Jabono.getInstance(); // Usando Singleton
            abonoFormulario.setVisible(true);
        } else {
            // Si ya está abierto, enfócalo
            abonoFormulario.setExtendedState(JFrame.NORMAL); // Restaurar si está minimizado
            abonoFormulario.toFront(); // Traer al frente
            abonoFormulario.requestFocus(); // Solicitar foco
        }
    }//GEN-LAST:event_btnpagosActionPerformed

    private void btnlistaesperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistaesperaActionPerformed

        if (esperaFormulario == null || !esperaFormulario.isVisible()) {
            // Si no está abierto, crea una nueva instancia o usa el Singleton
            esperaFormulario = Jlistaespera.getInstance(); // Usando Singleton
            esperaFormulario.setVisible(true);
        } else {
            // Si ya está abierto, enfócalo
            esperaFormulario.setExtendedState(JFrame.NORMAL); // Restaurar si está minimizado
            esperaFormulario.toFront(); // Traer al frente
            esperaFormulario.requestFocus(); // Solicitar foco
        }

        Jlistaespera.txtempleado.setText(lblempleado.getText());

    }//GEN-LAST:event_btnlistaesperaActionPerformed

    private void btncambioturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncambioturnoActionPerformed

        Finicioturno finicio = new Finicioturno();

        if (sesionIniciada) {
            // Si la sesión no está iniciada, mostrar el formulario de inicio de sesión

//            Jsalidaturno formTurnos = Jsalidaturno.getInstance();
//            formTurnos.toFront();
//            formTurnos.setVisible(true);
            if (salidaturno == null || !salidaturno.isVisible()) {
                // Si no está abierto, crea una nueva instancia o usa el Singleton
                salidaturno = Jsalidaturno.getInstance(); // Usando Singleton
                salidaturno.setVisible(true);
            } else {
                // Si ya está abierto, enfócalo
                salidaturno.setExtendedState(JFrame.NORMAL); // Restaurar si está minimizado
                salidaturno.toFront(); // Traer al frente
                salidaturno.requestFocus(); // Solicitar foco
            }
            Jsalidaturno.txtidempleado.setText(lblidpersona.getText());
            Jsalidaturno.txtempleado.setText(lblnombres.getText() + " " + lblapellidos.getText());
            // Si la sesión ya está iniciada, mostrar el formulario Jsalidaturno
            metodoDondeSeNecesitaFormLogin();
        } else {
            if (finicio.hayTurnoActivo()) {
                JOptionPane.showMessageDialog(null, "Hay un turno activo. Debe finalizar el turno actual antes de iniciar uno nuevo.");
                Jsalidaturno formTurnos = Jsalidaturno.getInstance();
                formTurnos.toFront();
                formTurnos.setVisible(true);
                Jsalidaturno.txtidempleado.setText(lblidpersona.getText());
                Jsalidaturno.txtempleado.setText(lblnombres.getText() + " " + lblapellidos.getText());
            } else {
                Jinicioturno formLogin = new Jinicioturno();
                formLogin.toFront();
                formLogin.setVisible(true);
            }
        }

    }//GEN-LAST:event_btncambioturnoActionPerformed

    private void btnlimpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiezaActionPerformed

        if (limpiezaFormulario == null || !limpiezaFormulario.isVisible()) {
            // Si no está abierto, crea una nueva instancia o usa el Singleton
            limpiezaFormulario = Jlimpieza.getInstance(); // Usando Singleton
            limpiezaFormulario.setVisible(true);
        } else {
            // Si ya está abierto, enfócalo
            limpiezaFormulario.setExtendedState(JFrame.NORMAL); // Restaurar si está minimizado
            limpiezaFormulario.toFront(); // Traer al frente
            limpiezaFormulario.requestFocus(); // Solicitar foco
        }

    }//GEN-LAST:event_btnlimpiezaActionPerformed

    private void cboinformesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboinformesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cboinformesMouseClicked

    private void cboinformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboinformesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboinformesActionPerformed

    private void btnconsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultasActionPerformed
        if (cboinformes.getSelectedItem() != null) {
            String selectedItem = (String) cboinformes.getSelectedItem();
            // Verificar el elemento seleccionado y realizar la acción correspondiente
            if (selectedItem.equals("Salidas")) {
                Jvistasalida frameSalida = new Jvistasalida();
                frameSalida.toFront();
                frameSalida.setVisible(true);

            } else if (selectedItem.equals("Ingresos")) {
//                Jvistaingreso frameingreso = new Jvistaingreso();
//                frameingreso.toFront();
//                frameingreso.setVisible(true);

            } else if (selectedItem.equals("Reservas")) {
                Jvistareservas framereservas = new Jvistareservas();
                framereservas.toFront();
                framereservas.setVisible(true);

            } else if (selectedItem.equals("Abonos")) {

                JOptionPane.showMessageDialog(this, "Seleccione una opción válida", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (selectedItem.equals("")) {

            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnconsultasActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton21ActionPerformed

    private void jToggleButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton22ActionPerformed

    private void jToggleButton031ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton031ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton031ActionPerformed

    private void jToggleButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton32ActionPerformed

    private void jToggleButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton39ActionPerformed

    private void btnsalidaAcompañanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalidaAcompañanteActionPerformed
        Jsalidaacompañante salida = new Jsalidaacompañante();
        salida.toFront();
        salida.setVisible(true);
    }//GEN-LAST:event_btnsalidaAcompañanteActionPerformed

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
            java.util.logging.Logger.getLogger(Jmenuhotel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jmenuhotel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jmenuhotel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jmenuhotel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            // new Jmenuhotel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncambioturno;
    private javax.swing.JButton btnconsultas;
    private javax.swing.JButton btningresohuesped;
    private javax.swing.JButton btnlimpieza;
    private javax.swing.JButton btnlistaespera;
    private javax.swing.JButton btnpagos;
    private javax.swing.JButton btnregistro;
    private javax.swing.JButton btnreservas;
    private javax.swing.JButton btnsalidaAcompañante;
    private javax.swing.JButton btnsalidahuesped;
    private javax.swing.JComboBox<String> cboinformes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton;
    private javax.swing.JToggleButton jToggleButton031;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton21;
    private javax.swing.JToggleButton jToggleButton210;
    private javax.swing.JToggleButton jToggleButton22;
    private javax.swing.JToggleButton jToggleButton23;
    private javax.swing.JToggleButton jToggleButton24;
    private javax.swing.JToggleButton jToggleButton25;
    private javax.swing.JToggleButton jToggleButton26;
    private javax.swing.JToggleButton jToggleButton27;
    private javax.swing.JToggleButton jToggleButton28;
    private javax.swing.JToggleButton jToggleButton29;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton310;
    private javax.swing.JToggleButton jToggleButton311;
    private javax.swing.JToggleButton jToggleButton312;
    private javax.swing.JToggleButton jToggleButton32;
    private javax.swing.JToggleButton jToggleButton33;
    private javax.swing.JToggleButton jToggleButton34;
    private javax.swing.JToggleButton jToggleButton35;
    private javax.swing.JToggleButton jToggleButton36;
    private javax.swing.JToggleButton jToggleButton37;
    private javax.swing.JToggleButton jToggleButton38;
    private javax.swing.JToggleButton jToggleButton39;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    private javax.swing.JToggleButton jToggleButtonamarillo;
    private javax.swing.JToggleButton jToggleButtonazul;
    private javax.swing.JToggleButton jToggleButtonnaranja;
    private javax.swing.JToggleButton jToggleButtonrojo;
    private javax.swing.JToggleButton jToggleButtonverde;
    private javax.swing.JPanel jpmenu;
    public static javax.swing.JLabel lblempleado;
    public static javax.swing.JLabel lblestado;
    public static javax.swing.JLabel lblfecha;
    public static javax.swing.JLabel lblturnos;
    public static javax.swing.JPanel pnlBotones;
    // End of variables declaration//GEN-END:variables

}
