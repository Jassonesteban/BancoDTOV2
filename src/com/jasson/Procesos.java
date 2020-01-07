package com.jasson;
import  com.jasson.Cuenta;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Procesos {
    List<Cuenta> cliente;

    public Procesos() {
        cliente = new ArrayList<>();
    }

    public void generarclientes(){
        int tamaño, Ncuenta;
        String titular;
        double plata;
        Random aleatorio = new Random();
        tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un tamaño pa la lista"));
        for (int i=0; i<tamaño;i++){
            Ncuenta = aleatorio.nextInt(75-25+1) + 25;
            titular = JOptionPane.showInputDialog("Ingrese el nombre del titular");
            plata = Double.parseDouble(JOptionPane.showInputDialog("Ingrese una cantidad de dinero optima:"));
            Cuenta count = new Cuenta(Ncuenta,titular,plata);
            cliente.add(count);
        }
    }

    public void elimianrcliente(Cuenta count){
        cliente.remove(count.getTitular());
        JOptionPane.showMessageDialog(null, "El cliente " + count.getTitular() +
                " con el numero de cuenta " + count.getNumerocuenta() +"\n"+ " ha sido eliminado satisfactoriamente");
    }

    public List<Cuenta> obtenerclientes(){
        return cliente;
    }

   public Cuenta consultarTitular(int ncuenta){
       return cliente.get(ncuenta);
   }

   public void actualizarcliente(Cuenta cuenta){
        cliente.get(cuenta.getNumerocuenta()).setTitular(cuenta.getTitular());
        cliente.get(cuenta.getNumerocuenta()).setDinero(cuenta.getDinero());
        JOptionPane.showMessageDialog(null, "El cliente con el Numero de cuenta " +cuenta.getNumerocuenta()+
                " fue actualizado correctamente");
   }
}
