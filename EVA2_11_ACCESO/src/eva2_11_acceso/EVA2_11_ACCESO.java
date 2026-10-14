package eva2_11_acceso;

import java.util.Scanner;

public class EVA2_11_ACCESO {

    final static String USUARIO = "admin";
    final static String PWD = "admin";
    
    public static void main(String[] args) {
    String usuario,pwd;
     Scanner captu = new Scanner(System.in);
     System.out.println("Solicita el usuario:");
     usuario= captu.nextLine();
     System.out.println("Solicita la contraseña:");
     pwd= captu.nextLine();
     
     if (usuario==USUARIO){//usuario.equals(USUARIO) una alternativa segura para comparar cadenas
      if (pwd == PWD){
          System.out.println("ACCESO CONCEDIDO!!");
      }else{
          System.out.println("ACCESO DENEGADO!!");
      }
     }else{
         System.out.println("ACCESO DENEGADO!!");
     }
        
    }
    
}
