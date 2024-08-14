package Logica;

import Datos.Dingreso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fingreso {

    private final Cconexion mysql = new Cconexion();
    private final Connection cn = mysql.establecerConexion();
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"Idingreso", "Idhabitacion", "Numero", "Idcliente", "Cliente", "Telefono", "Documento",
            "Fecha ingreso", "Numero personas", "Tipo cliente", "Costo alojamiento", "Motivo viaje", "Estado", "Ciudad Recidencia", "Ciudad Procedencia"};

        String[] registro = new String[15];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT i.idingreso, i.idhabitacion, h.numero, i.idcliente, "
                + "(SELECT nombres FROM cliente WHERE idcliente=i.idcliente) AS clienten, "
                + "(SELECT apellidos FROM cliente WHERE idcliente=i.idcliente) AS clienteap, "
                + "(SELECT numdocumento FROM cliente WHERE idcliente=i.idcliente) AS clientenu, "
                + "(SELECT telefono FROM cliente WHERE idcliente=i.idcliente) AS clientete, "
                + "i.fecha_hora_ingreso, i.num_personas, i.tipo_cliente, i.costoalojamiento, "
                + "i.motivo_viaje, i.estado, i.ciudad_de_recidencia, i.ciudad_de_procedencia "
                + "FROM ingreso i "
                + "INNER JOIN habitacion h ON i.idhabitacion=h.idhabitacion "
                + "WHERE (SELECT numdocumento FROM cliente WHERE idcliente=i.idcliente) LIKE ? "
                + "ORDER BY idingreso DESC";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setString(1, "%" + buscar + "%");
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    registro[0] = rs.getString("idingreso");
                    registro[1] = rs.getString("idhabitacion");
                    registro[2] = rs.getString("numero");
                    registro[3] = rs.getString("idcliente");
                    registro[4] = rs.getString("clienten") + " " + rs.getString("clienteap");
                    registro[5] = rs.getString("clientete");
                    registro[6] = rs.getString("clientenu");
                    registro[7] = rs.getString("fecha_hora_ingreso");
                    registro[8] = rs.getString("num_personas");
                    registro[9] = rs.getString("tipo_cliente");
                    registro[10] = rs.getString("costoalojamiento");
                    registro[11] = rs.getString("motivo_viaje");
                    registro[12] = rs.getString("estado");
                    registro[13] = rs.getString("ciudad_de_recidencia");
                    registro[14] = rs.getString("ciudad_de_procedencia");

                    totalregistros++;
                    modelo.addRow(registro);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los ingresos: " + e.getMessage());
            return null;
        }
        return modelo;
    }

    public boolean insertar(Dingreso dts) {
        sSQL = "INSERT INTO ingreso (idhabitacion, idcliente, fecha_hora_ingreso, num_personas, tipo_cliente, "
                + "costoalojamiento, motivo_viaje, estado, ciudad_de_recidencia, ciudad_de_procedencia, "
                + "num_habitacion, documento, tipo_documento, tipo_habitacion) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, dts.getIdhabitacion());
            pst.setInt(2, dts.getIdcliente());
            pst.setString(3, dts.getFecha_hora_ingreso());
            pst.setInt(4, dts.getNum_personas());
            pst.setString(5, dts.getTipo_cliente());
            pst.setInt(6, dts.getCostoalojamiento());
            pst.setString(7, dts.getMotivo_viaje());
            pst.setString(8, dts.getEstado());
            pst.setString(9, dts.getCiudad_de_recidencia());
            pst.setString(10, dts.getCiudad_de_procedencia());
            pst.setInt(11, dts.getNum_habitacion());
            pst.setString(12, dts.getDocumento());
            pst.setString(13, dts.getTipo_documento());
            pst.setString(14, dts.getTipo_habitacion());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar el ingreso: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(Dingreso dts) {
        sSQL = "DELETE FROM ingreso WHERE idingreso = ?";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, dts.getIdingreso());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el ingreso: " + e.getMessage());
            return false;
        }
    }

    public boolean editar(Dingreso dts) {
        sSQL = "UPDATE ingreso SET idhabitacion = ?, idcliente = ?, fecha_hora_ingreso = ?, num_personas = ?, "
                + "tipo_cliente = ?, costoalojamiento = ?, motivo_viaje = ?, estado = ?, "
                + "ciudad_de_recidencia = ?, ciudad_de_procedencia = ?, num_habitacion = ?, "
                + "documento = ?, tipo_documento = ?, tipo_habitacion = ? "
                + "WHERE idingreso = ?";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, dts.getIdhabitacion());
            pst.setInt(2, dts.getIdcliente());
            pst.setString(3, dts.getFecha_hora_ingreso());
            pst.setInt(4, dts.getNum_personas());
            pst.setString(5, dts.getTipo_cliente());
            pst.setInt(6, dts.getCostoalojamiento());
            pst.setString(7, dts.getMotivo_viaje());
            pst.setString(8, dts.getEstado());
            pst.setString(9, dts.getCiudad_de_recidencia());
            pst.setString(10, dts.getCiudad_de_procedencia());
            pst.setInt(11, dts.getNum_habitacion());
            pst.setString(12, dts.getDocumento());
            pst.setString(13, dts.getTipo_documento());
            pst.setString(14, dts.getTipo_habitacion());

            pst.setInt(15, dts.getIdingreso());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al editar el ingreso: " + e.getMessage());
            return false;
        }
    }

    public boolean finalizar(Dingreso dts) {
        sSQL = "UPDATE ingreso SET estado = 'Finalizado' WHERE idingreso = ?";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, dts.getIdingreso());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al finalizar el ingreso: " + e.getMessage());
            return false;
        }
    }

    public boolean activar(Dingreso dts) {
        sSQL = "UPDATE ingreso SET estado = 'Activo' WHERE idingreso = ?";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, dts.getIdingreso());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al activar el ingreso: " + e.getMessage());
            return false;
        }
    }

    public int obtenerIdHabitacionAnterior(int idIngreso) {
        sSQL = "SELECT idhabitacion FROM ingreso WHERE idingreso = ?";
        int idHabitacion = -1;

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, idIngreso);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    idHabitacion = rs.getInt("idhabitacion");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el ID de la habitación anterior: " + e.getMessage());
        }

        return idHabitacion;
    }
}


