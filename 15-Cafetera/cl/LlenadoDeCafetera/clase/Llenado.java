/**
 * @author:IvánCabrera
 */
package cl.LlenadoDeCafetera.clase;
import java.util.Scanner;
public class Llenado {
    //atributos

    private double capacidadMaxima;

    private double capacidadActual;

    //creacion de geters y seters

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    /**
     * método para llenar toda la capacidad de la cafetera
     */
    public void llenarCafetera(){
        capacidadActual = capacidadMaxima;

        System.out.println("\nLlenando cafereta... Espere...");

        System.out.println("\nLa capacidad actual de la cafetera es: "+ capacidadActual);

    }

    /**
     * método para llenar una tasa en toda la capacidad de esta
     */
    public void servirTasa (){

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPor favor ingrese el tamaño de la taza expresado en litros");

        double tamañoTaza = scanner.nextDouble();

       if (tamañoTaza>capacidadActual){

           System.out.println("\nNo alcanza");

           System.out.println("\nLa taza se llenó solamente: " + capacidadActual + " lt");

        }
       else {

           System.out.println("\nla taza se ha llenado!");

           System.out.println("\nQuedan en la cafetera "+(capacidadActual-tamañoTaza)+" lt");
       }
    }

    /**
     * método para vaciar la cafetera
     */
        public void vaciarCafetera(){
            System.out.println("\nVaciando cafetera....");


            capacidadActual = 0;

            System.out.println("\nLa cafetera está vacía");
        }
    /**
     * método para llenar la cafetera a gusto
     */
    public void agregarCafe(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n¿Cuanto café desea agregar?");

        double agregar = scanner.nextDouble();

        capacidadActual += agregar;

        if (capacidadActual>3) {

            System.out.println("\nPRECAUCIÓN CAPACIDAD EXCEDIDA!");

            System.out.println("\nCafetera llena!");

            capacidadActual = 3;
        }
        System.out.println("\nla cafetera tiene: " + capacidadActual + " lt");
    }
}






