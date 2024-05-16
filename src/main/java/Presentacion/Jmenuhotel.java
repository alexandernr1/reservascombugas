package Presentacion;

import Logica.CambioEstadoEvento;
import Logica.CambioEstadoListener;
import Logica.Fhabitacion;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

public final class Jmenuhotel extends javax.swing.JFrame implements CambioEstadoListener {

    private String idpersona;
    private String nombres;
    private String apellidos;
    private String acceso;
    private Boolean sesionIniciada = false;
//    private Jinicioturno Jsalidaturno;
    private LoguinDeAdmin Javanzado;
    private final Fhabitacion fcn;
    private final List<CambioEstadoListener> cambioEstadoListeners;

    public Jmenuhotel(String idpersona, String nombres, String apellidos, String acceso) {

        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        setResizable(false);
        setTitle("MENU HOTEL");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.fcn = new Fhabitacion();
        this.cambioEstadoListeners = new ArrayList<>();
        this.idpersona = idpersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.acceso = acceso;

        lblidpersona.setText(idpersona);
        lblnombres.setText(nombres);
        lblapellidos.setText(apellidos);
        lblacceso.setText(acceso);
        inhabilitar();

        actualizarColoresBotones();
//       ;
    }
    public static int idusuario;

    static void inhabilitar() {
        lblidpersona.setVisible(false);
        lblacceso.setVisible(false);

    }
    // Método para agregar un listener de cambio de estado

    public void agregarCambioEstadoListener(CambioEstadoListener listener) {
        // Agrega el listener a una lista de listeners
        cambioEstadoListeners.add(listener);
    }

    // Método para notificar a los listeners sobre un cambio de estado
    public void notificarCambioEstado(CambioEstadoEvento evento) {
        for (CambioEstadoListener listener : cambioEstadoListeners) {
            listener.cambioEstadoOcurrido(evento);
        }
    }

    @Override
    // Implementación del método de la interfaz CambioEstadoListener
    public void cambioEstadoOcurrido(CambioEstadoEvento evento) {
        actualizarColoresBotones();
    }

    private void actualizarColoresBotones() {

        Component[] componentes = pnlBotones.getComponents();

        for (Component componente : componentes) {
            if (componente instanceof JToggleButton boton) {
                String nombreBoton = boton.getText();
                int idHabitacion = Integer.parseInt(nombreBoton.substring(10));
                String estadoHabitacion = fcn.obtenerEstadoHabitacion(idHabitacion);

                switch (estadoHabitacion) {
                    case "Disponible" ->
                        boton.setBackground(Color.GREEN);
                    case "Ocupado" ->
                        boton.setBackground(Color.RED);
                    case "Reserva" ->
                        boton.setBackground(Color.YELLOW);
                    case "Mantenimiento" ->
                        boton.setBackground(Color.ORANGE);
                    case "Limpieza" ->
                        boton.setBackground(Color.BLUE);
                    default ->
                        boton.setBackground(new Color(255, 255, 255));
                }
            }
        }
    }

