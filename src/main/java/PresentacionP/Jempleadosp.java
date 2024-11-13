package PresentacionP;

import DatosP.Dempleadop;
import LogicaP.Fempleadop;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Jempleadosp extends javax.swing.JFrame {

    public Jempleadosp() {
        initComponents();
        setTitle("REGISTRO DE EMPLEADOS");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mostrarp("");
        inhabilitar();
        configurarTabla();
    }
    private String accion = "guardar";

    void ocultar_columnas() {
        tablalistadoP.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistadoP.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistadoP.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    private void configurarTabla() {
        // Aquí configuras el comportamiento y el estilo de la tabla
        tablalistadoP.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablalistadoP.setRowHeight(25); // Ajusta la altura de las filas
        tablalistadoP.setRowMargin(5); // Espacio entre filas

        // Cambiar color del encabezado usando un renderer personalizado
        JTableHeader header = tablalistadoP.getTableHeader();
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
        tablalistadoP.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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

    void inhabilitar() {

        txtidempleado.setVisible(false);
        txtidempleado.setText("");
        txtnombres.setText("");
        txtapellidos.setText("");
        txtdocumento.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtemail.setText("");
        txtpais.setText("");
        txtciudad.setText("");
        txtlogin.setText("");
        txtpassword.setText("");

        txteps.setText("");
        txtarl.setText("");

    }

    void habilitar() {
        txtidempleado.setVisible(false);
        txtnombres.setEnabled(true);
        txtapellidos.setEnabled(true);
        comtipodocumento.setEnabled(true);
        txtdocumento.setEnabled(true);
        txtdireccion.setEnabled(true);
        txttelefono.setEnabled(true);
        txtemail.setEnabled(true);
        txtpais.setEnabled(true);
        txtciudad.setEnabled(true);
        cboacceso.setEnabled(true);
        txtlogin.setEnabled(true);
        txtpassword.setEnabled(true);
        cboestado.setEnabled(true);
        txteps.setEnabled(true);
        txtarl.setEnabled(true);

        btnGuardarp.setEnabled(true);

//        btneliminar.setEnabled(true);
        txtidempleado.setText("");
        txtnombres.setText("");
        txtapellidos.setText("");
        txtdocumento.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtemail.setText("");
        txtpais.setText("");
        txtciudad.setText("");
        txtlogin.setText("");
        txtpassword.setText("");
        cboestado.setEnabled(true);
        txteps.setText("");
        txtarl.setText("");

    }

    void mostrarp(String buscar) {
        try {
            DefaultTableModel modelo;
            Fempleadop func = new Fempleadop();
            modelo = func.mostrarp(buscar);

            tablalistadoP.setModel(modelo);
            ocultar_columnas();
            lbltotalregistro1.setText("Total Registros " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        txtidempleado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtdocumento = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        cboacceso = new javax.swing.JComboBox();
        comtipodocumento = new javax.swing.JComboBox<>();
        txtpais = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtciudad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txteps = new javax.swing.JTextField();
        txtarl = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cboestado = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtlogin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        btnGuardarp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtbuscar1 = new javax.swing.JTextField();
        btnbuscar1 = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablalistadoP = new javax.swing.JTable();
        lbltotalregistro1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO DE EMPLEADOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        txtidempleado.setText("IDP");
        txtidempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidempleadoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nombres:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Apellidos:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Tipo Documento:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Documento:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Dirección:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Teléfono:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Acceso:");

        txtnombres.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombresActionPerformed(evt);
            }
        });

        txtapellidos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtapellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidosActionPerformed(evt);
            }
        });

        txtdocumento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdocumentoActionPerformed(evt);
            }
        });

        txtdireccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        txttelefono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });

        txtemail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        cboacceso.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cboacceso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Empleado", "Administrador", "General" }));

        comtipodocumento.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        comtipodocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Tarjeta de identidad", "Cedula de ciudadania", "Cedula extrangeria ", "Pasaporte", " " }));
        comtipodocumento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comtipodocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comtipodocumentoActionPerformed(evt);
            }
        });

        txtpais.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaisActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText(" Ciudad:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Pais :");

        txtciudad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtciudadActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("EPS:");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("ARL:");

        txteps.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txtarl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Estado:");

        cboestado.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "D" }));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("login:");

        txtlogin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Password:");

        txtpassword.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btnGuardarp.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnGuardarp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnGuardarp.setText("Guardar");
        btnGuardarp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarp.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardarp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarpActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.GIF"))); // NOI18N
        jButton1.setText("Nuevo");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(txtidempleado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtnombres, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtapellidos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtdocumento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtdireccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txttelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtemail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cboacceso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(comtipodocumento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtpais, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtciudad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txteps, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtarl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cboestado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtlogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtpassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnGuardarp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarp)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel1)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(71, 71, 71)
                                        .addComponent(jLabel14))
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtarl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txteps, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(txtapellidos, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombres, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(txtpais, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                        .addComponent(jLabel9))
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comtipodocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(txtciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cboacceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(comtipodocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(txtpais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txtciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(cboacceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txteps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtarl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setText("Buscar:");

        txtbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscar1ActionPerformed(evt);
            }
        });

        btnbuscar1.setBackground(new java.awt.Color(204, 204, 204));
        btnbuscar1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnbuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnbuscar1.setText("Buscar");
        btnbuscar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar1ActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(204, 204, 204));
        btneliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        tablalistadoP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablalistadoP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombres", "Apellidos", "Documento", "Numero ", "Direccion", "Telefono", "Email", "Pais", "Ciudad", "acceso", "login", "passwrod", "Estado", "Eps", "Arl"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablalistadoP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoPMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablalistadoP);

        lbltotalregistro1.setText("Total registro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbltotalregistro1)
                        .addGap(126, 126, 126))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnbuscar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addComponent(lbltotalregistro1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidempleadoActionPerformed

    private void txtnombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombresActionPerformed
        // TODO add your handling code here:
        txtnombres.transferFocus();
    }//GEN-LAST:event_txtnombresActionPerformed

    private void txtapellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidosActionPerformed
        // TODO add your handling code here:
        txtapellidos.transferFocus();
    }//GEN-LAST:event_txtapellidosActionPerformed

    private void txtdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdocumentoActionPerformed
        // TODO add your handling code here:
        txtdocumento.transferFocus();
    }//GEN-LAST:event_txtdocumentoActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
        txtdireccion.transferFocus();
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
        txttelefono.transferFocus();
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
        txtemail.transferFocus();
    }//GEN-LAST:event_txtemailActionPerformed

    private void comtipodocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comtipodocumentoActionPerformed
        // TODO add your handling code here:
        comtipodocumento.transferFocus();
    }//GEN-LAST:event_comtipodocumentoActionPerformed

    private void txtpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaisActionPerformed
        // TODO add your handling code here:
        txtpais.transferFocus();
    }//GEN-LAST:event_txtpaisActionPerformed

    private void txtciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtciudadActionPerformed
        // TODO add your handling code here:
        txtciudad.transferFocus();
    }//GEN-LAST:event_txtciudadActionPerformed
   
    private void txtbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscar1ActionPerformed

    private void btnbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar1ActionPerformed
        // TODO add your handling code here:
