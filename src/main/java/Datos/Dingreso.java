package Datos;


public class Dingreso {

    public int idingreso;
    public int idhabitacion;
    public int idcliente;
    public String fecha_hora_ingreso;
    public int num_personas;
    public String tipo_cliente;
    public int costoalojamiento;
    public String motivo_viaje;
    public String estado;
    public String ciudad_de_recidencia;
    public String ciudad_de_procedencia;
    public int num_habitacion;

    public Dingreso() {
    }

    public Dingreso(int idingreso, int idhabitacion, int idcliente, String fecha_hora_ingreso, int num_personas, String tipo_cliente, int costoalojamiento, String motivo_viaje, String estado, String ciudad_de_recidencia, String ciudad_de_procedencia, int num_habitacion) {
        this.idingreso = idingreso;
        this.idhabitacion = idhabitacion;
        this.idcliente = idcliente;
        this.fecha_hora_ingreso = fecha_hora_ingreso;
        this.num_personas = num_personas;
        this.tipo_cliente = tipo_cliente;
        this.costoalojamiento = costoalojamiento;
        this.motivo_viaje = motivo_viaje;
        this.estado = estado;
        this.ciudad_de_recidencia = ciudad_de_recidencia;
        this.ciudad_de_procedencia = ciudad_de_procedencia;
        this.num_habitacion = num_habitacion;
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

    public String getFecha_hora_ingreso() {
        return fecha_hora_ingreso;
    }

    public void setFecha_hora_ingreso(String fecha_hora_ingreso) {
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

    public int getCostoalojamiento() {
        return costoalojamiento;
    }

    public void setCostoalojamiento(int costoalojamiento) {
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

    public String getCiudad_de_recidencia() {
        return ciudad_de_recidencia;
    }

    public void setCiudad_de_recidencia(String ciudad_de_recidencia) {
        this.ciudad_de_recidencia = ciudad_de_recidencia;
    }

    public String getCiudad_de_procedencia() {
        return ciudad_de_procedencia;
    }

    public void setCiudad_de_procedencia(String ciudad_de_procedencia) {
        this.ciudad_de_procedencia = ciudad_de_procedencia;
    }

    public int getNum_habitacion() {
        return num_habitacion;
    }

    public void setNum_habitacion(int num_habitacion) {
        this.num_habitacion = num_habitacion;
    }

   


    

}
