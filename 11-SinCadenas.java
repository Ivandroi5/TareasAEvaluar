/**
 * @author:IvánCabrea
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String cadenaUsuario = scanner.nextLine();

// se puede usar char.Art
// condicional en caso de que el espacio sea vacío

        if (cadenaUsuario.substring(3, 4).equals(" ")){
            System.out.println("Tu cuarta letra está en un espacio vacio");
        } else {
// si no extrae el caracter que ocupa el lugar 4
            System.out.println("Su cuarta letra es: " + cadenaUsuario.substring(3, 4));
        }
//lo mismo de arriba pero para el lugar 5
        if (cadenaUsuario.substring(4,5).equals(" ")){
            System.out.println("Tu quinta letra está en un espacio");
        } else {
            System.out.println ("Su quinta letra es: "+cadenaUsuario.substring(4,5));
        }
//contador de vocales para una palabra ingresada
        System.out.println("Ingrese una palabra");
        String cadenaNueva = scanner.nextLine().toLowerCase();
        int contadorVocales= 0;
        for (int i= 0;i<cadenaNueva.length(); i++){
            char c = cadenaNueva.charAt(i);
            if((c == 'a') || (c == 'e') || (c== 'i') || (c == 'o') || (c == 'u')) {
                contadorVocales++;
            }
        }
        System.out.println("La cantidad de vocales en tu frase o palabra es: "+contadorVocales);

        scanner.close();
    }
}