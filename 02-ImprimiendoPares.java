/**
 * @author:IvánCabrea
 */
public class pares {
    public static void main(String[] args) {

        // recorre una lista de 2 en 2 hasta llegar a 100
        int i;
        for (i = 2; i <= 100; i++) {

            if(i%2==0) {
                System.out.println("Imprimiendo par...");
                System.out.println(i);
            }
        }

    }
}