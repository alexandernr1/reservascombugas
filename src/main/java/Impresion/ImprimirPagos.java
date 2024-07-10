package Impresion;

import Datos.Dpago;
import Logica.Cconexion;
import br.com.adilson.util.Extenso;
import br.com.adilson.util.PrinterMatrix;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;

public class ImprimirPagos {

    private final Cconexion mysql = new Cconexion();
    private final Connection cn = mysql.establecerConexion();
    private String sSQL = "";
    PrinterMatrix printer = new PrinterMatrix();

    public boolean ImprimirFacturaPago() throws FileNotFoundException, IOException {
        sSQL = "SELECT * FROM pago ORDER BY idpago DESC LIMIT 1";

        try ( Statement statement = cn.createStatement();  ResultSet resultSet = statement.executeQuery(sSQL)) {

              String imagePath = "C:\\Users\\Usuario\\Desktop\\reservascombugas\\reservascombugas\\src\\main\\java\\Impresion\\IconoEmpresa.png";
             addImageToPrintFile(imagePath); 
             
            while (resultSet.next()) {
                Dpago dts = new Dpago();
                dts.setIdpago(resultSet.getInt("idpago"));
                dts.setIdsalida(resultSet.getInt("idsalida"));
                dts.setCliente(resultSet.getString("cliente"));
                dts.setNumero(resultSet.getInt("numero"));
                dts.setFechaemision(resultSet.getString("fechaemision"));
                dts.setTipocomprobante(resultSet.getString("tipocomprobante"));
                dts.setNumcomprobante(resultSet.getString("numcomprobante"));
                dts.setEfectivo(resultSet.getInt("efectivo"));
                dts.setTarjeta(resultSet.getInt("tarjeta"));
                dts.setTransferencia(resultSet.getInt("transferencia"));
                dts.setDescuentos(resultSet.getInt("descuentos"));
                dts.setCobrosfraccion(resultSet.getInt("cobrosfraccion"));
                dts.setValorcobrar(resultSet.getInt("valorcobrar"));
                dts.setNetoapagar(resultSet.getInt("netoapagar"));
                dts.setEmpleado(resultSet.getString("empleado"));
                dts.setNumero_turno(resultSet.getInt("numero_turno"));
                dts.setDeuda_anterior(resultSet.getInt("deuda_anterior"));
                dts.setEstado(resultSet.getString("estado"));

                // Imprimir los datos
                Extenso extenso = new Extenso();
                extenso.setNumber(101.85);
                printer.setOutSize(25, 32);

                printer.printTextWrap(1, 2, 10, 32, "HOTEL COMBUGAS S.A.S ");
                printer.printTextWrap(2, 3, 12, 80, "NIT: 900139412-4 ");
                printer.printTextWrap(3, 3, 14, 80, "TEL:3205417916");
                printer.printTextWrap(4, 3, 15, 80, "CARTAGENA");
                printer.printTextWrap(5, 3, 8, 80, "DG 31D N.32A-25B.TERNERA");
                printer.printTextWrap(6, 3, 4, 80, "-----------------------------------");
                printer.printTextWrap(7, 3, 4, 80, "Fecha Emision: " + dts.getFechaemision());
                printer.printTextWrap(8, 3, 4, 80, "Tipo Comprobante: " + dts.getTipocomprobante());
                printer.printTextWrap(9, 3, 4, 80, "Numero Factura: " + dts.getNumcomprobante());
                printer.printTextWrap(10, 3, 4, 80, "Numero Habitacion: " + dts.getNumero());
                printer.printTextWrap(11, 3, 4, 80, "Cliente: " + dts.getCliente());
                printer.printTextWrap(12, 3, 4, 80, "Efectivo: " + dts.getEfectivo());
                printer.printTextWrap(13, 3, 4, 80, "Tarjeta: " + dts.getTarjeta());
                printer.printTextWrap(14, 3, 4, 80, "Transferencia: " + dts.getTransferencia());
                printer.printTextWrap(15, 3, 4, 80, "Descuentos: " + dts.getDescuentos());
                printer.printTextWrap(16, 3, 4, 80, "Cobros Fraccion: " + dts.getCobrosfraccion());
                printer.printTextWrap(17, 3, 4, 80, "Deuda Anterior: " + dts.getDeuda_anterior());
                printer.printTextWrap(18, 3, 4, 80, "Neto a Pagar: " + dts.getNetoapagar());
                printer.printTextWrap(19, 3, 4, 80, "-----------------------------------");
                printer.printTextWrap(20, 3, 4, 80, "Empleado: " + dts.getEmpleado());
                printer.printTextWrap(21, 3, 4, 80, "-----------------------------------");

            }

            printer.toFile("impresion.txt");
            
           try (FileOutputStream fos = new FileOutputStream("impresion.txt", true)) {
            byte[] cutCommand = new byte[]{0x1D, 0x56, 0x41}; // Comando ESC/POS para cortar el papel
            fos.write(cutCommand);
            fos.write(cutCommand);//PRUEBA CORTE DE IMPRESIÓN
        } catch (IOException e) {
            e.printStackTrace();
        }

            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream("impresion.txt");

            } catch (FileNotFoundException f) {
                f.printStackTrace();
            }

            DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
            Doc documeDoc = new SimpleDoc(inputStream, docFormat, null);

            PrintRequestAttributeSet attribute = new HashPrintRequestAttributeSet();
            PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();

            if (defaultPrintService != null) {
                DocPrintJob printJob = defaultPrintService.createPrintJob();
                try {
                    printJob.print(documeDoc, attribute);
                } catch (Exception e) {
                    System.out.println("ERROR: " + e);
                }
            } else {
                System.out.println("No hay una impresora conectada");
            }

            return true;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de errores
            return false;
        }
    }

     // Método para convertir una imagen a un byte array
    private byte[] convertImageToByteArray(String imagePath) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(new File(imagePath));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, "png", byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
    
    // Método para añadir la imagen al archivo de impresión
    private void addImageToPrintFile(String imagePath) {
        try {
            byte[] imageBytes = convertImageToByteArray(imagePath);
            try (FileOutputStream fos = new FileOutputStream("impresion.txt", true)) {
                fos.write(imageBytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
