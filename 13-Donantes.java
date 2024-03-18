/**
 * @author:IvánCabrera
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        //se pide la edad

        System.out.println("Bienvenido a la selección de donantes");

        System.out.println("Ingrese su edad");

        int edadIngresada = scanner.nextInt();

        //se pide el peso

        System.out.println("Ingrese su peso expresado en kilos");

        int kilosIngresados = scanner.nextInt();

        //se comparan los valores de edad y peso con los aceptado para donar

        if (edadIngresada >= 18 && edadIngresada <= 65 && kilosIngresados >= 50) {
            System.out.println("Puesdes donar sangre!");

        }else {
            System.out.println("No puedes donar sangre!");
        }

        scanner.close();
    }
}