package LogicaP;

import DatosP.Dingresop;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Lingresop {

    private final Cconexionp mysql = new Cconexionp();
    private final Connection cn = mysql.establecerConexionp();
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID INGRESO", "idinicioturno", "Turno", "N turno", "Empledo", "placa", "Fecha Ingreso", "Tipo Vehiculo", "Tipo Servicio", "Cliente", "Zona", "Observaciones", "Estado"};

        String[] registro = new String[13];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT * FROM ingreso WHERE placa LIKE ? ORDER BY idingreso";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, "%" + buscar + "%");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("idingreso");
                registro[1] = rs.getString("idinicioturno");
                registro[2] = rs.getString("turno");
                registro[3] = rs.getString("numeroturno");
                registro[4] = rs.getString("empleado");
                registro[5] = rs.getString("placa");
                registro[6] = rs.getString("fechaingreso");
                registro[7] = rs.getString("tipovehiculo");
                registro[8] = rs.getString("tiposervicio");
                registro[9] = rs.getString("cliente");
                registro[10] = rs.getString("zona");
                registro[11] = rs.getString("observaciones");
                registro[12] = rs.getString("estado");

                totalregistros++;
                modelo.addRow(registro);
            }
            return modelo;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean insertar(Dingresop dts) {
        sSQL = "INSERT INTO ingreso (idinicioturno, turno, numeroturno, empleado, placa, fechaingreso, tipovehiculo, tiposervicio, cliente, zona, observaciones, estado)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, dts.getIdinicioturno());
            pst.setString(2, dts.getTurno());
            pst.setString(3, dts.getNumeroturno());
            pst.setString(4, dts.getEmpleado());
            pst.setString(5, dts.getPlaca());
            pst.setString(6, dts.getFechaingreso());
            pst.setString(7, dts.getTipovehiculo());
            pst.setString(8, dts.getTiposervicio());
            pst.setString(9, dts.getCliente());
            pst.setString(10, dts.getZona());
            pst.setString(11, dts.getObservaciones());
            pst.setString(12, dts.getEstado());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(Dingresop dts) {
        sSQL = "UPDATE ingreso SET (idinicioturno=?, turno=?, numeroturno=?, empleado=?, placa=?, fechaingreso=?, tipovehiculo=?, tiposervicio=?, cliente=?, zona=?, observaciones=?, estado=?";

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {

            pst.setInt(1, dts.getIdinicioturno());
            pst.setString(2, dts.getTurno());
            pst.setString(3, dts.getNumeroturno());
            pst.setString(4, dts.getEmpleado());
            pst.setString(5, dts.getPlaca());
            pst.setString(6, dts.getFechaingreso());
            pst.setString(7, dts.getTipovehiculo());
            pst.setString(8, dts.getTiposervicio());
            pst.setString(9, dts.getCliente());
            pst.setString(10, dts.getZona());
            pst.setString(11, dts.getObservaciones());
            pst.setString(12, dts.getEstado());

            pst.setInt(13, dts.getIdingreso());
            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al editar EL INGRESO: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(Dingresop dts) {
        sSQL = "delete from ingreso where idingreso=?";

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, dts.getIdingreso());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la INGRESO: " + e.getMessage());
            return false;
        }

    }
}
