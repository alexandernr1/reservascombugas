package Logica;

import Datos.Dingreso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Alexander Nieves
 */
public class Fingreso {

    private final Cconexion mysql = new Cconexion();
    private final Connection cn = mysql.establecerConexion();
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"Idingreso", "Idhabitacion", "Numero", "Idcliente", "Cliente", "clientete","Documento",
            "Fecha ingreso", "Numero personas", "tipo cliente", "Costoalojamiento", "Motivo viaje", "Estado"};

        String[] registro = new String[13];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select i.idingreso,i.idhabitacion,h.numero,i.idcliente,"
                + "(select nombres from cliente where idcliente=i.idcliente)as clienten,"
                + "(select apellidos from cliente where idcliente=i.idcliente)as clienteap,"
                + "(SELECT numdocumento FROM cliente WHERE idcliente = i.idcliente)AS clientenu,"
                + "(select telefono from cliente where idcliente= i.idcliente)as clientete,"
                + "i.fecha_hora_ingreso,i.num_personas,i.tipo_cliente,i.motivo_viaje,i.estado,"
                + "i.costoalojamiento from ingreso i inner join habitacion h on i.idhabitacion=h.idhabitacion where (SELECT numdocumento FROM cliente WHERE idcliente = i.idcliente) like '%" + buscar + "%' order by idingreso desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

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
               

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(Dingreso dts) {
        sSQL = "INSERT INTO ingreso (idhabitacion, idcliente, fecha_hora_ingreso, num_personas, tipo_cliente, costoalojamiento, motivo_viaje,estado)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, dts.getIdhabitacion());
            pst.setInt(2, dts.getIdcliente());
            pst.setString(3, dts.getFecha_hora_ingreso());
            pst.setInt(4, dts.getNum_personas());
            pst.setString(5, dts.getTipo_cliente());
            pst.setInt(6, dts.getCostoalojamiento());
            pst.setString(7, dts.getMotivo_viaje());
            pst.setString(8, dts.getEstado());
            

            int n = pst.executeUpdate();
            // JOptionPane.showMessageDialog(null, "DATOS ALMACENADOS CORRECTAMENTE");
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(Dingreso dts) {
        sSQL = "delete from ingreso where idingreso=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdingreso());

            int n = pst.executeUpdate();

            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(Dingreso dts) {
        sSQL = "update ingreso set idhabitacion=?,idcliente=?,fecha_hora_ingreso=?,num_personas=?,tipo_cliente=?,costoalojamiento=?,motivo_viaje=?,estado=?"
                + " where idingreso=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdhabitacion());
            pst.setInt(2, dts.getIdcliente());
            pst.setString(3, dts.getFecha_hora_ingreso());
            pst.setInt(4, dts.getNum_personas());
            pst.setString(5, dts.getTipo_cliente());
            pst.setInt(6, dts.getCostoalojamiento());
            pst.setString(7, dts.getMotivo_viaje());
            pst.setString(8, dts.getEstado());
           

            pst.setInt(9, dts.getIdingreso());

            int n = pst.executeUpdate();

            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

   public boolean finalizar (Dingreso dts){
       sSQL="update ingreso set estado='Finalizado'"+
               " where idingreso=?";
           //alt + 39
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
          
           pst.setInt(1, dts.getIdingreso());
           
           int n=pst.executeUpdate();
           
           return n!=0;
           
       } catch (SQLException e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
    public boolean activar (Dingreso dts){
       sSQL="update ingreso set estado='Activo'"+
               " where idingreso=?";
           //alt + 39
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
          
           pst.setInt(1, dts.getIdingreso());
           
           int n=pst.executeUpdate();
           
           return n!=0;
           
       } catch (SQLException e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
     public int obtenerIdHabitacionAnterior(int idIngreso) {
        sSQL = "SELECT idhabitacion FROM ingreso WHERE idingreso = ?";
        int idHabitacion = -1; // Valor predeterminado en caso de error o no encontrado

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, idIngreso);
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
}
