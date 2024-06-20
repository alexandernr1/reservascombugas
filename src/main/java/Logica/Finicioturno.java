package Logica;

import Datos.Dempleado;
import Datos.Dinicioturno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Finicioturno {

    private final Cconexion mysql = new Cconexion();
    private final Connection cn = mysql.establecerConexion();
    private String sSQL = "";

    ArrayList<Dempleado>listaEMpleado = new ArrayList<>();
    
    public void agregarEmpleados(Dempleado empleado){
        listaEMpleado.add(empleado);
    }
    
    public boolean insertar(Dinicioturno dts) {

        sSQL = "INSERT INTO inicioturno (fecha_hora_inicio, turno, numero_turno, estado, empleado)"
                + "values (?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getFecha_hora_inicio());
            pst.setString(2, dts.getTurno());
            pst.setInt(3, dts.getNumero_turno()); // Utilizamos el valor generado para numero_turno
            pst.setString(4, dts.getEstado());
            pst.setString(5, dts.getEmpleado());

            int n = pst.executeUpdate();
            // JOptionPane.showMessageDialog(null, "DATOS ALMACENADOS CORRECTAMENTE");
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public int generarNumeroTurno() {
        String serie = "";
        String sSQL = "SELECT MAX(numero_turno) FROM inicioturno";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                serie = rs.getString(1);
                if (serie != null) {
                    // Incrementar el valor de serie
                    return Integer.parseInt(serie) + 1;
                } else {
                    // Si no hay registros, el primer número de turno es 1
                    return 1;
                }
            } else {
                // Si la consulta no devuelve resultados, también retornamos 1
                return 1;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al generar el número de turno: " + e.getMessage());
            return 0;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al convertir el número de turno: " + e.getMessage());
            return 0;
        }
    }

    public boolean finalizarturno(Dinicioturno dts) {
        sSQL = "update inicioturno set estado='Finalizado'"
                + " where numero_turno=?";
        //alt + 39

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getNumero_turno());

            int n = pst.executeUpdate();

            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean hayTurnoActivo() {
        String sSQL = "SELECT COUNT(*) AS total FROM inicioturno WHERE estado = 'Activo'";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int total = rs.getInt("total");
                return total > 0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al verificar el estado del turno: " + e.getMessage());
        }
        return false;
    }

    public boolean llenarcboempleado() {
        String sSQL = "select idpersona from empleado where idpersona = '78'";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int total = rs.getInt("empleado");
                return total > 0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "no se encontro empleado: " + e.getMessage());
        }
        return false;
    }
}
