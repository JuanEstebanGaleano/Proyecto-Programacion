package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class RosaTest {
    
    @Test
    public void testRealizarCuidado() {
        Rosa rosa = new Rosa("Rosa común", "Rosa científica", "Flor", "Suelo húmedo", "Podar en invierno");
        String cuidado = rosa.realizarCuidado();
        assertEquals("Cuidado específico para rosas", cuidado);
    }
}