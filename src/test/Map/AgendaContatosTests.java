package test.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import main.Map.Basic.AgendaContatos;

@Testable
public class AgendaContatosTests {
    @Test
    public void temQueAdicionarContato() {
        AgendaContatos agenda = new AgendaContatos();

        assertTrue(agenda.obterNumeroContatos() == 0);

        agenda.adicionarContato("João", 12345);
        agenda.adicionarContato("Maria", 54321);
        agenda.adicionarContato("Márcio", 23451);
        agenda.adicionarContato("Lúcia", 11111);

        assertTrue(agenda.obterNumeroContatos() == 4);
    }

    @Test
    public void temQueRemoverContato() {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("João", 12345);
        agenda.adicionarContato("Maria", 54321);
        agenda.adicionarContato("Márcio", 23451);
        agenda.adicionarContato("Lúcia", 11111);

        assertTrue(agenda.obterNumeroContatos() == 4);

        agenda.removerContato("João");
        agenda.removerContato("Maria");

        assertTrue(agenda.obterNumeroContatos() == 2);
    }

    @Test
    public void temQueRetornarNumero() {        
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("João", 12345);
        agenda.adicionarContato("Maria", 54321);
        agenda.adicionarContato("Márcio", 23451);
        agenda.adicionarContato("Lúcia", 11111);
        
        assertEquals(12345, agenda.pesquisarPorNome("João"));
        assertEquals(54321, agenda.pesquisarPorNome("Maria"));
        assertEquals(23451, agenda.pesquisarPorNome("Márcio"));
        assertEquals(11111, agenda.pesquisarPorNome("Lúcia"));
    }
}
