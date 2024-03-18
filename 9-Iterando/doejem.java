/**
 * @author:IvánCabrea
 * clase que suma del 1 a 10 usando "do-while"
 */
public class doejem {
    public static void main(String[] args) {

        int suma=0;
        int i=0;
        do {i++;
            suma += i;
            System.out.println(i);
        }
        while(i<10);
        System.out.println("\nLa suma total de los dígitos es: "+ suma);
    }
}

