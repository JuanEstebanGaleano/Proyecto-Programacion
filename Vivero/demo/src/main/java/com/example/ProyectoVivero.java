package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class ProyectoVivero {
  public static void main(String[] args) {
    // Menu de interaccion
    System.out.println("--------------------\n");
    Clientes cliente = new Clientes("Juan");
    Empleado empleado = new Empleado("");
    String mensajeCliente = JOptionPane.showInputDialog("Cliente " + cliente.getNombre() + ", ingrese su mensaje:");
    cliente.enviarMensaje(empleado, mensajeCliente);

    // Imprimir la informacion de las clases
    System.out.println("--------------------\n");
    Planta rosa = new Rosa("Rosa común", "Rosa sp.", "Arbusto", "Luz directa", "Riego regular");
    rosa.setFechaRiego(new Date());

    BotanicoEspecializado botanico = new BotanicoEspecializado("Licencia1", "Jeronimo ", "Guzman",
        "elwestconsin12@gmail.com", "3127610096");

    CuidadoPlanta cuidado = new CuidadoPlanta("Área1", new Date());
    botanico.agregarCuidado(cuidado);
    cuidado.registrarResultadoCuidado("Cuidado exitoso");
    List<CuidadoPlanta> cuidadosDelBotanico = botanico.obtenerCuidados();

    // Mostrar información de la planta
    System.out.println("Información de la planta:");
    System.out.println(rosa);
    System.out.println("--------------------\n");

    // Mostrar información del botánico
    System.out.println("Información del botánico:");
    System.out.println("Número de cuidados del botánico: " + cuidadosDelBotanico.size());
    System.out.println(botanico);

    // Datos de cliente
    System.out.println("--------------------\n");
    Clientes cliente1 = new Clientes("Juan");
    cliente1.setAdquirirPlantas("Rosa");
    String adquirirPlantasCliente1 = cliente1.getAdquirirPlantas();
    String nombreCliente1 = cliente1.getNombre();
    Date fechaRegistroCliente1 = cliente1.getFechaRegistro();

    // Mostrar información del cuidado de la planta
    System.out.println("Información del cuidado de la planta:");
    System.out.println("Área de cuidado: " + cuidado.getAreaCuidado());
    System.out.println("Fecha y hora del cuidado: " + cuidado.getFechaHoraCuidado());
    System.out.println("Resultado del cuidado: " + cuidado.getResultadoCuidado());
    System.out.println("Estado del cuidado: " + cuidado.getEstadoCuidado());

    // Datos de Seguimiento de plantas
    SeguimientoPlantas seguimiento1 = new SeguimientoPlantas("Bueno", "Normal", "Abono");
    String herramientaUtilizada = seguimiento1.realizarSeguimiento();// Realizar el seguimiento de la planta

    // Imprimir El seguimiento de la planta
    System.out.println("--------------------\n");
    System.out.println("El seguimiento de la planta: ");
    seguimiento1.mostrarSeguimiento();
    System.out.println("Herramienta utilizada: " + herramientaUtilizada);

    // Imprimir Registro de clientes
    System.out.println("--------------------\n");
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("Nombre del cliente: " + nombreCliente1);
    System.out.println("Planta Adquiririda: " + adquirirPlantasCliente1);
    System.out.println("Fecha de registro: " + sdf.format(fechaRegistroCliente1));
    System.out.println("--------------------\n");
  }
}
