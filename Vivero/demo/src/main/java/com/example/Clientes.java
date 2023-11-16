package com.example;
import java.util.Date;

// Clase de clientes
public class Clientes {
    private String adquirirPlantas;
    private String Preferencias;
    private String Recordatorios;
    private String AprenderPlantas;
    private String nombre;
    private Date fechaRegistro;

    // Constructor de la clase
    public Clientes(String nombre) {
        this.nombre = nombre;
        this.fechaRegistro = new Date(); // Registra la fecha actual al crear un cliente
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public String getAdquirirPlantas() {
        return adquirirPlantas;
    }

    public void setAdquirirPlantas(String adquirirPlantas) {
        this.adquirirPlantas = adquirirPlantas;
    }

    public String getAprenderPlantas() {
        return AprenderPlantas;
    }

    public void setAprenderPlantas(String aprenderPlantas) {
        AprenderPlantas = aprenderPlantas;
    }

    public String getPreferencias() {
        return Preferencias;
    }

    public void setPreferencias(String preferencias) {
        Preferencias = preferencias;
    }

    public String getRecordatorios() {
        return Recordatorios;
    }

    public void setRecordatorios(String recordatorios) {
        Recordatorios = recordatorios;
    }
}
