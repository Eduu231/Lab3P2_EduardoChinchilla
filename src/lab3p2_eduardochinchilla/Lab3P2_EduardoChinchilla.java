package lab3p2_eduardochinchilla;

import java.util.*;

public class Lab3P2_EduardoChinchilla {
    
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion = 0;
        
        while (opcion != 8){
            
            opcion = menuCRUD();
            
            switch (opcion){
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    break;
                }
                case 5:{
                    break;
                }
                case 7:{
                    break;
                }
                case 8:{
                    System.out.println("Salio");
                    break;
                }
            }
        }
    
        
        
        
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
}
