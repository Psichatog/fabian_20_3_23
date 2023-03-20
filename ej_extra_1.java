
import java.util.Scanner;

/*
 * Escribir un programa que calcule cuántos litros de combustible consumió un automóvil. El
usuario ingresará una cantidad de litros de combustible cargados en la estación y una
cantidad de kilómetros recorridos, después, el programa calculará el consumo (km/lt) y se lo
mostrará al usuario.
 */

/**
 *
 * @author J
 */
public class ej_extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese cuantos litros de combustible cargo por ultima vez");
        int litro = leer.nextInt();
        System.out.println("ingrese los kilometros recorridos desde la ultima carga de combustible");
        int km =leer.nextInt();
        System.out.println("Al momento del calculo, ingrese los litros restantes de combustible");
        int naft = leer.nextInt();
        
        double kmPORlitro = km / (litro-naft);
        
        System.out.println("el consumo de su vehiculo es de: " + kmPORlitro+ " kilometros por litro");
        
                
                
              
               
    }
    
}
