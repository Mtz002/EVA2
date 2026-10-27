/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29.pkg30_menu;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_2930_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner captu = new Scanner (System.in);
        int option;
        
        do{
             System.out.println("-----------MENU DEL SISTEMA-----------");
              System.out.println("1. VENTAS");
               System.out.println("2. COMPRA");
                System.out.println("3. PROVEEDORES");
                 System.out.println("4. CLIENTES");
                  System.out.println("5. SALIR");
                  option= captu.nextInt();
                  captu.nextLine();
                  
        } while (option !=5 );
        System.out.println("Saliendo del sistema");
    }
    
}