    // Tu código existente...
//    public void actualizarColoresBotones() {
//        Fhabitacion fcn = new Fhabitacion();
//
//        // Iterar sobre los componentes del panel de botones
//        Component[] componentes = pnlBotones.getComponents();
////        Component[] componente = pnlbotnes.getComponents();
//        for (Component componente : componentes) {
//            if (componente instanceof JToggleButton) {
//                JToggleButton boton = (JToggleButton) componente;
//                String nombreBoton = boton.getText(); // Obtener el nombre del botón (por ejemplo, "HabitaciónX")
//                int idHabitacion = Integer.parseInt(nombreBoton.substring(10)); // Extraer el número de habitación del nombre del botón
//
//                // Obtener el estado de la habitación según su ID
//                String estadoHabitacion = fcn.obtenerEstadoHabitacion(idHabitacion);
//
//                // Asignar color al botón según el estado de la habitación
//                switch (estadoHabitacion) {
//                    case "Disponible":
//                        boton.setBackground(new Color(31, 222, 101)); // Color verde
//                        break;
//                    case "Ocupado":
//                        boton.setBackground(new Color(240, 82, 48)); // Color naranja
//                        break;
//                    case "Mantenimiento":
//                        boton.setBackground(new Color(255, 255, 0)); // Color amarillo
//                        break;
//                    default:
//                        boton.setBackground(new Color(255, 255, 255)); // Color blanco si no se reconoce el estado
//                        break;
//                }
//            }
//        }
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        escritorio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblidpersona = new javax.swing.JLabel();
        lblnombres = new javax.swing.JLabel();
        lblapellidos = new javax.swing.JLabel();
        lblacceso = new javax.swing.JLabel();
        cboinformes = new javax.swing.JComboBox<>();
        btnconsultas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        jpsemaforo = new javax.swing.JPanel();
        jpmenu = new javax.swing.JPanel();
        btncambioturno = new javax.swing.JButton();
        btnlistaespera = new javax.swing.JButton();
        btnlimpieza = new javax.swing.JButton();
        btnconfiguracion = new javax.swing.JButton();
        btnsalidahuesped = new javax.swing.JButton();
        btningresohuesped = new javax.swing.JButton();
        btnregistro = new javax.swing.JButton();
        btnavanzado = new javax.swing.JButton();
        btnreservas = new javax.swing.JButton();
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
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jToggleButton17 = new javax.swing.JToggleButton();
        jToggleButton18 = new javax.swing.JToggleButton();
        jToggleButton19 = new javax.swing.JToggleButton();
        jToggleButton20 = new javax.swing.JToggleButton();
        jToggleButton21 = new javax.swing.JToggleButton();
        jToggleButton23 = new javax.swing.JToggleButton();
        jToggleButton24 = new javax.swing.JToggleButton();
        jToggleButton25 = new javax.swing.JToggleButton();
        jToggleButton26 = new javax.swing.JToggleButton();
        jToggleButton27 = new javax.swing.JToggleButton();
        jToggleButton28 = new javax.swing.JToggleButton();
        jToggleButton29 = new javax.swing.JToggleButton();
        jToggleButton30 = new javax.swing.JToggleButton();
        jToggleButton31 = new javax.swing.JToggleButton();
        jToggleButton32 = new javax.swing.JToggleButton();
        jToggleButton33 = new javax.swing.JToggleButton();
        jToggleButton34 = new javax.swing.JToggleButton();
        jToggleButton35 = new javax.swing.JToggleButton();
        jToggleButton36 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton37 = new javax.swing.JToggleButton();
        jToggleButton38 = new javax.swing.JToggleButton();
        jToggleButton39 = new javax.swing.JToggleButton();
        jToggleButton22 = new javax.swing.JToggleButton();
        jToggleButton40 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel2.setLayout(new java.awt.BorderLayout());

