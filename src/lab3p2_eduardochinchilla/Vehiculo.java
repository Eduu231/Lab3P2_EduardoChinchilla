
package lab3p2_eduardochinchilla;

import java.awt.Color;
import java.util.Date;


public class Vehiculo {
   private int numeroPlaca;
   private String marca;
   private String modelo;
   private String tipo;
   private Color color;
   private Date date;

    public Vehiculo(int numeroPlaca, String marca, String modelo, String tipo, Color color, Date date) {
        this.numeroPlaca = numeroPlaca;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.date = date;
    }

    public int getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(int numeroPlaca) {
        //hay que validar 
        this.numeroPlaca = numeroPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
   
   
   
}
