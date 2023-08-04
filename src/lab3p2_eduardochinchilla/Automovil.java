
package lab3p2_eduardochinchilla;

import java.awt.Color;
import java.util.Date;


public class Automovil extends Vehiculo{

    private String tipoCombustible;
    private int numeroPuerta;
    private String tipoTransmision;
    private int numeroAsientos;

    public Automovil(String tipoCombustible, int numeroPuerta, String tipoTransmision, int numeroAsientos, int numeroPlaca, String marca, String modelo, String tipo, Color color, Date date) {
        super(numeroPlaca, marca, modelo, tipo, color, date);
        this.tipoCombustible = tipoCombustible;
        this.numeroPuerta = numeroPuerta;
        this.tipoTransmision = tipoTransmision;
        this.numeroAsientos = numeroAsientos;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public void setNumeroPuerta(int numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    public String toString() {
        return "Automovil{" + "tipoCombustible=" + tipoCombustible + ", numeroPuerta=" + numeroPuerta + ", tipoTransmision=" + tipoTransmision + ", numeroAsientos=" + numeroAsientos + '}';
    }
    
    
    
            
  
    
}