//        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscar1ActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
      
        if (!txtidempleado.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estás seguro de Eliminar el empleado?", "Confirmar", 2);

            if (confirmacion == 0) {
                Fempleadop func = new Fempleadop();
                Dempleadop dts = new Dempleadop();

                dts.setIdempleado(Integer.parseInt(txtidempleado.getText()));
                try {
                    func.eliminar(dts);
                } catch (SQLException ex) {
                    Logger.getLogger(Jempleadosp.class.getName()).log(Level.SEVERE, null, ex);
                }
                mostrarp("");
                inhabilitar();

            }

        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void tablalistadoPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoPMouseClicked
        // TODO add your handling code here:
        btnGuardarp.setText("Editar");
        habilitar();
        btneliminar.setEnabled(true);
        accion = "editar";

        int fila = tablalistadoP.rowAtPoint(evt.getPoint());

        txtidempleado.setText(tablalistadoP.getValueAt(fila, 0).toString());
        txtnombres.setText(tablalistadoP.getValueAt(fila, 1).toString());
        txtapellidos.setText(tablalistadoP.getValueAt(fila, 2).toString());
        comtipodocumento.setSelectedItem(tablalistadoP.getValueAt(fila, 3).toString());
        txtdocumento.setText(tablalistadoP.getValueAt(fila, 4).toString());
        txttelefono.setText(tablalistadoP.getValueAt(fila, 5).toString());
        txtdireccion.setText(tablalistadoP.getValueAt(fila, 6).toString());
        txtemail.setText(tablalistadoP.getValueAt(fila, 7).toString());
        txtpais.setText(tablalistadoP.getValueAt(fila, 8).toString());
        txtciudad.setText(tablalistadoP.getValueAt(fila, 9).toString());
        cboacceso.setSelectedItem(tablalistadoP.getValueAt(fila, 10).toString());
        txtlogin.setText(tablalistadoP.getValueAt(fila, 11).toString());
        txtpassword.setText(tablalistadoP.getValueAt(fila, 12).toString());
        cboestado.setSelectedItem(tablalistadoP.getValueAt(fila, 13).toString());
        txteps.setText(tablalistadoP.getValueAt(fila, 14).toString());
        txtarl.setText(tablalistadoP.getValueAt(fila, 15).toString());
    }//GEN-LAST:event_tablalistadoPMouseClicked

    private void btnGuardarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarpActionPerformed
        // TODO add your handling code here:
         if (txtnombres.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Nombre para el empleado");
            txtnombres.requestFocus();
            return;
        }
        if (txtapellidos.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un apellido para el empleado");
            txtapellidos.requestFocus();
            return;
        }

        if (txtdocumento.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Número de Doc para el empleado");
            txtdocumento.requestFocus();
            return;
        }

        if (txtlogin.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un login para el empleado");
            txtlogin.requestFocus();
            return;
        }
        if (txtpassword.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un password para el empleado");
            txtpassword.requestFocus();
            return;
        }

        Dempleadop dts = new Dempleadop();
        Fempleadop func = new Fempleadop();

        dts.setNombres(txtnombres.getText());
        dts.setApellidos(txtapellidos.getText());

        int seleccionado = comtipodocumento.getSelectedIndex();
        dts.setTipodocumento((String) comtipodocumento.getItemAt(seleccionado));
        dts.setDocumento(txtdocumento.getText());
        dts.setDireccion(txtdireccion.getText());
        dts.setTelefono(txttelefono.getText());
        dts.setEmail(txtemail.getText());
        dts.setPais(txtpais.getText());
        dts.setCiudad(txtciudad.getText());

        seleccionado = cboacceso.getSelectedIndex();
        dts.setAcceso((String) cboacceso.getItemAt(seleccionado));
        dts.setLogin(txtlogin.getText());
        dts.setPassword(txtpassword.getText());
        dts.setEps(txteps.getText());
        dts.setArl(txtarl.getText());

        seleccionado = cboestado.getSelectedIndex();
        dts.setEstado((String) cboestado.getItemAt(seleccionado));

        if (accion.equals("guardar")) {
            try {
                if (func.insertar(dts)) {
                    JOptionPane.showMessageDialog(rootPane, "el empleado fue registrado satisfactoriamente");
                    mostrarp("");
                    inhabilitar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Jempleadosp.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (accion.equals("editar")) {
            dts.setIdempleado(Integer.parseInt(txtidempleado.getText()));

            try {
                if (func.editar(dts)) {
                    JOptionPane.showMessageDialog(rootPane, "El empleado fue Editado satisfactoriamente");
                    mostrarp("");
                    inhabilitar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Jempleadosp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btnGuardarpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        habilitar();
        btnGuardarp.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Jempleadosp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jempleadosp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jempleadosp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jempleadosp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jempleadosp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarp;
    private javax.swing.JButton btnbuscar1;
    private javax.swing.JButton btneliminar;
    private javax.swing.JComboBox cboacceso;
    private javax.swing.JComboBox cboestado;
    private javax.swing.JComboBox<String> comtipodocumento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbltotalregistro1;
    private javax.swing.JTable tablalistadoP;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtarl;
    private javax.swing.JTextField txtbuscar1;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txteps;
    private javax.swing.JTextField txtidempleado;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtpais;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
