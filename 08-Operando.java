/**
 * @author:IvánCabrea
 */
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * clase que pide un numero para usar diferentes operadoes en el cálculo de este
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un número entero");
        numero = scanner.nextInt();

        System.out.println("Es doble es: "+(numero*2));
        System.out.println("Es triple es: "+(numero*3));
        System.out.println("La raiz cuadrada es: "+ sqrt(numero));
        System.out.println("La potencia elevada a 7 es : "+pow(numero,7));

        scanner.close();

    }
}
