/**
 * @author:IvánCabrea
 */

import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

                Scanner scaner = new Scanner(System.in);

                int suma = 0;

                // crea el arreglo y pide el tamaño

                System.out.println("Ingresa el tamaño del arreglo: ");
                int tamano = scaner.nextInt();

                int[] arreglo = new int[tamano];

                // recorre el arreglo y guarda los valores en la variable suma

                for (int i = 0; i < tamano; i++) {
                    System.out.println("Ingresa los valores para el arreglo numero" +" "+(i)+ ":");

                    arreglo[i] = scaner.nextInt();
                    suma += arreglo[i];
                }
                // muestra los valores del arreglo
                System.out.println("Los valores ingresados son:");
                for (int i = 0; i < tamano; i++) {
                    System.out.print(arreglo[i] + " - ");
                }
                //muestra la suma total de los valores del arreglo
                System.out.println("\nLa suma de todos los elementos en el arreglo es: " + suma);

                scaner.close();
            }
        }

