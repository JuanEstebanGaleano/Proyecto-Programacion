package com.example;
import java.util.List;

// Clase abstracta para representar botánicos
abstract class Botanico {
    private String licenciaBotanico;
    private String nombre;
    private String apellido;
    private String email;
    private String numeroCelular;

    public Botanico(String licenciaBotanico, String nombre, String apellido, String email, String numeroCelular) {
        this.licenciaBotanico = licenciaBotanico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numeroCelular = numeroCelular;
    }
     /*
      *Implementamos  la interfaz para que hereda de una clase que contiene el método
       abstracto para añadir cuidados especificos 

     */
    public abstract void agregarCuidado(CuidadoPlanta cuidado);

    public abstract void actualizarCuidado(CuidadoPlanta cuidado);

    public abstract void eliminarCuidado(CuidadoPlanta cuidado);

    public abstract List<CuidadoPlanta> obtenerCuidados();

    @Override
    public String toString() {
        return "Licencia de botánico: " + licenciaBotanico + "\n" +
               "Nombre: " + nombre + "\n" +
               "Apellido: " + apellido + "\n" +
               "Email: " + email + "\n" +
               "Número de celular: " + numeroCelular + "\n";
    }
    
}
