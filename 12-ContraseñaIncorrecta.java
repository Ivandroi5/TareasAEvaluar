/**
 * @author:IvánCabrera
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //varaible
        String contraseña = "bootcam2024";
        //se pide la contraseña por scanner
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingrese contraseña:");

        String contraseñaIngresada = scanner.nextLine();

        //se compara la contraseña escaneado con la almacenada en la variable
        if(contraseñaIngresada.equals(contraseña)) {
            System.out.println("Contraseña correcta");
        }
        else {
            System.out.println("Contraseña incorrecta");
        }
        scanner.close();
    }
}
