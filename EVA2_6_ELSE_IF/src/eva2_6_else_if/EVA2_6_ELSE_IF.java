/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_else_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_6_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double temp;
       Scanner captu = new Scanner(System.in);
        System.out.println("Captura la temperatura: ");
        temp = captu.nextDouble();
        
        if (temp>=35){
        System.out.println("Clima calido");
        }
        else if (temp >= 20){
            System.out.println("Clima agradable");
        } 
        else  if (temp>= 10)   {
         System.out.println("Clima frio");
        }
         else{
         System.out.println("Hace muchisimo frio");
                }
    }
    
}
