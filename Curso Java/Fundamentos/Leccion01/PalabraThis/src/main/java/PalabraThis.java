
public class PalabraThis {

    public static void main(String[] args) {

        Persona persona = new Persona("Juan");
    }

}
//this apunta al objeto con que estemos trabajando actualmente

class Persona {

    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
        System.out.println("Impresion del operador this en la clase persona: " +this);
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this);//this contiene una referencia al objeto persona
    }
}
//la palabra this o apuntador this no se puede utilizar en un contexto estatico
//el apuntador this apunta a diferentes objetos dependiendo la clase donde donde se encuentre

class Imprimir {

    public void imprimir(Persona p) {
        System.out.println("Impresion del argumento persona: " + p);//valor del objeto persona
        System.out.println("Impresion del objeto actual" + this);//this apunta a un objeto de tipo imprimir
    }
}
