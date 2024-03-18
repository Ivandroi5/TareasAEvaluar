/**
 * @author:IvánCabrea
 * clase que suma del 1 a 10  usando "for"
 */
public class forejem {
    public static void main(String[] args) {

        int suma= 0;
        int i;
        for(i=1; i<=10; i++) {
            System.out.println(i);
            suma+= i;
        }
        System.out.println("\nLa suma total de los dígitos es: "+ suma);
    }
}
