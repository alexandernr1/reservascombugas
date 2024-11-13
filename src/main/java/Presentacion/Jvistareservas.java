
package Presentacion;

import Logica.Freserva;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public final class Jvistareservas extends javax.swing.JFrame {

   
    public Jvistareservas() {
        initComponents();
         setLocationRelativeTo(null);
        setTitle("REGISTROS DE RESERVAS");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mostrar("");
        configurarTabla();
    }
     private void configurarTabla() {
    // Aquí configuras el comportamiento y el estilo de la tabla
    tablalistadoreserva.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS); 
    tablalistadoreserva.setRowHeight(25); // Ajusta la altura de las filas
    tablalistadoreserva.setRowMargin(5); // Espacio entre filas
    
       // Cambiar color del encabezado usando un renderer personalizado
        JTableHeader header = tablalistadoreserva.getTableHeader();
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
        tablalistadoreserva.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
     public void limpiarTabla(JTable tablalistareserva) {
        DefaultTableModel model = (DefaultTableModel) tablalistadoreserva.getModel();
        model.setRowCount(0);
    }
    void ocultar_columnas() {
        tablalistadoreserva.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistadoreserva.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistadoreserva.getColumnModel().getColumn(0).setPreferredWidth(0);

        tablalistadoreserva.getColumnModel().getColumn(1).setMaxWidth(0);
        tablalistadoreserva.getColumnModel().getColumn(1).setMinWidth(0);
        tablalistadoreserva.getColumnModel().getColumn(1).setPreferredWidth(0);

        
    }
 void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            Freserva func = new Freserva();
            modelo = func.mostrar(buscar);

            tablalistadoreserva.setModel(modelo);
            ocultar_columnas();
            lbltotalregistros.setText("Total Registros " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        lbltotalregistros = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tablalistadoreserva = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel12.setBackground(new java.awt.Color(244, 244, 244));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Reservas"));

        jLabel28.setText("Buscar");

        btnbuscar.setBackground(new java.awt.Color(204, 204, 204));
        btnbuscar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        lbltotalregistros.setText("Registros");

        tablalistadoreserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero", "Cliente", "Empleado", "Tipo Reserva", "FechaReserva", "Fecha Salida", "FechaIngreso", "Costo", "Estado", "N Noches", "N Personas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablalistadoreserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoreservaMouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(tablalistadoreserva);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lbltotalregistros))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void tablalistadoreservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoreservaMouseClicked

       
    }//GEN-LAST:event_tablalistadoreservaMouseClicked

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
            java.util.logging.Logger.getLogger(Jvistareservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jvistareservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jvistareservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jvistareservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jvistareservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tablalistadoreserva;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
