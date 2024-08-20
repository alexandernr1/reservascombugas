package Presentacion;

import Datos.Dfactura_electronica;
import Logica.Cconexion;
import Logica.Ffactura_electronica;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jregistro_factura_electronica extends javax.swing.JFrame {
    
    PreparedStatement pst;
    ResultSet rs;
    private static Jregistro_factura_electronica instance;
    
    public Jregistro_factura_electronica() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("REGISTRO FACTURACION ELECTRINOCA");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        Jingreso factura = new Jingreso();
         txtidcliente.setText(factura.idcliente1);
        
    }
    private String accion = "guardar";
    
     public static Jregistro_factura_electronica getInstance() {
        if (instance == null) {
            instance = new Jregistro_factura_electronica();
        }
        return instance;
    }
    
    void limpiarcajas() {
        txtdocumento.setText(null);
        txtdv.setText(null);
        txtrazon_social.setText(null);
        cbotipo_persona.setSelectedItem("Seleccionar");
        cbotipo_documento.setSelectedItem("Seleccionar");
        cbodepartamento.setSelectedItem("Seleccionar");
        cbomunicipio.setSelectedItem("Seleccionar");
        txtdireccion.setText(null);
        txttelefono.setText(null);
        txtemail.setText(null);
        
    }
    
    private void limpiarCheckboxes() {
        chbagente_retencion_iva.setSelected(false);
        chbautoretenedor.setSelected(false);
        chbgrancontribuyente.setSelected(false);
        chbregimen_simple_tributario.setSelected(false);
        chbnoresponsable.setSelected(false);
        chbGrancontribuyente.setSelected(false);
        chbautoretenedores.setSelected(false);
        chbregimencomunpersonajuridica.setSelected(false);
        chbNoResponsableIva.setSelected(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        txtdocumento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtdv = new javax.swing.JTextField();
        txtrazon_social = new javax.swing.JTextField();
        cbotipo_documento = new javax.swing.JComboBox<>();
        cbotipo_persona = new javax.swing.JComboBox<>();
        cbodepartamento = new javax.swing.JComboBox<>();
        cbomunicipio = new javax.swing.JComboBox<>();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        chbgrancontribuyente = new javax.swing.JCheckBox();
        chbregimen_simple_tributario = new javax.swing.JCheckBox();
        chbautoretenedor = new javax.swing.JCheckBox();
        chbagente_retencion_iva = new javax.swing.JCheckBox();
        chbnoresponsable = new javax.swing.JCheckBox();
        btnregistrar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtcajabuscar = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();
        chbautoretenedores = new javax.swing.JCheckBox();
        chbGrancontribuyente = new javax.swing.JCheckBox();
        chbregimencomunpersonajuridica = new javax.swing.JCheckBox();
        chbNoResponsableIva = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENTES FACTURA ELECTRONICA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("Documento:");

        txtdocumento.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdocumentoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Razon social/Nombre:");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Tipo Persona:");

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("Tipo Documento:");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("Departamento:");

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("Municipio:");

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setText("Direccion:");

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setText("Telelfono:");

        jLabel9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel9.setText("Email:");

        jLabel10.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel10.setText("Regimen Fiscal:");

        jLabel11.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel11.setText("Responsabilidades Fiscales:");

        jLabel12.setText("D.V");

        txtdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdvActionPerformed(evt);
            }
        });

        txtrazon_social.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtrazon_social.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrazon_socialActionPerformed(evt);
            }
        });

        cbotipo_documento.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cbotipo_documento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cedula De Ciudadania", "Cedula De Extrageria", "NIT", "Pasaporte" }));
        cbotipo_documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipo_documentoActionPerformed(evt);
            }
        });

        cbotipo_persona.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cbotipo_persona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Natural", "Juridica" }));
        cbotipo_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipo_personaActionPerformed(evt);
            }
        });

        cbodepartamento.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cbodepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Antioquia", "Arauca", "Atlántico", "Bolívar ", "Boyacá", "Caldas", "Caquetá", "Casanare", "Cauca", "Cesar", "Chocó", "Córdoba", "Cundinamarca", "Guainía", "Guaviare", "Huila", "La Guajira", "Magdalena", "Meta", "Nariño", "Norte de Santander", "Putumayo", "Quindío", "Risaralda", "San Andrés y Providencia", "Santander", "Sucre", "Tolima", "Valle del Cauca", "Vaupés", "Vichada" }));
        cbodepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbodepartamentoActionPerformed(evt);
            }
        });

        cbomunicipio.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cbomunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Medellín", " Arauca", " Barranquilla", " Cartagena", " Tunja", " Manizales", " Florencia", " Yopal", " Popayán", " Valledupar", " Quibdó", " Montería", " Bogotá", " Puerto Inírida", " San José del Guaviare", " Neiva", " Riohacha", " Santa Marta", " Villavicencio", " Pasto", " Cúcuta", " Mocoa", " Armenia", " Pereira", " San Andrés", " Bucaramanga", " Sincelejo", " Ibagué", " Cali", "Mitú", "Puerto Carreño" }));
        cbomunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbomunicipioActionPerformed(evt);
            }
        });

        txtdireccion.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        txttelefono.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });

        txtemail.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        chbgrancontribuyente.setText("Gran Contribuyente");
        chbgrancontribuyente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbgrancontribuyenteActionPerformed(evt);
            }
        });

        chbregimen_simple_tributario.setText("Regimen simple de tributacion");

        chbautoretenedor.setText("Autoretenedor");

        chbagente_retencion_iva.setText("Agente de Retencion IVA");

        chbnoresponsable.setText("No responsable");

        btnregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel13.setText("Caja Buscar:");

        txtcajabuscar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtcajabuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcajabuscarKeyPressed(evt);
            }
        });

        txtidcliente.setText("IDC");

        chbautoretenedores.setText("Auto Retenedores");
        chbautoretenedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbautoretenedoresActionPerformed(evt);
            }
        });

        chbGrancontribuyente.setText("Gran Contribuyente");
        chbGrancontribuyente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbGrancontribuyenteActionPerformed(evt);
            }
        });

        chbregimencomunpersonajuridica.setText("Regimen Comun Persona Juridica");
        chbregimencomunpersonajuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbregimencomunpersonajuridicaActionPerformed(evt);
            }
        });

        chbNoResponsableIva.setText("No Responsable de Iva");
        chbNoResponsableIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbNoResponsableIvaActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.GIF"))); // NOI18N
        jButton1.setText("NUEVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtdocumento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtdv, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtrazon_social, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cbotipo_documento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cbotipo_persona, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cbodepartamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cbomunicipio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtdireccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txttelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtemail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(chbgrancontribuyente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(chbregimen_simple_tributario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(chbautoretenedor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(chbagente_retencion_iva, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(chbnoresponsable, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnregistrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtcajabuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtidcliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(chbautoretenedores, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(chbGrancontribuyente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(chbregimencomunpersonajuridica, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(chbNoResponsableIva, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtrazon_social)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbotipo_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbodepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbomunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbotipo_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                                .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(jLabel12))
                                            .addComponent(txtcajabuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtdv, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 112, Short.MAX_VALUE))))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(153, 153, 153)
                                .addComponent(jLabel10))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chbgrancontribuyente)
                                    .addComponent(chbregimen_simple_tributario)
                                    .addComponent(chbagente_retencion_iva)
                                    .addComponent(chbautoretenedor)
                                    .addComponent(chbnoresponsable))
                                .addGap(84, 84, 84)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chbNoResponsableIva)
                                    .addComponent(chbautoretenedores)
                                    .addComponent(chbregimencomunpersonajuridica)
                                    .addComponent(chbGrancontribuyente)))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtcajabuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtrazon_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbotipo_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbotipo_documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbodepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbomunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(8, 8, 8)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbgrancontribuyente)
                    .addComponent(chbautoretenedores))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chbautoretenedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chbagente_retencion_iva)
                        .addGap(4, 4, 4)
                        .addComponent(chbregimen_simple_tributario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chbnoresponsable))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(chbGrancontribuyente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chbregimencomunpersonajuridica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chbNoResponsableIva)))
                .addGap(29, 29, 29)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void chbgrancontribuyenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbgrancontribuyenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbgrancontribuyenteActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        
        if (txtdocumento.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar Documento");
            txtdocumento.requestFocus();
            return;
            
        }
        if (txtrazon_social.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una Razon social/Nombre");
            txtrazon_social.requestFocus();
            return;
            
        }
        if (cbotipo_persona.getSelectedIndex() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes seleccionar un TIPO PERSONA");
            cbotipo_persona.requestFocus();
            return;
            
        }
        if (cbotipo_documento.getSelectedIndex() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes seleccionar un TIPO DOCUMENTO");
            cbotipo_documento.requestFocus();
            return;
            
        }
        Dfactura_electronica dts = new Dfactura_electronica();
        Ffactura_electronica fnc = new Ffactura_electronica();
        
        dts.setDocumento(Integer.parseInt(txtdocumento.getText()));
        dts.setDv(Integer.parseInt(txtdv.getText()));
        dts.setRazon_social(txtrazon_social.getText());
        
        int tipo_persona = cbotipo_persona.getSelectedIndex();
        dts.setTipo_persona((String) cbotipo_persona.getItemAt(tipo_persona));
        int tipo_documento = cbotipo_documento.getSelectedIndex();
        dts.setTipo_documento((String) cbotipo_documento.getItemAt(tipo_documento));
        int departamento = cbodepartamento.getSelectedIndex();
        dts.setDepartamento((String) cbodepartamento.getItemAt(departamento));
        int municipio = cbomunicipio.getSelectedIndex();
        dts.setMunicipio((String) cbomunicipio.getItemAt(municipio));
        
        dts.setDireccion(txtdireccion.getText());
        dts.setTelefono(txttelefono.getText());
        dts.setEmail(txtemail.getText());
        
        List<String> responsabilidadesFiscales = new ArrayList<>();
        
        if (chbagente_retencion_iva.isSelected()) {
            responsabilidadesFiscales.add("Agente Retención IVA");
        }
        if (chbautoretenedor.isSelected()) {
            responsabilidadesFiscales.add("Autoretenedor");
        }
        if (chbgrancontribuyente.isSelected()) {
            responsabilidadesFiscales.add("Gran Contribuyente");
        }
        if (chbregimen_simple_tributario.isSelected()) {
            responsabilidadesFiscales.add("Régimen Simple Tributario");
        }
        if (chbnoresponsable.isSelected()) {
            responsabilidadesFiscales.add("No Responsable");
        }
        String responsabilidadesFiscalesString = String.join(",", responsabilidadesFiscales);

