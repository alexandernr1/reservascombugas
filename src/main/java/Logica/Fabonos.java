package Logica;

import Datos.Dabono;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fabonos {

    private final Cconexion mysql = new Cconexion();
    private final Connection cn = mysql.establecerConexion();
    private String sSQL = "";

    public Integer totalregistros;

   public DefaultTableModel mostrar(String buscar) {
    DefaultTableModel modelo;
    String[] titulos = {"Idabono", "Idingreso", "Idhabitacion", "Numero", "idcliente", "Cliente", "Identificación", "Fecha Abono", "Abono habitacion", "Descuentos", "Conceptos Descuentos", "Forma Abono", "Total Abonos ", "Privilegios Admon", "Privilegios Recep", "otros cobros", "Numero Turno"};
    String[] registro = new String[17];
    totalregistros = 0;
    modelo = new DefaultTableModel(null, titulos);

    sSQL = "SELECT a.idabono, a.idingreso, a.idhabitacion, h.numero, a.idcliente, "
          + "(SELECT nombres FROM cliente WHERE idcliente = a.idcliente) AS clienten, "
          + "(SELECT apellidos FROM cliente WHERE idcliente = a.idcliente) AS clienteap, "
          + "(SELECT numdocumento FROM cliente WHERE idcliente = a.idcliente) AS clientenu, "
          + "a.fechaabono, a.abonohabitacion, a.descuentos, a.conceptodescuento, a.formaabono, "
          + "a.totalabonos, a.privilegiosadmon, a.privilegiosrecepcion, a.otroscobros, a.numero_turno "
          + "FROM abono a "
          + "INNER JOIN habitacion h ON a.idhabitacion = h.idhabitacion "
          + "WHERE h.numero LIKE ? "
          + "ORDER BY a.idabono DESC";

    try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
        pst.setString(1, "%" + buscar + "%");
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                registro[0] = rs.getString("idabono");
                registro[1] = rs.getString("idingreso");
                registro[2] = rs.getString("idhabitacion");
                registro[3] = rs.getString("numero");
                registro[4] = rs.getString("idcliente");
                registro[5] = rs.getString("clienten") + " " + rs.getString("clienteap");
                registro[6] = rs.getString("clientenu");
                registro[7] = rs.getString("fechaabono");
                registro[8] = rs.getString("abonohabitacion");
                registro[9] = rs.getString("descuentos");
                registro[10] = rs.getString("conceptodescuento");
                registro[11] = rs.getString("formaabono");
                registro[12] = rs.getString("totalabonos");
                registro[13] = rs.getString("privilegiosadmon");
                registro[14] = rs.getString("privilegiosrecepcion");
                registro[15] = rs.getString("otroscobros");
                registro[16] = rs.getString("numero_turno");

                totalregistros++;
                modelo.addRow(registro);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "NO SE PUEDE MOSTRAR LOS DATOS: " + e.getMessage());
    }

    return modelo;
}


    public boolean insertar(Dabono dts) {
    sSQL = "INSERT INTO abono (idingreso, idhabitacion, idcliente, fechaabono, abonohabitacion, descuentos, conceptodescuento, formaabono, totalabonos, privilegiosadmon, privilegiosrecepcion, otroscobros, numero_turno) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
        pst.setInt(1, dts.getIdingreso());
        pst.setInt(2, dts.getIdhabitacion());
        pst.setInt(3, dts.getIdcliente());
        pst.setString(4, dts.getFechaabono());
        pst.setInt(5, dts.getAbonohabitacion());
        pst.setString(6, dts.getDescuentos());
        pst.setString(7, dts.getConceptodescuento());
        pst.setString(8, dts.getFormaAbono());
        pst.setInt(9, dts.getTotalAbonos());
        pst.setString(10, dts.getPrivilegiosAdmon());
        pst.setString(11, dts.getPrivilegiosrecepcion());
        pst.setInt(12, dts.getOtroscobros());
        pst.setInt(13, dts.getNumero_turno());

        int n = pst.executeUpdate();
        return n != 0;
    } catch (SQLException e) {
        JOptionPane.showConfirmDialog(null, e);
        return false;
    }
}


  public boolean editar(Dabono dts) {
    sSQL = "UPDATE abono SET idingreso=?, idhabitacion=?, idcliente=?, fechaabono=?, abonohabitacion=?, descuentos=?, conceptodescuento=?, formaabono=?, totalabonos=?, privilegiosadmon=?, privilegiosrecepcion=?, otroscobros=?, numero_turno=? WHERE idabono=?";

    try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
        pst.setInt(1, dts.getIdingreso());
        pst.setInt(2, dts.getIdhabitacion());
        pst.setInt(3, dts.getIdcliente());
        pst.setString(4, dts.getFechaabono());
        pst.setDouble(5, dts.getAbonohabitacion());
        pst.setString(6, dts.getDescuentos());
        pst.setString(7, dts.getConceptodescuento());
        pst.setString(8, dts.getFormaAbono());
        pst.setInt(9, dts.getTotalAbonos());
        pst.setString(10, dts.getPrivilegiosAdmon());
        pst.setString(11, dts.getPrivilegiosrecepcion());
        pst.setInt(12, dts.getOtroscobros());
        pst.setInt(13, dts.getNumero_turno());
        pst.setInt(14, dts.getIdabono());

        int n = pst.executeUpdate();
        return n != 0;
    } catch (SQLException e) {
        JOptionPane.showConfirmDialog(null, e);
        return false;
    }
}


   public boolean eliminar(Dabono dts) {
    sSQL = "DELETE FROM abono WHERE idabono=?";

    try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
        pst.setInt(1, dts.getIdabono());

        int n = pst.executeUpdate();
        return n != 0;
    } catch (SQLException e) {
        JOptionPane.showConfirmDialog(null, e);
        return false;
    }
}

}
