package com.example;
import javax.swing.JOptionPane;

// Clase de Seguimiento de las plantas
 class SeguimientoPlantas extends Planta {
    private String SeguimientoDelEstadoSalud;
    private String SeguimientoDelCrecimiento;
    private String Herramientas;
    public int seg;

    // Constructor de la clase
    public SeguimientoPlantas(String SeguimientoDelEstadoSalud, String SeguimientoDelCrecimiento, String Herramientas) {
        super(Herramientas, Herramientas, SeguimientoDelEstadoSalud, SeguimientoDelCrecimiento, Herramientas);
        this.SeguimientoDelEstadoSalud = SeguimientoDelEstadoSalud;
        this.SeguimientoDelCrecimiento = SeguimientoDelCrecimiento;
        this.Herramientas = Herramientas;
    }

    public String getSeguimientoDelEstadoSalud() {
        return SeguimientoDelEstadoSalud;
    }

    public void Planta() {
        JOptionPane.showMessageDialog(null, "Seguimiento de la planta");
    }

    public void setSeguimientoDelEstadoSalud(String seguimientoDelEstadoSalud) {
        SeguimientoDelEstadoSalud = seguimientoDelEstadoSalud;
    }

    public String getSeguimientoDelCrecimiento() {
        return SeguimientoDelCrecimiento;
    }

    public void setSeguimientoDelCrecimiento(String seguimientoDelCrecimiento) {
        SeguimientoDelCrecimiento = seguimientoDelCrecimiento;
    }

    public String getHerramientas() {
        return Herramientas;
    }

    public void setHerramientas(String herramientas) {
        Herramientas = herramientas;
    }

    // Seguimiento de la planta
    public String realizarSeguimiento() {
        String herramientaUtilizada;
        seg = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de herramienta que utilizará"));
        switch (seg) {
            case 1:
                herramientaUtilizada = "Abono";
                break;
            case 2:
                herramientaUtilizada = "Regar";
                break;
            case 3:
                herramientaUtilizada = "Trasplantes";
                break;
            default:
                herramientaUtilizada = "Herramienta no reconocida";
        }
        return herramientaUtilizada;
    }

    // Método para mostrar la informacion del seguimiento de la planta
    public void mostrarSeguimiento() {
        System.out.println("Seguimiento del estado de salud: " + SeguimientoDelEstadoSalud);
        System.out.println("Seguimiento del crecimiento: " + SeguimientoDelCrecimiento);
    }

    @Override
    public String realizarCuidado() {
       /* Es una palabra clave en Java que se utiliza para lanzar una excepción. 
       Indica que se está produciendo una situación excepcional en el código
        */
    throw new UnsupportedOperationException("Método 'realizarCuidado' no implementado");
    // Nota: es una excepción que indica que la operación no es compatible o no está soportada
    }
}
