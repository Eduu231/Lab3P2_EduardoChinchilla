
package lab3p2_eduardochinchilla;

import java.awt.Color;
import java.util.Date;


public class Autobus extends Vehiculo{
    
    private int cantidadPasajeros;
    private int cantidadEjes;
    private double longitud;

    public Autobus(int cantidadPasajeros, int cantidadEjes, double longitud, String numeroPlaca, String marca, String modelo, String tipo, Color color, Date date) {
        super(numeroPlaca, marca, modelo, tipo, color, date);
        this.cantidadPasajeros = cantidadPasajeros;
        this.cantidadEjes = cantidadEjes;
        this.longitud = longitud;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +"Autobus " + "cantidadPasajeros: " + cantidadPasajeros + "\n" +"cantidadEjes: " + cantidadEjes + "\n" +"longitud: " + longitud +"\n";
    }
    
    
    
    
}
