/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_p4;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class EVA2_24_P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        int base = scanner.nextInt();

        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }

        System.out.println("Resultado: " + base + " elevado a la " + exponente + " = " + resultado);
    }
    
}
