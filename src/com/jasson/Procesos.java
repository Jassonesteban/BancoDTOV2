package com.jasson;
import  com.jasson.Cuenta;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class Procesos {
    ArrayList<clienteDTO> cliente;
    int tamaño;

    public Procesos() {
        cliente = new ArrayList<>();
    }


    public void generarclientes(){
        Random aleatorio = new Random();
        JOptionPane.showMessageDialog(null,"Vamos a crear una cuenta bancaria, por favor llene los siguientes datos");
        Persona persona = new Persona();
        Cuenta cuenta = new Cuenta();
        persona.cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cedula"));
        persona.Nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        persona.Apellidos = JOptionPane.showInputDialog("Ingrese su apellido");
        persona.estado_civil = JOptionPane.showInputDialog("Ingrese su estado civil");
        persona.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        cuenta.numerocuenta = aleatorio.nextInt(34575-25+1) + 89123425;
        cuenta.saldo = 0;
        clienteDTO dto = new clienteDTO();
        dto.setCedula(persona.getCedula());
        dto.setNombrecompleto(persona.getNombre(),persona.getApellidos());
        dto.setCedula(persona.getCedula());
        dto.setEstado(persona.getEstado_civil());
        dto.setNumerocuenta(cuenta.getNumerocuenta());
        cliente.add(dto);
    }

    public void elimianrcliente(Cuenta count){
        cliente.remove(count.getTitular());
        JOptionPane.showMessageDialog(null, "El cliente " + count.getTitular() +
                " con el numero de cuenta " + count.getNumerocuenta() +"\n"+ " ha sido eliminado satisfactoriamente");
    }

    public void obtenerclientes(){
        Iterator iter = cliente.iterator();
        while (iter.hasNext()){

        }
    }

   public clienteDTO consultarTitular(int ncuenta){
        return cliente.get(ncuenta);
   }

   /*public void actualizarcliente(clienteDTO cuenta){
        cliente.get(cuenta.getNumerocuenta()).setTitular(cuenta.getTitular());
        cliente.get(cuenta.getNumerocuenta()).setSaldo(cuenta.getSaldo());
        JOptionPane.showMessageDialog(null, "El cliente con el Numero de cuenta " +cuenta.getNumerocuenta()+
                " fue actualizado correctamente");
   }*/
}
