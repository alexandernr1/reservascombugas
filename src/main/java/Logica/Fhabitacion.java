package Logica;

import Datos.Dhabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fhabitacion {

    private javax.swing.JTable tablalistado;

    private final Cconexion mysql = new Cconexion();
    private final Connection cn = mysql.establecerConexion();
    private String sSQL = "";
    public Integer totalregistros;

      public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "Número", "Piso", "Descripción", "Características", "Precio", "Estado", "Tipo habitación"};
        String[] registro = new String[8];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT * FROM habitacion WHERE numero LIKE ? ORDER BY idhabitacion";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setString(1, "%" + buscar + "%");
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    registro[0] = rs.getString("idhabitacion");
                    registro[1] = rs.getString("numero");
                    registro[2] = rs.getString("piso");
                    registro[3] = rs.getString("descripcion");
                    registro[4] = rs.getString("caracteristicas");
                    registro[5] = rs.getString("precio");
                    registro[6] = rs.getString("estado");
                    registro[7] = rs.getString("tipohabitacion");

                    totalregistros++;
                    modelo.addRow(registro);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar las habitaciones: " + e.getMessage());
            return null;
        }
        return modelo;
    }

    public DefaultTableModel mostrarvista(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "Número", "Piso", "Descripción", "Características", "Precio", "Estado", "Tipo habitación"};
        String[] registro = new String[8];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT * FROM habitacion WHERE piso LIKE ? AND estado='Disponible' ORDER BY idhabitacion";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setString(1, "%" + buscar + "%");
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    registro[0] = rs.getString("idhabitacion");
                    registro[1] = rs.getString("numero");
                    registro[2] = rs.getString("piso");
                    registro[3] = rs.getString("descripcion");
                    registro[4] = rs.getString("caracteristicas");
                    registro[5] = rs.getString("precio");
                    registro[6] = rs.getString("estado");
                    registro[7] = rs.getString("tipohabitacion");

                    totalregistros++;
                    modelo.addRow(registro);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar las habitaciones disponibles: " + e.getMessage());
            return null;
        }
        return modelo;
    }

    public boolean insertar(Dhabitacion dts) {
        sSQL = "INSERT INTO habitacion (numero, piso, descripcion, caracteristicas, precio, estado, tipohabitacion) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, dts.getNumero());
            pst.setString(2, dts.getPiso());
            pst.setString(3, dts.getDescripcion());
            pst.setString(4, dts.getCaracteristicas());
            pst.setInt(5, dts.getPrecio());
            pst.setString(6, dts.getEstado());
            pst.setString(7, dts.getTipohabitacion());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar la habitación: " + e.getMessage());
            return false;
        }
    }

    public boolean editar(Dhabitacion dts) {
        sSQL = "UPDATE habitacion SET numero=?, piso=?, descripcion=?, caracteristicas=?, precio=?, estado=?, tipohabitacion=? "
                + "WHERE idhabitacion=?";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, dts.getNumero());
            pst.setString(2, dts.getPiso());
            pst.setString(3, dts.getDescripcion());
            pst.setString(4, dts.getCaracteristicas());
            pst.setInt(5, dts.getPrecio());
            pst.setString(6, dts.getEstado());
            pst.setString(7, dts.getTipohabitacion());
            pst.setInt(8, dts.getIdhabitacion());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al editar la habitación: " + e.getMessage());
            return false;
        }
    }

    public boolean desocupar(Dhabitacion dts) {
        sSQL = "UPDATE habitacion SET estado='Disponible' WHERE idhabitacion=?";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, dts.getIdhabitacion());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al desocupar la habitación: " + e.getMessage());
            return false;
        }
    }

    public boolean ocupar(Dhabitacion dts) {
        sSQL = "UPDATE habitacion SET estado='Ocupado' WHERE idhabitacion=?";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, dts.getIdhabitacion());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ocupar la habitación: " + e.getMessage());
            return false;
        }
    }

    public boolean reserva(Dhabitacion dts) {
        sSQL = "UPDATE habitacion SET estado='Reserva' WHERE idhabitacion=?";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, dts.getIdhabitacion());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al reservar la habitación: " + e.getMessage());
            return false;
        }
    }

    public boolean limpieza(Dhabitacion dts) {
        sSQL = "UPDATE habitacion SET estado='Limpieza' WHERE idhabitacion=?";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, dts.getIdhabitacion());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cambiar el estado a 'Limpieza': " + e.getMessage());
            return false;
        }
    }

    public boolean disponible(Dhabitacion dts) {
        sSQL = "UPDATE habitacion SET estado='Disponible' WHERE idhabitacion=?";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, dts.getIdhabitacion());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cambiar el estado a 'Disponible': " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(Dhabitacion dts) {
        sSQL = "DELETE FROM habitacion WHERE idhabitacion=?";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, dts.getIdhabitacion());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la habitación: " + e.getMessage());
            return false;
        }
    }

    public String obtenerEstadoHabitacion(int numero) {
        String estado = "Disponible";
        String sSQL = "SELECT estado FROM habitacion WHERE numero = ?";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, numero);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    estado = rs.getString("estado");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el estado de la habitación: " + e.getMessage());
        }

        return estado;
    }


    public Map<Integer, String> obtenerEstadosTodasHabitaciones() {
        Map<Integer, String> estados = new HashMap<>();

        sSQL = "SELECT idhabitacion, estado FROM habitacion";
        try ( PreparedStatement pst = cn.prepareStatement(sSQL);  ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                int idhabitacion = rs.getInt("idhabitacion");
                String estado = rs.getString("estado");
                estados.put(idhabitacion, estado);
            }
        } catch (SQLException e) {
        }

        return estados;
    }
// public boolean cambioprecio(){
//     
//     
// }
}
