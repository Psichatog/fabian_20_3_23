
import java.util.Scanner;

/*
 * Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
 */

/**
 *
 * @author J
 */
public class ej_extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner (System.in);
         System.out.println("Ingrese el primer número");
          int num1 = leer.nextInt();
         System.out.println("Ingrese el segundo número");
          int num2 = leer.nextInt();
          int suma = num1 + num2;
          int resta = num1 - num2;
          int multi = num1 * num2;
          int divi = num1 / num2;
          double mud = num1 % num2;
          
          System.out.println("la suma es: " +suma);
          System.out.println("la resta es: " +resta);
          System.out.println("la multipliacion es: " +multi);
          System.out.println("la division es: " +divi);
          System.out.println("el módulo es: " +mud);
          
    }
    
}
