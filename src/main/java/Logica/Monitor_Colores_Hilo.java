package Logica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class Monitor_Colores_Hilo extends Thread {


    public boolean running = true;
    public final Fhabitacion fcn;
    public final JPanel pnlBotones;

    private List<CambioEstadoListener> listeners = new ArrayList<>();

    public Monitor_Colores_Hilo(Fhabitacion fcn, JPanel pnlBotones) {
        this.fcn = fcn;
        this.pnlBotones = pnlBotones;
    }

    public void detener() {
        running = false;
    }

    public void agregarCambioEstadoListener(CambioEstadoListener listener) {
        listeners.add(listener);
    }

    public void notificarCambioEstado(CambioEstadoEvento evento) {
        for (CambioEstadoListener listener : listeners) {
            listener.cambioEstadoOcurrido(evento);
        }
    }

    // Resto del código...

   
}
