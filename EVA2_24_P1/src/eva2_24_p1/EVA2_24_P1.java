
package eva2_24_p1;

import java.util.Scanner;


public class EVA2_24_P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero inicial: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingrese el numero final: ");
        int fin = scanner.nextInt();

        System.out.print("Resultado: ");
        for (int i = inicio; i <= fin; i++) {
            System.out.print(i);
            if (i < fin) {
                System.out.print(" - ");
            }
    }
        System.out.print("");
    }
}
