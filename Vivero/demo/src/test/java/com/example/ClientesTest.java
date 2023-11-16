package com.example;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;

public class ClientesTest {
    @Test
    public void testGetNombre() {
        Clientes cliente = new Clientes("Juan");
        assertEquals("Juanes", cliente.getNombre());
    }

    @Test
    public void testGetFechaRegistro() {
        Clientes cliente = new Clientes("Juan");
        Date fechaRegistro = cliente.getFechaRegistro();
        assertNotNull(fechaRegistro);
    }

    @Test
    public void testSetAdquirirPlantas() {
        Clientes cliente = new Clientes("Juan");
        cliente.setAdquirirPlantas("Plantas de interior");
        assertEquals("Plantas de interior", cliente.getAdquirirPlantas());
    }

    @Test
    public void testSetAprenderPlantas() {
        Clientes cliente = new Clientes("Juan");
        cliente.setAprenderPlantas("Cuidados de las plantas");
        assertEquals("Cuidados de las plantas", cliente.getAprenderPlantas());
    }

    @Test
    public void testSetPreferencias() {
        Clientes cliente = new Clientes("Juan");
        cliente.setPreferencias("Plantas con flores");
        assertEquals("Plantas con flores", cliente.getPreferencias());
    }

    @Test
    public void testSetRecordatorios() {
        Clientes cliente = new Clientes("Juan");
        cliente.setRecordatorios("Regar las plantas");
        assertEquals("Regar las plantas", cliente.getRecordatorios());
    }
}
