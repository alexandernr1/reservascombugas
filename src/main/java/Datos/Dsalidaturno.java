
package Datos;

public class Dsalidaturno {
    
public int idturno;
public int idabonos;
public int idempleado;
public int idhabitacion;
public String empleado;
public String turno;
public String fecha_hora_inicio;
public String fecha_hora_salida;
public int habitaciones_ocupadas;
public int total_recibos;
public int base;
public int tarjetas;
public int efectivo;
public int transfrencias;
public int totalhabitaciones;
public int total_abonos;
public int otros_ingresos;
public int total_recaudo;
public int entrega_admon;
public int total_efectivo;
public String observaciones;

    public Dsalidaturno() {
    }

    public Dsalidaturno(int idturno, int idabonos, int idempleado, int idhabitacion, String empleado, String turno, String fecha_hora_inicio, String fecha_hora_salida, int habitaciones_ocupadas, int total_recibos, int base, int tarjetas, int efectivo, int transfrencias, int totalhabitaciones, int total_abonos, int otros_ingresos, int total_recaudo, int entrega_admon, int total_efectivo, String observaciones) {
        this.idturno = idturno;
        this.idabonos = idabonos;
        this.idempleado = idempleado;
        this.idhabitacion = idhabitacion;
        this.empleado = empleado;
        this.turno = turno;
        this.fecha_hora_inicio = fecha_hora_inicio;
        this.fecha_hora_salida = fecha_hora_salida;
        this.habitaciones_ocupadas = habitaciones_ocupadas;
        this.total_recibos = total_recibos;
        this.base = base;
        this.tarjetas = tarjetas;
        this.efectivo = efectivo;
        this.transfrencias = transfrencias;
        this.totalhabitaciones = totalhabitaciones;
        this.total_abonos = total_abonos;
        this.otros_ingresos = otros_ingresos;
        this.total_recaudo = total_recaudo;
        this.entrega_admon = entrega_admon;
        this.total_efectivo = total_efectivo;
        this.observaciones = observaciones;
    }

    public int getIdturno() {
        return idturno;
    }

    public void setIdturno(int idturno) {
        this.idturno = idturno;
    }

    public int getIdabonos() {
        return idabonos;
    }

    public void setIdabonos(int idabonos) {
        this.idabonos = idabonos;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public int getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getFecha_hora_inicio() {
        return fecha_hora_inicio;
    }

    public void setFecha_hora_inicio(String fecha_hora_inicio) {
        this.fecha_hora_inicio = fecha_hora_inicio;
    }

    public String getFecha_hora_salida() {
        return fecha_hora_salida;
    }

    public void setFecha_hora_salida(String fecha_hora_salida) {
        this.fecha_hora_salida = fecha_hora_salida;
    }

    public int getHabitaciones_ocupadas() {
        return habitaciones_ocupadas;
    }

    public void setHabitaciones_ocupadas(int habitaciones_ocupadas) {
        this.habitaciones_ocupadas = habitaciones_ocupadas;
    }

    public int getTotal_recibos() {
        return total_recibos;
    }

    public void setTotal_recibos(int total_recibos) {
        this.total_recibos = total_recibos;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(int tarjetas) {
        this.tarjetas = tarjetas;
    }

    public int getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(int efectivo) {
        this.efectivo = efectivo;
    }

    public int getTransfrencias() {
        return transfrencias;
    }

    public void setTransfrencias(int transfrencias) {
        this.transfrencias = transfrencias;
    }

    public int getTotalhabitaciones() {
        return totalhabitaciones;
    }

    public void setTotalhabitaciones(int totalhabitaciones) {
        this.totalhabitaciones = totalhabitaciones;
    }

    public int getTotal_abonos() {
        return total_abonos;
    }

    public void setTotal_abonos(int total_abonos) {
        this.total_abonos = total_abonos;
    }

    public int getOtros_ingresos() {
        return otros_ingresos;
    }

    public void setOtros_ingresos(int otros_ingresos) {
        this.otros_ingresos = otros_ingresos;
    }

    public int getTotal_recaudo() {
        return total_recaudo;
    }

    public void setTotal_recaudo(int total_recaudo) {
        this.total_recaudo = total_recaudo;
    }

    public int getEntrega_admon() {
        return entrega_admon;
    }

    public void setEntrega_admon(int entrega_admon) {
        this.entrega_admon = entrega_admon;
    }

    public int getTotal_efectivo() {
        return total_efectivo;
    }

    public void setTotal_efectivo(int total_efectivo) {
        this.total_efectivo = total_efectivo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }


}
