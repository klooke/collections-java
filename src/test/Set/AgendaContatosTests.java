package test.Set;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import main.Set.Pesquisa.AgendaContatos;
import main.Set.Pesquisa.Contato;

@Testable
public class AgendaContatosTests {
    @Test
    public void temQueAdicionarContatos() {
        AgendaContatos contatos = new AgendaContatos();

        assertTrue(contatos.exibirContatos().size() == 0);

        contatos.adionarContato("Teste A", 999999);
        contatos.adionarContato("Teste E", 999999); // Não pode adicionar

        assertTrue(contatos.exibirContatos().size() == 1);

        contatos.adionarContato("Teste B", 988888);
        contatos.adionarContato("Teste C", 977777);
        contatos.adionarContato("Teste D", 966666);
        contatos.adionarContato("Teste E", 966666); // Não pode adicionar

        assertTrue(contatos.exibirContatos().size() == 4);
    }

    @Test
    public void temQueRetornarContatoPorNome() {
        AgendaContatos contatos = new AgendaContatos();

        contatos.adionarContato("Teste A", 999999);
        contatos.adionarContato("Teste B", 988888);
        contatos.adionarContato("Teste C", 977777);
        contatos.adionarContato("Teste D", 966666);

        Set<Contato> listaContatoPesquisado = new LinkedHashSet<>();
        listaContatoPesquisado.add(new Contato("Teste C", 977777));

        Set<Contato> listaContatosEncontrados = contatos.pesquisarPorNome("Teste C");
        assertEquals(listaContatoPesquisado, listaContatosEncontrados);

        // Tem que retornar tudo
        assertArrayEquals(contatos.pesquisarPorNome("Teste").toArray(), contatos.exibirContatos().toArray());
    }

    @Test
    public void temQueAtualizarNumeroContato() {
        AgendaContatos contatos = new AgendaContatos();

        contatos.adionarContato("Teste A", 999999);
        contatos.adionarContato("Teste B", 988888);
        contatos.adionarContato("Teste C", 977777);
        contatos.adionarContato("Teste D", 966666);

        int novoNumero = 2222222;

        assertFalse(contatos.pesquisarPorNome("Teste C").contains(new Contato("Teste C", novoNumero)));
        assertFalse(contatos.pesquisarPorNome("Teste D").contains(new Contato("Teste D", novoNumero)));

        contatos.atualizarNumeroContato("Teste C", novoNumero);
        contatos.atualizarNumeroContato("Teste D", novoNumero);

        assertTrue(contatos.pesquisarPorNome("Teste C").contains(new Contato("Teste C", novoNumero)));
        assertTrue(contatos.pesquisarPorNome("Teste D").contains(new Contato("Teste D", novoNumero)));
    }
}
