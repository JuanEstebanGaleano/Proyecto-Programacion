package com.example;

import javax.swing.JOptionPane;

public class Empleado {
    public Empleado(String string) {
    }
    public void recibirMensaje(Clientes cliente, String mensaje) {
        System.out.println("Recibiendo mensaje en Empleado: " + mensaje);
        JOptionPane.showMessageDialog(null, "Empleado " + " recibió mensaje de Cliente " + cliente.getNombre() + ": " + mensaje);
    }
}
