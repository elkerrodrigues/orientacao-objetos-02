package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CorrentistaTeste {
    @Test
    public void criarObjetoCorrentista() {
        Correntista c1 = new Correntista();
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributoCodigo() {
        Correntista c1 = new Correntista();
        c1.setCodigo("1234");
        assertNotNull(c1.getCodigo());
    }
    @Test
    public void presencaAtributoNome() {
        Correntista c1 = new Correntista();
        c1.setNome("Antonio");
        assertNotNull(c1.getNome());
    }
    @Test
    public void presencaAtributoEmail() {
        Correntista c1 = new Correntista();
        c1.setEmail("ant@email.com");
        assertNotNull(c1.getEmail());
    }
    @Test
    public void presencaAtributoTelefone() {
        Correntista c1 = new Correntista();
        c1.setTelefone("40028922");
        assertNotNull(c1.getTelefone());
    }
    @Test
    public void metodoGetCodigo() {
        Correntista c1 = new Correntista();
        c1.setCodigo("1234");
        assertEquals("1234", c1.getCodigo());
    }

    @Test
    public void metodoSetCodigo() {
        Correntista c1 = new Correntista();
        c1.setCodigo("1234");
        assertEquals("1234", c1.getCodigo());
    }

    @Test
    public void metodoSetCodigoInvalido() {
        Correntista c1 = new Correntista();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setCodigo("234"));
        assertEquals("Codigo Invalido.", exception.getMessage());
    }

    @Test
    public void metodoGetNome() {
        Correntista c1 = new Correntista();
        c1.setNome("Antonio");
        assertEquals("Antonio", c1.getNome());
    }

    @Test
    public void metodoSetNome() {
        Correntista c1 = new Correntista();
        c1.setNome("Antonio");
        c1.setNome("Pedro");
        assertEquals("Pedro", c1.getNome());
    }

    @Test
    public void metodoSetNomeInvalido() {
        Correntista c1 = new Correntista();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setNome("A"));
        assertEquals("Nome Invalido.", exception.getMessage());
    }

    @Test
    public void metodoGetEmail() {
        Correntista c1 = new Correntista();
        c1.setEmail("ant@email.com");
        assertEquals("ant@email.com", c1.getEmail());
    }

    @Test
    public void metodoSetEmail() {
        Correntista c1 = new Correntista();
        c1.setEmail("antonio@fmail.com");
        assertEquals("antonio@fmail.com", c1.getEmail());
    }

    @Test
    public void metodoSetEmailInvalido() {
        Correntista c1 = new Correntista();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setEmail("ant"));
        assertEquals("Email Invalido.", exception.getMessage());
    }

    @Test
    public void metodoGetTelefone() {
        Correntista c1 = new Correntista();
        c1.setTelefone("40028922");
        assertEquals("40028922", c1.getTelefone());
    }

    @Test
    public void metodoSetTelefone() {
        Correntista c1 = new Correntista();
        c1.setTelefone("22982004");
        assertEquals("22982004", c1.getTelefone());
    }

    @Test
    public void metodoSetTelefoneInvalido() {
        Correntista c1 = new Correntista();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setTelefone("234"));
        assertEquals("Telefone Invalido.", exception.getMessage());
    }


}
