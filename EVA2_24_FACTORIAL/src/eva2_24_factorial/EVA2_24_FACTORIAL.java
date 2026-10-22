
package eva2_24_factorial;

import java.util.Scanner;

public class EVA2_24_FACTORIAL {


    public static void main(String[] args) {
        // TODO code application logic here
         int num, facto= 1;
      
       Scanner captu = new Scanner (System.in);
       System.out.println("Valor a calcular: ");
       num= captu.nextInt();
       captu.nextLine();
       
        for (int i = num; i >= 1; i++){
            System.out.println();
            //operacion9
            facto = facto + i;
        }
        System.out.println("Factorial de" + num + " - " + facto);
    }
    
}
