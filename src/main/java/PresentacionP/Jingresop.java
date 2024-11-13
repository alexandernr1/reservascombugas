package PresentacionP;

import Datos.Tiempopro;
import DatosP.Dingresop;
import LogicaP.Lingresop;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Jingresop extends javax.swing.JFrame {

    private static Jingresop instance;
     Tiempopro time = new Tiempopro();

    public Jingresop() {
        initComponents();
        mostrar("");
        configurarTabla();
        setLocationRelativeTo(null);
        setTitle("INGRESO");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        inhabilitar();
        mostrarTiempo();
    }
    private String accion = "guardar";
    
     public void mostrarTiempo() {

        txtfechaingreso.setText(time.getFechacomp() + " " + time.getHoracomp());
    }

    private void configurarTabla() {
        // Aquí configuras el comportamiento y el estilo de la tabla
        tablalistado.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablalistado.setRowHeight(25); // Ajusta la altura de las filas
        tablalistado.setRowMargin(5); // Espacio entre filas

        // Cambiar color del encabezado usando un renderer personalizado
        JTableHeader header = tablalistado.getTableHeader();
        header.setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                cell.setBackground(new Color(135, 206, 235));
                cell.setForeground(Color.WHITE); // Texto blanco para encabezado
                cell.setFont(new Font("SansSerif", Font.BOLD, 14)); // Fuente personalizada
                return cell;
            }
        });

        // Establecer colores alternos en las filas
        tablalistado.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // Color de las filas alternas
                if (!isSelected) {
                    if (row % 2 == 0) {
                        cell.setBackground(Color.LIGHT_GRAY); // Filas pares
                    } else {
                        cell.setBackground(Color.WHITE); // Filas impares
                    }
                } else {
                    cell.setBackground(Color.CYAN); // Color para fila seleccionada
                }

                return cell;
            }
        });
    }

    public static Jingresop getInstance() {
        if (instance == null) {
            instance = new Jingresop();
        }
        return instance;
    }

    void ocultar_columnas() {
        tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);

        tablalistado.getColumnModel().getColumn(1).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(1).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(1).setPreferredWidth(0);

        tablalistado.getColumnModel().getColumn(2).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(2).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(2).setPreferredWidth(0);
    }

   private void inhabilitar() {

        txtidingreso.setVisible(false);
        txtidturno.setVisible(false);
        txtplaca.setText("");
        cbotipovehiculo.setSelectedItem("SELECCIONAR");
        cbotiposervicio.setSelectedItem("SELECCIONAR");
        txtcliente.setText("o");
        cbozona.setSelectedItem("");
        txtobservaciones.setText("Ninguna");
        cboestado.setSelectedItem("Seleccionar");

    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            Lingresop func = new Lingresop();
            modelo = func.mostrar(buscar);

            tablalistado.setModel(modelo);
            ocultar_columnas();
            lblregistro.setText("Total Registros " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtobservaciones = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtplaca = new javax.swing.JTextField();
        txtcliente = new javax.swing.JTextField();
        txtfechaingreso = new javax.swing.JTextField();
        cbotipovehiculo = new javax.swing.JComboBox<>();
        cbotiposervicio = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbozona = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtnumeroturno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtempleado = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnguardar1 = new javax.swing.JButton();
        lblturno = new javax.swing.JLabel();
        txtidturno = new javax.swing.JTextField();
        cboestado = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtidingreso = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        lblregistro = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Cliente:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Tipo Vehiculo:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Tipo Servicio:");

        txtobservaciones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtobservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtobservacionesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Placa:");

        txtplaca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplacaActionPerformed(evt);
            }
        });

        txtcliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclienteActionPerformed(evt);
            }
        });

        txtfechaingreso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtfechaingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaingresoActionPerformed(evt);
            }
        });

        cbotipovehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "TRICICLOS", "MOTOS", "AUTOMOVIL", "BUSETAS", "TRANSBORDO", "VOLQUETAS", "CAMION GRANDE", "TRACTOMULA", "OTROS" }));
        cbotipovehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipovehiculoActionPerformed(evt);
            }
        });

        cbotiposervicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "GENERAL", "PREPAGO", "CREDITO", "CLEINTE HOTEL", "EMPLEADO" }));
        cbotiposervicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotiposervicioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Zona:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Fecha ingreso:");

        cbozona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", " " }));
        cbozona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbozonaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Turno:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Responsable:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Observaciones:");

        txtempleado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtempleadoActionPerformed(evt);
            }
        });

        btnguardar.setBackground(new java.awt.Color(204, 204, 204));
        btnguardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnguardar.setText("Ingresar");
        btnguardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnguardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnguardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnguardar1.setBackground(new java.awt.Color(204, 204, 204));
        btnguardar1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnguardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.GIF"))); // NOI18N
        btnguardar1.setText("Nuevo");
        btnguardar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnguardar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardar1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnguardar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnguardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar1ActionPerformed(evt);
            }
        });

        lblturno.setText("TURNO");

        txtidturno.setText("IDIT");

        cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Activo", "Finalizado" }));
        cboestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboestadoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Estado:");

        txtidingreso.setText("IDIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtcliente)
                                .addComponent(txtobservaciones)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cbozona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(17, 17, 17))
                                .addComponent(cbotiposervicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbotipovehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtfechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumeroturno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblturno))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnguardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtidingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtidturno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbotipovehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbotiposervicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbozona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtobservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtnumeroturno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblturno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidturno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(btnguardar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablalistado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablalistado);

        lblregistro.setText("Total:");

        btnbuscar.setBackground(new java.awt.Color(204, 204, 204));
        btnbuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(204, 204, 204));
        btneliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txtbuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btneliminar)
                .addGap(47, 47, 47)
                .addComponent(lblregistro)
                .addGap(140, 140, 140))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblregistro)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btneliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfechaingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaingresoActionPerformed
        // TODO add your handling code here:
        txtfechaingreso.transferFocus();
    }//GEN-LAST:event_txtfechaingresoActionPerformed

    private void txtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclienteActionPerformed
        // TODO add your handling code here:
        txtcliente.transferFocus();
    }//GEN-LAST:event_txtclienteActionPerformed

    private void txtobservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtobservacionesActionPerformed
        // TODO add your handling code here:
        txtobservaciones.transferFocus();
    }//GEN-LAST:event_txtobservacionesActionPerformed

    private void txtplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplacaActionPerformed
      txtplaca.transferFocus();
    }//GEN-LAST:event_txtplacaActionPerformed

    private void txtempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtempleadoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        if (txtplaca.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "DEBES INGRESAR UNA PLACA");
            txtplaca.requestFocus();
            return;
        }
        if (txtfechaingreso.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "VERIFICA QUE ESTE LA FECHA POR FAVOR");
            txtfechaingreso.requestFocus();
            return;
        }

        if (cbotipovehiculo.getSelectedIndex() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "DEBES SELECCIONAR UN TIPO DE VEHICULO");
            cbotipovehiculo.requestFocus();
            return;
        }

        if (cbotiposervicio.getSelectedIndex() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "DEBES SELCCIONAR UN TIPO DE SERVICIO");
            cbotiposervicio.requestFocus();
            return;
        }

        Dingresop dts = new Dingresop();
        Lingresop func = new Lingresop();

