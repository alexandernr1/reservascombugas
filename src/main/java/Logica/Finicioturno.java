
package Logica;

import Datos.Dinicioturno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Finicioturno {
     private final Cconexion mysql = new Cconexion();
    private final Connection cn = mysql.establecerConexion();
    private String sSQL = "";
    
    
     public boolean insertar(Dinicioturno dts) {
        sSQL = "INSERT INTO inicioturno (fecha_hora_inicio, turno)"
                + "values (?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getFecha_hora_inicio());
            pst.setString(2, dts.getTurno());
           
            int n = pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, "DATOS ALMACENADOS CORRECTAMENTE");
            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
