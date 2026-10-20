
package eva2_18_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_18_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        System.out.println("Introduce el numero del dia (1-7):");
       int dia = captu.nextInt();
       
       switch(dia){
           case 1:
               System.out.println ("Domingo");
               //aqui podemos poner cuantas intrucciones necesitamos
               break;
               case 2:
               System.out.println ("Martes");
               
               break;
               case 3:
               System.out.println ("Miercoles");
              
               break;
               case 4:
               System.out.println ("Jueves");
              
               break;
               case 5:
               System.out.println ("Viernes");
              
               break;
               case 6:
               System.out.println ("Sabado");
              
               break;
               default:
               System.out.println ("Numero no valido");
               
               break;
               
       }
        
    }
    
}
