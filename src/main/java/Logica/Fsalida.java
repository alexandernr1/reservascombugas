package Logica;

import Datos.Dfactura_electronica;
import Datos.Dinicioturno;
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

    public Object[] mostrarsalida(String buscar, String turnoActivo) throws SQLException {
        DefaultTableModel modelo;

        String[] titulos = {"Idsalida", "Idingreso", "idcliente", "idhabitacion", "idabono", "empleado", "Numero Turno",
            "Numero", "Cliente", "Numnoches", "Razon social", "Documento", "Email", "Costo", "Fecha Ingreso", "Fecha Salida", "Tipo Cliente",
            "valor Noches", "Abonos", "Valor Total", "Descunetos", "Cobros Extra", "Otros Cobros",
            "Deuda Anterior", "Total", "Antes IVA", "IVA 19", "Reten 35", "Reten 4", "Subtotal",
            "Efectivo", "Tarjeta", "Transferencias", "Total Pago"};
        String[] registro = new String[34];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        // Consulta SQL adaptada
        sSQL = "SELECT s.idsalida, s.idingreso, s.idcliente, s.idhabitacion, s.idabono, s.empleado, "
                + "s.numero_turno, s.numero, s.cliente, s.numnoches, s.razon_social, s.documento, s.email, s.costoalojamiento, s.fechaingreso, s.fechasalida, "
                + "s.tipocliente, s.valor_noches, s.abonos, s.valor_total, s.descuentos, s.cobros_extra, s.otros_cobros, "
                + "s.deuda_anterior, s.total, s.antesIVA, s.IVA19, s.reten35, s.reten4, s.subtotal, "
                + "s.efectivo, s.tarjeta, s.transferencias, s.totalpago, "
                + "SUM(s.efectivo) AS totalEfectivo, "
                + "SUM(s.tarjeta) AS totalTarjeta, "
                + "SUM(s.transferencias) AS totalTransferencias "
                + "FROM salida s "
                + "INNER JOIN inicioturno t ON s.numero_turno = t.numero_turno "
                + "WHERE s.numero LIKE '%" + buscar + "%' "
                + "AND t.estado = 'Activo' "
                + "GROUP BY s.idsalida "
                + "ORDER BY s.idsalida DESC";

        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sSQL);

        int totalEfectivo = 0;
        int totalTarjeta = 0;
        int totalTransferencia = 0;

        try {

            while (rs.next()) {
                registro[0] = rs.getString("idsalida");
                registro[1] = rs.getString("idingreso");
                registro[2] = rs.getString("idcliente");
                registro[3] = rs.getString("idhabitacion");
                registro[4] = rs.getString("idabono");
                registro[5] = rs.getString("empleado");
                registro[6] = rs.getString("numero_turno");
                registro[7] = rs.getString("numero");
                registro[8] = rs.getString("cliente");
                registro[9] = rs.getString("numnoches");
                registro[10] = rs.getString("razon_social");
                registro[11] = rs.getString("documento");
                registro[12] = rs.getString("email");
                registro[13] = rs.getString("costoalojamiento");
                registro[14] = rs.getString("fechaingreso");
                registro[15] = rs.getString("fechasalida");
                registro[16] = rs.getString("tipocliente");
                registro[17] = rs.getString("valor_noches");
                registro[18] = rs.getString("abonos");
                registro[19] = rs.getString("valor_total");
                registro[20] = rs.getString("descuentos");
                registro[21] = rs.getString("cobros_extra");
                registro[22] = rs.getString("otros_cobros");
                registro[23] = rs.getString("deuda_anterior");
                registro[24] = rs.getString("total");
                registro[25] = rs.getString("antesIVA");
                registro[26] = rs.getString("IVA19");
                registro[27] = rs.getString("reten35");
                registro[28] = rs.getString("reten4");
                registro[29] = rs.getString("subtotal");
                registro[30] = rs.getString("efectivo");
                registro[31] = rs.getString("tarjeta");
                registro[32] = rs.getString("transferencias");
                registro[33] = rs.getString("totalpago");

                totalEfectivo += rs.getInt("totalEfectivo");
                totalTarjeta += rs.getInt("totalTarjeta");
                totalTransferencia += rs.getInt("totalTransferencias");
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDE MOSTRAR LOS DATOS: " + e.getMessage());
            return null;
        }
        return new Object[]{modelo, totalEfectivo, totalTarjeta, totalTransferencia};
    }

    public boolean insertar(Dsalida dts) {
        sSQL = "insert into salida (idingreso,idcliente,idhabitacion,idabono,empleado,numero_turno,"
                + "numero, cliente, numnoches,razon_social,documento,email,costoalojamiento,fechaingreso,fechasalida,tipocliente,"
                + "valor_noches,abonos,valor_total,descuentos,cobros_extra,otros_cobros,deuda_anterior,"
                + " total,antesIVA,IVA19,reten35,reten4,subtotal,efectivo,tarjeta,transferencias,totalpago, idinicioturno, turno)"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdingreso());
            pst.setInt(2, dts.getIdcliente());
            pst.setInt(3, dts.getIdhabitacion());
            pst.setInt(4, dts.getIdabono());
            pst.setString(5, dts.getEmpleado());
            pst.setInt(6, dts.getNumero_turno());
            pst.setInt(7, dts.getNumero());
            pst.setString(8, dts.getCliente());
            pst.setInt(9, dts.getNumnoches());
            pst.setString(10, dts.getRazon_social());
            pst.setInt(11, dts.getDocumento());
            pst.setString(12, dts.getEmail());
            pst.setInt(13, dts.getCostoalojamiento());
            pst.setString(14, dts.getFechaingreso());
            pst.setString(15, dts.getFechasalida());
            pst.setString(16, dts.getTipocliente());
            pst.setInt(17, dts.getValor_noches());
            pst.setInt(18, dts.getAbonos());
            pst.setInt(19, dts.getValor_total());
            pst.setInt(20, dts.getDescuentos());
            pst.setInt(21, dts.getCobros_extra());
            pst.setInt(22, dts.getOtros_cobros());
            pst.setInt(23, dts.getDeuda_anterior());
            pst.setInt(24, dts.getTotal());
            pst.setInt(25, dts.getAntesIVA());
            pst.setInt(26, dts.getIVA19());
            pst.setInt(27, dts.getReten35());
            pst.setInt(28, dts.getReten4());
            pst.setInt(29, dts.getSubtotal());
            pst.setInt(30, dts.getEfectivo());
            pst.setInt(31, dts.getTarjeta());
            pst.setInt(32, dts.getTransferencias());
            pst.setInt(33, dts.getTotalpago());
            pst.setInt(34, dts.getIdinicioturno());
            pst.setString(35, dts.getTurno());

            int n = pst.executeUpdate();

