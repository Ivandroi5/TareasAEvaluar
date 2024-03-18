/**
 * @author:IvánCabrera
 */
import cl.LlenadoDeCafetera.clase.Llenado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        Llenado llenado = new Llenado();

        //llamado de los métodos en la clase "Llenado"

        llenado.setCapacidadActual(0.5);

        llenado.setCapacidadMaxima(3);

        System.out.println("La capacidad máxima de la cafetera es: "+ llenado.getCapacidadMaxima());

        System.out.println("\nLa cantidad actual en la cafetera es: "+ llenado.getCapacidadActual() + " lt");

        llenado.llenarCafetera();

        llenado.servirTasa();

        llenado.vaciarCafetera();

        llenado.agregarCafe();

        scanner.close();
    }

}