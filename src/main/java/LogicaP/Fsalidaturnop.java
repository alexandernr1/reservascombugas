package LogicaP;

import DatosP.Dsalidaturnop;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Alexander nieves romero
 */
public class Fsalidaturnop {

    private final Cconexionp mysql = new Cconexionp();
    private final Connection cn = mysql.establecerConexionp();
    private String sSQL = "";
    public Integer totalregistros;

    public boolean insertar(Dsalidaturnop dts) {
        sSQL = "insert into salida_turno ( idempleado, idhabitacion, empleado, turno, fecha_hora_inicio, fecha_hora_salida,"
                + " total_recibos, base, tarjetas, efectivo, transferencias,  otros_ingresos, total_recaudo, entrega_admon, total_efectivo, observaciones, numero_turno)"
                + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdempleado());
            pst.setInt(2, dts.getIdhabitacion());
            pst.setString(3, dts.getEmpleado());
            pst.setString(4, dts.getTurno());
            pst.setString(5, dts.getFecha_hora_inicio());
            pst.setString(6, dts.getFecha_hora_salida());
            pst.setInt(7, dts.getTotal_recibos());
            pst.setInt(8, dts.getBase());
            pst.setInt(9, dts.getTarjetas());
            pst.setInt(10, dts.getEfectivo());
            pst.setInt(11, dts.getTransferencias());
            pst.setInt(12, dts.getOtros_ingresos());
            pst.setInt(13, dts.getTotal_recaudo());
            pst.setInt(14, dts.getEntrega_admon());
            pst.setInt(15, dts.getTotal_efectivo());
            pst.setString(16, dts.getObservaciones());
            pst.setInt(17, dts.getNumero_turno());

            int n = pst.executeUpdate();

//        JOptionPane.showMessageDialog(null, "DATOS ALMACENADOS CORRECTAMENTE");
            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public ResultSet realizarConsulta(String inicioturno) throws SQLException {

        sSQL = "select *from inicio_turno where numero_turno=?";

        PreparedStatement pst = cn.prepareStatement(sSQL);
        pst.setString(1, inicioturno);

        return pst.executeQuery();
    }

 

    public String estadoturno() {
        String estado = "";
        String sSQL = "select estado from inicio_turno ORDER BY numero_turno DESC LIMIT 1;";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                estado = rs.getString("estado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el estado del turno: " + e.getMessage());
        }

        return estado;
    }

    public int numeroturno() {
        int numeroturno = 0;
        sSQL = "SELECT numero_turno FROM inicio_turno WHERE estado = 'Activo' ORDER BY numero_turno DESC LIMIT 1";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                numeroturno = rs.getInt("numero_turno");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el numero del turno: " + e.getMessage());
        }

        return numeroturno;
    }

    public int[] totalmedio_pagos(int numeroturno) {
        int[] mediosDePago = new int[3]; // Un array para almacenar los totales de efectivo, tarjeta y transferencia

        // Consulta SQL para obtener los totales de medios de pago durante un turno activo
        String sSQL = "SELECT SUM(efectivo) AS efectivo, SUM(tarjeta) AS tarjeta, SUM(transferencia) AS transferencia "
                + "FROM abono WHERE numero_turno = ?";

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, numeroturno);

            try ( ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    mediosDePago[0] = rs.getInt("efectivo"); // Total en efectivo
                    mediosDePago[1] = rs.getInt("tarjeta");  // Total en tarjeta
                    mediosDePago[2] = rs.getInt("transferencia"); // Total en transferencia
                }
            }

            return mediosDePago; // Retornar el array con los totales
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener totales en medios de pago: " + e.getMessage());
            return new int[]{0, 0, 0}; // En caso de error, retornar un array con valores 0
        }
    }

    public int[] totalmedio_pagos_pago(int numeroturno) {
        int[] mediosDePago_pago = new int[3]; // Un array para almacenar los totales de efectivo, tarjeta y transferencia

        // Consulta SQL para obtener los totales de medios de pago durante un turno activo
        String sSQL = "SELECT SUM(efectivo) AS efectivo, SUM(tarjeta) AS tarjeta, SUM(transferencias) AS transferencias "
                + "FROM salida WHERE numero_turno = ?";

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, numeroturno);

            try ( ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    mediosDePago_pago[0] = rs.getInt("efectivo"); // Total en efectivo
                    mediosDePago_pago[1] = rs.getInt("tarjeta");  // Total en tarjeta
                    mediosDePago_pago[2] = rs.getInt("transferencias"); // Total en transferencia
                }
            }

            return mediosDePago_pago; // Retornar el array con los totales
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener totales en medios de pago: " + e.getMessage());
            return new int[]{0, 0, 0}; // En caso de error, retornar un array con valores 0
        }
    }

    public int totalAbonos(int numero) {
        int numeroturno = 0;
        String sSQL = "SELECT SUM(totalapagar) AS totalapagar from abono where numero_turno = ?";

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, numero);
            try ( ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    numeroturno = rs.getInt("totalapagar");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la suma de toteles a pagar: " + e.getMessage());
        }

        return numeroturno;
    }

    public String Consultaempleado(int idEmpleado) throws SQLException {
        String empleado1 = "";
        String sSQL = "SELECT empleado FROM inicioturno WHERE idinicioturno =? AND estado ='Activo';";

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, idEmpleado);

            try ( ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    empleado1 = rs.getString("empleado");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el dato del empleado: " + e.getMessage());
        }

        return empleado1;
    }

    public int sumatotales(int inicioturno2) {
        int netorecaudado = 0;

        sSQL = "SELECT SUM(deuda_anterior) AS deuda_anterior from reserva1.pago where numero_turno = ?";
        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, inicioturno2);

            try ( ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    netorecaudado = rs.getInt("deuda_anterior");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la suma de deudas anterior: " + e.getMessage());
        }
        return netorecaudado;
    }

    public int sumaDeudaAnterior(int inicioturno3) {
        int deuda_anterior = 0;

        sSQL = "SELECT SUM(deuda_anterior) AS deuda_anterior from pago where numero_turno = ?";
        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, inicioturno3);

            try ( ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    deuda_anterior = rs.getInt("deuda_anterior");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la suma de deuda Aterior: " + e.getMessage());
        }
        return deuda_anterior;
    }

}
