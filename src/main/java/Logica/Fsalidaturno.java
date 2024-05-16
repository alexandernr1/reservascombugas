package Logica;

import Datos.Dsalida;
import Datos.Dsalidaturno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Alexander nieves romero
 */
public class Fsalidaturno {

    private final Cconexion mysql = new Cconexion();
    private final Connection cn = mysql.establecerConexion();
    private String sSQL = "";
    public Integer totalregistros;

//   public DefaultTableModel mostrar(String buscar) {
//    DefaultTableModel modelo;
//
//    String[] titulos = {"Idsalida", "Idingreso", "idcliente", "idhabitacion", "idabono", "Idempleado", "Numero", "Cliente", "Numnoches", "Costo", "Fecha Ingreso", "Fecha Salida", "Fecha Emision", "Tipo Cliente", "Tipo comprobante", "N Comprobante", "Forma Pago", "valor Noches", "Abonos", "Valor Total", "Descunetos", "Cobros Extra", "Otros Cobros", "Total Pago"};
//    String[] registro = new String[24];
//
//    totalregistros = 0;
//    modelo = new DefaultTableModel(null, titulos);
//
//    sSQL = "SELECT s.idsalida, s.idingreso, s.idcliente, s.idhabitacion, s.idabono, s.idempleado, " +
//            "s.numero, s.cliente, s.numnoches, s.costoalojamiento, s.fechaingreso, s.fechasalida, " +
//            "s.fechaemision, s.tipocliente, s.tipocomprobante, s.num_comprobante, s.formapago, s.valor_noches, " +
//            "s.abonos, s.valor_total, s.descuentos, s.cobros_extra, s.otros_cobros, s.totalpago " +
//            "FROM salida s WHERE s.numero LIKE '%" + buscar + "%' ORDER BY idsalida DESC";
//
//    try {
//        Statement st = cn.createStatement();
//        ResultSet rs = st.executeQuery(sSQL);
//
//        while (rs.next()) {
//            registro[0] = rs.getString("idsalida");
//            registro[1] = rs.getString("idingreso");
//            registro[2] = rs.getString("idcliente");
//            registro[3] = rs.getString("idhabitacion");
//            registro[4] = rs.getString("idabono");
//            registro[5] = rs.getString("idempleado");
//            registro[6] = rs.getString("numero");
//            registro[7] = rs.getString("cliente");
//            registro[8] = rs.getString("numnoches");
//            registro[9] = rs.getString("costoalojamiento");
//            registro[10] = rs.getString("fechaingreso");
//            registro[11] = rs.getString("fechasalida");
//            registro[12] = rs.getString("fechaemision");
//            registro[13] = rs.getString("tipocliente");
//            registro[14] = rs.getString("tipocomprobante");
//            registro[15] = rs.getString("num_comprobante");
//            registro[16] = rs.getString("formapago");
//            registro[17] = rs.getString("valor_noches");
//            registro[18] = rs.getString("abonos");
//            registro[19] = rs.getString("valor_total");
//            registro[20] = rs.getString("descuentos");
//            registro[21] = rs.getString("cobros_extra");
//            registro[22] = rs.getString("otros_cobros");
//            registro[23] = rs.getString("totalpago");
//
//            totalregistros = totalregistros + 1;
//            modelo.addRow(registro);
//        }
//
//        return modelo;
//
//    } catch (SQLException e) {
////        JOptionPane.showMessageDialog(null, "NO SE PUEDE MOSTRAR LOS DATOS: " + e.getMessage());
//        return null;
//    }
//}
    public boolean insertar(Dsalidaturno dts) {
    sSQL = "insert into salidaturno (idabonos, idempleado, idhabitacion, empleado, turno, fecha_hora_inicio, fecha_hora_salida,"
            + " habitaciones_ocupadas, total_recibos, base, tarjetas, efectivo, transferencias, totalhabitaciones, total_abonos, otros_ingresos, total_recaudo, entrega_admon, total_efectivo, observaciones)"
            + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    try {

        PreparedStatement pst = cn.prepareStatement(sSQL);
        pst.setInt(1, dts.getIdabonos());
        pst.setInt(2, dts.getIdempleado());
        pst.setInt(3, dts.getIdhabitacion());
        pst.setString(4, dts.getEmpleado());
        pst.setString(5, dts.getTurno());
        pst.setString(6, dts.getFecha_hora_inicio());
        pst.setString(7, dts.getFecha_hora_salida());
        pst.setInt(8, dts.getHabitaciones_ocupadas()); 
        pst.setInt(9, dts.getTotal_recibos());
        pst.setInt(10, dts.getBase());
        pst.setInt(11, dts.getTarjetas());
        pst.setInt(12, dts.getEfectivo());
        pst.setInt(13, dts.getTransferencias()); 
        pst.setInt(14, dts.getTotalhabitaciones());
        pst.setInt(15, dts.getTotal_abonos());
        pst.setInt(16, dts.getOtros_ingresos());
        pst.setInt(17, dts.getTotal_recaudo());
        pst.setInt(18, dts.getEntrega_admon());
        pst.setInt(19, dts.getTotal_efectivo());
        pst.setString(20, dts.getObservaciones());

        int n = pst.executeUpdate();

//        JOptionPane.showMessageDialog(null, "DATOS ALMACENADOS CORRECTAMENTE");

        return n != 0;

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
        return false;
    }
}


    public ResultSet realizarConsulta(String turno) throws SQLException {

        // Preparar la consulta SQL con un JOIN y subconsultas para obtener información del cliente
        sSQL
                = "SELECT  s.idhabitacion, h.estado, "
                + "(SELECT totalabonos FROM abono WHERE idabono = a.idabono)AS totalabonos,"
                + "s.idsalida, s.formapago"
                + "i.fecha_hora_ingreso, i.num_personas, i.tipo_cliente, i.motivo_viaje, i.estado,"
                + "i.costoalojamiento "
                + "FROM ingreso i INNER JOIN habitacion h ON i.idhabitacion = h.idhabitacion "
                + "LEFT JOIN abono a ON i.idingreso = a.idingreso "
                + "WHERE h.numero = ?";

        PreparedStatement pst = cn.prepareStatement(sSQL);
        pst.setString(1, turno);

        return pst.executeQuery();
    }
}
