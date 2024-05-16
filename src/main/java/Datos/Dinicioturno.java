package Datos;

public class Dinicioturno {

    public int idturno;
    public String fecha_hora_inicio;
    public String turno;

    public Dinicioturno() {
    }

    public Dinicioturno(int idturno, String fecha_hora_inicio, String turno) {
        this.idturno = idturno;
        this.fecha_hora_inicio = fecha_hora_inicio;

        this.turno = turno;
    }

    public int getIdturno() {
        return idturno;
    }

    public void setIdturno(int idturno) {
        this.idturno = idturno;
    }

    public String getFecha_hora_inicio() {
        return fecha_hora_inicio;
    }

    public void setFecha_hora_inicio(String fecha_hora_inicio) {
        this.fecha_hora_inicio = fecha_hora_inicio;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

}
