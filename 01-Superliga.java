/**
 * @author:IvánCabrea
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pide la información de las partidas de tu equipo favorito

        System.out.println("Ingrese su equipo favorito:");
        String equipoFavorito = scanner.next();

        System.out.println("Ingrese el número de partidas ganadas:");
        int partidasGanadas = scanner.nextInt();

        System.out.println("Ingrese el número de partidas perdidas:");
        int partidasPerdidas = scanner.nextInt();

        System.out.println("Ingrese el número de partidas empatadas:");
        int partidasEmpatadas = scanner.nextInt();

        // imprime el puntaje de tu equipo
        int puntajeTotal = (partidasEmpatadas)+(partidasPerdidas*0)+(partidasGanadas*3);

        System.out.println("El puntaje total de: " + equipoFavorito + " es: " + puntajeTotal);



    }
}