package com.example;
import java.util.ArrayList;
import java.util.List;

// Clase concreta que hereda de Botanico
class BotanicoEspecializado extends Botanico {
    private List<CuidadoPlanta> cuidados;

    public BotanicoEspecializado(String licenciaBotanico, String nombre, String apellido, String email, String numeroCelular) {
        super(licenciaBotanico, nombre, apellido, email, numeroCelular);
        cuidados = new ArrayList<>();
    }

    @Override
    public void agregarCuidado(CuidadoPlanta cuidado) {
        cuidados.add(cuidado);
    }
    // Método para obtener los cuidados de una planta
    @Override
    public void actualizarCuidado(CuidadoPlanta cuidado) {
        for (int i = 0; i < cuidados.size(); i++) {
            if (cuidados.get(i).equals(cuidado)) {
                cuidados.set(i, cuidado);
                return;
            }
        }
    }
    
    @Override
    public void eliminarCuidado(CuidadoPlanta cuidado) {
        cuidados.remove(cuidado);
    }

    @Override
    public List<CuidadoPlanta> obtenerCuidados() {
        return cuidados;
    }
    
}