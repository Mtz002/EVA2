
package eva2_23_capturar;

import java.util.Scanner;


public class EVA2_23_CAPTURAR {

    public static void main(String[] args) {
        // TODO code application logic here
        
       //SOLICITAR LASCALIFICAIONES Y PROMEDIO
       int cant, califa=0;
       double promedio;
       Scanner captu = new Scanner (System.in);
       System.out.println("Cuantas calificaciones vas a captu?: ");
       cant= captu.nextInt();
       captu.nextLine();
       
       for (int i = 0; i <= cant; i++ ){//for (int i=1)
          System.out.println("Captura la calificaciones: ");
          califa= califa + captu.nextInt();//CADA VEZ Q CAPTURAS SE VA ACOMULANDO(SUMANDO) LA CALIFA 
          captu.nextLine();
       
       }
       System.out.println("acumulado - "+ califa);
       promedio = califa / (cant * 1.0);
       System.out.println("Promedio - "+ promedio);
       
    }
    
}
