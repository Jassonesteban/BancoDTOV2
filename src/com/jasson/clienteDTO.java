package com.jasson;

import java.io.Serializable;

public class clienteDTO implements Serializable {
    private int cedula;
    private  String nombrecompleto;
    private String nombre;
    private String apellido;
    private String estado;
    private int numerocuenta;

    public clienteDTO() {
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombre, String apellido) {
        this.nombrecompleto = nombre + " " + apellido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }
}
