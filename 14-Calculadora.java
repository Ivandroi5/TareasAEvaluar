/**
 * @author:IvánCabrera
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("(\\__/)");
        System.out.println("(o^.^)");
        System.out.println("z(_(\")(\")");
        System.out.println("-----------------------------------------");

        //definicion de variables

        int primerNum;
        int segundoNum;
        int tipoDeOperacion;
        boolean menu = true;

        Scanner scanner = new Scanner(System.in);

        //scaneo de los dos enteros

        System.out.println("Ingrese el primer entero");
        primerNum = scanner.nextInt();
        System.out.println("-----------------------------------------");
        System.out.println("Ingrese el segundo entero");
        segundoNum = scanner.nextInt();

        //creacion de ciclo while para el bucle

 while(menu) {
        int i;
        for (i = 1; i<=5; i++){
        //menú de operaciones
            switch (i){
                case 1:
                    System.out.println("-----------------------------------------");
                    System.out.println(i+" Sumar");
                    System.out.println("-----------------------------------------");
                    break;
                case 2:
                    System.out.println(i+" Restar");
                    System.out.println("-----------------------------------------");
                    break;
                case 3:
                    System.out.println(i+" Multiplicar");
                    System.out.println("-----------------------------------------");
                    break;
                case 4:
                    System.out.println(i+" Dividir");
                    System.out.println("-----------------------------------------");
                    break;
                case 5:
                    System.out.println(i+" SALIR");


            }
        //ejecucion de métodos del menú anterior
        }
        System.out.println("Ingrese el tipo de opereación");
        tipoDeOperacion = scanner.nextInt();
        switch (tipoDeOperacion){
            case 1:
                System.out.println("=========================================");
                Sumar(primerNum,segundoNum);
                System.out.println("=========================================");
                break;
            case 2:
                System.out.println("=========================================");
                Restar(primerNum,segundoNum);
                System.out.println("=========================================");
                break;
            case 3:
                System.out.println("=========================================");
                Multiplicar(primerNum,segundoNum);
                System.out.println("=========================================");
                break;
            case 4:
                System.out.println("=========================================");
                Dividir(primerNum,segundoNum);
                System.out.println("=========================================");
                break;
            case 5:
                menu =false;
            default:
                if(menu == false){
                    System.out.println("Saliendo...");
                }else {
                    System.out.println("=========================================");
                    System.out.println("No se encuentra la operación seleccionada");
                    System.out.println("=========================================");
                }
        }
 }
        scanner.close();
        System.out.println("(\\__/)");
        System.out.println("(o^.^)");
        System.out.println("z(_(\")(\")");
        System.out.println("-----------------------------------------");
    }

    /**
     *métoddos de las operaciones matematicas
     */
    public static void Sumar(int primerNum, int segundoNum){
        int resultado =(primerNum + segundoNum);
        System.out.println("El resultado de la Suma es:"+ resultado);
    }
    public static void Restar(int primerNum, int segundoNum) {
        int resultado = (primerNum - segundoNum);
        System.out.println("El resultado de la Resta es:" + resultado);
    }
    public static void Multiplicar(int primerNum, int segundoNum) {
        int resultado = (primerNum * segundoNum);
        System.out.println("El resultado de la Multiplicación es:" + resultado);
    }
    public static void Dividir(int primerNum, int segundoNum) {
        float resultado = ((float) primerNum / segundoNum);
        System.out.println("El resultado de la Divisón es:" + resultado);
    }

}