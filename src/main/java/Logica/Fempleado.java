package Logica;

import Datos.Dempleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fempleado {

    private final Cconexion mysql = new Cconexion();
    private final Connection cn = mysql.establecerConexion();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"idpersona", "Nombres", "Apellidos", "Tipodocumento", "NúmeroDocumento", "Teléfono", "Dirección", "Email", "pais", "ciudad", "Acceso", "Login", "Password", "Estado", "eps", "arl"};

        String[] registro = new String[16];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT p.idpersona,p.nombres,p.apellidos,p.tipodocumento,p.numdocumento,"
                + "p.telefono, p.direccion, p.email, p.pais,p.ciudad,e.acceso,e.login,e.password,e.estado, e.eps, e.arl FROM persona p inner join empleado e "
                + "on p.idpersona=e.idpersona WHERE numdocumento like '%"
                + buscar + "%' order by idpersona desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idpersona");
                registro[1] = rs.getString("nombres");
                registro[2] = rs.getString("apellidos");
                registro[3] = rs.getString("tipodocumento");
                registro[4] = rs.getString("numdocumento");
                registro[5] = rs.getString("telefono");
                registro[6] = rs.getString("direccion");
                registro[7] = rs.getString("email");
                registro[8] = rs.getString("pais");
                registro[9] = rs.getString("ciudad");
                registro[10] = rs.getString("acceso");
                registro[11] = rs.getString("login");
                registro[12] = rs.getString("password");
                registro[13] = rs.getString("estado");
                registro[14] = rs.getString("eps");
                registro[15] = rs.getString("arl");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public DefaultTableModel mostrarvista(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"idpersona", "Nombres", "Apellidos", "Tipodocumento", "NúmeroDocumento", "Teléfono", "Dirección", "Email", "pais", "ciudad", "Acceso", "Login", "Password", "Estado", "eps", "arl"};

        String[] registro = new String[16];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT p.idpersona,p.nombres,p.apellidos,p.tipodocumento,p.numdocumento,"
                + "p.telefono,p.direccion,p.email,p.pais,p.ciudad,e.acceso,e.login,e.password,e.estado, e.eps, e.arl FROM persona p inner join empleado e "
                + "on p.idpersona=e.idpersona WHERE numdocumento like '%"
                + buscar + "%' order by idpersona desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idpersona");
                registro[1] = rs.getString("nombres");
                registro[2] = rs.getString("apellidos");
                registro[3] = rs.getString("tipodocumento");
                registro[4] = rs.getString("numdocumento");
                registro[5] = rs.getString("telefono");
                registro[6] = rs.getString("direccion");
                registro[7] = rs.getString("email");
                registro[8] = rs.getString("pais");
                registro[9] = rs.getString("ciudad");
                registro[10] = rs.getString("acceso");
                registro[11] = rs.getString("login");
                registro[12] = rs.getString("password");
                registro[13] = rs.getString("estado");
                registro[14] = rs.getString("eps");
                registro[15] = rs.getString("arl");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(Dempleado dts) {
        sSQL = "insert into persona (nombres, apellidos, tipodocumento, numdocumento, telefono, direccion, email,pais,ciudad)"
                + "values (?,?,?,?,?,?,?,?,?) ";
        sSQL2 = "insert into empleado (idpersona,acceso,login,password,estado,eps,arl)"
                + "values ((select idpersona from persona order by idpersona desc limit 1),?,?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getNombres());
            pst.setString(2, dts.getApellidos());
            pst.setString(3, dts.getTipodocumento());
            pst.setString(4, dts.getNumdocumento());
            pst.setString(5, dts.getTelefono());
            pst.setString(6, dts.getDireccion());
            pst.setString(7, dts.getEmail());
            pst.setString(8, dts.getPais());
            pst.setString(9, dts.getCiudad());

            pst2.setString(1, dts.getAcceso());
            pst2.setString(2, dts.getLogin());
            pst2.setString(3, dts.getPassword());
            pst2.setString(4, dts.getEstado());
            pst2.setString(5, dts.getEps());
            pst2.setString(6, dts.getArl());

            // Agrega impresiones para depuración
            System.out.println("sSQL2: " + sSQL2);
            System.out.println("idpersona from subquery: " + getIdPersonaFromSubquery());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();
                return n2 != 0;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

// Agrega un método para obtener el ID de persona desde la subconsulta
    private int getIdPersonaFromSubquery() {
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select idpersona from persona order by idpersona desc limit 1");
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0; // Valor predeterminado si no se encuentra
    }

    public boolean editar(Dempleado dts) {
        sSQL = "UPDATE persona SET nombres=?,apellidos=?,tipodocumento=?,numdocumento=?,"
                + "telefono=?, direccion=?,email=?,pais=?,ciudad=? WHERE idpersona=?";

        sSQL2 = "UPDATE empleado SET acceso=?,login=?,password=?,estado=?,eps=?,arl=?"
                + " WHERE idpersona=?";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getNombres());
            pst.setString(2, dts.getApellidos());
            pst.setString(3, dts.getTipodocumento());
            pst.setString(4, dts.getNumdocumento());
            pst.setString(5, dts.getTelefono());
            pst.setString(6, dts.getDireccion());
            pst.setString(7, dts.getEmail());
            pst.setString(8, dts.getPais());
            pst.setString(9, dts.getCiudad());
            pst.setInt(10, dts.getIdpersona());

            pst2.setString(1, dts.getAcceso());
            pst2.setString(2, dts.getLogin());
            pst2.setString(3, dts.getPassword());
            pst2.setString(4, dts.getEstado());
            pst2.setString(5, dts.getEps());
            pst2.setString(6, dts.getArl());
            pst2.setInt(7, dts.getIdpersona());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                return n2 != 0;

            } else {
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(Dempleado dts) {
        sSQL = "delete from empleado where idpersona=?";
        sSQL2 = "delete from persona where idpersona=?";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setInt(1, dts.getIdpersona());

            pst2.setInt(1, dts.getIdpersona());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                return n2 != 0;

            } else {
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public DefaultTableModel login(String login, String password) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Nombres", "Apellidos", "Acceso", "Login", "Password", "Estado",};

        String[] registro = new String[7];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.idpersona,p.nombres,p.apellidos,"
                + "e.acceso,e.login,e.password,e.estado,e.eps,e.arl from persona p inner join Empleado e "
                + "on p.idpersona= e.idpersona WHERE e.login='"
                + login + "' and e.password='" + password + "' and e.estado='A'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idpersona");
                registro[1] = rs.getString("nombres");
                registro[2] = rs.getString("apellidos");

                registro[3] = rs.getString("acceso");
                registro[4] = rs.getString("login");
                registro[5] = rs.getString("password");
                registro[6] = rs.getString("estado");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
}
