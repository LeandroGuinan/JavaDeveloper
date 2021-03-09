package com.gm.mundopc;

public class Orden {

    private final int idOrden;
    private final Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {
        if (contadorComputadoras < MAX_COMPUTADORAS) {
            computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ah alcanzado el maximo de productos");
        }
    }

    public void motrarOrden() {

        System.out.println("Orden #" + idOrden);
        System.out.println("Productos de orden");
        System.out.println("");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }

    }
}
