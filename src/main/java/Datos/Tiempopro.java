package Datos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Tiempopro {

    public Calendar fecha = new GregorianCalendar();
    
    public SimpleDateFormat formatoHora = new SimpleDateFormat("hh:mm a", Locale.ENGLISH);
    public SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");

    public String getFechacomp() {
        return formatoFecha.format(fecha.getTime());
    }

    public String getHoracomp() {
        return formatoHora.format(fecha.getTime());
    }


}
