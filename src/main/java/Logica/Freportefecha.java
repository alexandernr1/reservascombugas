package Logica;

import Datos.Dinicioturno;
import Datos.Dsalidaturno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Freportefecha {

    Statement st;
    ResultSet rs;

    public void llenarcboturno(JComboBox<String> combo) {
        Finicioturno func = new Finicioturno();  // Asumo que este es tu objeto funcional
        DefaultComboBoxModel<String> com = new DefaultComboBoxModel<>();  // Modelo para el JComboBox
        combo.setModel(com);  // Asignamos el modelo al combo
        Cconexion conexion = new Cconexion();  // Conexión a la base de datos

        com.addElement("Seleccione un turno");  // Primer elemento del ComboBox

        try {
            // Establecer la conexión y ejecutar la consulta SQL
            Connection conectar = conexion.establecerConexion();
            st = conectar.createStatement();
            rs = st.executeQuery("SELECT turno FROM inicioturno"
                    + " ORDER BY idinicioturno DESC LIMIT 90");

            // Recorrer los resultados de la consulta
            while (rs.next()) {
                // Obtener el turno desde el ResultSet
                String turno = rs.getString("turno");

                // Agregar el turno al modelo del ComboBox
                com.addElement(turno);

                // Si tienes un método en Finicioturno para agregar el turno
                Dinicioturno turnos = new Dinicioturno();
                turnos.setTurno(turno);  // Si tienes un setter en Dinicioturno
                func.agregarturno(turnos);  // Si agregas turnos a algún objeto o lista en Finicioturno
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    public void llenarcboturnofin(JComboBox<String> combo) {
        Finicioturno func = new Finicioturno();  // Asumo que este es tu objeto funcional
        DefaultComboBoxModel<String> com = new DefaultComboBoxModel<>();  // Modelo para el JComboBox
        combo.setModel(com);  // Asignamos el modelo al combo
        Cconexion conexion = new Cconexion();  // Conexión a la base de datos

        com.addElement("Seleccione un turno");  // Primer elemento del ComboBox

        try {
            // Establecer la conexión y ejecutar la consulta SQL
            Connection conectar = conexion.establecerConexion();
            st = conectar.createStatement();
            rs = st.executeQuery("SELECT turno FROM salida ORDER BY idsalida DESC LIMIT 90");

            // Recorrer los resultados de la consulta
            while (rs.next()) {
                // Obtener el turno desde el ResultSet
                String turno = rs.getString("turno");

                // Agregar el turno al modelo del ComboBox
                com.addElement(turno);

                // Si tienes un método en Finicioturno para agregar el turno
                Dsalidaturno turnofin = new Dsalidaturno();
                turnofin.setTurno(turno);  // Si tienes un setter en Dinicioturno
                func.agregarturnofin(turnofin);  // Si agregas turnos a algún objeto o lista en Finicioturno
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    public void llenarTablaAbonos(JComboBox<String> comboTurnoInicio, JComboBox<String> comboTurnoFin, JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de llenarla

        // Obtener los valores seleccionados de los combos
        String turnoInicioSeleccionado = (String) comboTurnoInicio.getSelectedItem();
        String turnoFinSeleccionado = (String) comboTurnoFin.getSelectedItem();

        // Encabezados de las columnas
        String[] titulos = {"idabono", "habitacion", "fechaabono", "abonohabitacion", "descuentos", "otroscobros", "numero_turno",
            "documento", "razon_social", "email", "numeronoches", "valordescuento", "efectivo", "tarjeta",
            "transferencia", "totalapagar"};

        Object[] fila = new Object[16];
        Cconexion conexion = new Cconexion();

        try {
            Connection conectar = conexion.establecerConexion();
            model = new DefaultTableModel(null, titulos);

            // Consulta SQL corregida para filtrar por los turnos de inicio y fin
            PreparedStatement ps = conectar.prepareStatement(
                    "SELECT a.idabono, a.habitacion, a.fechaabono, a.abonohabitacion, "
                    + "a.descuentos, a.otroscobros, a.numero_turno, a.documento, "
                    + "a.razon_social, a.email, a.numeronoches, a.valordescuento, "
                    + "a.efectivo, a.tarjeta, a.transferencia, a.totalapagar "
                    + "FROM reserva1.abono a "
                    + "WHERE turno = ? AND turno = ? "
                    + "ORDER BY a.idabono DESC;");

            // Asignar los valores de los turnos seleccionados a los parámetros de la consulta
            ps.setString(1, turnoInicioSeleccionado); // Establecer el primer turno (inicio)
            ps.setString(2, turnoFinSeleccionado); // Establecer el segundo turno (fin)

            ResultSet rs = ps.executeQuery();

            // Recorrer los resultados de la consulta y llenar la tabla
            while (rs.next()) {
                fila[0] = rs.getInt("idabono");
                fila[1] = rs.getString("habitacion");
                fila[2] = rs.getString("fechaabono"); // Convertir la fecha a cadena si es necesario
                fila[3] = rs.getInt("abonohabitacion");
                fila[4] = rs.getInt("descuentos");
                fila[5] = rs.getInt("otroscobros");
                fila[6] = rs.getString("numero_turno");
                fila[7] = rs.getString("documento");
                fila[8] = rs.getString("razon_social");
                fila[9] = rs.getString("email");
                fila[10] = rs.getInt("numeronoches");
                fila[11] = rs.getInt("valordescuento");
                fila[12] = rs.getInt("efectivo");
                fila[13] = rs.getInt("tarjeta");
                fila[14] = rs.getInt("transferencia");
                fila[15] = rs.getInt("totalapagar");

                model.addRow(fila); // Agregar la fila a la tabla
            }

            // Asignar el modelo actualizado a la tabla
            table.setModel(model);

            // Cerrar conexión
            rs.close();
            ps.close();
            conectar.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void llenarTablaIngreso(JComboBox<String> comboTurnoInicio, JComboBox<String> comboTurnoFin, JTable table) {

        String[] titulos1 = {"idingreso", "idcliente", "Cliente", "documento",
            "Telefono", "Fecha Ingreso", "N° Personas", "Tipo Cliente",
            "Costo", "Motivo Viaje", "Estado", "C.R", "C.P", "N°Habi"};

        DefaultTableModel modelo = new DefaultTableModel(null, titulos1);
        table.setModel(modelo);
        modelo.setRowCount(0); // Limpiar la tabla antes de llenarla

        // Obtener los valores seleccionados
        String turnoInicioSeleccionado = (String) comboTurnoInicio.getSelectedItem();
        String turnoFinSeleccionado = (String) comboTurnoFin.getSelectedItem();

        Object[] registro = new Object[15];
        Cconexion conexion = new Cconexion();

        try {
            Connection conectar = conexion.establecerConexion();
            PreparedStatement ps = conectar.prepareStatement(
                    "SELECT i.idingreso, i.idcliente, "
                    + "(SELECT nombres FROM cliente WHERE idcliente=i.idcliente) AS clienten, "
                    + "(SELECT apellidos FROM cliente WHERE idcliente=i.idcliente) AS clienteap, "
                    + "(SELECT numdocumento FROM cliente WHERE idcliente=i.idcliente) AS clientenu, "
                    + "(SELECT telefono FROM cliente WHERE idcliente=i.idcliente) AS clientete, "
                    + "i.fecha_hora_ingreso, i.num_personas, i.tipo_cliente, i.costoalojamiento, "
                    + "i.motivo_viaje, i.estado, i.ciudad_de_recidencia, i.ciudad_de_procedencia, i.num_habitacion "
                    + "FROM reserva1.ingreso i "
                    + "WHERE turno = ? AND turno = ? "
                    + "ORDER BY i.idingreso DESC");

            // Establecer los parámetros de la consulta
            ps.setString(1, turnoInicioSeleccionado); // Establecer el primer turno
            ps.setString(2, turnoFinSeleccionado); // Establecer el segundo turno

            ResultSet rs = ps.executeQuery();

            // Recorrer los resultados de la consulta y llenar la tabla
            while (rs.next()) {

                registro[0] = rs.getString("idingreso");
                registro[1] = rs.getString("idcliente");
                registro[2] = rs.getString("clienten") + " " + rs.getString("clienteap");
                registro[3] = rs.getString("clientete");
                registro[4] = rs.getString("clientenu");
                registro[5] = rs.getString("fecha_hora_ingreso");
                registro[6] = rs.getString("num_personas");
                registro[7] = rs.getString("tipo_cliente");
                registro[8] = rs.getString("costoalojamiento");
                registro[9] = rs.getString("motivo_viaje");
                registro[10] = rs.getString("estado");
                registro[11] = rs.getString("ciudad_de_recidencia");
                registro[12] = rs.getString("ciudad_de_procedencia");
                registro[13] = rs.getString("num_habitacion");

                modelo.addRow(registro); // Agregar fila a la tabla

            }

            // Cerrar conexión
            rs.close();
            ps.close();
            conectar.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void llenarTablaSalida(JComboBox<String> comboTurnoInicio, JComboBox<String> comboTurnoFin, JTable table) {

        String[] titulos1 = {"Numero", "Fecha Ingreso", "Fecha Salida", "Empleado",
            "N° Turno", "Cliente", "Numnoches", "Costo", "Tipo Cliente",
            "valor Noches", "Abonos", "Valor Total", "Total Pago"};

//        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        DefaultTableModel modelos = new DefaultTableModel(null, titulos1);
        table.setModel(modelos);
        modelos.setRowCount(0); // Limpiar la tabla antes de llenarla

        // Obtener los valores seleccionados
        String turnoInicioSeleccionado = (String) comboTurnoInicio.getSelectedItem();
        String turnoFinSeleccionado = (String) comboTurnoFin.getSelectedItem();

        Object[] registro = new Object[14]; // Cambia 16 por el número de columnas que tienes
        Cconexion conexion = new Cconexion();

        try {
            Connection conectar = conexion.establecerConexion();
            PreparedStatement ps = conectar.prepareStatement(
                    "SELECT s.numero, s.fechaingreso, s.fechasalida, s.empleado, s.numero_turno, "
                    + "s.cliente, s.tipocliente, s.numnoches, s.costoalojamiento, "
                    + "s.valor_noches, s.abonos, s.valor_total, s.totalpago "
                    + "FROM salida s "
                    + "WHERE turno BETWEEN ? AND ? "
                    + "ORDER BY s.idsalida DESC");

            // Establecer los parámetros de la consulta
            ps.setString(1, turnoInicioSeleccionado); // Establecer el primer turno
            ps.setString(2, turnoFinSeleccionado); // Establecer el segundo turno

            ResultSet rs = ps.executeQuery();

            // Recorrer los resultados de la consulta y llenar la tabla
            while (rs.next()) {

                registro[0] = rs.getString("numero");
                registro[1] = rs.getString("fechaingreso");
                registro[2] = rs.getString("fechasalida");
                registro[3] = rs.getString("empleado");
                registro[4] = rs.getString("numero_turno");
                registro[5] = rs.getString("cliente");
                registro[6] = rs.getString("tipocliente");
                registro[7] = rs.getString("numnoches");
                registro[8] = rs.getString("costoalojamiento");
                registro[9] = rs.getString("valor_noches");
                registro[10] = rs.getString("abonos");
                registro[11] = rs.getString("valor_total");
                registro[12] = rs.getString("totalpago");

                modelos.addRow(registro); // Agregar fila a la tabla

            }

            // Cerrar conexión
            rs.close();
            ps.close();
            conectar.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
