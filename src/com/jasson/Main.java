package com.jasson;
import com.jasson.Cuenta;
import com.jasson.Procesos;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int opcion, opciondos;
        Procesos Clientebusinessobject = new Procesos();
            int op = JOptionPane.showConfirmDialog(null,"¿Tienes cuenta con nosotros?", "Bienvenido", JOptionPane.YES_NO_OPTION );
            if(op == JOptionPane.YES_OPTION){
                int cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta"));
                Clientebusinessobject.consultarTitular(cuenta);

            }else if(op == JOptionPane.NO_OPTION){
               Procesos procesos = new Procesos();
               procesos.generarclientes();
                opcion = Integer.parseInt(JOptionPane.showInputDialog("------------Sistema bancario ADMINISTRADOR-----------------\n"+
                        "Sea bienvenido, vamos agregar los clientes para los bancos\n" +" ¿Que desea hacer?\n"+
                        "1. ver los clientes ingresados al sistema\n"+
                        "2. Actualizar un dato de algun cliente\n"+
                        "3. Eliminar algun cliente del sistmea"));
                switch (opcion){
                    case 1:
                        procesos.obtenerclientes();
                        break;

                }
            }else{
                JOptionPane.showMessageDialog(null,"Hay un error");
            }
    }
}
