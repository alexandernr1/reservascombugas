package Datos;

public class Dpago {

    public int idpago;
    public int idsalida;
    public String cliente;
    public int numero;
    public String fechaemision;
    public String tipocomprobante;
    public String numcomprobante;
    public int efectivo;
    public int tarjeta;
    public int transferencia;
    public int descuentos;
    public int cobrosfraccion;
    public int valorcobrar;
    public int netoapagar;
    public String empleado;

    public Dpago() {
    }

    public Dpago(int idpago, int idsalida, String cliente, int numero, String fechaemision, String tipocomprobante, String numcomprobante, int efectivo, int tarjeta, int transferencia, int descuentos, int cobrosfraccion, int valorcobrar, int netoapagar, String empleado) {
        this.idpago = idpago;
        this.idsalida = idsalida;
        this.cliente = cliente;
        this.numero = numero;
        this.fechaemision = fechaemision;
        this.tipocomprobante = tipocomprobante;
        this.numcomprobante = numcomprobante;
        this.efectivo = efectivo;
        this.tarjeta = tarjeta;
        this.transferencia = transferencia;
        this.descuentos = descuentos;
        this.cobrosfraccion = cobrosfraccion;
        this.valorcobrar = valorcobrar;
        this.netoapagar = netoapagar;
        this.empleado = empleado;
    }

    public int getIdpago() {
        return idpago;
    }

    public void setIdpago(int idpago) {
        this.idpago = idpago;
    }

    public int getIdsalida() {
        return idsalida;
    }

    public void setIdsalida(int idsalida) {
        this.idsalida = idsalida;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaemision() {
        return fechaemision;
    }

    public void setFechaemision(String fechaemision) {
        this.fechaemision = fechaemision;
    }

    public String getTipocomprobante() {
        return tipocomprobante;
    }

    public void setTipocomprobante(String tipocomprobante) {
        this.tipocomprobante = tipocomprobante;
    }

    public String getNumcomprobante() {
        return numcomprobante;
    }

    public void setNumcomprobante(String numcomprobante) {
        this.numcomprobante = numcomprobante;
    }

    public int getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(int efectivo) {
        this.efectivo = efectivo;
    }

    public int getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    public int getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(int transferencia) {
        this.transferencia = transferencia;
    }

    public int getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(int descuentos) {
        this.descuentos = descuentos;
    }

    public int getCobrosfraccion() {
        return cobrosfraccion;
    }

    public void setCobrosfraccion(int cobrosfraccion) {
        this.cobrosfraccion = cobrosfraccion;
    }

    public int getValorcobrar() {
        return valorcobrar;
    }

    public void setValorcobrar(int valorcobrar) {
        this.valorcobrar = valorcobrar;
    }

    public int getNetoapagar() {
        return netoapagar;
    }

    public void setNetoapagar(int netoapagar) {
        this.netoapagar = netoapagar;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    

}