//            JOptionPane.showMessageDialog(null, "DATOS ALMACENADOS CORRECTAMENTE");
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
                + "a.idabono, a.descuentos, a.totalabonos, a.abonohabitacion, a.totalapagar,"
                + "i.fecha_hora_ingreso, i.num_personas, i.tipo_cliente, i.motivo_viaje, i.estado,"
                + "i.costoalojamiento "
                + "FROM ingreso i INNER JOIN habitacion h ON i.idhabitacion = h.idhabitacion "
                + "LEFT JOIN abono a ON i.idingreso = a.idingreso "
                + "WHERE h.numero = ? AND i.estado = 'Activo'";

        PreparedStatement pst = cn.prepareStatement(sSQL);
        pst.setString(1, numeroHabitacion);

        return pst.executeQuery();
    }

    public int obtenerIdHabitacionAnterior(int idIsalida) {
        sSQL = "SELECT idhabitacion FROM salida WHERE idsalida = ?";
        int idHabitacion = -1; // Valor predeterminado en caso de error o no encontrado

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, idIsalida);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                idHabitacion = rs.getInt("idhabitacion");
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return idHabitacion;
    }

    public Dinicioturno numeroturno() {
        int numeroturno = 0;
        int idinicioturno = 0;
        sSQL = "SELECT numero_turno, idinicioturno FROM inicioturno WHERE estado = 'Activo' ORDER BY numero_turno DESC LIMIT 1";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                numeroturno = rs.getInt("numero_turno");
                idinicioturno = rs.getInt("idinicioturno");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el numero del turno: " + e.getMessage());
        }

        return new Dinicioturno(numeroturno, idinicioturno);
    }

    public int deudaanterior(String documento) {
        int idcambio = 0;
        sSQL = "SELECT deuda_anterior FROM cambio_habitacion WHERE documento = ?AND estado = 'Activo' ORDER BY numero_turno";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, documento);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                idcambio = rs.getInt("deuda_anterior");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener deuda anterior: " + e.getMessage());
        }

        return idcambio;
    }

    public int otroscobros(int netocobros) {
        int cobros = 0;
        String sSQL = "SELECT SUM(a.otroscobros) otroscobros "
                + "FROM abono a "
                + "INNER JOIN ingreso i ON a.idingreso = i.idingreso "
                + "WHERE i.idingreso = ?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, netocobros);  // Pasar el valor netocobros como parámetro
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                cobros = rs.getInt("otroscobros");  // Obtener el valor de otroscobros
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener Otros Cobros: " + e.getMessage());
        }

        return cobros;
    }

    public int sumadescuentos(int descuentosSuma) {
        int cobros = 0;
        sSQL = "SELECT SUM(a.descuentos) AS descuentos "
                + "FROM abono a "
                + "INNER JOIN ingreso i ON a.idingreso = i.idingreso "
                + "WHERE i.idingreso = ?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, descuentosSuma);  // Pasar el valor netocobros como parámetro
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                cobros = rs.getInt("descuentos");  // Obtener el valor de otroscobros
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener LOS DESCUENTOS: " + e.getMessage());
        }

        return cobros;
    }

    public Dfactura_electronica cleinteFacturar(int factura) {
        Dfactura_electronica cliente = null;

        sSQL = "SELECT "
                + "f.documento,"
                + "f.razon_social,"
                + "f.email,"
                + "f.idcliente "
                + "FROM factura_electronica f "
                + "JOIN ingreso i ON f.idcliente = i.idcliente where i.idcliente = ?";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, factura);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int idCliente = rs.getInt("idcliente");
                int documento = rs.getInt("documento");
                String razonSocial = rs.getString("razon_social");
                String email = rs.getString("email");

                cliente = new Dfactura_electronica(idCliente, documento, razonSocial, email);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener IDcliente F: " + e.getMessage());
        }

        return cliente;
    }

    public int sumaAbono(int numero) {

        int suma = 0;
        sSQL = "SELECT SUM(totalapagar) AS totalapagar "
                + "FROM abono a "
                + "INNER JOIN ingreso i ON a.idingreso = i.idingreso "
                + "inner join habitacion h on a.idhabitacion = h.idhabitacion "
                + "WHERE i.estado = 'Activo' AND i.idingreso = ? AND h.estado = 'Ocupado' ";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, numero);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                suma = rs.getInt("totalapagar");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la SUMA: " + e.getMessage());
        }

        return suma;
    }

}
