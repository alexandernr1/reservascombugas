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

    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Idsalida", "cliente", "numero", "fecha emision", "tipo Comprobante", "Número comprobante", "Efectivo", "Tarjeta", "Transferencias", "Descuentos", "Cobros Fraccion", "Valor a Cobrar", "Neto a Pagar", "Empleado", "Numero Turno", "Deuda Anterior", "Estado", "Docuemnto", "correo", "Numero Noches", "IVA", "Reten3,5", "Reten 4"};

        String[] registro = new String[24];

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
                registro[15] = rs.getString("numero_turno");
                registro[16] = rs.getString("deuda_anterior");
                registro[17] = rs.getString("estado");
                registro[18] = rs.getString("documento");
                registro[19] = rs.getString("correo");
                registro[20] = rs.getString("numero_noches");
                registro[21] = rs.getString("IVA");
                registro[22] = rs.getString("retencion35");
                registro[23] = rs.getString("retencion4");

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
        sSQL = "INSERT INTO pago (idsalida, cliente, numero, fechaemision,tipocomprobante,numcomprobante,efectivo, tarjeta,transferencia,descuentos,cobrosfraccion,valorcobrar,netoapagar,empleado,numero_turno,deuda_anterior,estado,documento,correo,numero_noches,IVA,retencion35,retencion4,idcliente)"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
            pst.setInt(15, dts.getNumero_turno());
            pst.setInt(16, dts.getDeuda_anterior());
            pst.setString(17, dts.getEstado());
            pst.setInt(18, dts.getDocumento());
            pst.setString(19, dts.getCorreo());
            pst.setInt(20, dts.getNumero_noches());
            pst.setInt(21, dts.getIVA());
            pst.setInt(22, dts.getRetencion35());
            pst.setInt(23, dts.getRetencion4());
            pst.setInt(24, dts.getIdcliente());

            int n = pst.executeUpdate();

            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(Dpago dts) {
        sSQL = "UPDATE pago set idsalida=?,cliente=?, numero=?, fechaemision=?,tipocomprobante=?,numcomprobante=?,efectivo=?, tarjeta=?,transferencia=?,descuentos=?,cobrosfraccion=?,valorcobrar=?,netoapagar=?,empleado=?,numero_turno=?,deuda_anterior=?,estado=?,IVA=?,retencion35=?,retencion4=?)"
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
            pst.setInt(15, dts.getNumero_turno());
            pst.setInt(16, dts.getDeuda_anterior());
            pst.setString(17, dts.getEstado());
            pst.setInt(18, dts.getDocumento());
            pst.setString(19, dts.getCorreo());
            pst.setInt(20, dts.getNumero_noches());
            pst.setInt(21, dts.getIVA());
            pst.setInt(22, dts.getRetencion35());
            pst.setInt(23, dts.getRetencion4());

            pst.setInt(21, dts.getIdpago());

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

    public boolean pagar(Dpago dts) {
        sSQL = "UPDATE pago SET estado = 'Pagado'"
                + " WHERE idpago = ?";

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

    public int generarComprobante() {
        String serie = "";
        String sSQL = "SELECT MAX(numcomprobante) FROM pago";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                serie = rs.getString(1);
                if (serie != null) {
                    // Incrementar el valor de serie
                    return Integer.parseInt(serie) + 1;
                } else {
                    // Si no hay registros, el primer número de turno es 1
                    return 1;
                }
            } else {
                // Si la consulta no devuelve resultados, también retornamos 1
                return 1;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al generar el número de turno: " + e.getMessage());
            return 0;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al convertir el número de turno: " + e.getMessage());
            return 0;
        }
    }
}
