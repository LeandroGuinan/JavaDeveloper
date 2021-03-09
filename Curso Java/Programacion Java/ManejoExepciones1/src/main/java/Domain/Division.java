package Domain;

public class Division {

    private int numerador;
    private int denominador;

    public Division(int numerador, int denominador) throws OperacionExepcion {

        this.numerador = numerador;
        this.denominador = denominador;

        if (this.denominador == 0) {

            throw new OperacionExepcion("Denominador igual a cero");

        }else{
            VisializarOperacion();
        }
    }

    public void VisializarOperacion() {
        System.out.println("El resultado de la division es: " + this.numerador / this.denominador);
    }
}
