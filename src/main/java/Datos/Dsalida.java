package Datos;

import java.sql.Date;

/**
 * @author Alexander nieves romero
 */
public class Dsalida {

    public int idsalida;
    public int idingreso;
    public int idcliente;
    public int idhabitacion;
    public int idabono;
    public String empleado;
    public int numero;
    public String cliente;
    public int numnoches;
    public int costoalojamiento;
    public String fechaingreso;
    public String fechasalida;

    public String tipocliente;

    public int valor_noches;
    public int abonos;
    public int valor_total;
    public int descuentos;
    public int cobros_extra;
    public int otros_cobros;
    public Double totalpago;

    public Dsalida() {
    }

    public Dsalida(int idsalida, int idingreso, int idcliente, int idhabitacion, int idabono, String empleado, int numero, String cliente, int numnoches, int costoalojamiento, String fechaingreso, String fechasalida,  String tipocliente, int valor_noches, int abonos, int valor_total, int descuentos, int cobros_extra, int otros_cobros, Double totalpago) {
        this.idsalida = idsalida;
        this.idingreso = idingreso;
        this.idcliente = idcliente;
        this.idhabitacion = idhabitacion;
        this.idabono = idabono;
        this.empleado = empleado;
        this.numero = numero;
        this.cliente = cliente;
        this.numnoches = numnoches;
        this.costoalojamiento = costoalojamiento;
        this.fechaingreso = fechaingreso;
        this.fechasalida = fechasalida;

        this.tipocliente = tipocliente;

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

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
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

    public int getCostoalojamiento() {
        return costoalojamiento;
    }

    public void setCostoalojamiento(int costoalojamiento) {
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

    public String getTipocliente() {
        return tipocliente;
    }

    public void setTipocliente(String tipocliente) {
        this.tipocliente = tipocliente;
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
