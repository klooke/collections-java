package test.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import main.Map.Basic.Dicionario;

@Testable
public class DicionarioTests {
    @Test
    public void temQueAdicionarPalavra() {
        Dicionario dicionario = new Dicionario();

        assertTrue(dicionario.obterNumeroDefinicoes() == 0);

        dicionario.adicionarPalavra("A", "AAAAAAA");
        dicionario.adicionarPalavra("B", "BBBBBBB");
        dicionario.adicionarPalavra("C", "CCCCCCC");
        dicionario.adicionarPalavra("D", "DDDDDDD");

        assertTrue(dicionario.obterNumeroDefinicoes() == 4);
    }

    @Test
    public void temQueRemoverPalavra() {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("A", "AAAAAAA");
        dicionario.adicionarPalavra("B", "BBBBBBB");
        dicionario.adicionarPalavra("C", "CCCCCCC");
        dicionario.adicionarPalavra("D", "DDDDDDD");

        assertTrue(dicionario.obterNumeroDefinicoes() == 4);

        dicionario.removerPalavra("A");
        dicionario.removerPalavra("B");

        assertTrue(dicionario.obterNumeroDefinicoes() == 2);
    }

    @Test
    public void temQueRetornarDefinicao() {        
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("A", "AAAAAAA");
        dicionario.adicionarPalavra("B", "BBBBBBB");
        dicionario.adicionarPalavra("C", "CCCCCCC");
        dicionario.adicionarPalavra("D", "DDDDDDD");
        
        assertEquals("AAAAAAA", dicionario.pesquisarPorPalavra("A"));
        assertEquals("BBBBBBB", dicionario.pesquisarPorPalavra("B"));
        assertEquals("CCCCCCC", dicionario.pesquisarPorPalavra("C"));
        assertEquals("DDDDDDD", dicionario.pesquisarPorPalavra("D"));
    }
}
