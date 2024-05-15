package ar.edu.unju.fi.ejercicio5.model;


public class Producto {
    private String codigo;
    private String descripcion;
    private double precio;
    private boolean estado;

    // Constructor, getters y setters aquí

    public Producto(String codigo, String descripcion, double precio, boolean estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
    }

    // Getters y setters aquí

    public double getPrecio() {
        return precio;
    }
