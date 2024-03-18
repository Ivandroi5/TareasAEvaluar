/**
 * @author:IvánCabrea
 */

import java.util.Scanner;

public class ConversorEuros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto en euros:");
        double euros = scanner.nextDouble();

        double[] arregloConversiones = convertirMoneda(euros);

        System.out.println("Monto en euros: " + euros);
        System.out.println("Monto en libras: " + arregloConversiones[0]);
        System.out.println("Monto en dólares: " + arregloConversiones[1]);
        System.out.println("Monto en yenes: " + arregloConversiones[2]);
        System.out.println("Monto en pesos Chilenos: " + arregloConversiones[3]);
    }
    /**
     * metodo para convertir monedas
     */

    public static double[] convertirMoneda(double euros) {
        double[] arregloConversiones = new double[4];

        double libras = euros * 0.86;
        arregloConversiones[0] = libras;

        double dolares = euros * 1.28611;
        arregloConversiones[1] = dolares;

        double yenes = euros * 129.852;
        arregloConversiones[2] = yenes;

        double pesosChilenos = euros * 800;
        arregloConversiones[3] = pesosChilenos;

        return arregloConversiones;
    }
}