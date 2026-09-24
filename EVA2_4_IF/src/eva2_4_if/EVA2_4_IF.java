/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_4_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Nombre;
          double Salario,bono, salariofinal;
        
        Scanner captuScanner = new Scanner(System.in);
        System.out.println("Captura el Nombre:" );
        Nombre = captuScanner.nextLine();
        System.out.println("Captura el salario:" );
        Salario = captuScanner.nextDouble();
        
        subtotal= Precio * cantidad;
        
        if (subtotal<=12000){
            bono= Salario * 0.10;
        }
        else {
            bono= Salario * 0.10;
        }
        total=subtotal - descuento;
        System.out.println("/////RESULTADO//////");
        System.out.println("Nombre:"+ Nombre);
        System.out.println(":"+descuento);
        System.out.println("Total a pagar:"+total);
        
        
        
        
    }
    
}
