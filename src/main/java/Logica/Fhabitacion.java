package Logica;

import Datos.Dhabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setString(1, "%" + buscar + "%");
            try ( ResultSet rs = pst.executeQuery()) {
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

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setString(1, "%" + buscar + "%");
            try ( ResultSet rs = pst.executeQuery()) {
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

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
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

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
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

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
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

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, dts.getIdhabitacion());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ocupar la habitación: " + e.getMessage());
            return false;
        }
    }

    // Método para iniciar el hilo directamente
    public void iniciarHiloReserva() {
        Runnable reservaUpdater = () -> {
            while (true) {
                try {
                    // Consulta para obtener reservas cuya fecha es hoy (fechareserva o fechaingreso)
                    sSQL = "SELECT idhabitacion, fechareserva, fechaingreso "
                            + "FROM reserva1.reserva "
                            + "WHERE DATE(fechareserva) = CURDATE() OR DATE(fechaingreso) = CURDATE()";

                    try ( PreparedStatement pst = cn.prepareStatement(sSQL);  ResultSet rs = pst.executeQuery()) {

                        while (rs.next()) {
                            int idhabitacion = rs.getInt("idhabitacion");
                            String fechaIngreso = rs.getString("fechaingreso");

                            // Lógica adicional para verificar si ya pasó la fecha de ingreso
                            if (fechaIngreso.equals("CURDATE()")) {
                                actualizarEstadoHabitacion(idhabitacion, "Ocupado");
                            } else {
                                actualizarEstadoHabitacion(idhabitacion, "Reserva");
                            }
                        }
                    } catch (SQLException e) {
                        System.out.println("Error al verificar reservas: " + e.getMessage());
                    }

                    // Pausar por un tiempo antes de volver a comprobar (ejemplo: 1 hora)
                    Thread.sleep(3600000); // 1 hora en milisegundos

                } catch (InterruptedException e) {
                    System.out.println("Error en el hilo de actualización de reservas: " + e.getMessage());
                    Thread.currentThread().interrupt(); // Interrupción adecuada del hilo
                    break;
                }
            }
        };

        // Iniciar el hilo
        Thread hiloReserva = new Thread(reservaUpdater);
        hiloReserva.start();
    }

// Método auxiliar para actualizar el estado de la habitación
    public void actualizarEstadoHabitacion(int idhabitacion, String nuevoEstado) throws SQLException {
        sSQL = "UPDATE habitacion SET estado=? WHERE idhabitacion=?";

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setString(1, nuevoEstado);
            pst.setInt(2, idhabitacion);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar la habitación a estado '" + nuevoEstado + "': " + e.getMessage());
        }
    }

//     Metodo auxiliar para editar el estado de la reserva
    public boolean EditarEstadoReserva(Dhabitacion dts) {
        sSQL = "UPDATE habitacion SET estado='Reserva' WHERE idhabitacion=?";

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, dts.getIdhabitacion());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar la habitación a estado 'Reserva': " + e.getMessage());
        }
        return false;
    }

    public boolean limpieza(Dhabitacion dts) {
        sSQL = "UPDATE habitacion SET estado='Limpieza' WHERE idhabitacion=?";

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
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

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
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

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
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

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, numero);
            try ( ResultSet rs = pst.executeQuery()) {
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

}
