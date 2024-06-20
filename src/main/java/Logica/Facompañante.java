package Logica;

import Datos.Dacompañante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Facompañante {

    private final Cconexion mysql = new Cconexion();
    private final Connection cn = mysql.establecerConexion();
    private String sSQL = "";
    public Integer totalregistros;
    
     public DefaultTableModel mostraracompañante(String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"idacompañante","Idcliente","Nombre Apellido","Tipo documento","Documento","Parentesco","Numero habita"};
       
       String [] registro =new String [7];
       
       totalregistros=0;
       modelo = new DefaultTableModel(null,titulos);
       
       sSQL="select * from acompañantes where documento like '%"+ buscar + "%' order by idcliente";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro [0]=rs.getString("idacompañante");
               registro [1]=rs.getString("idcliente");
               registro [2]=rs.getString("nombre_apellido");
               registro [3]=rs.getString("tipo_documento");
               registro [4]=rs.getString("documento");
               registro [5]=rs.getString("parentesco");
               registro [6]=rs.getString("num_habitacion");
               
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           }
           return modelo;
           
       } catch (SQLException e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
     } 
    
      public boolean insertar (Dacompañante dts){
       sSQL="insert into acompañantes (idcliente,nombre_apellido, tipo_documento, documento, parentesco, num_habitacion)" +
               "values (?,?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setInt(1, dts.getIdcliente());
           pst.setString(2, dts.getNombre_apellido());
           pst.setString(3, dts.getTipo_documento());
           pst.setInt(4, dts.getDocumento());
           pst.setString(5, dts.getParentesco());
           pst.setInt(6, dts.getNum_habitacion());
          
           
           int n=pst.executeUpdate();
           
           return n!=0;
     
       } catch (SQLException e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
       public boolean eliminar (Dacompañante dts){
       sSQL="delete from acompañantes where idacompañante=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setInt(1, dts.getIdacompañante());
           
           int n=pst.executeUpdate();
           
           return n!=0;
           
       } catch (SQLException e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
   }
}


