package Presentacion;

import Datos.Dfactura_electronica;
import Datos.Dpago;
import Datos.Tiempopro;
import Impresion.ImprimirPagos;
import Logica.Cconexion;
import Logica.Fpago;
import Logica.Fsalida;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public final class Jpago extends javax.swing.JFrame {

    Tiempopro time = new Tiempopro();

    @SuppressWarnings("static-access")
    public Jpago() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("PAGOS");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        inhabilitar();
        mostrarTiempo();
        generarnumero();
        txtefectivo.setText("0");
        txttarjeta.setText("0");
        txttransferencia.setText("0");
        txtreten_35.setText("0");
        txtreten4.setText("0");

        Jsalidahuesped pago = new Jsalidahuesped();
        
//        txtcliente.setText(pago.razon_social);
//        txtdocumento.setText(pago.documento);
//        txtcorreo.setText(pago.correo);
//        txtnumero_noches.setText(pago.numero_noches);
//        txthabitacion.setText(pago.habitacion);
//        txtdescuentos.setText(pago.totaldescuentos);
//        txtcobrosfraccion.setText(pago.cobros_extra);
//        txtvaloracobrar.setText(pago.pagototal);
//        txtempleado.setText(pago.empleado);
//        txtnumero_turno.setText(pago.numero_turno);
//        txtdeudaanterior.setText(pago.deuda_anterior);
//        txtidcliente.setText(pago.idcliente);
//        calulo19();
        
    }

    private String accion = "guardar";

    private void mostrarTiempo() {

        txtfechaemision.setText(time.getFechacomp());
    }

    public void generarnumero() {
        Fpago func = new Fpago();
        int numeroTurno = func.generarComprobante();
        String numero = Integer.toString(numeroTurno);
        txtnumcomprobante.setText(numero);
    }

    void inhabilitar() {
        txtidpago.setVisible(false);

    }

    private void limpiarCajas() {
        txtidpago.setText("");
//    txtidsalida.setText("");
        txtcliente.setText("");
        txthabitacion.setText("");
        txtfechaemision.setText("");
        cbotipocomprobante.setSelectedIndex(0);
        txtnumcomprobante.setText("");
        txtefectivo.setText("");
        txttarjeta.setText("");
        txttransferencia.setText("");
        txtdescuentos.setText("");
        txtcobrosfraccion.setText("");
        txtvaloracobrar.setText("");
        txt_total_final.setText("");
        txtempleado.setText("");
        txtnumero_turno.setText("");
        txtdeudaanterior.setText("");
        cboestado.setSelectedIndex(0);
        txtdocumento.setText(null);
        txtcorreo.setText(null);
        txtnumero_noches.setText(null);
    }

    public void calulo19() {
        int valorCobrar = Integer.parseInt(txtvaloracobrar.getText());
        int valorConIVA = (int) (valorCobrar * 0.19);
        txtIVA_19.setText(String.valueOf(valorConIVA));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnumcomprobante = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cbotipocomprobante = new javax.swing.JComboBox<>();
        txtcliente = new javax.swing.JTextField();
        txtempleado = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtnumero_turno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboestado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        txtdocumento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txthabitacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtfechaemision = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtdescuentos = new javax.swing.JTextField();
        txtcobrosfraccion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtdeudaanterior = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtvaloracobrar = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtIVA_19 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtreten_35 = new javax.swing.JTextField();
        txtreten4 = new javax.swing.JTextField();
        calcular35 = new javax.swing.JButton();
        calcular4 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        Btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnImprimirComprobante = new javax.swing.JButton();
        btnvistapago = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtefectivo = new javax.swing.JTextField();
        txttarjeta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txttransferencia = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_total_final = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtidpago = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtvalordescuento = new javax.swing.JTextField();
        txtDescuentos = new javax.swing.JTextField();
        txtotroscobros = new javax.swing.JTextField();
        txtvalorbruto = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtabonohabitacion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtnumero_noches = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtcostoalojamiento = new javax.swing.JTextField();
        txtidingreso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL PAGO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("Tipo Comprobante:");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("N° Comprobante: ");

        txtnumcomprobante.setEditable(false);
        txtnumcomprobante.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtnumcomprobante.setText(" ");
        txtnumcomprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumcomprobanteActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel19.setText("Cliente:");

        cbotipocomprobante.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cbotipocomprobante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Recibo", "Factura", "Otros" }));

        txtcliente.setEditable(false);
        txtcliente.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtcliente.setText("\n");
        txtcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclienteActionPerformed(evt);
            }
        });

        txtempleado.setEditable(false);
        txtempleado.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel20.setText("Responsable:");

        txtnumero_turno.setEditable(false);
        txtnumero_turno.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        txtnumero_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumero_turnoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setText("Numero turno:");

        jLabel9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel9.setText("Estado:");

        cboestado.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagado", "Pendiente" }));

        jLabel10.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel10.setText("NIT/C.C:");

        jLabel12.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel12.setText("Correo:");

        txtcorreo.setEditable(false);
        txtcorreo.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtcorreo.setText(" ");
        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });

        txtdocumento.setEditable(false);
        txtdocumento.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtdocumento.setText(" ");
        txtdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdocumentoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Habitación:");

        txthabitacion.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txthabitacion.setText("\n");
        txthabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthabitacionActionPerformed(evt);
            }
        });
        txthabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txthabitacionKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setText("Fecha Emision:");

        txtfechaemision.setEditable(false);
        txtfechaemision.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtfechaemision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaemisionActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtnumcomprobante, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cbotipocomprobante, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtcliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtempleado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtnumero_turno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cboestado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtcorreo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtdocumento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txthabitacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtfechaemision, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txthabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfechaemision, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtnumero_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtcliente)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbotipocomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumcomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txthabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtfechaemision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtnumero_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbotipocomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnumcomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DETALLE DEL PAGO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel15.setText("Descuentos:");

        txtdescuentos.setEditable(false);
        txtdescuentos.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        txtcobrosfraccion.setEditable(false);
        txtcobrosfraccion.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel13.setText(" Cobros  fraccion:");

        txtdeudaanterior.setEditable(false);
        txtdeudaanterior.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel21.setText("Deuda Anterior:");

        txtvaloracobrar.setEditable(false);
        txtvaloracobrar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel17.setText("Total antes de Inpuestos");

        jLabel22.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel22.setText("IVA(19.00%):");

        txtIVA_19.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
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

        jLabel23.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel23.setText("Descuento Reten (3.5%):");

        txtreten_35.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
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

        txtreten4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
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

        calcular35.setText("Calcular");
        calcular35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular35ActionPerformed(evt);
            }
        });

        calcular4.setText("Calcular");
        calcular4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular4ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel26.setText("Descuento Reten (4%):");

        jLabel16.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel16.setText("Subtotal:");

        txtsubtotal.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtsubtotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsubtotalKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel16)
                    .addComponent(jLabel26))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtIVA_19)
                        .addComponent(txtvaloracobrar)
                        .addComponent(txtdeudaanterior)
                        .addComponent(txtcobrosfraccion)
                        .addComponent(txtdescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtsubtotal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtreten4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtreten_35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calcular35)
                            .addComponent(calcular4))))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtdescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcobrosfraccion)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdeudaanterior)
                    .addComponent(jLabel21))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtvaloracobrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(txtIVA_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtreten_35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcular35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtreten4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcular4)
                    .addComponent(jLabel26))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsubtotal)
                    .addComponent(jLabel16))
                .addContainerGap())
        );

        Btnnuevo.setBackground(new java.awt.Color(204, 204, 204));
        Btnnuevo.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.GIF"))); // NOI18N
        Btnnuevo.setText("NUEVO");
        Btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnnuevoActionPerformed(evt);
            }
        });

        btnguardar.setBackground(new java.awt.Color(204, 204, 204));
        btnguardar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnImprimirComprobante.setBackground(new java.awt.Color(204, 204, 204));
        btnImprimirComprobante.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnImprimirComprobante.setText("Imprimir");
        btnImprimirComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirComprobanteActionPerformed(evt);
            }
        });

        btnvistapago.setBackground(new java.awt.Color(204, 204, 204));
        btnvistapago.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnvistapago.setText("Consultar");
        btnvistapago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvistapagoActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORMAS DE PAGO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Tarjeta:");

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("Transferencia:");

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("Efectivo:");

        jLabel18.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel18.setText("Total final:");

        txt_total_final.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txt_total_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_total_finalActionPerformed(evt);
            }
        });
        txt_total_final.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_total_finalKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txttransferencia, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addComponent(txttarjeta)
                        .addComponent(txtefectivo))
                    .addComponent(txt_total_final, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtefectivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttarjeta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txttransferencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txt_total_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel25.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel25.setText("Vista tabala pagos:");

        txtidpago.setText("IDP");

        txtidcliente.setText("IDC");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESCUENTOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 14))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel11.setText("Abono Habitación:");

        txtDescuentos.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtDescuentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentosActionPerformed(evt);
            }
        });
        txtDescuentos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescuentosKeyPressed(evt);
            }
        });

        txtotroscobros.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtotroscobros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtotroscobrosActionPerformed(evt);
            }
        });

        txtvalorbruto.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel24.setText("Total Bruto:");

        jLabel27.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel27.setText("Descuentos:");

        jLabel28.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel28.setText("valor del descuento:");

        jLabel29.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel29.setText("Otros cobros:");

        txtabonohabitacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel14.setText("Numero noches:");

        txtnumero_noches.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtnumero_noches.setText("\n");
        txtnumero_noches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumero_nochesActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel31.setText("Costo Alojamiento:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescuentos))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcostoalojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumero_noches, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtabonohabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(txtvalordescuento))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtvalorbruto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtotroscobros)
                        .addGap(20, 20, 20))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtabonohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtvalordescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtcostoalojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtnumero_noches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtotroscobros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtvalorbruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(28, 28, 28))
        );

        txtidingreso.setText("IDI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btnnuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImprimirComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(btnvistapago)
                        .addGap(45, 45, 45)
                        .addComponent(txtidpago, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtidingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(463, 463, 463))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(txtidingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidpago, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnvistapago)
                    .addComponent(btnImprimirComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txthabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthabitacionActionPerformed

    private void txtnumcomprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumcomprobanteActionPerformed


    }//GEN-LAST:event_txtnumcomprobanteActionPerformed

    private void btnvistapagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvistapagoActionPerformed

        Jvistapago pago = new Jvistapago();
        pago.toFront();
        pago.setVisible(true);

    }//GEN-LAST:event_btnvistapagoActionPerformed

    private void btnImprimirComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirComprobanteActionPerformed

        ImprimirPagos imprimir = new ImprimirPagos();
        try {
            imprimir.ImprimirFacturaPago();
        } catch (IOException ex) {
            Logger.getLogger(Jpago.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImprimirComprobanteActionPerformed

    private void txtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclienteActionPerformed

    private void txtfechaemisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaemisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaemisionActionPerformed

    private void BtnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnnuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:

        if (cbotipocomprobante.getSelectedIndex() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes seleccionar tipo comprobante");
            cbotipocomprobante.requestFocus();
            return;
        }
        if (txtvaloracobrar.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el total de pago del comprobante");
            txtvaloracobrar.requestFocus();
            return;
        }

        if (txtnumcomprobante.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Número de Comprobante del Pago");
            txtnumcomprobante.requestFocus();
            return;
        }

        Dpago dts = new Dpago();
        Fpago func = new Fpago();

        dts.setCliente(txtcliente.getText());
        dts.setNumero(Integer.parseInt(txthabitacion.getText()));
        dts.setFechaemision(txtfechaemision.getText());
        int seleccionado = cbotipocomprobante.getSelectedIndex();
        dts.setTipocomprobante((String) cbotipocomprobante.getItemAt(seleccionado));
        dts.setNumcomprobante(txtnumcomprobante.getText());
        dts.setEfectivo(Integer.parseInt(txtefectivo.getText()));
        dts.setTarjeta(Integer.parseInt(txttarjeta.getText()));
        dts.setTransferencia(Integer.parseInt(txttransferencia.getText()));
        dts.setDescuentos(Integer.parseInt(txtdescuentos.getText()));
        dts.setCobrosfraccion(Integer.parseInt(txtcobrosfraccion.getText()));
        dts.setValorcobrar(Integer.parseInt(txtvaloracobrar.getText()));
        dts.setNetoapagar(Integer.parseInt(txt_total_final.getText()));
        dts.setEmpleado(txtempleado.getText());
        dts.setNumero_turno(Integer.parseInt(txtnumero_turno.getText()));
        dts.setDeuda_anterior(Integer.parseInt(txtdeudaanterior.getText()));
        int estado = cboestado.getSelectedIndex();
        dts.setEstado((String) cboestado.getItemAt(estado));
        dts.setDocumento(Integer.parseInt(txtdocumento.getText()));
        dts.setCorreo(txtcorreo.getText());
        dts.setNumero_noches(Integer.parseInt(txtnumero_noches.getText()));
        dts.setIVA(Integer.parseInt(txtIVA_19.getText()));
        dts.setRetencion35(Integer.parseInt(txtreten_35.getText()));
        dts.setRetencion4(Integer.parseInt(txtreten4.getText()));
        dts.setIdcliente(Integer.parseInt(txtidcliente.getText()));

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, " El pago por $. " + txt_total_final.getText()
                        + " del Sr. " + txtcliente.getText() + " Ha sido realizado con Éxito");

                inhabilitar();
                limpiarCajas();

                ImprimirPagos imprimir = new ImprimirPagos();
                try {
                    imprimir.ImprimirFacturaPago();
                } catch (IOException ex) {
                    Logger.getLogger(Jpago.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txt_total_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_total_finalActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txt_total_finalActionPerformed

    private void txt_total_finalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_total_finalKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                // Obtener los valores de los campos de texto y convertirlos a enteros
                int efectivo = Integer.parseInt(txtefectivo.getText());
                int tarjeta = Integer.parseInt(txttarjeta.getText());
                int transferencia = Integer.parseInt(txttransferencia.getText());

                int totalPago = efectivo + tarjeta + transferencia;
                txt_total_final.setText(String.valueOf(totalPago));

            } catch (NumberFormatException e) {
                // Manejar la excepción si alguno de los campos de texto no contiene un número válido
                System.err.println("Error: uno o más campos no contienen un número válido");
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_txt_total_finalKeyPressed

    private void txtnumero_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumero_turnoActionPerformed
        // Generar el número de turno
    }//GEN-LAST:event_txtnumero_turnoActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void txtdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdocumentoActionPerformed

    private void txtnumero_nochesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumero_nochesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumero_nochesActionPerformed

    private void txthabitacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthabitacionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Cconexion conexion = new Cconexion();

            try ( Connection conectar = conexion.establecerConexion()) {
                String consultaSQL = "SELECT i.idingreso, i.idhabitacion, h.numero, h.precio, i.idcliente, "
                        + "(SELECT nombres FROM cliente WHERE idcliente = i.idcliente) AS clienten, "
                        + "(SELECT apellidos FROM cliente WHERE idcliente = i.idcliente) AS clienteap, "
                        + "(SELECT numdocumento FROM cliente WHERE idcliente = i.idcliente) AS clientenu "
                        + "FROM ingreso i "
                        + "INNER JOIN habitacion h ON i.idhabitacion = h.idhabitacion "
                        + "WHERE h.numero = ? AND i.estado = 'Activo'";

                try ( PreparedStatement pst = conectar.prepareStatement(consultaSQL)) {
                    pst.setString(1, txthabitacion.getText());

                    try ( ResultSet rs = pst.executeQuery()) {
                        if (rs.next()) {
                            // Mostrar datos en los JTextField correspondientes

                            txtidingreso.setText(String.valueOf(rs.getInt("idingreso")));
//                            txtidhabitacion.setText(String.valueOf(rs.getInt("idhabitacion")));
                            txtidcliente.setText(String.valueOf(rs.getInt("idcliente")));
//                            txtcliente.setText(rs.getString("clienten") + " " + rs.getString("clienteap"));
//                            txtcostoalojamiento.setText(String.valueOf(rs.getDouble("precio")));
//                            txtnumero.setText(String.valueOf(rs.getInt("numero")));
//                            txtclientenu.setText(String.valueOf(rs.getString("clientenu")));

                            int factura = Integer.parseInt(txtidcliente.getText());
                            Dfactura_electronica clienteF = new Fsalida().cleinteFacturar(factura);
                            if (clienteF != null) {
                                txtcliente.setText(clienteF.getRazon_social());
                                txtcorreo.setText(clienteF.getEmail());
                                txtdocumento.setText(String.valueOf(clienteF.getDocumento()));
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "No se encontró el CLIENTE solicitado.");
                        }
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al obtener los datos: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_txthabitacionKeyPressed

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

    private void calcular35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcular35ActionPerformed
        // TODO add your handling code here:
        int valorcobrar = Integer.parseInt(txtvaloracobrar.getText());
        int valorConIVA = Integer.parseInt(txtIVA_19.getText());
        int Suma = (int) (valorcobrar + valorConIVA);
        int Reten35 = (int) (Suma * 0.035);
        txtreten_35.setText(String.valueOf(Reten35));
    }//GEN-LAST:event_calcular35ActionPerformed

    private void calcular4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcular4ActionPerformed
        // TODO add your handling code here:
        int valorcobrar = Integer.parseInt(txtvaloracobrar.getText());
        int valorConIVA = Integer.parseInt(txtIVA_19.getText());
        int Suma = (int) (valorcobrar + valorConIVA);
        int reten4 = (int) (Suma * 0.04);
        txtreten4.setText(String.valueOf(reten4));
    }//GEN-LAST:event_calcular4ActionPerformed

    private void txtsubtotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsubtotalKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                // Obtener los valores de los campos de texto y convertirlos a enteros
                int valoracobrar = Integer.parseInt(txtvaloracobrar.getText());
                int Iva19 = Integer.parseInt(txtIVA_19.getText());
                int reten35 = Integer.parseInt(txtreten_35.getText());
                int reten4 = Integer.parseInt(txtreten4.getText());

                int subtotal = valoracobrar + Iva19 - reten35 - reten4;
                txtsubtotal.setText(String.valueOf(subtotal));

            } catch (NumberFormatException e) {
                // Manejar la excepción si alguno de los campos de texto no contiene un número válido
                System.err.println("Error: uno o más campos no contienen un número válido");
                e.printStackTrace();
            }

        }

    }//GEN-LAST:event_txtsubtotalKeyPressed

    private void txtDescuentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuentosActionPerformed

    private void txtDescuentosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentosKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                int abonohabitacion = Integer.parseInt(txtabonohabitacion.getText());
                int valordescuento = Integer.parseInt(txtvalordescuento.getText());
                int numeronoches = Integer.parseInt(txtnumero_noches.getText());
                
                System.out.println("Abono Habitación: " + abonohabitacion);
                System.out.println("Número Noches: " + numeronoches);
                System.out.println("Valor Descuento: " + valordescuento);

                // Validación adicional para evitar cálculos negativos
                if (valordescuento < 0 || numeronoches < 0) {
                    JOptionPane.showMessageDialog(null, "El número de noches y el valor del descuento deben ser positivos.");
                    return;
                }

                int calculo = valordescuento * numeronoches;
                txtDescuentos.setText(String.valueOf(calculo));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa números válidos.");
            }
        }
    }//GEN-LAST:event_txtDescuentosKeyPressed

    private void txtotroscobrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtotroscobrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtotroscobrosActionPerformed

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
            java.util.logging.Logger.getLogger(Jpago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jpago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jpago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jpago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jpago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnnuevo;
    private javax.swing.JButton btnImprimirComprobante;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnvistapago;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calcular35;
    private javax.swing.JButton calcular4;
    private javax.swing.JComboBox<String> cboestado;
    private javax.swing.JComboBox<String> cbotipocomprobante;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
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
    private javax.swing.JTextField txtDescuentos;
    private javax.swing.JTextField txtIVA_19;
    private javax.swing.JTextField txt_total_final;
    public static javax.swing.JTextField txtabonohabitacion;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtcobrosfraccion;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtcostoalojamiento;
    private javax.swing.JTextField txtdescuentos;
    private javax.swing.JTextField txtdeudaanterior;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtefectivo;
    private javax.swing.JTextField txtempleado;
    private javax.swing.JTextField txtfechaemision;
    private javax.swing.JTextField txthabitacion;
    private javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtidingreso;
    private javax.swing.JTextField txtidpago;
    private javax.swing.JTextField txtnumcomprobante;
    private javax.swing.JTextField txtnumero_noches;
    private javax.swing.JTextField txtnumero_turno;
    private javax.swing.JTextField txtotroscobros;
    private javax.swing.JTextField txtreten4;
    private javax.swing.JTextField txtreten_35;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttarjeta;
    private javax.swing.JTextField txttransferencia;
    private javax.swing.JTextField txtvaloracobrar;
    private javax.swing.JTextField txtvalorbruto;
    private javax.swing.JTextField txtvalordescuento;
    // End of variables declaration//GEN-END:variables
}
