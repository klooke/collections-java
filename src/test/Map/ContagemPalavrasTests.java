package test.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import main.Map.Pesquisa.ContagemPalavras;

@Testable
public class ContagemPalavrasTests {
    @Test
    public void temQueAdicionarPalavra() {
        ContagemPalavras palavras = new ContagemPalavras();

        assertTrue(palavras.obterNumeroPalavras() == 0);

        palavras.adicionarPalavra("A", 1);
        palavras.adicionarPalavra("B", 10);
        palavras.adicionarPalavra("C", 100);
        palavras.adicionarPalavra("D", 1000);

        assertTrue(palavras.obterNumeroPalavras() == 4);
    }

    @Test
    public void temQueRemoverPalavra() {
        ContagemPalavras palavras = new ContagemPalavras();

        palavras.adicionarPalavra("A", 1);
        palavras.adicionarPalavra("B", 10);
        palavras.adicionarPalavra("C", 100);
        palavras.adicionarPalavra("D", 1000);

        assertTrue(palavras.obterNumeroPalavras() == 4);

        palavras.removerPalavra("A");
        palavras.removerPalavra("B");

        assertTrue(palavras.obterNumeroPalavras() == 2);
    }

    @Test
    public void temQueRetornarPalavraMaisFrequente() {
        ContagemPalavras palavras = new ContagemPalavras();

        palavras.adicionarPalavra("A", 1);
        palavras.adicionarPalavra("B", 10);
        palavras.adicionarPalavra("C", 100);
        palavras.adicionarPalavra("D", 1000);

        assertEquals("D", palavras.encontrarPalavraMaisFrequente());
    }
}
