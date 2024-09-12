package Logica;

import Datos.DvalorCongelado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fabonocongelado {

    private final Cconexion mysql = new Cconexion();
    private final Connection cn = mysql.establecerConexion();
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrarAbonoCongelado1(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {
            "Idabono", "HABITACION", "idcliente", "CLIENTE",
            "DOCUMENTO", "FECHA ABONO", "FECHA CONGELADO", "ABONO HABITACION", "DESCUENTO", "N° NOCHES", "NOCHES USADAS", "VALOR CONGELADO", "ESTADO"};
        String[] registro = new String[13];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select idabono, habitacion, idcliente, cliente, documento, fechaabono, fechacongelado, abonohabitacion, descuentos, numeronoches, "
                + "nochesusadas, valorcongelado, estado "
                + "from abonocongelado  "
                + "WHERE documento LIKE ? ";

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setString(1, "%" + buscar + "%");

            try ( ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    registro[0] = rs.getString("idabono");
                    registro[1] = rs.getString("habitacion");
                    registro[2] = rs.getString("idcliente");
                    registro[3] = rs.getString("cliente");
                    registro[4] = rs.getString("documento");
                    registro[5] = rs.getString("fechaabono");
                    registro[6] = rs.getString("fechacongelado");
                    registro[7] = rs.getString("abonohabitacion");
                    registro[8] = rs.getString("descuentos");
                    registro[9] = rs.getString("numeronoches");
                    registro[10] = rs.getString("nochesusadas");
                    registro[11] = rs.getString("valorcongelado");
                    registro[12] = rs.getString("estado");

                    totalregistros++;
                    modelo.addRow(registro);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDE MOSTRAR LOS DATOS: " + e.getMessage());
        }

        return modelo;
    }

    public boolean insertar(DvalorCongelado dts) {
        sSQL = "INSERT INTO abonocongelado (idabono, idcliente, habitacion, cliente, documento, fechaabono, fechacongelado, abonohabitacion, descuentos,"
                + " numeronoches, nochesusadas, valorcongelado, estado)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try ( PreparedStatement pst = cn.prepareStatement(sSQL)) {

            pst.setInt(1, dts.getIdabono());
            pst.setInt(2, dts.getIdcliente());
            pst.setInt(3, dts.getHabitacion());
            pst.setString(4, dts.getCliente());
            pst.setInt(5, dts.getDocumento());
            pst.setString(6, dts.getFechaabono());
            pst.setString(7, dts.getFechacongelado());
            pst.setInt(8, dts.getAbonohabitacion());
            pst.setInt(9, dts.getDescuentos());
            pst.setInt(10, dts.getNumeronoches());
            pst.setInt(11, dts.getNochesusadas());
            pst.setInt(12, dts.getValorcongelado());
            pst.setString(13, dts.getEstado());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    public int obtenerSaldoCongelado(int idcliente) throws SQLException {
    int saldoCongelado = 0;
    
    // Consulta SQL para obtener los abonos congelados del cliente
     sSQL = "SELECT valorcongelado, numeronoches FROM abonocongelado WHERE idcliente = ? AND estado = 'Congelado'";
    
    try (PreparedStatement ps = cn.prepareStatement(sSQL)) {
        ps.setInt(1, idcliente); // Pasar el id del cliente
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            saldoCongelado = rs.getInt("valorcongelado"); // Obtener el saldo congelado
           
             
        }
    }
    
    return saldoCongelado;
}
public boolean cambiarestado(DvalorCongelado dts) {
        sSQL = "update abonocongelado set estado = 'Usado' where idcliente  = ?";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setInt(1, dts.getIdcliente());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cambiar el estado: " + e.getMessage());
            return false;
        }
    }
}
