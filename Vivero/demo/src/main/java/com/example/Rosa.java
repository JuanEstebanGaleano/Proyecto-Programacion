package com.example;

// Clase concreta que hereda de Planta
class Rosa extends Planta {
    public Rosa(String nombreComun, String nombreCientifico, String tipo, String requerimientos, String cuidadosEspecificos) {
            super(nombreComun, nombreCientifico, tipo, requerimientos, cuidadosEspecificos); 
    }

    @Override
    public String realizarCuidado() {
        return "Cuidado específico para rosas";
    }
}