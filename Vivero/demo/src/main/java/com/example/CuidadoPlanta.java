package com.example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
// Clase para representar cuidados de las plantas
class CuidadoPlanta {
    private String areaCuidado;
    private Date fechaHoraCuidado;
    private List<Botanico> botanicos;
    private String resultadoCuidado;
    private String estadoCuidado;
    private String Herramientas;
    public int seg;

    public CuidadoPlanta(String areaCuidado, Date fechaHoraCuidado) {
        this.areaCuidado = areaCuidado;
        this.fechaHoraCuidado = fechaHoraCuidado;
        //objeto donde se va a crear la nueva lista
        this.botanicos = new ArrayList<>();
        this.resultadoCuidado = "";
        this.estadoCuidado = "PENDIENTE";
    }
//es agregar las herramientas, se puede cambiar por algun nombre
    public CuidadoPlanta(String string, String string2, String string3) {
    }

    public String getAreaCuidado() {
        return areaCuidado;
    }

    public Date getFechaHoraCuidado() {
        return fechaHoraCuidado;
    }

    public void agregarBotanico(Botanico botanico) {
        botanicos.add(botanico);
    }

    public void registrarResultadoCuidado(String resultado) {
        resultadoCuidado = resultado;
        estadoCuidado = "FINALIZADO";
    }

    public void aplazarCuidado() {
        estadoCuidado = "APLAZADO";
    }

    public String getEstadoCuidado() {
        return estadoCuidado;
    }
    public String getResultadoCuidado() {
        return resultadoCuidado;
    }
    public void setResultadoCuidado(String resultadoCuidado) {
        this.resultadoCuidado = resultadoCuidado;
    }
    public List<Botanico> getBotanicos() {
        return botanicos;
    }
    public void setBotanicos(List<Botanico> botanicos) {
        this.botanicos = botanicos;
    }
    public void setAreaCuidado(String areaCuidado) {
        this.areaCuidado = areaCuidado;
    }
    public void setFechaHoraCuidado(Date fechaHoraCuidado) {
        this.fechaHoraCuidado = fechaHoraCuidado;
    }
    public void setEstadoCuidado(String estadoCuidado) {
        this.estadoCuidado = estadoCuidado;
    }
    
    public String getHerramientas() {
        return Herramientas;
    }

    public void setHerramientas(String herramientas) {
        Herramientas = herramientas;
    }
    @Override
    public String toString() {
        return "Área de cuidado: " + areaCuidado + "\n" +
               "Fecha y hora del cuidado: " + fechaHoraCuidado + "\n" +
               "Resultado del cuidado: " + resultadoCuidado + "\n" +
               "Estado del cuidado: " + estadoCuidado + "\n";
    }
  
}