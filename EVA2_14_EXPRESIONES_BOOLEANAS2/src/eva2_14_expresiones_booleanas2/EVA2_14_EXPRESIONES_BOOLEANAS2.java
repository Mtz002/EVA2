
package eva2_14_expresiones_booleanas2;

import java.util.Scanner;

public class EVA2_14_EXPRESIONES_BOOLEANAS2 {

  
    public static void main(String[] args) {
        //BECA
        //promedio >= 95
        // esta en equipo representativo
        int promedio;
        String equipo;
        
       Scanner captu = new Scanner(System.in);
       System.out.println("Cual es tu promedio:");
       promedio= captu.nextInt();
       System.out.println("Perteneces a un Equipo representativo (S/N?):");
       equipo= captu.nextLine();
       equipo= captu.nextLine();
       
       //Condiciones para dar beca
       if (promedio >=95 || equipo.equals("S")){
           System.out.println("BECA CONCEDIDA11");
       }else{
           System.out.println("BECA DENEGADA!!");
       }
       
        
    }
    
}
