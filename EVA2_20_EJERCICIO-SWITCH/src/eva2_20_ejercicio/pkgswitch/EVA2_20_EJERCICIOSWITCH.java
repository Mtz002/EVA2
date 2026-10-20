/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_ejercicio.pkgswitch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_20_EJERCICIOSWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CALCULADORA
        //PERDIR DOS VALORES ENTEROS
        //PEDIR LAOPERACION :USAR SWITCH
        //1SUMA
        //2RESTA
        //3 MULTIPLICACION
        //4 DIVISION
        double num1,num2,resu;
         Scanner captu = new Scanner (System.in);
        System.out.println("Introduce un numero:");
        num1 = captu.nextDouble();
        System.out.println("Introduce otro):");
        num2 = captu.nextDouble();
        System.out.println("Introduce la operacion q desees realizar (1 SUMA,2 Resta,3 Multiplicacion,4 Division)");
        int oper = captu.nextInt();
        
       
       switch(oper){
           case 1:
               resu= num1 + num2;
               System.out.println ("Sum= "+ resu);
               
               break;
               case 2:
               resu= num1 - num2;
               System.out.println ("Res= "+ resu);
               
               break;
               case 3:
              resu= num1 * num2;
               System.out.println ("Mul= "+ resu);
              
               break;
               case 4:
              resu= num1 / num2;
               System.out.println ("Div= "+ resu);
              
               break;
       }
    }
    
}
