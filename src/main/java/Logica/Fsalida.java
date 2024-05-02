package Logica;

import Datos.Dsalida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Alexander nieves romero
 */
public class Fsalida {

    private final Cconexion mysql = new Cconexion();
    private final Connection cn = mysql.establecerConexion();
    private String sSQL = "";
    public Integer totalregistros;

    public boolean insertar(Dsalida dts) {
        sSQL = "insert into salida (idingreso,idcliente,idhabitacion,idabono,idempleado,"
                + "numero, cliente, numnoches,costoalojamiento,fechaingreso,fechasalida,fechaemision,tipocliente,tipocomprobante,num_comprobante,formapago,"
                + "valor_noches,abonos,valor_total,descuentos,cobros_extra,otros_cobros,totalpago)"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdingreso());
            pst.setInt(2, dts.getIdcliente());
            pst.setInt(3, dts.getIdhabitacion());
            pst.setInt(4, dts.getIdabono());
            pst.setInt(5, dts.getIdempleado());
            pst.setInt(6, dts.getNumero());
            pst.setString(7, dts.getCliente());
            pst.setInt(8, dts.getNumnoches());
            pst.setDouble(9, dts.getCostoalojamiento());
            pst.setString(10, dts.getFechaingreso());
            pst.setString(11, dts.getFechasalida());
            pst.setDate(12, dts.getFechaemision());
            pst.setString(13, dts.getTipocliente());
            pst.setString(14, dts.getTipocomprobante());
            pst.setString(15, dts.getNum_comprobante());
            pst.setString(16, dts.getFormapago());
            pst.setInt(17, dts.getValor_noches());
            pst.setInt(18, dts.getAbonos());
            pst.setInt(19, dts.getValor_total());
            pst.setInt(20, dts.getDescuentos());
            pst.setInt(21, dts.getCobros_extra());
            pst.setInt(22, dts.getOtros_cobros());
            pst.setDouble(23, dts.getTotalpago());

            int n = pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "DATOS ALMACENADOS CORRECTAMENTE");
            
            return n != 0;
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