        escritorio.setBackground(new java.awt.Color(255, 255, 102));
        escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\logo combugas.png")); // NOI18N
        escritorio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, -1, -1));

        lblidpersona.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblidpersona.setText("jLabel3");
        escritorio.add(lblidpersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        lblnombres.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblnombres.setText("jLabel4");
        escritorio.add(lblnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, -1));

        lblapellidos.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblapellidos.setText("jLabel5");
        escritorio.add(lblapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 150, -1));

        lblacceso.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblacceso.setText("jLabel6");
        escritorio.add(lblacceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 150, -1));

        cboinformes.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cboinformes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingresos", "Reservas", "Salidas", "Abonos", " ", " ", " " }));
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
        escritorio.add(cboinformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 143, -1));

        btnconsultas.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnconsultas.setText("CONSULTAR");
        btnconsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultasActionPerformed(evt);
            }
        });
        escritorio.add(btnconsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Consutas de informes:");
        escritorio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, 40));

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
        jScrollPane1.setViewportView(tablalistado);

        escritorio.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 10, 20));

        jPanel2.add(escritorio, java.awt.BorderLayout.PAGE_START);

        jpmenu.setBackground(new java.awt.Color(204, 255, 153));
        jpmenu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENÚ HOTEL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 24))); // NOI18N
        jpmenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncambioturno.setBackground(new java.awt.Color(204, 255, 153));
        btncambioturno.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        btncambioturno.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\cambio-de-turno.png")); // NOI18N
        btncambioturno.setText("CAMBIO DE TURNO");
        btncambioturno.setBorder(null);
        btncambioturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncambioturnoActionPerformed(evt);
            }
        });
        jpmenu.add(btncambioturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 210, 198, 34));

        btnlistaespera.setBackground(new java.awt.Color(204, 255, 153));
        btnlistaespera.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        btnlistaespera.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\tiempo.png")); // NOI18N
        btnlistaespera.setText("LISTA DE ESPERA");
        btnlistaespera.setBorder(null);
        btnlistaespera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistaesperaActionPerformed(evt);
            }
        });
        jpmenu.add(btnlistaespera, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 256, 198, 36));

        btnlimpieza.setBackground(new java.awt.Color(204, 255, 153));
        btnlimpieza.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnlimpieza.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\limpieza.png")); // NOI18N
        btnlimpieza.setText("LiMPIEZA");
        btnlimpieza.setBorder(null);
        btnlimpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiezaActionPerformed(evt);
            }
        });
        jpmenu.add(btnlimpieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 339, 198, 35));

        btnconfiguracion.setBackground(new java.awt.Color(204, 255, 153));
        btnconfiguracion.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        btnconfiguracion.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\configuracion.png")); // NOI18N
        btnconfiguracion.setText("CONFIGURACION");
        btnconfiguracion.setBorder(null);
        btnconfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfiguracionActionPerformed(evt);
            }
        });
        jpmenu.add(btnconfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 421, 198, -1));

        btnsalidahuesped.setBackground(new java.awt.Color(204, 255, 153));
        btnsalidahuesped.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        btnsalidahuesped.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\salida.png")); // NOI18N
        btnsalidahuesped.setText("SALIDA HUESPED");
        btnsalidahuesped.setBorder(null);
        btnsalidahuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalidahuespedActionPerformed(evt);
            }
        });
        jpmenu.add(btnsalidahuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 167, 198, 31));

        btningresohuesped.setBackground(new java.awt.Color(204, 255, 153));
        btningresohuesped.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        btningresohuesped.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\ingreso.png")); // NOI18N
        btningresohuesped.setText("INGRESO HUESPED");
        btningresohuesped.setBorder(null);
        btningresohuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresohuespedActionPerformed(evt);
            }
        });
        jpmenu.add(btningresohuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 123, 198, 32));

        btnregistro.setBackground(new java.awt.Color(204, 255, 153));
        btnregistro.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        btnregistro.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\registro-en-linea.png")); // NOI18N
        btnregistro.setText("REGISTRO");
        btnregistro.setActionCommand("     REGISTRO");
        btnregistro.setBorder(null);
        btnregistro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistroActionPerformed(evt);
            }
        });
        jpmenu.add(btnregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 198, 40));

        btnavanzado.setBackground(new java.awt.Color(204, 255, 153));
        btnavanzado.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnavanzado.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\carrera-profesional.png")); // NOI18N
        btnavanzado.setText("AVANZADO");
        btnavanzado.setBorder(null);
        btnavanzado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnavanzadoActionPerformed(evt);
            }
        });
        jpmenu.add(btnavanzado, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 380, 192, 35));

        btnreservas.setBackground(new java.awt.Color(204, 255, 153));
        btnreservas.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        btnreservas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\reserva.png")); // NOI18N
        btnreservas.setText("RESERVAS");
        btnreservas.setBorder(null);
        btnreservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreservasActionPerformed(evt);
            }
        });
        jpmenu.add(btnreservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 198, -1));

        btnpagos.setBackground(new java.awt.Color(204, 255, 153));
        btnpagos.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnpagos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\HotelC\\src\\main\\java\\File\\metodo-de-pago.png")); // NOI18N
        btnpagos.setText("PAGOS Y ABONOS");
        btnpagos.setBorder(null);
        btnpagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagosActionPerformed(evt);
            }
        });
        jpmenu.add(btnpagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 298, 210, 35));

        pnlBotones.setBackground(new java.awt.Color(204, 204, 204));
        pnlBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton1.setText("Habitacion1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, 47));

        jToggleButton2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton2.setText("Habitacion2");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, 47));

        jToggleButton3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton3.setText("Habitacion3");
        pnlBotones.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 110, 47));

        jToggleButton4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton4.setText("Habitacion4");
        pnlBotones.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 110, 47));

        jToggleButton5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton5.setText("Habitacion5");
        pnlBotones.add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 110, 47));

        jToggleButton6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton6.setText("Habitacion6");
        pnlBotones.add(jToggleButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, 47));

        jToggleButton7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton7.setText("Habitacion7");
        pnlBotones.add(jToggleButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, 42));

        jToggleButton8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton8.setText("Habitacion8");
        pnlBotones.add(jToggleButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 210, 42));

        jToggleButton9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton9.setText("Habitacion9");
        pnlBotones.add(jToggleButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 102, 42));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("SEGUNDO PISO");
        pnlBotones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 103, 28));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("PRIMER PISO");
        pnlBotones.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 103, 28));

        jToggleButton10.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton10.setText("Habitacion10");
        pnlBotones.add(jToggleButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, 39));

        jToggleButton11.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton11.setText("Habitacion11");
        pnlBotones.add(jToggleButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, 39));

        jToggleButton12.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton12.setText("Habitacion12");
        pnlBotones.add(jToggleButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 70, 120, 39));

        jToggleButton13.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton13.setText("Habitacion21");
        jToggleButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton13ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, 47));

        jToggleButton14.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton14.setText("Habitacion22");
        jToggleButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton14ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, 47));

        jToggleButton15.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton15.setText("Habitacion23");
        pnlBotones.add(jToggleButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 120, 47));

        jToggleButton16.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton16.setText("Habitacion24");
        pnlBotones.add(jToggleButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, 47));

        jToggleButton17.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton17.setText("Habitacion27");
        pnlBotones.add(jToggleButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, 42));

        jToggleButton18.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton18.setText("Habitacion28");
        pnlBotones.add(jToggleButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, 42));

        jToggleButton19.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton19.setText("Habitacion25");
        pnlBotones.add(jToggleButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, 47));

        jToggleButton20.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton20.setText("Habitacion26");
        pnlBotones.add(jToggleButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 120, 60));

        jToggleButton21.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton21.setText("Habitacion29");
        pnlBotones.add(jToggleButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 120, 42));

        jToggleButton23.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton23.setText("Habitacion211");
        pnlBotones.add(jToggleButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 259, 120, 50));

        jToggleButton24.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton24.setText("Habitacion210");
        pnlBotones.add(jToggleButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 220, 39));

        jToggleButton25.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton25.setText("Habitacion31");
        jToggleButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton25ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, -1, 47));

        jToggleButton26.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton26.setText("Habitacion32");
        jToggleButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton26ActionPerformed(evt);
            }
        });
        pnlBotones.add(jToggleButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, -1, 47));

        jToggleButton27.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton27.setText("Habitacion33");
        pnlBotones.add(jToggleButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 110, 47));

        jToggleButton28.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton28.setText("Habitacion34");
        pnlBotones.add(jToggleButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, 47));

        jToggleButton29.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton29.setText("Habitacion37");
        pnlBotones.add(jToggleButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 120, 50));

        jToggleButton30.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton30.setText("Habitacion38");
        pnlBotones.add(jToggleButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, 40));

        jToggleButton31.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton31.setText("Habitacion35");
        pnlBotones.add(jToggleButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, 47));

        jToggleButton32.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton32.setText("Habitacion36");
        pnlBotones.add(jToggleButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 120, 47));

        jToggleButton33.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton33.setText("Habitacion39");
        pnlBotones.add(jToggleButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 120, 40));

        jToggleButton34.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton34.setText("Habitacion312");
        pnlBotones.add(jToggleButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 399, 120, 50));

        jToggleButton35.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton35.setText("Habitacion311");
        pnlBotones.add(jToggleButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, 39));

        jToggleButton36.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton36.setText("Habitacion310");
        pnlBotones.add(jToggleButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, 39));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("TERCER PISO");
        pnlBotones.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 103, 28));

        jToggleButton37.setBackground(new java.awt.Color(255, 0, 0));
        jToggleButton37.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton37.setText("OCUPADA");

        jToggleButton38.setBackground(new java.awt.Color(255, 255, 0));
        jToggleButton38.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton38.setText("RESERVADA");

        jToggleButton39.setBackground(new java.awt.Color(255, 102, 0));
        jToggleButton39.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton39.setText("MANTENIMIENTO");

        jToggleButton22.setBackground(new java.awt.Color(0, 204, 0));
        jToggleButton22.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jToggleButton22.setText("DISPONIBLE");

        jToggleButton40.setBackground(new java.awt.Color(51, 0, 255));
        jToggleButton40.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton40.setText("LIMPIEZA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton40)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnlBotones.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, -1, 170));

        javax.swing.GroupLayout jpsemaforoLayout = new javax.swing.GroupLayout(jpsemaforo);
        jpsemaforo.setLayout(jpsemaforoLayout);
        jpsemaforoLayout.setHorizontalGroup(
            jpsemaforoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpsemaforoLayout.createSequentialGroup()
                .addComponent(jpmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpsemaforoLayout.setVerticalGroup(
            jpsemaforoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpsemaforoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
        );

        jPanel2.add(jpsemaforo, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalidahuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalidahuespedActionPerformed

        new Jsalidahuesped().setVisible(true);
        Jsalidahuesped.txtidempleado.setText(lblidpersona.getText());
        Jsalidahuesped.txtempleado.setText(lblnombres.getText() + " " + lblapellidos.getText());
        Jsalidahuesped.idusuario = Integer.parseInt(lblidpersona.getText());
    }//GEN-LAST:event_btnsalidahuespedActionPerformed

    private void btnregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistroActionPerformed

        new Jcliente().setVisible(true);

    }//GEN-LAST:event_btnregistroActionPerformed

    private void btnreservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservasActionPerformed

        Jmanejoreservas form = new Jmanejoreservas();
        form.toFront();
        form.setVisible(true);
        Jmanejoreservas.txtidempleado.setText(lblidpersona.getText());
        Jmanejoreservas.txtempleado.setText(lblnombres.getText() + " " + lblapellidos.getText());
        Jmanejoreservas.idusuario = Integer.parseInt(lblidpersona.getText());

    }//GEN-LAST:event_btnreservasActionPerformed

    private void btningresohuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresohuespedActionPerformed

        Jingreso form = new Jingreso();
        form.toFront();
        form.setVisible(true);
        Jingreso.txtidempleado.setText(lblidpersona.getText());
        Jingreso.txtempleado.setText(lblnombres.getText() + " " + lblapellidos.getText());
        Jingreso.idusuario = Integer.parseInt(lblidpersona.getText());

    }//GEN-LAST:event_btningresohuespedActionPerformed

    private void btnconfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfiguracionActionPerformed

    }//GEN-LAST:event_btnconfiguracionActionPerformed

    private void btnpagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagosActionPerformed

        new Jabono().setVisible(true);
    }//GEN-LAST:event_btnpagosActionPerformed

    private void btnavanzadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnavanzadoActionPerformed

        Javanzado = new LoguinDeAdmin();
        Javanzado.toFront();
        Javanzado.setVisible(true);
        sesionIniciada = true;

    }//GEN-LAST:event_btnavanzadoActionPerformed

    private void btnlistaesperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistaesperaActionPerformed
        new Jlistaespera().setVisible(true);
        Jlistaespera.txtidempleado.setText(lblidpersona.getText());
        Jlistaespera.txtempleado.setText(lblnombres.getText() + " " + lblapellidos.getText());
        Jlistaespera.idusuario = Integer.parseInt(lblidpersona.getText());
    }//GEN-LAST:event_btnlistaesperaActionPerformed

    private void btncambioturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncambioturnoActionPerformed
        if (sesionIniciada) {
            // Si la sesión ya está iniciada, mostrar el formulario Jsalidaturno
            Jsalidaturno formTurnos = new Jsalidaturno();
            formTurnos.toFront();
            formTurnos.setVisible(true);
        } else {
            // Si la sesión no está iniciada, mostrar el formulario de inicio de sesión
            Jinicioturno formLogin = new Jinicioturno(sesionIniciada);
            formLogin.toFront();
            formLogin.setVisible(true);
//        Jsalidaturno.txtidempleado.setText(lblidpersona.getText());
//        Jsalidaturno.txtempleado.setText(lblnombres.getText() + " " + lblapellidos.getText());
//        Jsalidaturno.idusuario = Integer.parseInt(lblidpersona.getText());
        }
        //        if (!sesionIniciada) {
