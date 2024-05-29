
package Logica;

import Datos.Dhabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fhabitacion {
    
    private javax.swing.JTable tablalistado;
   
   private final Cconexion mysql=new Cconexion();
   private final Connection cn = mysql.establecerConexion();
   private String sSQL="";
   public Integer totalregistros;
   
   
   public DefaultTableModel mostrar(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Número","Piso","Descripción","Caracteristicas","Precio","Estado","Tipo habitación"};
       
       String [] registro =new String [8];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select * from habitacion where numero like '%"+ buscar + "%' order by idhabitacion";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idhabitacion");
               registro [1]=rs.getString("numero");
               registro [2]=rs.getString("piso");
               registro [3]=rs.getString("descripcion");
               registro [4]=rs.getString("caracteristicas");
               registro [5]=rs.getString("precio");
               registro [6]=rs.getString("estado");
               registro [7]=rs.getString("tipohabitacion");
               
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (SQLException e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
     } 
   
   
   public DefaultTableModel mostrarvista(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Número","Piso","Descripción","Caracteristicas","Precio","Estado","Tipohabitación"};
       
       String [] registro =new String [8];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select * from habitacion where piso like '%"+ buscar + "%' and estado='Disponible' order by idhabitacion";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idhabitacion");
               registro [1]=rs.getString("numero");
               registro [2]=rs.getString("piso");
               registro [3]=rs.getString("descripcion");
               registro [4]=rs.getString("caracteristicas");
               registro [5]=rs.getString("precio");
               registro [6]=rs.getString("estado");
               registro [7]=rs.getString("tipohabitacion");
               
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (SQLException e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
     } 
   
   
   public boolean insertar (Dhabitacion dts){
       sSQL="insert into habitacion (numero,piso,descripcion,caracteristicas,precio,estado,tipohabitacion)" +
               "values (?,?,?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getNumero());
           pst.setString(2, dts.getPiso());
           pst.setString(3, dts.getDescripcion());
           pst.setString(4, dts.getCaracteristicas());
           pst.setInt(5, dts.getPrecio());
           pst.setString(6, dts.getEstado());
           pst.setString(7, dts.getTipohabitacion());
           
           int n=pst.executeUpdate();
           
           return n!=0;
     
       } catch (SQLException e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
   
   public boolean editar (Dhabitacion dts){
       sSQL="update habitacion set numero=?,piso=?,descripcion=?,caracteristicas=?,precio=?,estado=?,tipohabitacion=?"+
               " where idhabitacion=?";
           
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getNumero());
           pst.setString(2, dts.getPiso());
           pst.setString(3, dts.getDescripcion());
           pst.setString(4, dts.getCaracteristicas());
           pst.setDouble(5, dts.getPrecio());
           pst.setString(6, dts.getEstado());
           pst.setString(7, dts.getTipohabitacion());
           pst.setInt(8, dts.getIdhabitacion());
           
           int n=pst.executeUpdate();
           
           return n!=0;
           
       } catch (SQLException e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   } 
  
   public boolean desocupar (Dhabitacion dts){
       sSQL="update habitacion set estado='Disponible'"+
               " where idhabitacion=?";
           //alt + 39
       
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
          
           pst.setInt(1, dts.getIdhabitacion());
           
           int n=pst.executeUpdate();
           
           return n!=0;
           
       } catch (SQLException e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   } 
  
   
   public boolean ocupar (Dhabitacion dts){
       sSQL="update habitacion set estado='Ocupado'"+
               " where idhabitacion=?";
           //alt + 39
        
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
          
           pst.setInt(1, dts.getIdhabitacion());
           
           int n=pst.executeUpdate();
           
           return n!=0;
           
       } catch (SQLException e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   } 
   public boolean reserva (Dhabitacion dts){
       sSQL="update habitacion set estado='Reserva'"+
               " where idhabitacion=?";
           //alt + 39
        
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
          
           pst.setInt(1, dts.getIdhabitacion());
           
           int n=pst.executeUpdate();
           
           return n!=0;
           
       } catch (SQLException e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   } 
    public boolean limpieza (Dhabitacion dts){
       sSQL="update habitacion set estado='Limpieza'"+
               " where idhabitacion=?";
           //alt + 39
        
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
          
           pst.setInt(1, dts.getIdhabitacion());
           
           int n=pst.executeUpdate();
           
           return n!=0;
           
       } catch (SQLException e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   } 
    public boolean disponible (Dhabitacion dts){
       sSQL="update habitacion set estado='Disponible'"+
               " where idhabitacion=?";
           //alt + 39
        
       try {
           PreparedStatement pst=cn.prepareStatement(sSQL);
          
           pst.setInt(1, dts.getIdhabitacion());
           
           int n=pst.executeUpdate();
           
           return n!=0;
           
       } catch (SQLException e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   } 
    
   public boolean eliminar (Dhabitacion dts){
       sSQL="delete from habitacion where idhabitacion=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdhabitacion());
           
           int n=pst.executeUpdate();
           
           return n!=0;
           
       } catch (SQLException e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
   
public String obtenerEstadoHabitacion(int idhabitacion) {
        String estado = "Disponible";

        try {
            sSQL = "SELECT estado FROM habitacion WHERE idhabitacion = ?";
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, idhabitacion);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                estado = rs.getString("estado");
            }

        } catch (SQLException e) {
          
            
        }

        return estado;
    }



        

 public Map<Integer, String> obtenerEstadosTodasHabitaciones() {
        Map<Integer, String> estados = new HashMap<>();

        sSQL = "SELECT idhabitacion, estado FROM habitacion";
        try (PreparedStatement pst = cn.prepareStatement(sSQL);
             ResultSet rs = pst.executeQuery()) {
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




