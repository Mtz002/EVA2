/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27.pkg28_do.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_2728_DOWHILE {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner captu = new Scanner (System.in);
        String usu,pwd;
         final String USUARIO= "admin";
         final String PASSWORD= "adm";
        do{
            System.out.println("Usuario: ");
            usu = captu.nextLine();
                System.out.println("Contraseña: ");
                pwd = captu.nextLine();
        }
        while (!(usu.equals(USUARIO) || !pwd.equals(PASSWORD)));
         System.out.println("ACCESO CONCEDIDO!!!");
    }
    
}
