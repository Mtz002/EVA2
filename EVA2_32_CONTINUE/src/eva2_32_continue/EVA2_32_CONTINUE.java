/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_continue;

/**
 *
 * @author Usuario
 */
public class EVA2_32_CONTINUE { // INTERRUMPE LA ITERACION ACTUAL
    //EL BREAKE DETIENE EL CICLO COMPLETO 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 0; i <= 20; i++){
            int residuo = i % 2;
            if (residuo == 0) //EL NUMERO ES PAR
            System.out.print(i + " - ");
            continue;// INTERRUMPE LA ITERACION ACTUAL
            
        }
        System.out.println("SI ELNUMERO ES PAR, ESTO NO SE IMPRIME");
    }
    
}
