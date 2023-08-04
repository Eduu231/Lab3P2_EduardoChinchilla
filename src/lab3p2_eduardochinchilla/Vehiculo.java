
package lab3p2_eduardochinchilla;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;


public class Vehiculo {
   private String numeroPlaca;
   private String marca;
   private String modelo;
   private String tipo;
   private Color color;
   private Date date;
   

    public Vehiculo (String numeroPlaca, String marca, String modelo, String tipo, Color color, Date date) {
        this.numeroPlaca = numeroPlaca;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.date = date;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
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

    @Override
    public String toString() {
        return "Vehiculo"+"\n" + "numeroPlaca: " + numeroPlaca + "\n" +"marca: " + marca + "\n" +"modelo: " + modelo + "\n" +"tipo: " + tipo + "\n" +"color:" + color + "\n" +"date: " + date + "\n";
    }
   
   
   
}
