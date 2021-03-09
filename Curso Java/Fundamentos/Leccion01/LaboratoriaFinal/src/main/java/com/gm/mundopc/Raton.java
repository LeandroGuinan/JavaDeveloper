package com.gm.mundopc;

public class Raton extends DispositivosEntrada {

    private final int idRaton;
    private int contadorRatones;

    public Raton(String entrada, String marca) {
        super(entrada,marca);
        idRaton = ++contadorRatones;

    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + super.toString();
    }

}
