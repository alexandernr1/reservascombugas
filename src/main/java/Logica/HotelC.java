

package Logica;


import Presentacion.LoguinDeSistema;


public class HotelC {

    public static void main(String[] args) {
        LoguinDeSistema prin = new LoguinDeSistema();
    prin.setVisible(true);
        Cconexion objetoConexion = new Cconexion();
        objetoConexion.establecerConexion();
        
       
    }
    
}
