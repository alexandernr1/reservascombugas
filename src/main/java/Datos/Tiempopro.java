package Datos;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tiempopro {

    Calendar fecha = new GregorianCalendar();
    String dia = Integer.toString(fecha.get(Calendar.DATE));
    String mes = Integer.toString(fecha.get(Calendar.MONTH)+1);
    String anho = Integer.toString(fecha.get(Calendar.YEAR));

    public String fechacomp = dia + "-" + mes + "-" + anho;

    String hora;
    String amPm;

    public String horacomp;

    public Tiempopro() {
        int hour = fecha.get(Calendar.HOUR);
        int minute = fecha.get(Calendar.MINUTE);
        int amPmValue = fecha.get(Calendar.AM_PM);

        hora = Integer.toString(hour);
        amPm = (amPmValue == Calendar.AM) ? "AM" : "PM";

        if (hour == 0) {
            hora = "12";
        }

        if (hour < 10) {
            hora = "0" + hora;
        }

        String minutos = Integer.toString(minute);
        if (minute < 10) {
            minutos = "0" + minutos;
        }

        horacomp = hora + ":" + minutos + " " + amPm;
    }

    public String getHoracomp() {
        return horacomp;
    }

    public String getFechacomp() {
        return fechacomp;
    }
}
