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

        String[] titulos = {"Idabono", "Idingreso", "Idhabitacion", "Numero", "idcliente", "Cliente", "Identificación", "Fecha Abono", "Abono habitacion", "Descuentos", "Conceptos Descuentos", "Forma Abono", "Total Abonos ", "Privilegios Admon", "Privilegios Recep", "otros cobros"};

        String[] registro = new String[16];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT a.idabono, a.idingreso, a.idhabitacion, h.numero, a.idcliente, "
                + "(SELECT nombres FROM cliente WHERE idcliente = a.idcliente) AS clienten, "
                + "(SELECT apellidos FROM cliente WHERE idcliente = a.idcliente) AS clienteap, "
                + "(SELECT numdocumento FROM cliente WHERE idcliente = a.idcliente)AS clientenu,"
                + "a.fechaabono, a.abonohabitacion, a.descuentos, a.conceptodescuento, a.formaabono,"
                + "a.totalabonos, a.privilegiosadmon, a.privilegiosrecepcion, a.otroscobros " 
                + "FROM abono a INNER JOIN habitacion h ON a.idhabitacion = h.idhabitacion WHERE h.numero like '%" + buscar + "%' order by idabono desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

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

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(Dabono dts) {
        sSQL = "INSERT INTO abono (idingreso,idhabitacion,idcliente,fechaabono,abonohabitacion,descuentos,conceptodescuento,formaabono,totalabonos,privilegiosadmon,privilegiosrecepcion,otroscobros)"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdingreso());
            pst.setInt(2, dts.getIdhabitacion());
            pst.setInt(3, dts.getIdcliente());
            pst.setDate(4, dts.getFechaabono());
            pst.setInt(5, dts.getAbonohabitacion());
            pst.setString(6, dts.getDescuentos());
            pst.setString(7, dts.getConceptodescuento());
            pst.setString(8, dts.getFormaAbono());
            pst.setInt(9, dts.getTotalAbonos());
            pst.setString(10, dts.getPrivilegiosAdmon());
            pst.setString(11, dts.getPrivilegiosrecepcion());
            pst.setInt(12, dts.getOtroscobros());
            int n = pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, "DATOS ALMACENADOS CORRECTAMENTE");
            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(Dabono dts) {
        sSQL = "update abono set idingreso=?,idhabitacion=?,idcliente=?,fechaabono=?,abonohabitacion=?,descuentos=?,conceptodescuento=?,formaabono=?,totalabonos=?,privilegiosadmon=?,privilegiosrecepcion=?, otroscobros=?"
                + " where idabono=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdingreso());
            pst.setInt(2, dts.getIdhabitacion());
            pst.setInt(3, dts.getIdcliente());
            pst.setDate(4, dts.getFechaabono());
            pst.setDouble(5, dts.getAbonohabitacion());
            pst.setString(6, dts.getDescuentos());
            pst.setString(7, dts.getConceptodescuento());
            pst.setString(8, dts.getFormaAbono());
            pst.setInt(9, dts.getTotalAbonos());
            pst.setString(10, dts.getPrivilegiosAdmon());
            pst.setString(11, dts.getPrivilegiosrecepcion());
            pst.setInt(12, dts.getOtroscobros());
            
            pst.setInt(13, dts.getIdabono());

            int n = pst.executeUpdate();

            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    public boolean eliminar(Dabono dts) {
        sSQL = "delete from abono where idabono=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdabono());

            int n = pst.executeUpdate();

            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
