
package Logica;
import Presentacion.Jmenuhotel;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Usuario
 */
public class ActualizadorColores implements Runnable {
    
     private final Jmenuhotel ventana;

    public ActualizadorColores(Jmenuhotel ventana) {
        this.ventana = ventana;
    }

    @Override
    public void run() {
        ventana. actualizarColoresBotones();
    }

    public void iniciarHilo() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(this, 0, 5, TimeUnit.SECONDS);
    }
}
