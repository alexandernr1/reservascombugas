package Presentacion;

import Logica.ActualizadorColores;
import Logica.Fhabitacion;
import Logica.Finicioturno;
import static Presentacion.Jmenuprin.lblacceso;
import static Presentacion.Jmenuprin.lblidpersona;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
    private static Jvistasalida frameSalida;
    private static Jvistaingreso frameIngreso;
    private static Jvistareservas frameReservas;
    private static JVistaAbonos formAbonos;
    private static JvistaHbitacionesOcupadas frameOcupadas;
     private Jregistro_factura_electronica factura;
      public static String idcliente = "";

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
                            boton.setBackground(new Color(144, 238, 144)); // Light green
                        case "Ocupado" ->
                            boton.setBackground(new Color(255, 99, 71)); // Light coral (soft red)
                        case "Reserva" ->
                            boton.setBackground(new Color(255, 255, 102)); // Light yellow
                        case "Mantenimiento" ->
                            boton.setBackground(new Color(255, 165, 79)); // Light orange
                        case "Limpieza" ->
                            boton.setBackground(new Color(0, 204, 255)); // Light sky blue
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
        btnpagos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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
        jToggleButtonazul = new javax.swing.JToggleButton();
        jToggleButtonverde = new javax.swing.JToggleButton();
        jToggleButton32 = new javax.swing.JToggleButton();
        jToggleButton33 = new javax.swing.JToggleButton();
        jToggleButton031 = new javax.swing.JToggleButton();
        jToggleButton36 = new javax.swing.JToggleButton();
        jToggleButton35 = new javax.swing.JToggleButton();
        jToggleButton34 = new javax.swing.JToggleButton();
        jToggleButton37 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        lblturnos = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblestado = new javax.swing.JLabel();
        lblempleado = new javax.swing.JLabel();
        btnconsultas = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cboinformes = new javax.swing.JComboBox<>();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setVisible(true);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jpmenu.setBackground(new java.awt.Color(0, 204, 204));
        jpmenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncambioturno.setBackground(new java.awt.Color(0, 204, 204));
        btncambioturno.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
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
        jpmenu.add(btncambioturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 180, 40));

        btnlistaespera.setBackground(new java.awt.Color(0, 204, 204));
        btnlistaespera.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
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
        jpmenu.add(btnlistaespera, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, 40));

        btnlimpieza.setBackground(new java.awt.Color(0, 204, 204));
        btnlimpieza.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
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
        jpmenu.add(btnlimpieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 190, 40));

        btnsalidahuesped.setBackground(new java.awt.Color(0, 204, 204));
        btnsalidahuesped.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
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
        jpmenu.add(btnsalidahuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, 40));

        btningresohuesped.setBackground(new java.awt.Color(0, 204, 204));
        btningresohuesped.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
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
        jpmenu.add(btningresohuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, 40));

        btnregistro.setBackground(new java.awt.Color(0, 204, 204));
        btnregistro.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
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
        jpmenu.add(btnregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 40));

        btnreservas.setBackground(new java.awt.Color(0, 204, 204));
        btnreservas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
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
        jpmenu.add(btnreservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 180, 40));

        btnpagos.setBackground(new java.awt.Color(0, 204, 204));
        btnpagos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
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
        jpmenu.add(btnpagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 180, 40));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.png"))); // NOI18N
        jButton1.setText("REGISTRO FAC-ELECT");
        jButton1.setBorder(null);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpmenu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 190, 40));

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.png"))); // NOI18N
        jButton2.setText("CONSULTA  FAC-ELECT");
        jButton2.setBorder(null);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jpmenu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 190, 40));

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
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 148, 59, 47));

        jToggleButton4.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton4.setText("4");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 148, 60, 47));

        jToggleButton5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton5.setText("5");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 148, 59, 47));

        jToggleButton6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton6.setText("6");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 65, 47));

        jToggleButton7.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton7.setText("7");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 203, 65, 36));

        jToggleButton8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton8.setText("8");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 106, 126, 37));

        jToggleButton9.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton9.setText("9");
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });
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
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 105, 60, -1));

        jToggleButton11.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton11.setText("11");
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton11ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 105, 59, -1));

        jToggleButton12.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton12.setText("12");
        jToggleButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton12ActionPerformed(evt);
            }
        });
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
        jToggleButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton23ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 161, 64, 47));

        jToggleButton24.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton24.setText("24");
        jToggleButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton24ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 161, 64, 47));

        jToggleButton27.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton27.setText("27");
        jToggleButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton27ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 105, 64, 50));

        jToggleButton28.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton28.setText("28");
        jToggleButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton28ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 105, 65, 50));

        jToggleButton25.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton25.setText("25");
        jToggleButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton25ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 161, 60, 47));

        jToggleButton26.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton26.setText("26");
        jToggleButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton26ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 161, 80, 65));

        jToggleButton29.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton29.setText("29");
        jToggleButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton29ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 105, 64, 50));

        jToggleButton.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton.setText("211");
        jToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 105, 80, 50));

        jToggleButton210.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton210.setText("210");
        jToggleButton210.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton210ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton210, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 105, 130, 50));

        jToggleButton38.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton38.setText("38");
        jToggleButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton38ActionPerformed(evt);
            }
        });
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
        jToggleButton312.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton312ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton312, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 297, -1, -1));

        jToggleButton311.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton311.setText("311");
        jToggleButton311.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton311ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton311, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 297, -1, -1));

        jToggleButton310.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton310.setText("310");
        jToggleButton310.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton310ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton310, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 297, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("TERCER PISO");
        pnlBotones.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 257, 103, 28));

        jToggleButtonrojo.setBackground(new java.awt.Color(255, 99, 71));
        jToggleButtonrojo.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButtonrojo.setText("OCUPADA");
        jToggleButtonrojo.setBorder(null);

        jToggleButtonamarillo.setBackground(new java.awt.Color(255, 255, 102));
        jToggleButtonamarillo.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButtonamarillo.setText("RESERVADA");
        jToggleButtonamarillo.setBorder(null);

        jToggleButtonnaranja.setBackground(new java.awt.Color(255, 165, 79));
        jToggleButtonnaranja.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButtonnaranja.setText("MANTENIMIENTO");
        jToggleButtonnaranja.setBorder(null);

        jToggleButtonazul.setBackground(new java.awt.Color(0, 204, 255));
        jToggleButtonazul.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButtonazul.setText("LIMPIEZA");
        jToggleButtonazul.setBorder(null);

        jToggleButtonverde.setBackground(new java.awt.Color(144, 238, 144));
        jToggleButtonverde.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jToggleButtonverde.setText("DISPONIBLE");
        jToggleButtonverde.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButtonnaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButtonazul, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButtonverde, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButtonamarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButtonrojo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jToggleButtonverde, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToggleButtonamarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButtonrojo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonnaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonazul, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        pnlBotones.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 320, 410, 70));

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
        jToggleButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton33ActionPerformed(evt);
            }
        });
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
        jToggleButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton36ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 343, 66, 47));

        jToggleButton35.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton35.setText("35");
        jToggleButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton35ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 343, 65, 47));

        jToggleButton34.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton34.setText("34");
        jToggleButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton34ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 343, 61, 47));

        jToggleButton37.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jToggleButton37.setText("37");
        jToggleButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton37ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 343, 66, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo luci.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("Fecha:");

        lblfecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblfecha.setText("fecha");

        lblturnos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblturnos.setText("turnos");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel10.setText("Turno:");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setText("Empleado:");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setText("Estado:");

        lblestado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblestado.setText("estado");

        lblempleado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblempleado.setText("empleado");

        btnconsultas.setBackground(new java.awt.Color(0, 204, 204));
        btnconsultas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnconsultas.setText("CONSULTAR");
        btnconsultas.setBorder(null);
        btnconsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultasActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoCombugas.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        cboinformes.setBackground(new java.awt.Color(0, 204, 204));
        cboinformes.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cboinformes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Reservas", "Ingresos", "Salidas", "Abonos", "Hbt Ocupadas", " " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel10))
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblturnos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cboinformes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnconsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblestado, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 590, Short.MAX_VALUE)))
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jpmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel10)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(lblempleado))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(lblestado)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblfecha)
                                .addGap(0, 0, 0)
                                .addComponent(lblturnos)
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnconsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboinformes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jpmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalidahuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalidahuespedActionPerformed

        if (salidaFormulario == null || !salidaFormulario.isVisible()) {
            // Si no está abierto, crea una nueva instancia o usa el Singleton
            Jsalidahuesped salidaFormulario = new Jsalidahuesped(); // Usando Singleton
            salidaFormulario.setVisible(true);
        } else {
            // Si ya está abierto, enfócalo
            salidaFormulario.setExtendedState(JFrame.NORMAL); // Restaurar si está minimizado
            salidaFormulario.toFront(); // Traer al frente
            salidaFormulario.requestFocus(); // Solicitar foco
        }

        Jsalidahuesped.txtempleado.setText(lblempleado.getText());
        Jsalidahuesped.lbturno.setText(lblturnos.getText());
    }//GEN-LAST:event_btnsalidahuespedActionPerformed

    private void btnregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistroActionPerformed

        if (clienteFormulario == null || !clienteFormulario.isVisible()) {
            // Si no está abierto, crea una nueva instancia o usa el Singleton
            Jcliente clienteFormulario = new Jcliente(); // Usando Singleton
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
            Jmanejoreservas reservaFormulario = new Jmanejoreservas(); // Usando Singleton
            reservaFormulario.setVisible(true);
        } else {
            // Si ya está abierto, enfócalo
            reservaFormulario.setExtendedState(JFrame.NORMAL); // Restaurar si está minimizado
            reservaFormulario.toFront(); // Traer al frente
            reservaFormulario.requestFocus(); // Solicitar foco
        }

        Jmanejoreservas.txtempleado.setText(lblempleado.getText());
        Jmanejoreservas.lbturno.setText(lblturnos.getText());

    }//GEN-LAST:event_btnreservasActionPerformed

    private void btningresohuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresohuespedActionPerformed

        if (ingresoFormulario == null || !ingresoFormulario.isVisible()) {
            // Si no está abierto, crea una nueva instancia o usa el Singleton
            Jingreso ingresoFormulario = new Jingreso(); // Usando Singleton
            ingresoFormulario.setVisible(true);
        } else {
            // Si ya está abierto, enfócalo
            ingresoFormulario.setExtendedState(JFrame.NORMAL); // Restaurar si está minimizado
            ingresoFormulario.toFront(); // Traer al frente
            ingresoFormulario.requestFocus(); // Solicitar foco
        }

        Jingreso.txtempleado.setText(lblempleado.getText());
        Jingreso.lbturnos.setText(lblturnos.getText());

    }//GEN-LAST:event_btningresohuespedActionPerformed

    private void btnpagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagosActionPerformed

        if (abonoFormulario == null || !abonoFormulario.isVisible()) {
            // Si no está abierto, crea una nueva instancia o usa el Singleton
            Jabono abonoFormulario = new Jabono(); // Usando Singleton
            abonoFormulario.setVisible(true);
        } else {
            // Si ya está abierto, enfócalo
            abonoFormulario.setExtendedState(JFrame.NORMAL); // Restaurar si está minimizado
            abonoFormulario.toFront(); // Traer al frente
            abonoFormulario.requestFocus(); // Solicitar foco
        }
        Jabono.lbturno.setText(lblturnos.getText());
    }//GEN-LAST:event_btnpagosActionPerformed

    private void btnlistaesperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistaesperaActionPerformed

        if (esperaFormulario == null || !esperaFormulario.isVisible()) {
            // Si no está abierto, crea una nueva instancia o usa el Singleton
            Jlistaespera esperaFormulario = new Jlistaespera(); // Usando Singleton
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

            Jsalidaturno formTurnos = Jsalidaturno.getInstance();
            formTurnos.toFront();
            formTurnos.setVisible(true);
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

            metodoDondeSeNecesitaFormLogin();
        } else {
            if (finicio.hayTurnoActivo()) {
                JOptionPane.showMessageDialog(null, "Hay un turno activo. Debe finalizar el turno actual antes de iniciar uno nuevo.");
                Jsalidaturno formTurnos = Jsalidaturno.getInstance();
                formTurnos.toFront();
                formTurnos.setVisible(true);

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
            Jlimpieza limpiezaFormulario = new Jlimpieza(); // Usando Singleton
            limpiezaFormulario.setVisible(true);
        } else {
            // Si ya está abierto, enfócalo
            limpiezaFormulario.setExtendedState(JFrame.NORMAL); // Restaurar si está minimizado
            limpiezaFormulario.toFront(); // Traer al frente
            limpiezaFormulario.requestFocus(); // Solicitar foco
        }

    }//GEN-LAST:event_btnlimpiezaActionPerformed

    private void btnconsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultasActionPerformed
        if (cboinformes.getSelectedItem() != null) {
            String selectedItem = (String) cboinformes.getSelectedItem();
            // Verificar el elemento seleccionado y realizar la acción correspondiente
            if (selectedItem.equals("Salidas")) {
                if (frameSalida == null || !frameSalida.isVisible()) {
                    frameSalida = new Jvistasalida();
                    frameSalida.toFront();
                    frameSalida.requestFocus();
                    frameSalida.setVisible(true);
                } else {
                    frameSalida.toFront(); // Solo traer al frente si ya está abierto
                }

            } else if (selectedItem.equals("Ingresos")) {
                if (frameIngreso == null || !frameIngreso.isVisible()) {
                    frameIngreso = new Jvistaingreso();
                    frameIngreso.toFront();
                    frameIngreso.requestFocus();
                    frameIngreso.setVisible(true);
                } else {
                    frameIngreso.toFront();
                }

            } else if (selectedItem.equals("Reservas")) {
                if (frameReservas == null || !frameReservas.isVisible()) {
                    frameReservas = new Jvistareservas();
                    frameReservas.toFront();
                    frameReservas.requestFocus();
                    frameReservas.setVisible(true);
                } else {
                    frameReservas.toFront();
                }

            } else if (selectedItem.equals("Abonos")) {
                if (formAbonos == null || !formAbonos.isVisible()) {
                    formAbonos = new JVistaAbonos();
                    formAbonos.toFront();
                    formAbonos.requestFocus();
                    formAbonos.setVisible(true);
                } else {
                    formAbonos.toFront();
                }

            } else if (selectedItem.equals("Hbt Ocupadas")) {
                if (frameOcupadas == null || !frameOcupadas.isVisible()) {
                    frameOcupadas = new JvistaHbitacionesOcupadas();
                    frameOcupadas.toFront();
                    frameOcupadas.requestFocus();
                    frameOcupadas.setVisible(true);
                } else {
                    frameOcupadas.toFront();
                }
            }

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnconsultasActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton21ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton21ActionPerformed

    private void jToggleButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton22ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton22ActionPerformed

    private void jToggleButton031ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton031ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton031ActionPerformed

    private void jToggleButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton32ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton32ActionPerformed

    private void jToggleButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton39ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton39ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton11ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton11ActionPerformed

    private void jToggleButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton12ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton12ActionPerformed

    private void jToggleButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton23ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton23ActionPerformed

    private void jToggleButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton24ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton24ActionPerformed

    private void jToggleButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton25ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton25ActionPerformed

    private void jToggleButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton26ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton26ActionPerformed

    private void jToggleButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton27ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton27ActionPerformed

    private void jToggleButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton28ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton28ActionPerformed

    private void jToggleButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton29ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton29ActionPerformed

    private void jToggleButton210ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton210ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton210ActionPerformed

    private void jToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButtonActionPerformed

    private void jToggleButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton33ActionPerformed
        // TODO add your handling code here: ListaOpciones Opciones = new ListaOpciones();
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton33ActionPerformed

    private void jToggleButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton34ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton34ActionPerformed

    private void jToggleButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton35ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton35ActionPerformed

    private void jToggleButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton36ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton36ActionPerformed

    private void jToggleButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton37ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton37ActionPerformed

    private void jToggleButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton38ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton38ActionPerformed

    private void jToggleButton310ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton310ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton310ActionPerformed

    private void jToggleButton311ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton311ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton311ActionPerformed

    private void jToggleButton312ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton312ActionPerformed
        // TODO add your handling code here:
        ListaOpciones Opciones = new ListaOpciones();
        Opciones.toFront();
        Opciones.requestFocus();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jToggleButton312ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //        idcliente = txtidcliente.getText();

        if (factura == null || !factura.isVisible()) {
            // Si no está abierto, crea una nueva instancia o usa el Singleton
            factura = Jregistro_factura_electronica.getInstance(); // Usando Singleton
            factura.setVisible(true);

            // Añadir WindowListener para limpiar la variable cuando se cierre el formulario
            factura.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    idcliente = ""; // Limpiar la variable
                }

                @Override
                public void windowClosed(WindowEvent e) {
                    idcliente = ""; // Limpiar la variable cuando el formulario ya se haya cerrado
                }
            });

        } else {
            // Si ya está abierto, enfócalo
            factura.setExtendedState(JFrame.NORMAL); // Restaurar si está minimizado
            factura.toFront(); // Traer al frente
            factura.requestFocus(); // Solicitar foco
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JconsultaFac_Elect consulta = new JconsultaFac_Elect();
        consulta.toFront();
        consulta.requestFocus();
        consulta.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton btnsalidahuesped;
    private javax.swing.JComboBox<String> cboinformes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
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
