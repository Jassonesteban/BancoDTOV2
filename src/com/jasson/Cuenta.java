package com.jasson;

public class Cuenta {
    int numerocuenta;
    String titular;
    double saldo;


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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        return this.getNumerocuenta() + " " + this.getTitular() + " " + this.getSaldo();
    }
}
