package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTeste {

    @Test
    public void criarObjetoRetangulo() {
        Retangulo r1 = new Retangulo();
        assertNotNull(r1);
    }

    @Test
    public void presencaAtributoBase() {
        Retangulo r1 = new Retangulo();
        r1.setBase(10.0);
        assertNotNull(r1.getBase());
    }

    @Test
    public void presencaAtributoAltura() {
        Retangulo r1 = new Retangulo();
        r1.setAltura(10.0);
        assertNotNull(r1.getAltura());
    }

    @Test
    public void metodoGetBase() {
        Retangulo r1 = new Retangulo();
        r1.setBase(10.0);
        assertEquals(10.0, r1.getBase());
    }

    @Test
    public void metodoSetBase() {
        Retangulo r1 = new Retangulo();
        r1.setBase(10.0);
        r1.setBase(20.0);
        assertEquals(20.0, r1.getBase());
    }

    @Test
    public void metodoSetBaseInvalido() {
        Retangulo r1 = new Retangulo();
        r1.setBase(10.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> r1.setBase(-20.0));
        assertEquals("A base deve ser maior que zero.", exception.getMessage());
    }

    @Test
    public void metodoGetAltura() {
        Retangulo r1 = new Retangulo();
        r1.setAltura(10.0);
        assertEquals(10.0, r1.getAltura());
    }

    @Test
    public void metodoSetAltura() {
        Retangulo r1 = new Retangulo();
        r1.setAltura(20.0);
        assertEquals(20.0, r1.getAltura());
    }

    @Test
    public void metodoSetAlturaInvalido() {
        Retangulo r1 = new Retangulo();
        r1.setAltura(20.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> r1.setAltura(-20.0));
        assertEquals("A altura deve ser maior que zero.", exception.getMessage());
    }

    @Test
    public void metodoCalcularArea() {
        Retangulo r1 = new Retangulo();
        r1.setBase(10.0);
        r1.setAltura(20.0);
        Double valorEsperado = 200.0;
        Double valorObtido = r1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        Retangulo r1 = new Retangulo();
        r1.setBase(10.0);
        r1.setAltura(20.0);
        Double valorEsperado = 60.0;
        Double valorObtido = r1.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }
}

