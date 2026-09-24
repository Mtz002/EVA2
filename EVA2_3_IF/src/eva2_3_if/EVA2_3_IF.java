/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_3_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Precio,subtotal,cantidad,descuento,total;
        
        Scanner captuScanner = new Scanner(System.in);
        System.out.println("Captura el precio del producto:" );
        Precio = captuScanner.nextDouble();
        System.out.println("Captura la cantidad comprada:" );
        cantidad = captuScanner.nextDouble();
        
        subtotal= Precio * cantidad;
        
        if (subtotal>=1000){
            descuento= subtotal * 0.10;
        }
        else {
            descuento= 0;
        }
        total=subtotal - descuento;
        System.out.println("/////RESULTADO//////");
        System.out.println("subtotal:"+ subtotal);
        System.out.println("Descuento del 10%:"+descuento);
        System.out.println("Total a pagar:"+total);
        
        
    }
    
}
