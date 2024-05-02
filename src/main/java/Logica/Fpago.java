
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

        String[] titulos = {"ID", "Idsalida", "tipoComprobante", "Númerocomprobante", "Totalpago", "FechaEmisión", "FechaPago", "formapago"};

        String[] registro = new String[8];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT * from pago where idsalida=" + buscar + " order by idpago desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idpago");
                registro[1] = rs.getString("idsalida");
                registro[2] = rs.getString("tipocomprobante");
                registro[3] = rs.getString("numcomprobante");
                registro[4] = rs.getString("totalpago");
                registro[5] = rs.getString("fechaemision");
                registro[6] = rs.getString("fechapago");
                registro[7] = rs.getString("formapago");

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
        sSQL = "INSERT INTO pago (idsalida,tipocomprobante,numcomprobante,totalpago,fechaemision,fechapago,formapago)"
                + "values (?,?,?,?,?,?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdsalida());
            pst.setString(2, dts.getTipocomprobante());
            pst.setString(3, dts.getNumcomprobante());
            pst.setDouble(4, dts.getTotalpago());
            pst.setDate(5, dts.getFechaemision());
            pst.setDate(6, dts.getFechapago());
            pst.setString(7, dts.getFormapago());

            int n = pst.executeUpdate();

            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(Dpago dts) {
        sSQL = "UPDATE pago set idsalida=?,tipocomprobante=?,numcomprobante=?,totalpago=?,fechaemision=?,fechapago=?,formapago=0"
                + " where idpago=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdsalida());
            pst.setString(2, dts.getTipocomprobante());
            pst.setString(3, dts.getNumcomprobante());
            pst.setDouble(4, dts.getTotalpago());
            pst.setDate(5, dts.getFechaemision());
            pst.setDate(6, dts.getFechapago());
            pst.setString(7, dts.getFormapago());

            pst.setInt(8, dts.getIdpago());

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

    try (Statement statement = cn.createStatement()) {
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
