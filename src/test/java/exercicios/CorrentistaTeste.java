package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CorrentistaTeste {
    @Test
    public void criarObjetoCorrentista() {
        Correntista c1 = new Correntista();
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributoCodigo() {
        Correntista c1 = new Correntista();
        c1.codigo = "1234";
        assertNotNull(c1.codigo);
    }
    @Test
    public void presencaAtributoNome() {
        Correntista c1 = new Correntista();
        c1.nome = "Antonio";
        assertNotNull(c1.nome);
    }
    @Test
    public void presencaAtributoEmail() {
        Correntista c1 = new Correntista();
        c1.email = "ant@email.com";
        assertNotNull(c1.email);
    }
    @Test
    public void presencaAtributoTelefone() {
        Correntista c1 = new Correntista();
        c1.telefone = "40028922";
        assertNotNull(c1.telefone);
    }
    @Test
    public void metodoGetCodigo() {
        Correntista c1 = new Correntista();
        c1.codigo = "1234";
        assertEquals("1234", c1.getCodigo());
    }

    @Test
    public void metodoSetCodigo() {
        Correntista c1 = new Correntista();
        c1.codigo = "1234";
        c1.setCodigo("2345");
        assertEquals("2345", c1.codigo);
    }
    @Test
    public void metodoGetNome() {
        Correntista c1 = new Correntista();
        c1.nome = "Antonio";
        assertEquals("Antonio", c1.getNome());
    }

    @Test
    public void metodoSetNome() {
        Correntista c1 = new Correntista();
        c1.nome = "Antonio";
        c1.setNome("Pedro");
        assertEquals("Pedro", c1.nome);
    }
    @Test
    public void metodoGetEmail() {
        Correntista c1 = new Correntista();
        c1.email = "ant@email.com";
        assertEquals("ant@email.com", c1.getEmail());
    }

    @Test
    public void metodoSetEmail() {
        Correntista c1 = new Correntista();
        c1.email = "ant@email.com";
        c1.setEmail("antonio@fmail.com");
        assertEquals("antonio@fmail.com", c1.email);
    }
    @Test
    public void metodoGetTelefone() {
        Correntista c1 = new Correntista();
        c1.telefone = "40028922";
        assertEquals("40028922", c1.getTelefone());
    }

    @Test
    public void metodoSetTelefone() {
        Correntista c1 = new Correntista();
        c1.telefone = "40028922";
        c1.setTelefone("22982004");
        assertEquals("22982004", c1.telefone);
    }




}