//            Jsalidaturno = new Jinicioturno();
//            Jsalidaturno.toFront();
//            Jsalidaturno.setVisible(true);1
//        }

//        cerrarTurno();

    }//GEN-LAST:event_btncambioturnoActionPerformed

    private void btnlimpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiezaActionPerformed
        Jlimpieza form = new Jlimpieza();
        form.toFront();
        form.setVisible(true);

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

            } else if (selectedItem.equals("Ingreso")) {
                //                    realizarAccionOpcion2();
            } else if (selectedItem.equals("Reserva")) {
                //                    realizarAccionOpcion3();
            } else if (selectedItem.equals("Abonos")) {
                JOptionPane.showMessageDialog(this, "Seleccione una opción válida", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (selectedItem.equals("")) {

            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnconsultasActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton13ActionPerformed

    private void jToggleButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton14ActionPerformed

    private void jToggleButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton25ActionPerformed

    private void jToggleButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton26ActionPerformed

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
    public static javax.swing.JButton btnavanzado;
    private javax.swing.JButton btncambioturno;
    public static javax.swing.JButton btnconfiguracion;
    private javax.swing.JButton btnconsultas;
    private javax.swing.JButton btningresohuesped;
    private javax.swing.JButton btnlimpieza;
    private javax.swing.JButton btnlistaespera;
    private javax.swing.JButton btnpagos;
    private javax.swing.JButton btnregistro;
    private javax.swing.JButton btnreservas;
    private javax.swing.JButton btnsalidahuesped;
    private javax.swing.JComboBox<String> cboinformes;
    public static javax.swing.JPanel escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton17;
    private javax.swing.JToggleButton jToggleButton18;
    private javax.swing.JToggleButton jToggleButton19;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton20;
    private javax.swing.JToggleButton jToggleButton21;
    private javax.swing.JToggleButton jToggleButton22;
    private javax.swing.JToggleButton jToggleButton23;
    private javax.swing.JToggleButton jToggleButton24;
    private javax.swing.JToggleButton jToggleButton25;
    private javax.swing.JToggleButton jToggleButton26;
    private javax.swing.JToggleButton jToggleButton27;
    private javax.swing.JToggleButton jToggleButton28;
    private javax.swing.JToggleButton jToggleButton29;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton30;
    private javax.swing.JToggleButton jToggleButton31;
    private javax.swing.JToggleButton jToggleButton32;
    private javax.swing.JToggleButton jToggleButton33;
    private javax.swing.JToggleButton jToggleButton34;
    private javax.swing.JToggleButton jToggleButton35;
    private javax.swing.JToggleButton jToggleButton36;
    private javax.swing.JToggleButton jToggleButton37;
    private javax.swing.JToggleButton jToggleButton38;
    private javax.swing.JToggleButton jToggleButton39;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton40;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    private javax.swing.JPanel jpmenu;
    private javax.swing.JPanel jpsemaforo;
    public static javax.swing.JLabel lblacceso;
    public static javax.swing.JLabel lblapellidos;
    public static javax.swing.JLabel lblidpersona;
    public static javax.swing.JLabel lblnombres;
    public static javax.swing.JPanel pnlBotones;
    private javax.swing.JTable tablalistado;
    // End of variables declaration//GEN-END:variables

}
