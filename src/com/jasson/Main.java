package com.jasson;
import com.jasson.Cuenta;
import com.jasson.Procesos;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Procesos Clientebusinessobject = new Procesos();
        Clientebusinessobject.generarclientes();
        Clientebusinessobject.obtenerclientes().forEach(System.out::println);
        Cuenta count = (Cuenta) Clientebusinessobject.obtenerclientes();
        String titular;
        titular = JOptionPane.showInputDialog("Ingrese el nuevo titular");
        count.setTitular(titular);
        Clientebusinessobject.actualizarcliente(count);

        count= (Cuenta) Clientebusinessobject.obtenerclientes();
        JOptionPane.showMessageDialog(null, count);

        String titulardos;
        titulardos = JOptionPane.showInputDialog("ingrese el nombre del titular que desea eliminar");
        count.setTitular(titulardos);
        Clientebusinessobject.elimianrcliente(count);



    }
}
