package Datos;

import java.sql.Date;

/**
 *
 * @author Alexander Nieves
 */
public class Dingreso {

    public int idingreso;
    public int idhabitacion;
    public int idcliente;
    public Date fecha_hora_ingreso;
    public int num_personas;
    public String tipo_cliente;
    public Double costoalojamiento;
    public String motivo_viaje;
    public String estado;

    public Dingreso() {
    }

    public Dingreso(int idingreso, int idhabitacion, int idcliente, Date fecha_hora_ingreso, int num_personas, String tipo_cliente, Double costoalojamiento, String motivo_viaje, String estado) {
        this.idingreso = idingreso;
        this.idhabitacion = idhabitacion;
        this.idcliente = idcliente;
        this.fecha_hora_ingreso = fecha_hora_ingreso;
        this.num_personas = num_personas;
        this.tipo_cliente = tipo_cliente;
        this.costoalojamiento = costoalojamiento;
        this.motivo_viaje = motivo_viaje;
        this.estado = estado;
        
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

    public Date getFecha_hora_ingreso() {
        return fecha_hora_ingreso;
    }

    public void setFecha_hora_ingreso(Date fecha_hora_ingreso) {
        this.fecha_hora_ingreso = fecha_hora_ingreso;
    }

    public int getNum_personas() {
        return num_personas;
    }

    public void setNum_personas(int num_personas) {
        this.num_personas = num_personas;
    }

    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public Double getCostoalojamiento() {
        return costoalojamiento;
    }

    public void setCostoalojamiento(Double costoalojamiento) {
        this.costoalojamiento = costoalojamiento;
    }

    public String getMotivo_viaje() {
        return motivo_viaje;
    }

    public void setMotivo_viaje(String motivo_viaje) {
        this.motivo_viaje = motivo_viaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

}
