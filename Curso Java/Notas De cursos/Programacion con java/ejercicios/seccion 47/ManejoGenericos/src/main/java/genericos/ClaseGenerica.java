package genericos;

public class ClaseGenerica<T> {

    //defininmos la variable de tipo generivo
    T objeto;

    //constructor que inicializa el tipo a utilizar
    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }

    public void ObtenerTipo() {
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
}
