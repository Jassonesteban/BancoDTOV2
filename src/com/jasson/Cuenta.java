package com.jasson;

public class Cuenta {
    int numerocuenta;
    String titular;
    double dinero;

    public Cuenta(int numerocuenta, String titular, double dinero) {
        this.numerocuenta = numerocuenta;
        this.titular = titular;
        this.dinero = dinero;
    }

    public int getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String toString(){
        return this.getNumerocuenta() + " " + this.getTitular() + " " + this.getDinero();
    }
}
