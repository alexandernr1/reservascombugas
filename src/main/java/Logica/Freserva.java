package Logica;

import Datos.Dreserva;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Freserva {

    private final Cconexion mysql = new Cconexion();
    private final Connection cn = mysql.establecerConexion();
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"Idreserva", "Idhabitacion", "Numero", "idcliente", "Cliente", "Idempleado", "Empleado", "TipoReserva", "FechaReserva", "FechaIngreso", "FechaSalida", "Costo", "Numnoches", "Numpersonas", "Estado"};
        String[] registro = new String[15];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select r.idreserva,r.idhabitacion,h.numero,r.idcliente,"
                + "(select nombres from cliente where idcliente=r.idcliente)as clienten,"
                + "(select apellidos from cliente where idcliente=r.idcliente)as clienteap,"
                + "r.idempleado,(select nombres from persona where idpersona = r.idempleado)as empleadon,"
                + "(select apellidos from persona where idpersona = r.idempleado)as empleadoap,"
                + "r.tiporeserva,r.fechareserva,r.fechaingreso,r.fechasalida,"
                + "r.costoalojamiento,r.estado,r.numnoches,r.numpersonas from reserva r inner join habitacion h on r.idhabitacion=h.idhabitacion where r.fechareserva like '%" + buscar + "%' order by idreserva desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idreserva");
                registro[1] = rs.getString("idhabitacion");
                registro[2] = rs.getString("numero");
                registro[3] = rs.getString("idcliente");
                registro[4] = rs.getString("clienten") + " " + rs.getString("clienteap");
                registro[5] = rs.getString("idempleado");
                registro[6] = rs.getString("empleadon") + " " + rs.getString("empleadoap");
                registro[7] = rs.getString("tiporeserva");
                registro[8] = rs.getString("fechareserva");
                registro[9] = rs.getString("fechaingreso");
                registro[10] = rs.getString("fechasalida");
                registro[11] = rs.getString("costoalojamiento");
                registro[12] = rs.getString("numnoches");
                registro[13] = rs.getString("numpersonas");
                registro[14] = rs.getString("estado");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }

            return modelo;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "NO SE PUEDE MOSTRAR LOS DATOS");
            return null;
        }

    }

    public boolean insertar(Dreserva dts) {
        sSQL = "insert into reserva (idhabitacion,idcliente,"
                + "idempleado,tiporeserva,fechareserva,fechaingreso,fechasalida,costoalojamiento,numnoches,numpersonas,estado)"
                + "values (?,?,?,?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdhabitacion());
            pst.setInt(2, dts.getIdcliente());
            pst.setInt(3, dts.getIdempleado());
            pst.setString(4, dts.getTiporeserva());
            pst.setDate(5, dts.getFechareserva());
            pst.setDate(6, dts.getFechaingreso());
            pst.setDate(7, dts.getFechasalida());
            pst.setDouble(8, dts.getCostoalojamiento());
            pst.setInt(9, dts.getNumnoches());
            pst.setInt(10, dts.getNumpersonas());
            pst.setString(11, dts.getEstado());

            int n = pst.executeUpdate();

            return n != 0; // JOptionPane.showMessageDialog(null, "DATOS ALMACENADOS CORRECTAMENTE");

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(Dreserva dts) {
        sSQL = "delete from reserva where idreserva=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdreserva());

            int n = pst.executeUpdate();

            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(Dreserva dts) {
        sSQL = "update reserva set idhabitacion=?,idcliente=?,idempleado=?,tiporeserva=?,fechareserva=?,fechaingreso=?,fechasalida=?,costoalojamiento=?, numnoches=?, numpersonas=?, estado=?"
                + " where idreserva=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdhabitacion());
            pst.setInt(2, dts.getIdcliente());
            pst.setInt(3, dts.getIdempleado());
            pst.setString(4, dts.getTiporeserva());
            pst.setDate(5, dts.getFechareserva());
            pst.setDate(6, dts.getFechaingreso());
            pst.setDate(7, dts.getFechasalida());
            pst.setDouble(8, dts.getCostoalojamiento());
            pst.setInt(9, dts.getNumnoches());
            pst.setInt(10, dts.getNumpersonas());
            pst.setString(11, dts.getEstado());

            pst.setInt(12, dts.getIdreserva());

            int n = pst.executeUpdate();

            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean pagar(Dreserva dts) {
        sSQL = "update reserva set estado='Pagada'"
                + " where idreserva=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdreserva());

            int n = pst.executeUpdate();

            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

}
