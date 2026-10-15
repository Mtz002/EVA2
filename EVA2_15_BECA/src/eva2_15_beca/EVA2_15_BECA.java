
package eva2_15_beca;

import java.util.Scanner;


public class EVA2_15_BECA {

  //promedio > 80
  //ingresos < 10000
    public static void main(String[] args) {
        int promedio,ingresos;
        
        
        
       Scanner captu = new Scanner(System.in);
       System.out.println("Cual es tu promedio:");
       promedio= captu.nextInt();
       System.out.println("Cuales son tus ingresos:");
       ingresos= captu.nextInt();
       ingresos= captu.nextInt();
       
       //Condiciones para dar beca
       if (promedio > 80 && ingresos <10000 ){
           System.out.println("BECA CONCEDIDA11");
       }else{
           System.out.println("BECA DENEGADA!!");
       }
    }
    
}
