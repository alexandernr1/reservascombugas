package Datos;

import java.sql.Date;

public class Dabono {

    public int idabono;
    public int idingreso;
    public int idhabitacion;
    public int idcliente;
    public Date fechaabono;
    public int abonohabitacion;
    public String descuentos;
    public String conceptodescuento;
    public String formaAbono;
    public int totalAbonos;
    public String privilegiosAdmon;
    public String privilegiosrecepcion;
    public int otroscobros;
    public int numero_turno;

    public Dabono() {
    }

    public Dabono(int idabono, int idingreso, int idhabitacion, int idcliente, Date fechaabono, int abonohabitacion, String descuentos, String conceptodescuento, String formaAbono, int totalAbonos, String privilegiosAdmon, String privilegiosrecepcion, int otroscobros, int numero_turno) {
        this.idabono = idabono;
        this.idingreso = idingreso;
        this.idhabitacion = idhabitacion;
        this.idcliente = idcliente;
        this.fechaabono = fechaabono;
        this.abonohabitacion = abonohabitacion;
        this.descuentos = descuentos;
        this.conceptodescuento = conceptodescuento;
        this.formaAbono = formaAbono;
        this.totalAbonos = totalAbonos;
        this.privilegiosAdmon = privilegiosAdmon;
        this.privilegiosrecepcion = privilegiosrecepcion;
        this.otroscobros = otroscobros;
        this.numero_turno = numero_turno;
    }

    public int getIdabono() {
        return idabono;
    }

    public void setIdabono(int idabono) {
        this.idabono = idabono;
    }

    public int getIdingreso() {
        return idingreso;
    }

    public void setIdingreso(int idingreso) {
        this.idingreso = idingreso;
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

    public Date getFechaabono() {
        return fechaabono;
    }

    public void setFechaabono(Date fechaabono) {
        this.fechaabono = fechaabono;
    }

    public int getAbonohabitacion() {
        return abonohabitacion;
    }

    public void setAbonohabitacion(int abonohabitacion) {
        this.abonohabitacion = abonohabitacion;
    }

    public String getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(String descuentos) {
        this.descuentos = descuentos;
    }

    public String getConceptodescuento() {
        return conceptodescuento;
    }

    public void setConceptodescuento(String conceptodescuento) {
        this.conceptodescuento = conceptodescuento;
    }

    public String getFormaAbono() {
        return formaAbono;
    }

    public void setFormaAbono(String formaAbono) {
        this.formaAbono = formaAbono;
    }

    public int getTotalAbonos() {
        return totalAbonos;
    }

    public void setTotalAbonos(int totalAbonos) {
        this.totalAbonos = totalAbonos;
    }

    public String getPrivilegiosAdmon() {
        return privilegiosAdmon;
    }

    public void setPrivilegiosAdmon(String privilegiosAdmon) {
        this.privilegiosAdmon = privilegiosAdmon;
    }

    public String getPrivilegiosrecepcion() {
        return privilegiosrecepcion;
    }

    public void setPrivilegiosrecepcion(String privilegiosrecepcion) {
        this.privilegiosrecepcion = privilegiosrecepcion;
    }

    public int getOtroscobros() {
        return otroscobros;
    }

    public void setOtroscobros(int otroscobros) {
        this.otroscobros = otroscobros;
    }

    public int getNumero_turno() {
        return numero_turno;
    }

    public void setNumero_turno(int numero_turno) {
        this.numero_turno = numero_turno;
    }

}
