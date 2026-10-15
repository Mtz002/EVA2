
package eva2_13_expresiones_booleanas;

public class EVA2_13_EXPRESIONES_BOOLEANAS {


    public static void main(String[] args) {
        boolean entrarAntro,tieneCredencial = true;
            int edad= 18;
        
            entrarAntro = (edad >=18)&& (tieneCredencial == true);
            System.out.println(entrarAntro);
            //OPERADORES BOOLEANS 
            //AND Y....&&------para q sea verdadero tienen q ser la edad y si tiene credencial true
            //OR  O....||------para q sea verdad una tiene q ser verdadera (cualquiera (F,V=V--V,F=V)
            //NOT  NEGACION....!
            
            boolean estaSoleado = false, tienesDinero= false;
            boolean permisoSalir;
            permisoSalir= (estaSoleado == true)|| (tienesDinero == true);
            System.out.println("Permiso para salir de paseo:"+ permisoSalir);
            
            
        
    }
    
}
