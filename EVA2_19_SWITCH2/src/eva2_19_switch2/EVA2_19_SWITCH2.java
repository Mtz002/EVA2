
package eva2_19_switch2;

import java.util.Scanner;


public class EVA2_19_SWITCH2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner captu = new Scanner (System.in);
          String carrera;
          System.out.println("Introduce la carrera (SISTEMAS, INFORMATICA, ADMINISTRACION):");
          carrera = captu.nextLine();
          
          switch(carrera){
          case "SYSTEMAS":
               System.out.println ("ISC");
               //aqui podemos poner cuantas intrucciones necesitamos
               break;
               case "INFORMATICA":
               System.out.println ("INF");
               
               break;
               case "ADMINISTRACION":
               System.out.println ("LA");
              
               break;
          }
    }
    
}
