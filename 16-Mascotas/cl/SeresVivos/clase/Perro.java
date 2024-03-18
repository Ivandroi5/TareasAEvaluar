/**
 * @author:IvánCabrera
 */

package cl.SeresVivos.clase;

public class Perro {

    //atributos de la clase perro

    public String nombrePerro;

    public int edadPerro;

    public String razaPerro;

    public float tamanoPerro;

    //construccyor para llamar el nombre del perro

    public Perro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    //constructor para enviar todos los atributos del perro

    public Perro(String nombrePerro, int edadPerro, String razaPerro, float tamanoPerro) {
        this.nombrePerro = nombrePerro;
        this.edadPerro = edadPerro;
        this.razaPerro = razaPerro;
        this.tamanoPerro = tamanoPerro;
    }

    //método para ladrar
    
    public void ladrar(){
        System.out.println("Guau");
    }

}

