
package Logica;

/**
 *
 * @author Usuario
 */
public class CambioEstadoEvento {
    
    public int idHabitacion;
    public String nuevoEstado;

    public CambioEstadoEvento(int idHabitacion, String nuevoEstado) {
        this.idHabitacion = idHabitacion;
        this.nuevoEstado = nuevoEstado;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public String getNuevoEstado() {
        return nuevoEstado;
    }

}


