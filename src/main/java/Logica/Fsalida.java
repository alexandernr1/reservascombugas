 package Logica;

import Datos.Dsalida;
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
public class Fsalida {

    private final Cconexion mysql = new Cconexion();
    private final Connection cn = mysql.establecerConexion();
    private String sSQL = "";
    public Integer totalregistros;

   public DefaultTableModel mostrar(String buscar) {
    DefaultTableModel modelo;

    String[] titulos = {"Idsalida", "Idingreso", "idcliente", "idhabitacion", "idabono", "empleado", "Numero", "Cliente", "Numnoches", "Costo", "Fecha Ingreso", "Fecha Salida", "Tipo Cliente", "valor Noches", "Abonos", "Valor Total", "Descunetos", "Cobros Extra", "Otros Cobros", "Total Pago"};
    String[] registro = new String[20];

    totalregistros = 0;
    modelo = new DefaultTableModel(null, titulos);

    sSQL = "SELECT s.idsalida, s.idingreso, s.idcliente, s.idhabitacion, s.idabono, s.empleado, " +
            "s.numero, s.cliente, s.numnoches, s.costoalojamiento, s.fechaingreso, s.fechasalida, " +
            "s.tipocliente, s.valor_noches, " +
            "s.abonos, s.valor_total, s.descuentos, s.cobros_extra, s.otros_cobros, s.totalpago " +
            "FROM salida s WHERE s.numero LIKE '%" + buscar + "%' ORDER BY idsalida DESC";

    try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);

        while (rs.next()) {
            registro[0] = rs.getString("idsalida");
            registro[1] = rs.getString("idingreso");
            registro[2] = rs.getString("idcliente");
            registro[3] = rs.getString("idhabitacion");
            registro[4] = rs.getString("idabono");
            registro[5] = rs.getString("empleado");
            registro[6] = rs.getString("numero");
            registro[7] = rs.getString("cliente");
            registro[8] = rs.getString("numnoches");
            registro[9] = rs.getString("costoalojamiento");
            registro[10] = rs.getString("fechaingreso");
            registro[11] = rs.getString("fechasalida");       
            registro[12] = rs.getString("tipocliente");
            registro[13] = rs.getString("valor_noches");
            registro[14] = rs.getString("abonos");
            registro[15] = rs.getString("valor_total");
            registro[16] = rs.getString("descuentos");
            registro[17] = rs.getString("cobros_extra");
            registro[18] = rs.getString("otros_cobros");
            registro[19] = rs.getString("totalpago");

            totalregistros = totalregistros + 1;
            modelo.addRow(registro);
        }

        return modelo;

    } catch (SQLException e) {
//        JOptionPane.showMessageDialog(null, "NO SE PUEDE MOSTRAR LOS DATOS: " + e.getMessage());
        return null;
    }
}


    public boolean insertar(Dsalida dts) {
        sSQL = "insert into salida (idingreso,idcliente,idhabitacion,idabono,empleado,"
                + "numero, cliente, numnoches,costoalojamiento,fechaingreso,fechasalida,tipocliente,"
                + "valor_noches,abonos,valor_total,descuentos,cobros_extra,otros_cobros,totalpago)"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdingreso());
            pst.setInt(2, dts.getIdcliente());
            pst.setInt(3, dts.getIdhabitacion());
            pst.setInt(4, dts.getIdabono());
            pst.setString(5, dts.getEmpleado());
            pst.setInt(6, dts.getNumero());
            pst.setString(7, dts.getCliente());
            pst.setInt(8, dts.getNumnoches());
            pst.setInt(9, dts.getCostoalojamiento());
            pst.setString(10, dts.getFechaingreso());
            pst.setString(11, dts.getFechasalida());
            pst.setString(12, dts.getTipocliente());
            pst.setInt(13, dts.getValor_noches());
            pst.setInt(14, dts.getAbonos());
            pst.setInt(15, dts.getValor_total());
            pst.setInt(16, dts.getDescuentos());
            pst.setInt(17, dts.getCobros_extra());
            pst.setInt(18, dts.getOtros_cobros());
            pst.setDouble(19, dts.getTotalpago());

            int n = pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "DATOS ALMACENADOS CORRECTAMENTE");

            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
     public ResultSet realizarConsulta(String numeroHabitacion) throws SQLException {
       

        // Preparar la consulta SQL con un JOIN y subconsultas para obtener información del cliente
        sSQL
                = "SELECT i.idingreso, i.idhabitacion, h.numero, i.idcliente, "
                + "(SELECT nombres FROM cliente WHERE idcliente = i.idcliente) AS clienten, "
                + "(SELECT apellidos FROM cliente WHERE idcliente = i.idcliente) AS clienteap, "
                + "(SELECT numdocumento FROM cliente WHERE idcliente = i.idcliente)AS clientenu,"
                + "(SELECT telefono FROM cliente WHERE idcliente = i.idcliente) AS clientete, "
                + "(SELECT totalabonos FROM abono WHERE idabono = a.idabono)AS totalabonos,"
                + "a.idabono, a.descuentos, a.totalabonos, a.abonohabitacion,"
                + "i.fecha_hora_ingreso, i.num_personas, i.tipo_cliente, i.motivo_viaje, i.estado,"
                + "i.costoalojamiento "
                + "FROM ingreso i INNER JOIN habitacion h ON i.idhabitacion = h.idhabitacion "
                + "LEFT JOIN abono a ON i.idingreso = a.idingreso "
                + "WHERE h.numero = ? AND i.estado = 'Activo'"; 

        PreparedStatement pst = cn.prepareStatement(sSQL);
        pst.setString(1, numeroHabitacion);

        return pst.executeQuery();
    }
}



