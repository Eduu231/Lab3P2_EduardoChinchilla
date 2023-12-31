package lab3p2_eduardochinchilla;

import java.awt.Color;
import java.util.*;
import javax.swing.JColorChooser;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;

public class Lab3P2_EduardoChinchilla {

    static Scanner read = new Scanner(System.in);
    static int contAutos = 0;
    static int contMotos = 0;
    static int contBus = 0;
    static boolean entro = false;
    public static void main(String[] args) throws ParseException {
       
        
        ArrayList<Vehiculo> vehiculo = new ArrayList();

        int opcion = 0;

        while (opcion != 8) {

            opcion = menuCRUD();

            switch (opcion) {
                case 1: {
                    read.nextLine();
                    System.out.println("Agregar el numero de Placa: ");
                    String placa = read.nextLine();
                    
                    while (!placa.startsWith("H") && !placa.startsWith("h")) {
                    
                        System.out.println("Error ");
                        System.out.println("Agregar el numero de Placa: ");
                        placa = read.nextLine();
                    }

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
                    contAutos++;
                    entro = true;
                    break;
                }
                case 2: {
                    read.nextLine();
                    System.out.println("Agregar el numero de Placa: ");
                    String placa = read.nextLine();

                    while (!placa.startsWith("B") && !placa.startsWith("b")) {
                        System.out.println("Error ");
                        System.out.println("Agregar el numero de Placa: ");
                        placa = read.nextLine();
                    }

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
                    contMotos++;
                    entro = true;
                    break;
                }
                case 3: {
                    read.nextLine();
                    System.out.println("Agregar el numero de Placa: ");
                    String placa = read.nextLine();

                    while (!placa.startsWith("H") && !placa.startsWith("h")) {
                        System.out.println("Error ");
                        System.out.println("Agregar el numero de Placa: ");
                        placa = read.nextLine();
                    }

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

                    System.out.println("Ingrese la cantidad de pasajeros: ");
                    int pasajeros = read.nextInt();

                    System.out.println("Ingrese la cantidad de ejes: ");
                    int ejes = read.nextInt();

                    System.out.println("Ingrese la longitud en metros: ");
                    double longitud = read.nextDouble();

                    vehiculo.add(new Autobus(pasajeros, ejes, longitud, placa, marca, modelo, tipoVehiculo, color, date2));
                    contBus++;
                    entro = true;
                    break;
                }
                case 4: {
                    if (entro == true){
                    System.out.println(listarVehiculos(vehiculo));
                    System.out.println("Ingrese 1 para automoviles, 2 para motocicletas , 3 para autobuses y 4 para salir: ");
                    int decision = read.nextInt();

                    while (decision != 4) {
                        decision = menuInterno();
                        switch (decision) {
                            case 1: {
                                System.out.println(listarAutomoviles(vehiculo));
                                System.out.println("Ingrese el indice a modicar:");
                                int pos = read.nextInt();
                                if (pos >= 0 && pos < vehiculo.size()) {

                                    if (vehiculo.get(pos) instanceof Automovil) {
                                        System.out.println("Atributo a modificar");
                                        int atributoM = 0;
                                        while (atributoM != 11) {

                                            atributoM = menuModAuto();

                                            switch (atributoM) {
                                                case 1: {
                                                    read.nextLine();
                                                    System.out.println("Agregar el numero de Placa: ");
                                                    String placa = read.nextLine();

                                                    while (!placa.startsWith("H") && !placa.startsWith("h")) {
                                                        System.out.println("Error ");
                                                        System.out.println("Agregar el numero de Placa: ");
                                                        placa = read.nextLine();
                                                    }
                                                    ((Automovil) vehiculo.get(pos)).setNumeroPlaca(placa);
                                                    break;
                                                }
                                                case 2: {
                                                    read.nextLine();
                                                    System.out.println("Agregar la marca del vehiculo: ");
                                                    String marca = read.nextLine();
                                                    ((Automovil) vehiculo.get(pos)).setMarca(marca);
                                                    break;
                                                }
                                                case 3: {
                                                    read.nextLine();
                                                    System.out.println("Agregar el modelo: ");
                                                    String modelo = read.nextLine();
                                                    ((Automovil) vehiculo.get(pos)).setModelo(modelo);
                                                    break;
                                                }
                                                case 4: {
                                                    read.nextLine();
                                                    System.out.println("Agregar el tipo de vehiculo: [turismo, camioneta, etc...]");
                                                    String tipoVehiculo = read.nextLine();
                                                    ((Automovil) vehiculo.get(pos)).setTipo(tipoVehiculo);
                                                    break;
                                                }
                                                case 5: {
                                                    System.out.println("elegir el color del vehiculo: ");
                                                    Color color = JColorChooser.showDialog(null, "Color", Color.yellow);
                                                    ((Automovil) vehiculo.get(pos)).setColor(color);
                                                    break;
                                                }
                                                case 6: {
                                                    read.nextLine();
                                                    System.out.println("Ingrese el año del vehiculo: ");
                                                    String fecha = read.nextLine();
                                                    DateFormat date = new SimpleDateFormat("yyyy");
                                                    Date date2 = new Date();
                                                    date2 = date.parse(fecha);
                                                    ((Automovil) vehiculo.get(pos)).setDate(date2);
                                                    break;
                                                }
                                                case 7: {
                                                    read.nextLine();
                                                    System.out.println("Agregar tipo de combustible: [diesel,regular o super]");
                                                    String tipoCombustible = read.nextLine().toLowerCase();
                                                    while (!tipoCombustible.equals("diesel") && !tipoCombustible.equals("regular") && !tipoCombustible.equals("super")) {
                                                        System.out.println("tipo de combustible incorrecto");
                                                        read.nextLine();
                                                        System.out.println("Agregar tipo de combustible: [diesel,regular o super]");
                                                        tipoCombustible = read.nextLine().toLowerCase();
                                                    }
                                                    ((Automovil) vehiculo.get(pos)).setTipoCombustible(tipoCombustible);
                                                    break;
                                                }
                                                case 8: {
                                                    System.out.println("Agregar numero de puertas: ");
                                                    int puertas = read.nextInt();
                                                    ((Automovil) vehiculo.get(pos)).setNumeroPuerta(puertas);
                                                    break;
                                                }
                                                case 9: {
                                                    read.nextLine();
                                                    System.out.println("Tipo de transmision: [automatico/manual]");
                                                    String transmision = read.nextLine().toLowerCase();
                                                    while (!transmision.equals("automatico") && !transmision.equals("manual")) {
                                                        System.out.println("Error esa transmision es incorrecta");
                                                        read.nextLine();
                                                        System.out.println("Tipo de transmision: [automatico/manual]");
                                                        transmision = read.nextLine().toLowerCase();

                                                    }
                                                    ((Automovil) vehiculo.get(pos)).setTipoTransmision(transmision);
                                                    break;
                                                }
                                                case 10: {
                                                    System.out.println("Numero de asientos: ");
                                                    int asientos = read.nextInt();
                                                    ((Automovil) vehiculo.get(pos)).setNumeroAsientos(asientos);
                                                    break;
                                                }
                                                case 11: {
                                                    System.out.println("salio");
                                                    break;
                                                }
                                            }

                                        }
                                    }
                                }
                                break;
                            }
                            case 2: {
                                System.out.println(listarMotos(vehiculo));
                                System.out.println("Ingrese el indice a modicar:");
                                int pos = read.nextInt();
                                if (pos >= 0 && pos < vehiculo.size()) {

                                    if (vehiculo.get(pos) instanceof Motocicleta) {
                                        System.out.println("Atributo a modificar");
                                        int atributoM = 0;
                                        while (atributoM != 10) {

                                            atributoM = menuModMoto();

                                            switch (atributoM) {
                                                case 1: {
                                                    read.nextLine();
                                                    System.out.println("Agregar el numero de Placa: ");
                                                    String placa = read.nextLine();

                                                    while (!placa.startsWith("H") && !placa.startsWith("h")) {
                                                        System.out.println("Error ");
                                                        System.out.println("Agregar el numero de Placa: ");
                                                        placa = read.nextLine();
                                                    }
                                                    ((Motocicleta) vehiculo.get(pos)).setNumeroPlaca(placa);
                                                    break;
                                                }
                                                case 2: {
                                                    read.nextLine();
                                                    System.out.println("Agregar la marca del vehiculo: ");
                                                    String marca = read.nextLine();
                                                    ((Motocicleta) vehiculo.get(pos)).setMarca(marca);
                                                    break;
                                                }
                                                case 3: {
                                                    read.nextLine();
                                                    System.out.println("Agregar el modelo: ");
                                                    String modelo = read.nextLine();
                                                    ((Motocicleta) vehiculo.get(pos)).setModelo(modelo);
                                                    break;
                                                }
                                                case 4: {
                                                    read.nextLine();
                                                    System.out.println("Agregar el tipo de vehiculo: [turismo, camioneta, etc...]");
                                                    String tipoVehiculo = read.nextLine();
                                                    ((Motocicleta) vehiculo.get(pos)).setTipo(tipoVehiculo);
                                                    break;
                                                }
                                                case 5: {
                                                    System.out.println("elegir el color del vehiculo: ");
                                                    Color color = JColorChooser.showDialog(null, "Color", Color.yellow);
                                                    ((Motocicleta) vehiculo.get(pos)).setColor(color);
                                                    break;
                                                }
                                                case 6: {
                                                    read.nextLine();
                                                    System.out.println("Ingrese el año del vehiculo: ");
                                                    String fecha = read.nextLine();
                                                    DateFormat date = new SimpleDateFormat("yyyy");
                                                    Date date2 = new Date();
                                                    date2 = date.parse(fecha);
                                                    ((Motocicleta) vehiculo.get(pos)).setDate(date2);
                                                    break;
                                                }
                                                case 7: {
                                                    System.out.println("Velocidad maxima en km/h: ");
                                                    double velocidad = read.nextDouble();
                                                    ((Motocicleta) vehiculo.get(pos)).setVelocidadMaxima(velocidad);
                                                    break;
                                                }
                                                case 8: {
                                                    System.out.println("Ingrese el peso en kg: ");
                                                    double peso = read.nextDouble();
                                                    ((Motocicleta) vehiculo.get(pos)).setPeso(peso);

                                                    break;
                                                }
                                                case 9: {
                                                    System.out.println("Ingrese el consumo de combustible en L/km: ");
                                                    double consumo = read.nextDouble();
                                                    ((Motocicleta) vehiculo.get(pos)).setConsumoCombustible(consumo);
                                                    break;
                                                }
                                                case 10: {
                                                    System.out.println("Salir");
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            case 3: {
                                System.out.println(listarAutobus(vehiculo));
                                System.out.println("Ingrese el indice a modicar:");
                                int pos = read.nextInt();
                                if (pos >= 0 && pos < vehiculo.size()) {

                                    if (vehiculo.get(pos) instanceof Autobus) {
                                        System.out.println("Atributo a modificar");
                                        int atributoM = 0;
                                        while (atributoM != 10) {

                                            atributoM = menuModBus();

                                            switch (atributoM) {
                                                case 1: {
                                                    read.nextLine();
                                                    System.out.println("Agregar el numero de Placa: ");
                                                    String placa = read.nextLine();

                                                    while (!placa.startsWith("H") && !placa.startsWith("h")) {
                                                        System.out.println("Error ");
                                                        System.out.println("Agregar el numero de Placa: ");
                                                        placa = read.nextLine();
                                                    }
                                                    ((Autobus) vehiculo.get(pos)).setNumeroPlaca(placa);
                                                    break;
                                                }
                                                case 2: {
                                                    read.nextLine();
                                                    System.out.println("Agregar la marca del vehiculo: ");
                                                    String marca = read.nextLine();
                                                    ((Autobus) vehiculo.get(pos)).setMarca(marca);
                                                    break;
                                                }
                                                case 3: {
                                                    read.nextLine();
                                                    System.out.println("Agregar el modelo: ");
                                                    String modelo = read.nextLine();
                                                    ((Autobus) vehiculo.get(pos)).setModelo(modelo);
                                                    break;
                                                }
                                                case 4: {
                                                    read.nextLine();
                                                    System.out.println("Agregar el tipo de vehiculo: [turismo, camioneta, etc...]");
                                                    String tipoVehiculo = read.nextLine();
                                                    ((Autobus) vehiculo.get(pos)).setTipo(tipoVehiculo);
                                                    break;
                                                }
                                                case 5: {
                                                    System.out.println("elegir el color del vehiculo: ");
                                                    Color color = JColorChooser.showDialog(null, "Color", Color.yellow);
                                                    ((Autobus) vehiculo.get(pos)).setColor(color);
                                                    break;
                                                }
                                                case 6: {
                                                    read.nextLine();
                                                    System.out.println("Ingrese el año del vehiculo: ");
                                                    String fecha = read.nextLine();
                                                    DateFormat date = new SimpleDateFormat("yyyy");
                                                    Date date2 = new Date();
                                                    date2 = date.parse(fecha);
                                                    ((Autobus) vehiculo.get(pos)).setDate(date2);
                                                    break;
                                                }
                                                case 7: {
                                                    System.out.println("Ingrese la cantidad de pasajeros: ");
                                                    int pasajeros = read.nextInt();
                                                    ((Autobus) vehiculo.get(pos)).setCantidadPasajeros(pasajeros);
                                                    break;
                                                }
                                                case 8: {
                                                    System.out.println("Ingrese la cantidad de ejes: ");
                                                    int ejes = read.nextInt();
                                                    ((Autobus) vehiculo.get(pos)).setCantidadEjes(ejes);
                                                    break;
                                                }
                                                case 9: {
                                                    System.out.println("Ingrese la longitud en metros: ");
                                                    double longitud = read.nextDouble();
                                                    ((Autobus) vehiculo.get(pos)).setLongitud(longitud);
                                                    break;
                                                }
                                                case 10: {
                                                    System.out.println("Salir");
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("Salir");
                                break;
                            }
                        }
                    }
                    }else{
                        System.out.println("Debe ingresar primero antes de modificar");
                    }
                    break;
                }
                case 5: {
                    if (entro == true){
                    System.out.println(listarVehiculos(vehiculo));

                    System.out.println("Ingrese el indice del vehiculo a eliminar: ");
                    int pos = read.nextInt();

                    if (pos >= 0 && pos < vehiculo.size()) {

                       if ( vehiculo.remove(pos) instanceof Automovil){
                           contAutos--;
                       }else if ( vehiculo.remove(pos) instanceof Motocicleta){
                           contMotos--;
                       }else if ( vehiculo.remove(pos) instanceof Autobus){
                           contBus--;
                       }
                        JOptionPane.showMessageDialog(null, "Se ha eliminado exitosamente");
                    } else {
                        System.out.println("El indice ingresado esta fuera de rango");

                    }
                    }else{
                        System.out.println("Debe agregar vehiculos antes de eliminar");
                    }
                    break;
                }
                case 6: {
                    if (entro == true){
                    System.out.println("Lista de vehiculos");
                    System.out.println(listarVehiculos(vehiculo));

                    System.out.println("Lista de Automoviles");
                    System.out.println(listarAutomoviles(vehiculo));
                    System.out.println("Hay un total de: " + contAutos + " automoviles");
                    
                    System.out.println("Lista de Motocicletas");
                    System.out.println(listarMotos(vehiculo));
                    System.out.println("Hay un total de: " + contMotos + " motos");
                    
                    System.out.println("Listar Autobuses");
                    System.out.println(listarAutobus(vehiculo));
                    System.out.println("Hay un total de: " + contBus + " buses");
                    }else{
                        System.out.println("Debe agregar vehiculos antes de listar");
                    }
                    break;
                }
                case 7: {
                    if (entro == true){
                    double totalPagar =0;
                    double TasaVehicular =525;
                    
                    System.out.println(listarVehiculos(vehiculo));
                    System.out.println("Ingrese el indice del vehiculo a generar la boleta:  ");
                    int pos = read.nextInt();

                    if (pos >= 0 && pos < vehiculo.size()) {

                        
                        JOptionPane.showMessageDialog(null, "Boleta de Revision Vehicular");
                        System.out.println(vehiculo.get(pos));
                        if ( vehiculo.get(pos) instanceof Automovil){
                            totalPagar = TasaVehicular + 1200;
                        }else  if (vehiculo.get(pos) instanceof Motocicleta) {
                            totalPagar = TasaVehicular + 200;
                        }else  if (vehiculo.get(pos) instanceof Autobus) {
                            totalPagar = TasaVehicular + 1000;  
                        }
                    } else {
                        System.out.println("El indice ingresado esta fuera de rango");

                    }
                    System.out.println("Su total a pagar es: " + totalPagar);
                    }else{
                        System.out.println("Debe agregar un vehiculo antes de pagar la boleta");
                    }
                    break;
                }
                case 8: {
                    System.out.println("Salio");
                    break;
                }
            }
        }

    }// fin main

    private static int menuModAuto() {
        int op = 0;

        System.out.println("""
                     1- Numero de placa
                     2- marca
                     3- modelo
                     4- tipo
                     5- color
                     6- date
                     7- tipo de combustible
                     8- numero de puertas
                     9- tipo transmision
                     10 - numero asiento
                     11 - Salir
                     """);

        op = read.nextInt();

        return op;
    }

    private static int menuModMoto() {
        int op = 0;

        System.out.println("""
                     1- Numero de placa
                     2- marca
                     3- modelo
                     4- tipo
                     5- color
                     6- date
                     7- velocidad maxima
                     8- peso
                     9- consumo de combustible
                     10 - Salir
                     """);

        op = read.nextInt();

        return op;
    }

    private static int menuModBus() {
        int op = 0;

        System.out.println("""
                     1- Numero de placa
                     2- marca
                     3- modelo
                     4- tipo
                     5- color
                     6- date
                     7- catidad Pasajeros
                     8- cantidad ejes
                     9- longitud
                     10 - Salir
                     """);

        op = read.nextInt();

        return op;
    }

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

    private static int menuInterno() {
        int op = 0;

        System.out.println("""
                           Menu Interno
                           1- Listar automovil
                           2- Listar Motocicleta
                           3- Listar Autobus
                           4- Salir
                           """);

        op = read.nextInt();

        return op;
    }

    private static String listarVehiculos(ArrayList vehiculos) {
        String salida = "";
        for (Object x : vehiculos) {
            if (x instanceof Vehiculo) {
                salida += vehiculos.indexOf(x) + "-" + x + "\n";
            }
        }
        return salida;
    }

    private static String listarAutomoviles(ArrayList vehiculos) {
        String salida = "";
        for (Object x : vehiculos) {
            if (x instanceof Automovil) {
                salida += vehiculos.indexOf(x) + "-" + x + "\n";
            }
        }
        return salida;
    }

    private static String listarMotos(ArrayList vehiculos) {
        String salida = "";
        for (Object x : vehiculos) {
            if (x instanceof Motocicleta) {
                salida += vehiculos.indexOf(x) + "-" + x + "\n";
            }
        }
        return salida;
    }

    private static String listarAutobus(ArrayList vehiculos) {
        String salida = "";
        for (Object x : vehiculos) {
            if (x instanceof Autobus) {
                salida += vehiculos.indexOf(x) + "-" + x + "\n";
            }
        }
        return salida;
    }
}
