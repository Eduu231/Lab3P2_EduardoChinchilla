package lab3p2_eduardochinchilla;

import java.util.*;

public class Lab3P2_EduardoChinchilla {
    
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        
    
        
        
        
    }
    
    
    
    private static int menuCRUD() {
        int op = 0;

        System.out.println("""
                           Menu CRUD
                           1- Agregar Producto
                           2- Modificar Producto
                           3- Eliminar Producto
                           4- Simulacion de Facturacion
                           5- Reporte
                           6- Salir
                           """);

        op = read.nextInt();

        return op;
    }
}
