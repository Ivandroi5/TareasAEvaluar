/**
 * @author:IvánCabrera
 */
package cl.SeresVivos.clase;
public class Persona extends Perro {

    //atributos de la clase persona

    public String nombrePersona;

    public String apellidoPersona;

    public long edadPersona;

    public int rutPersona;

    //contrucctor para llamar los atributos de persona y los de la clase perro

    public Persona(String nombrePersona,
                   String apellidoPersona, long edadPersona, int rutPersona, String nombrePerro,
                   int edadPerro, String razaPerro, float tamanoPerro) {
        super(nombrePerro,edadPerro, razaPerro, tamanoPerro);
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.edadPersona = edadPersona;
        this.rutPersona = rutPersona;
    }

    /**
     * método para mostrar la información de la persona y su perro
     */
    public void mostrarPersona() {

        System.out.println("\nNuestro cliente es: " + nombrePersona  +" "+ apellidoPersona);
        System.out.println("Edad: " + edadPersona+ " años");
        System.out.println("Rut: " + rutPersona);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Su mascota es: " + nombrePerro);
        System.out.println("Edad: " + edadPerro+ " año(s)");
        System.out.println("Raza: " + razaPerro);
        System.out.println("Tamaño: " + tamanoPerro + " cm");

        System.out.println("======================================================================\n");

    }

    /**
     * metodo para llamar el ladrido del perro
     */
    @Override
    public void ladrar() {
        super.ladrar();
    }
}

