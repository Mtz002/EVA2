/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_do.while2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_28_dOWHILE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        int monto,cuenta =5000;
        
        do{//EJECUTAR AL MENOS UNA VEZ
             System.out.println("Usuario: ");
             monto = captu.nextInt();
                //acumulador
                cuenta=cuenta -monto;
                
        }while (cuenta > 0);
        System.out.println("se le acabo el dinero");
    }
    
}
