package Logica;

import Datos.Dpago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fpago {

    private final Cconexion mysql = new Cconexion();
    private final Connection cn = mysql.establecerConexion();
    private String sSQL = "";
//    private final String sSQL2 = "";

    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Idsalida", "cliente", "numero", "fecha emision", "tipo Comprobante", "Número comprobante", "Efectivo", "Tarjeta", "Transferencias", "Descuentos", "Cobros Fraccion", "Valor a Cobrar", "Neto a Pagar", "Empleado"};

        String[] registro = new String[15];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT * from pago where fechaemision  like'%" + buscar + "%'  order by idpago desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idpago");
                registro[1] = rs.getString("idsalida");
                registro[2] = rs.getString("cliente");
                registro[3] = rs.getString("numero");
                registro[4] = rs.getString("fechaemision");
                registro[5] = rs.getString("tipocomprobante");
                registro[6] = rs.getString("numcomprobante");
                registro[7] = rs.getString("efectivo");
                registro[8] = rs.getString("tarjeta");
                registro[9] = rs.getString("transferencia");
                registro[10] = rs.getString("descuentos");
                registro[11] = rs.getString("cobrosfraccion");
                registro[12] = rs.getString("valorcobrar");
                registro[13] = rs.getString("netoapagar");
                registro[14] = rs.getString("empleado");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(Dpago dts) {
        sSQL = "INSERT INTO pago (idsalida, cliente, numero, fechaemision,tipocomprobante,numcomprobante,efectivo, tarjeta,transferencia,descuentos,cobrosfraccion,valorcobrar,netoapagar,empleado)"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdsalida());
            pst.setString(2, dts.getCliente());
            pst.setInt(3, dts.getNumero());
            pst.setString(4, dts.getFechaemision());
            pst.setString(5, dts.getTipocomprobante());
            pst.setString(6, dts.getNumcomprobante());
            pst.setInt(7, dts.getEfectivo());
            pst.setInt(8, dts.getTarjeta());
            pst.setInt(9, dts.getTransferencia());
            pst.setInt(10, dts.getDescuentos());
            pst.setInt(11, dts.getCobrosfraccion());
            pst.setInt(12, dts.getValorcobrar());
            pst.setInt(13, dts.getNetoapagar());
            pst.setString(14, dts.getEmpleado());

            int n = pst.executeUpdate();

            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(Dpago dts) {
        sSQL = "UPDATE pago set idsalida=?,cliente=?, numero=?, fechaemision=?,tipocomprobante=?,numcomprobante=?,efectivo=?, tarjeta=?,transferencia=?,descuentos=?,cobrosfraccion=?,valorcobrar=?,netoapagar=?,empleado=?)"
                + " where idpago=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
             pst.setInt(1, dts.getIdsalida());
            pst.setString(2, dts.getCliente());
            pst.setInt(3, dts.getNumero());
            pst.setString(4, dts.getFechaemision());
            pst.setString(5, dts.getTipocomprobante());
            pst.setString(6, dts.getNumcomprobante());
            pst.setInt(7, dts.getEfectivo());
            pst.setInt(8, dts.getTarjeta());
            pst.setInt(9, dts.getTransferencia());
            pst.setInt(10, dts.getDescuentos());
            pst.setInt(11, dts.getCobrosfraccion());
            pst.setInt(12, dts.getValorcobrar());
            pst.setInt(13, dts.getNetoapagar());
            pst.setString(14, dts.getEmpleado());
            
            pst.setInt(15, dts.getIdpago());

            int n = pst.executeUpdate();

            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(Dpago dts) {
        sSQL = "DELETE from pago where idpago=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdpago());

            int n = pst.executeUpdate();

            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public int UltimoNumeroComprobante() {
        sSQL = "SELECT MAX(numrocomprobante) AS ultimo_numero_comprobante FROM pagos";
        int ultimoNumeroComprobante = 0;

        try ( Statement statement = cn.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sSQL);

            if (resultSet.next()) {
                ultimoNumeroComprobante = resultSet.getInt("numcomprobante");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de errores
        }

        return ultimoNumeroComprobante;
    }

    public boolean pagar(Dpago dts) {
        sSQL = "update ingreso set estado = 'pagada'" + "where idingreso=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdpago());

            int n = pst.executeUpdate();

            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return false;

    }

}
