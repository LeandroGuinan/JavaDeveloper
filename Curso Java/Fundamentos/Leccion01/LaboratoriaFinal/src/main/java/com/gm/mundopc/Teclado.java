package com.gm.mundopc;


public class Teclado extends DispositivosEntrada {
    private int idTeclado;
    private static int contadorTeclados;
    
    
    public Teclado(String entrada, String marca){
        super(entrada,marca);
        idTeclado = ++contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + super.toString();
    }
    
    
}
