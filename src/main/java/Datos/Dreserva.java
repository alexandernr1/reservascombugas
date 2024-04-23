package Datos;

import java.sql.Date;

public class Dreserva {

    public int idreserva;
    public int idhabitacion;
    public int idcliente;
    public int idempleado;
    public String tiporeserva;
    public Date fechareserva;
    public Date fechaingreso;
    public Date fechasalida;
    public Double costoalojamiento;
    public int numnoches;
    public int numpersonas;
    public String estado;

    public Dreserva() {
    }

    public Dreserva(int idreserva, int idhabitacion, int idcliente, int idempleado, String tiporeserva, Date fechareserva, Date fechaingreso, Date fechasalida, Double costoalojamiento, int numnoches, int numpersonas, String estado) {
        this.idreserva = idreserva;
        this.idhabitacion = idhabitacion;
        this.idcliente = idcliente;
        this.idempleado = idempleado;
        this.tiporeserva = tiporeserva;
        this.fechareserva = fechareserva;
        this.fechaingreso = fechaingreso;
        this.fechasalida = fechasalida;
        this.costoalojamiento = costoalojamiento;
        this.numnoches = numnoches;
        this.numpersonas = numpersonas;
        this.estado = estado;
    }

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public int getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getTiporeserva() {
        return tiporeserva;
    }

    public void setTiporeserva(String tiporeserva) {
        this.tiporeserva = tiporeserva;
    }

    public Date getFechareserva() {
        return fechareserva;
    }

    public void setFechareserva(Date fechareserva) {
        this.fechareserva = fechareserva;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public Date getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(Date fechasalida) {
        this.fechasalida = fechasalida;
    }

    public Double getCostoalojamiento() {
        return costoalojamiento;
    }

    public void setCostoalojamiento(Double costoalojamiento) {
        this.costoalojamiento = costoalojamiento;
    }

    public int getNumnoches() {
        return numnoches;
    }

    public void setNumnoches(int numnoches) {
        this.numnoches = numnoches;
    }

    public int getNumpersonas() {
        return numpersonas;
    }

    public void setNumpersonas(int numpersonas) {
        this.numpersonas = numpersonas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
