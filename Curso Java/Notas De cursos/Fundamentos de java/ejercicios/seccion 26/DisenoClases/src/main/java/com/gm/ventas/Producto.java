package com.gm.ventas;


public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    private Producto(){
        this.contadorProductos = ++contadorProductos;
    }
    
    //construrcotr sobrecargado
    
    public Producto(String nombre, double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public static void setContadorProductos(int contadorProductos) {
        Producto.contadorProductos = contadorProductos;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
}