// Pasar la lista de responsabilidades fiscales al método setResponsabilidades_fiscales
        dts.setResponsabilidades_fiscales(responsabilidadesFiscalesString);
        
         List<String> RegimenFiscal = new ArrayList<>();
        
        if (chbautoretenedores.isSelected()) {
             RegimenFiscal.add("Auto Retenedores");
        }
        if (chbGrancontribuyente.isSelected()) {
             RegimenFiscal.add("Gran Contribuyente");
        }
        if (chbregimencomunpersonajuridica.isSelected()) {
             RegimenFiscal.add("Regimen Comun Persona Juridica");
        }
        if (chbregimencomunpersonajuridica.isSelected()) {
             RegimenFiscal.add("No Responsable de Iva");
        }
        
        String  regimenFiscal = String.join(",",  RegimenFiscal);

        dts.setRegimen_fiscal( regimenFiscal);
        
        dts.setIdcliente(Integer.parseInt(txtidcliente.getText()));
        
        if (accion.equals("guardar")) {
            try {
                if (fnc.insertar(dts)) {
                    
                    JOptionPane.showMessageDialog(rootPane, " Se Registro Satisfactoriamente");
                    limpiarcajas();
                    limpiarCheckboxes();
                    this.dispose();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Jregistro_factura_electronica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnregistrarActionPerformed

    private void txtdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdocumentoActionPerformed
        // TODO add your handling code here:
        txtdocumento.transferFocus();
    }//GEN-LAST:event_txtdocumentoActionPerformed

    private void txtdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdvActionPerformed
        // TODO add your handling code here:
        txtdv.transferFocus();
    }//GEN-LAST:event_txtdvActionPerformed

    private void txtrazon_socialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrazon_socialActionPerformed
        // TODO add your handling code here:
        txtrazon_social.transferFocus();
    }//GEN-LAST:event_txtrazon_socialActionPerformed

    private void cbotipo_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipo_personaActionPerformed
        // TODO add your handling code here:
        cbotipo_persona.transferFocus();
    }//GEN-LAST:event_cbotipo_personaActionPerformed

    private void cbotipo_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipo_documentoActionPerformed
        // TODO add your handling code here:
        cbotipo_documento.transferFocus();
    }//GEN-LAST:event_cbotipo_documentoActionPerformed

    private void cbodepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbodepartamentoActionPerformed
        // TODO add your handling code here:
        cbodepartamento.transferFocus();
    }//GEN-LAST:event_cbodepartamentoActionPerformed

    private void cbomunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbomunicipioActionPerformed
        // TODO add your handling code here:
        cbomunicipio.transferFocus();
    }//GEN-LAST:event_cbomunicipioActionPerformed

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

    private void txtcajabuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcajabuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Cconexion conexion = new Cconexion();
            
            try {
                Connection conectar = conexion.establecerConexion();
                
                pst = conectar.prepareStatement("select * from factura_electronica where documento=?");
                pst.setString(1, txtcajabuscar.getText());
                
                rs = pst.executeQuery();
                
                if (rs.next()) {
                    txtdocumento.setText(String.valueOf(rs.getInt("documento")));
                    txtdv.setText(rs.getString("DV"));
                    txtrazon_social.setText(rs.getString("razon_social"));
                    cbotipo_persona.setSelectedItem(rs.getString("tipo_persona"));
                    cbotipo_documento.setSelectedItem(rs.getString("tipo_documento"));
                    cbodepartamento.setSelectedItem(rs.getString("departamento"));
                    cbomunicipio.setSelectedItem(rs.getString("municipio"));
                    txtdireccion.setText(rs.getString("direccion"));
                    txttelefono.setText(rs.getString("telefono"));
                    txtemail.setText(rs.getString("email"));
                    String responsabilidadesFiscales = rs.getString("responsabilidades_fiscales");

                    // Desmarcar todos los checkboxes primero
                    chbagente_retencion_iva.setSelected(false);
                    chbautoretenedor.setSelected(false);
                    chbgrancontribuyente.setSelected(false);
                    chbregimen_simple_tributario.setSelected(false);
                    chbnoresponsable.setSelected(false);

                    // Dividir la cadena de responsabilidades fiscales y marcar los checkboxes correspondientes
                    if (responsabilidadesFiscales != null && !responsabilidadesFiscales.isEmpty()) {
                        String[] responsabilidadesArray = responsabilidadesFiscales.split(",");
                        
                        for (String responsabilidad : responsabilidadesArray) {
                            switch (responsabilidad.trim()) {
                                case "Agente Retención IVA" -> chbagente_retencion_iva.setSelected(true);
                                case "Autoretenedor" -> chbautoretenedor.setSelected(true);
                                case "Gran Contribuyente" -> chbgrancontribuyente.setSelected(true);
                                case "Régimen Simple Tributario" -> chbregimen_simple_tributario.setSelected(true);
                                case "No Responsable" -> chbnoresponsable.setSelected(true);
                            }
                        }
                    }
                    String Regimenfiscal = rs.getString("regimen_fiscal");

                    // Desmarcar todos los checkboxes primero
                    chbautoretenedores.setSelected(false);
                    chbGrancontribuyente.setSelected(false);
                    chbregimencomunpersonajuridica.setSelected(false);
                    chbNoResponsableIva.setSelected(false);
                   

                    // Dividir la cadena de responsabilidades fiscales y marcar los checkboxes correspondientes
                    if (Regimenfiscal != null && !Regimenfiscal.isEmpty()) {
                        String[] regimenArray = Regimenfiscal.split(",");
                        
                        for (String regimen : regimenArray) {
                            switch (regimen .trim()) {
                                case "Agente Retención IVA" -> chbautoretenedores.setSelected(true);
                                case "Autoretenedor" -> chbGrancontribuyente.setSelected(true);
                                case "Gran Contribuyente" -> chbregimencomunpersonajuridica.setSelected(true);
                                case "Régimen Simple Tributario" -> chbNoResponsableIva.setSelected(true);
                                
                            }
                        }
                    }
                
             

                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el documento solicitado");
                }
                conectar.close();                
                
            } catch (HeadlessException | SQLException ex) {
                System.err.println("Error: " + ex);
            }
        }
    }//GEN-LAST:event_txtcajabuscarKeyPressed

    private void chbautoretenedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbautoretenedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbautoretenedoresActionPerformed

    private void chbGrancontribuyenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbGrancontribuyenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbGrancontribuyenteActionPerformed

    private void chbregimencomunpersonajuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbregimencomunpersonajuridicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbregimencomunpersonajuridicaActionPerformed

    private void chbNoResponsableIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbNoResponsableIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbNoResponsableIvaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         limpiarcajas();
         limpiarCheckboxes();
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
            java.util.logging.Logger.getLogger(Jregistro_factura_electronica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jregistro_factura_electronica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jregistro_factura_electronica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jregistro_factura_electronica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jregistro_factura_electronica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregistrar;
    private javax.swing.JComboBox<String> cbodepartamento;
    private javax.swing.JComboBox<String> cbomunicipio;
    private javax.swing.JComboBox<String> cbotipo_documento;
    private javax.swing.JComboBox<String> cbotipo_persona;
    private javax.swing.JCheckBox chbGrancontribuyente;
    private javax.swing.JCheckBox chbNoResponsableIva;
    private javax.swing.JCheckBox chbagente_retencion_iva;
    private javax.swing.JCheckBox chbautoretenedor;
    private javax.swing.JCheckBox chbautoretenedores;
    private javax.swing.JCheckBox chbgrancontribuyente;
    private javax.swing.JCheckBox chbnoresponsable;
    private javax.swing.JCheckBox chbregimen_simple_tributario;
    private javax.swing.JCheckBox chbregimencomunpersonajuridica;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtcajabuscar;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtdv;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtrazon_social;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