//        dts.setIdingreso(Integer.parseInt(txtidingreso.getText()));
        dts.setIdinicioturno(Integer.parseInt(txtidturno.getText()));
        dts.setTurno(lblturno.getText());
        dts.setNumeroturno(txtnumeroturno.getText());
        dts.setEmpleado(txtempleado.getText());
        dts.setPlaca(txtplaca.getText());
        dts.setFechaingreso(txtfechaingreso.getText());
        int tipovehiculo = cbotipovehiculo.getSelectedIndex();
        dts.setTipovehiculo((String) cbotipovehiculo.getItemAt(tipovehiculo));
        int tiposervicio = cbotiposervicio.getSelectedIndex();
        dts.setTiposervicio((String) cbotiposervicio.getItemAt(tiposervicio));
        dts.setCliente(txtcliente.getText());
        int zona = cbozona.getSelectedIndex();
        dts.setZona((String) cbozona.getItemAt(zona));
        dts.setObservaciones(txtobservaciones.getText());
        int estado = cboestado.getSelectedIndex();
        dts.setEstado((String) cboestado.getItemAt(estado));

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, " INGRESO SATISFACTORIAMENTE");
                mostrar("");
//                inhabilitar();
            }

        } else if (accion.equals("editar")) {
            dts.setIdingreso(Integer.parseInt(txtidingreso.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "EDITADO SATISFACTORIAMENTE");
                mostrar("");
//                    inhabilitar();

            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnguardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar1ActionPerformed
        // TODO add your handling code here:
//        habilitar();
        btnguardar.setText("Guardar");
        accion = "guardar";
        inhabilitar();
    }//GEN-LAST:event_btnguardar1ActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked

        btnguardar.setText("Editar");
//        habilitar();
        btneliminar.setEnabled(true);
        accion = "editar";

        int fila = tablalistado.rowAtPoint(evt.getPoint());

        txtplaca.setText(tablalistado.getValueAt(fila, 5).toString());
        cbotipovehiculo.setSelectedItem(tablalistado.getValueAt(fila, 7).toString());
        cbotiposervicio.setSelectedItem(tablalistado.getValueAt(fila, 8).toString());
        txtcliente.setText(tablalistado.getValueAt(fila, 9).toString());
        cbozona.setSelectedItem(tablalistado.getValueAt(fila, 10).toString());
        cboestado.setSelectedItem(tablalistado.getValueAt(fila, 12).toString());


    }//GEN-LAST:event_tablalistadoMouseClicked

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        if (!txtidingreso.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de Eliminar el empleado?", "Confirmar", 2);

            if (confirmacion == 0) {
                Dingresop dts = new Dingresop();
                Lingresop func = new Lingresop();

                dts.setIdingreso(Integer.parseInt(txtidingreso.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();

            }

        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void cbotipovehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipovehiculoActionPerformed
        // TODO add your handling code here:
        cbotipovehiculo.transferFocus();
    }//GEN-LAST:event_cbotipovehiculoActionPerformed

    private void cbotiposervicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotiposervicioActionPerformed
        // TODO add your handling code here:
        cbotiposervicio.transferFocus();
    }//GEN-LAST:event_cbotiposervicioActionPerformed

    private void cbozonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbozonaActionPerformed
        // TODO add your handling code here:
        cbozona.transferFocus();
    }//GEN-LAST:event_cbozonaActionPerformed

    private void cboestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboestadoActionPerformed
        // TODO add your handling code here:
        cboestado.transferFocus();
    }//GEN-LAST:event_cboestadoActionPerformed

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
            java.util.logging.Logger.getLogger(Jingresop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jingresop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jingresop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jingresop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jingresop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnguardar1;
    private javax.swing.JComboBox<String> cboestado;
    private javax.swing.JComboBox<String> cbotiposervicio;
    private javax.swing.JComboBox<String> cbotipovehiculo;
    private javax.swing.JComboBox<String> cbozona;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblregistro;
    private javax.swing.JLabel lblturno;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtempleado;
    private javax.swing.JTextField txtfechaingreso;
    private javax.swing.JTextField txtidingreso;
    private javax.swing.JTextField txtidturno;
    private javax.swing.JTextField txtnumeroturno;
    private javax.swing.JTextField txtobservaciones;
    private javax.swing.JTextField txtplaca;
    // End of variables declaration//GEN-END:variables
}
