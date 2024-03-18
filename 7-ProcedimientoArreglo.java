/**
 * @author:IvánCabrea
 */
public class Main {
    public static void main(String[] args) {
        int[] arreglo = {65, 2, 9, 36, 0};

        mostrarArreglo(arreglo);

    }

    /**
     *
     * @param arreglo: destinado a ser mostrado con su lugar en el for en mnostrarArreglo
     */

    public static void mostrarArreglo (int[] arreglo) {
        System.out.println ("Elementos del arreglo:");

        for (int i = 0; i < arreglo.length; i++) {

            System.out.println("Elemento " + (i) + ": " + arreglo[i]);

        }
    }
}