public class PalabraNull {

    public static void main(String[] args) {
        Persona persona1 =new Persona("juan");
        System.out.println("persona1 = " + persona1.obtenerNombre());

        Persona persona2 = persona1;// las variables de tipo objet solo almacenan la referencia

        System.out.println("persona2 = " + persona2.obtenerNombre());

        // hacemos que la variable persona 1 ya no apunte al objeto persona
        persona1 = null;// esta variable es candidata para ser eliminada por el recolector de basura

        System.gc();// recolector de basura este se inicia cuando la mv de java quiere garbage collector solo planifica la llamada

        persona2 =null;

        if (persona1 != null){
            System.out.println("persona1 = " + persona1.obtenerNombre());
        }

    }

}
class Persona {
    String nombre;

    // constructor

    Persona (String nombre){
        this.nombre = nombre;

    }

    // metodos
    public String obtenerNombre(){
        return this.nombre;
    }
}