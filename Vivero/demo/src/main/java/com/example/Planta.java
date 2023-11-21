package com.example;
import java.util.Date;

// Clase abstracta para representar plantas
abstract class Planta {
    private String nombreComun;
    private String nombreCientifico;
    private String tipo;
    private String requerimientos;
    private String cuidadosEspecificos;
    private Date fechaRiego;

    public Planta(String nombreComun, String nombreCientifico, String tipo, String requerimientos, String cuidadosEspecificos) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.tipo = tipo;
        this.requerimientos = requerimientos;
        this.cuidadosEspecificos = cuidadosEspecificos;
        this.fechaRiego = null;
    }
        //Metodos y getter para la exposicion:
    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRequerimientos() {
        return requerimientos;
    }

    public void setCuidadosEspecificos(String cuidadosEspecificos) {
        this.cuidadosEspecificos = cuidadosEspecificos;
    }

    public Date getFechaRiego() {
        return fechaRiego;
    }

    public void setFechaRiego(Date fechaRiego) {
        this.fechaRiego = fechaRiego;
    }

    public abstract String realizarCuidado();

    @Override
    public String toString() {
        return "Nombre común: " + nombreComun + "\n" +
               "Nombre científico: " + nombreCientifico + "\n" +
               "Tipo: " + tipo + "\n" +
               "Requerimientos: " + requerimientos + "\n" +
               "Cuidados específicos: " + cuidadosEspecificos + "\n";
    }

 
}


       