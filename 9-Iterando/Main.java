/**
 * @author:IvánCabrea
 * clase que suma del 1 a 10 usando "while"
 */
public class Main {
    public static void main(String[] args) {
        int suma=0;
        int i=0;
        while (i < 10 ){
            i++;
            suma += i;
            System.out.println(i);
        }
        System.out.println("\nLa suma total de los dígitos es: "+ suma);
    }
}