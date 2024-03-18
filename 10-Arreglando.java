/**
 * @author:IvánCabrea
 */
import java.util.Scanner;
public class Arreglando {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //arreglo de 3
        double[] trio = new double[3];
        int i;
        double mayorValor =trio[0];

        //pedir los valores del arreglo
        for (i=0; i <3; i++) {

            System.out.println("Ingresa el valor para el índice numero" +" "+(i)+ ":");
            trio [i] = scanner.nextDouble();
        }

        //buscar el valor mayor en el arreglo
        for (i=0; i <3; i++){

            System.out.print(trio [i] + " - ");
            if (trio [i]>mayorValor){
                mayorValor = trio[i];
            }
        }

        //imprimir el valor mayor
        System.out.println("\n\nEl valor mayor del arreglo es: "+ mayorValor);
        scanner.close();
    }
}