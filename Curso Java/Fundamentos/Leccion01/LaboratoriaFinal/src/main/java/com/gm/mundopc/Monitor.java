package com.gm.mundopc;

public class Monitor {
    
    private final int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;
    
    private Monitor(){
        idMonitor = ++contadorMonitores;
    }
    public Monitor(String marca,double tamaño){
        this();
        this.marca=marca;
        this.tamaño=tamaño;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getContadorMonitores() {
        return contadorMonitores;
    }

    public void setContadorMonitores(int ContadorMonitores) {
        this.contadorMonitores = ContadorMonitores;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamaño=" + tamaño + '}';
    }

    
    
    
}