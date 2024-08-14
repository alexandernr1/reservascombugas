package Logica;

import Datos.Dfactura_electronica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Ffactura_electronica {

    private final Cconexion mysql = new Cconexion();
    private final Connection cn = mysql.establecerConexion();
    private String sSQL = "";

    public boolean insertar(Dfactura_electronica dts) throws SQLException {

        sSQL = "insert into factura_electronica (documento, DV,razon_social,tipo_persona,tipo_documento,departamento,municipio,direccion,telefono,email,regimen_fiscal,responsabilidades_fiscales,idcliente)"
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = cn.prepareStatement(sSQL);
        try {

            pst.setInt(1, dts.getDocumento());
            pst.setInt(2, dts.getDv());
            pst.setString(3, dts.getRazon_social());
            pst.setString(4, dts.getTipo_persona());
            pst.setString(5, dts.getTipo_documento());
            pst.setString(6, dts.getDepartamento());
            pst.setString(7, dts.getMunicipio());
            pst.setString(8, dts.getDireccion());
            pst.setString(9, dts.getTelefono());
            pst.setString(10, dts.getEmail());
            pst.setString(11, dts.getRegimen_fiscal());
            pst.setString(12, dts.getResponsabilidades_fiscales());
            pst.setInt(13, dts.getIdcliente());

            int n = pst.executeUpdate();

            return n != 0;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar recursos: " + e.getMessage());
            }

        }

    }

}
