package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CirculoTeste {

    @Test
    public void criarObjetoCirculo() {
        Circulo c1 = new Circulo();
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributoBase() {
        Circulo c1 = new Circulo();
        c1.setRaio(10.0);
        assertNotNull(c1.getRaio());
    }

    @Test
    public void metodoGetRaio() {
        Circulo c1 = new Circulo();
        c1.setRaio(10.0);
        assertEquals(10.0, c1.getRaio());
    }

    @Test
    public void metodoSetRaio() {
        Circulo c1 = new Circulo();
        c1.setRaio(10.0);
        c1.setRaio(20.0);
        assertEquals(20.0, c1.getRaio());
    }

    @Test
    public void metodoSetRaioInvalido() {
        Circulo c1 = new Circulo();
        c1.setRaio(10.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setRaio(-20.0));
        assertEquals("O raio deve ser maior que zero.", exception.getMessage());
    }

    @Test
    public void metodoCalcularArea() {
        Circulo c1 = new Circulo();
        c1.setRaio(10.0);
        Double valorEsperado = 314.0;
        Double valorObtido = c1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        Circulo c1 = new Circulo();
        c1.setRaio(10.0);
        Double valorEsperado = 20.0 * 3.14;
        Double valorObtido = c1.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }
}



