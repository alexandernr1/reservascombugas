package Datos;

import java.sql.Date;

/** @author Alexander nieves romero*/

public class Dsalida {

    private int idsalida;
    private int idingreso;
    private int idcliente;
    private int idhabitacion;
    private int idabono;
    private int idempleado;
    private int numero;
    private String cliente;
    private int numnoches;
    private Double costoalojamiento;
    private String fechaingreso;
    private String fechasalida;
    private Date fechaemision;
    private String tipocliente;
    private String tipocomprobante;
    private String num_comprobante;
    private String formapago;
    private int valor_noches;
    private int abonos;
    private int valor_total;
    private int descuentos;
    private int cobros_extra;
    private int otros_cobros;
    private Double totalpago;

    public Dsalida() {
    }

    public Dsalida(int idsalida, int idingreso, int idcliente, int idhabitacion, int idabono, int idempleado, int numero, String cliente, int numnoches, Double costoalojamiento, String fechaingreso, String fechasalida, Date fechaemision, String tipocliente, String tipocomprobante, String num_comprobante, String formapago, int valor_noches, int abonos, int valor_total, int descuentos, int cobros_extra, int otros_cobros, Double totalpago) {
        this.idsalida = idsalida;
        this.idingreso = idingreso;
        this.idcliente = idcliente;
        this.idhabitacion = idhabitacion;
        this.idabono = idabono;
        this.idempleado = idempleado;
        this.numero = numero;
        this.cliente = cliente;
        this.numnoches = numnoches;
        this.costoalojamiento = costoalojamiento;
        this.fechaingreso = fechaingreso;
        this.fechasalida = fechasalida;
        this.fechaemision = fechaemision;
        this.tipocliente = tipocliente;
        this.tipocomprobante = tipocomprobante;
        this.num_comprobante = num_comprobante;
        this.formapago = formapago;
        this.valor_noches = valor_noches;
        this.abonos = abonos;
        this.valor_total = valor_total;
        this.descuentos = descuentos;
        this.cobros_extra = cobros_extra;
        this.otros_cobros = otros_cobros;
        this.totalpago = totalpago;
    }

    public int getIdsalida() {
        return idsalida;
    }

    public void setIdsalida(int idsalida) {
        this.idsalida = idsalida;
    }

    public int getIdingreso() {
        return idingreso;
    }

    public void setIdingreso(int idingreso) {
        this.idingreso = idingreso;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public int getIdabono() {
        return idabono;
    }

    public void setIdabono(int idabono) {
        this.idabono = idabono;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumnoches() {
        return numnoches;
    }

    public void setNumnoches(int numnoches) {
        this.numnoches = numnoches;
    }

    public Double getCostoalojamiento() {
        return costoalojamiento;
    }

    public void setCostoalojamiento(Double costoalojamiento) {
        this.costoalojamiento = costoalojamiento;
    }

    public String getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public String getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(String fechasalida) {
        this.fechasalida = fechasalida;
    }

    public Date getFechaemision() {
        return fechaemision;
    }

    public void setFechaemision(Date fechaemision) {
        this.fechaemision = fechaemision;
    }

    public String getTipocliente() {
        return tipocliente;
    }

    public void setTipocliente(String tipocliente) {
        this.tipocliente = tipocliente;
    }

    public String getTipocomprobante() {
        return tipocomprobante;
    }

    public void setTipocomprobante(String tipocomprobante) {
        this.tipocomprobante = tipocomprobante;
    }

    public String getNum_comprobante() {
        return num_comprobante;
    }

    public void setNum_comprobante(String num_comprobante) {
        this.num_comprobante = num_comprobante;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    public int getValor_noches() {
        return valor_noches;
    }

    public void setValor_noches(int valor_noches) {
        this.valor_noches = valor_noches;
    }

    public int getAbonos() {
        return abonos;
    }

    public void setAbonos(int abonos) {
        this.abonos = abonos;
    }

    public int getValor_total() {
        return valor_total;
    }

    public void setValor_total(int valor_total) {
        this.valor_total = valor_total;
    }

    public int getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(int descuentos) {
        this.descuentos = descuentos;
    }

    public int getCobros_extra() {
        return cobros_extra;
    }

    public void setCobros_extra(int cobros_extra) {
        this.cobros_extra = cobros_extra;
    }

    public int getOtros_cobros() {
        return otros_cobros;
    }

    public void setOtros_cobros(int otrso_cobros) {
        this.otros_cobros = otrso_cobros;
    }

    public Double getTotalpago() {
        return totalpago;
    }

    public void setTotalpago(Double totalpago) {
        this.totalpago = totalpago;
    }
    
    
}
