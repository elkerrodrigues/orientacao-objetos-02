package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuadradoTeste {

    @Test
    public void criarObjetoQuadrado() {
        Quadrado q1 = new Quadrado();
        assertNotNull(q1);
    }

    @Test
    public void presencaAtributoLado() {
        Quadrado q1 = new Quadrado();
        q1.setLado(10.0);
        assertNotNull(q1.getLado());
    }

    @Test
    public void metodoGetLado() {
        Quadrado q1 = new Quadrado();
        q1.setLado(10.0);
        assertEquals(10.0, q1.getLado());
    }

    @Test
    public void metodoSetLado() {
        Quadrado q1 = new Quadrado();
        q1.setLado(10.0);
        q1.setLado(20.0);
        assertEquals(20.0, q1.getLado());
    }

    @Test
    public void metodoSetLadoInvalido() {
        Quadrado q1 = new Quadrado();
        q1.setLado(10.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> q1.setLado(-20.0));
        assertEquals("O lado deve ser maior que zero.", exception.getMessage());
    }

    @Test
    public void metodoCalcularArea() {
        Quadrado q1 = new Quadrado();
        q1.setLado(10.0);
        Double valorEsperado = 100.0;
        Double valorObtido = q1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        Quadrado q1 = new Quadrado();
        q1.setLado(10.0);
        Double valorEsperado = 40.0;
        Double valorObtido = q1.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }
}
