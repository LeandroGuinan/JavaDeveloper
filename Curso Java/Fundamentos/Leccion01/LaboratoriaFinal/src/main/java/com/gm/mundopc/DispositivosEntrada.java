package com.gm.mundopc;

public class DispositivosEntrada {

    private String entrada;
    private String marca;
    
    public DispositivosEntrada(String entrada, String marca){
        this.entrada = entrada;
        this.marca = marca;
        
    }

    

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivosEntrada{" + "entrada=" + entrada + ", marca=" + marca + '}';
    }
    
    
    
}
