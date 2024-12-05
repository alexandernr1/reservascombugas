package LogicaP;

import Datos.Dinicioturno;
import DatosP.Dinicioturnop;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Fsalidap {

    private final Cconexionp mysql = new Cconexionp();
    private final Connection cn = mysql.establecerConexionp();
    private String sSQL = "";
    public Integer totalregistros;

    public Dinicioturnop numeroturnop() {
        int numeroturno = 0;
        int idturno = 0;
        sSQL = "SELECT numero_turno, idturno FROM inicio_turno WHERE estado = 'Activo' ORDER BY numero_turno DESC LIMIT 1";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                numeroturno = rs.getInt("numero_turno");
                idturno = rs.getInt("idturno");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el numero del turno: " + e.getMessage());
        }

        return new Dinicioturnop(numeroturno, idturno);
    }

}
