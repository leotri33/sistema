/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication26;

/**
 *
 * @author pc
 */
public class Vehiculos {
        private String idPlaca;
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private String color;
    private String fechaUltimoMantenimiento;
    private String sucursal;
    private double kilometraje;
    private double precioPorDia;
    private String estado;

    // Constructor
    public Vehiculos(String idPlaca, String marca, String modelo, int anioFabricacion, 
                    String color, String fechaUltimoMantenimiento, String sucursal,
                    double kilometraje, double precioPorDia, String estado) {
        this.idPlaca = idPlaca;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.color = color;
        this.fechaUltimoMantenimiento = fechaUltimoMantenimiento;
        this.sucursal = sucursal;
        this.kilometraje = kilometraje;
        this.precioPorDia = precioPorDia;
        this.estado = estado;
    }

    // Getters y Setters
    public String getIdPlaca() {
        return idPlaca;
    }

    public void setIdPlaca(String idPlaca) {
        this.idPlaca = idPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFechaUltimoMantenimiento() {
        return fechaUltimoMantenimiento;
    }

    public void setFechaUltimoMantenimiento(String fechaUltimoMantenimiento) {
        this.fechaUltimoMantenimiento = fechaUltimoMantenimiento;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
