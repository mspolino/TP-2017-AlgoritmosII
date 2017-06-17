/**
 * Created by marti on 6/6/2017.
 */
public class Condicion {

    /*Atributos de Condiciones - Nombre+parametros de condicion(?)*/
    String nombrecondicion;

    /*Getters y Setters de Condiciones*/
    public String getNombrecondicion ( ) {
        return nombrecondicion;
    }

    public void setNombrecondicion (String nombrecondicion) {
        this.nombrecondicion = nombrecondicion;
    }

    /*
    Se implementa informar. Idealmente voy a venir de un FOR desde el main, o desde condiciones, donde por cada subscriptor, se le envíe un mensaje:
    *"Estimado: +NombreSubscriptor"/esto lo hace el for del main, por lo que entiendo.
    *"Está en curso un período de: +NombreCondicion"
     */

    @Override
    public void informar(Condicion condicion){

        this.nombrecondicion = Condicion.getNombrecondicion ();
        System.out.println ("Está en curso un período de: " +this.nombrecondicion);

    }

}

