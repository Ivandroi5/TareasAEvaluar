/**
 * @author:IvánCabrera
 */
import cl.SeresVivos.clase.Persona;

public class Main {
    public static void main(String[] args) {
        //llenado de objetos con parametros

        Persona persona1 = new Persona("Juan","Anderson",35,
                16502365-6,"Señor Smith",3,"Lundehund noruego",35);

        Persona persona2 = new Persona("Ana","Deschanel",40,
                15102365,"Clarita",1,"Morkie",15);

        //ejecución de métodos de la clase persona

        persona1.mostrarPersona();


        persona2.mostrarPersona();




    }
}