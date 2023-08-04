package lab3p2_eduardochinchilla;

import java.awt.Color;
import java.util.*;
import javax.swing.JColorChooser;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;

public class Lab3P2_EduardoChinchilla {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

        ArrayList<Vehiculo> vehiculo = new ArrayList();

        int opcion = 0;

        while (opcion != 8) {

            opcion = menuCRUD();

            switch (opcion) {
                case 1: {

                    System.out.println("Agregar el numero de Placa: ");
                    String placa = read.nextLine();

                    while (!placa.startsWith("H") && !placa.startsWith("h")) {
                        System.out.println("Error ");
                        System.out.println("Agregar el numero de Placa: ");
                        placa = read.nextLine();
                    }
                    read.nextLine();
                    System.out.println("Agregar la marca del vehiculo: ");
                    String marca = read.nextLine();

                    System.out.println("Agregar el modelo: ");
                    String modelo = read.nextLine();

                    System.out.println("Agregar el tipo de vehiculo: [turismo, camioneta, etc...]");
                    String tipoVehiculo = read.nextLine();

                    System.out.println("elegir el color del vehiculo: ");
                    Color color = JColorChooser.showDialog(null, "Color", Color.yellow);

                    System.out.println("Ingrese el año del vehiculo: ");
                    String fecha = read.nextLine();
                    DateFormat date = new SimpleDateFormat("yyyy");
                    Date date2 = new Date();
                    date2 = date.parse(fecha);

                    System.out.println("Agregar tipo de combustible: [diesel,regular o super]");
                    String tipoCombustible = read.nextLine().toLowerCase();
                    while (!tipoCombustible.equals("diesel") && !tipoCombustible.equals("regular") && !tipoCombustible.equals("super")) {
                        System.out.println("tipo de combustible incorrecto");
                        read.nextLine();
                        System.out.println("Agregar tipo de combustible: [diesel,regular o super]");
                        tipoCombustible = read.nextLine().toLowerCase();
                    }
                    System.out.println("Agregar numero de puertas: ");
                    int puertas = read.nextInt();
                    read.nextLine();
                    System.out.println("Tipo de transmision: [automatico/manual]");
                    String transmision = read.nextLine().toLowerCase();
                    while (!transmision.equals("automatico") && !transmision.equals("manual")) {
                        System.out.println("Error esa transmision es incorrecta");
                        read.nextLine();
                        System.out.println("Tipo de transmision: [automatico/manual]");
                        transmision = read.nextLine().toLowerCase();

                    }
                    System.out.println("Numero de asientos: ");
                    int asientos = read.nextInt();

                    vehiculo.add(new Automovil(tipoCombustible, puertas, transmision, asientos, placa, marca, modelo, tipoVehiculo, color, date2));
                    break;
                }
                case 2: {
                    System.out.println("Agregar el numero de Placa: ");
                    String placa = read.nextLine();

                    while (!placa.startsWith("H") && !placa.startsWith("h")) {
                        System.out.println("Error ");
                        System.out.println("Agregar el numero de Placa: ");
                        placa = read.nextLine();
                    }
                    read.nextLine();
                    System.out.println("Agregar la marca del vehiculo: ");
                    String marca = read.nextLine();

                    System.out.println("Agregar el modelo: ");
                    String modelo = read.nextLine();

                    System.out.println("Agregar el tipo de vehiculo: [turismo, camioneta, etc...]");
                    String tipoVehiculo = read.nextLine();

                    System.out.println("elegir el color del vehiculo: ");
                    Color color = JColorChooser.showDialog(null, "Color", Color.yellow);

                    System.out.println("Ingrese el año del vehiculo: ");
                    String fecha = read.nextLine();
                    DateFormat date = new SimpleDateFormat("yyyy");
                    Date date2 = new Date();
                    date2 = date.parse(fecha);
                    //vehiculo

                    System.out.println("Velocidad maxima en km/h: ");
                    double velocidad = read.nextDouble();

                    System.out.println("Ingrese el peso en kg: ");
                    double peso = read.nextDouble();

                    System.out.println("Ingrese el consumo de combustible en L/km: ");
                    double consumo = read.nextDouble();

                    vehiculo.add(new Motocicleta(velocidad, peso, consumo, placa, marca, modelo, tipoVehiculo, color, date2));
                    break;
                }
                case 3: {
                    System.out.println("Agregar el numero de Placa: ");
                    String placa = read.nextLine();

                    while (!placa.startsWith("H") && !placa.startsWith("h")) {
                        System.out.println("Error ");
                        System.out.println("Agregar el numero de Placa: ");
                        placa = read.nextLine();
                    }
                    read.nextLine();
                    System.out.println("Agregar la marca del vehiculo: ");
                    String marca = read.nextLine();

                    System.out.println("Agregar el modelo: ");
                    String modelo = read.nextLine();

                    System.out.println("Agregar el tipo de vehiculo: [turismo, camioneta, etc...]");
                    String tipoVehiculo = read.nextLine();

                    System.out.println("elegir el color del vehiculo: ");
                    Color color = JColorChooser.showDialog(null, "Color", Color.yellow);

                    System.out.println("Ingrese el año del vehiculo: ");
                    String fecha = read.nextLine();
                    DateFormat date = new SimpleDateFormat("yyyy");
                    Date date2 = new Date();
                    date2 = date.parse(fecha);
                    //vehiculo

                    System.out.println("Ingrese la cantidad de pasajeros: ");
                    int pasajeros = read.nextInt();

                    System.out.println("Ingrese la cantidad de ejes: ");
                    int ejes = read.nextInt();

                    System.out.println("Ingrese la longitud en metros: ");
                    double longitud = read.nextDouble();

                    vehiculo.add(new Autobus(pasajeros, ejes, longitud, placa, marca, modelo, tipoVehiculo, color, date2));
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                case 7: {
                    break;
                }
                case 8: {
                    System.out.println("Salio");
                    break;
                }
            }
        }

    }// fin main

    private static int menuCRUD() {
        int op = 0;

        System.out.println("""
                           Menu CRUD
                           1- Agregar Automovil
                           2- Agregar Motocicleta
                           3- Agregar Autobus
                           4- Modificar vehiculo
                           5- Eliminar vehiculo
                           6- Mostar Vehiculo
                           7- Generar Boleta
                           8- Salir
                           """);

        op = read.nextInt();

        return op;
    }
}
