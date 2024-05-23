package test.Set;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import main.Set.Basic.ConjuntoPalavrasUnicas;

@Testable
public class ConjuntoPalavrasUnicasTests {
    @Test
    public void temQueAdicionarPalavras() {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        assertTrue(palavras.exibirPalavrasUnicas().size() == 0);

        palavras.adicionarPalavra("Teste A");
        palavras.adicionarPalavra("Teste A"); // Não deve adicionar.

        assertTrue(palavras.exibirPalavrasUnicas().size() == 1);

        palavras.adicionarPalavra("Teste B");
        palavras.adicionarPalavra("Teste C");
        palavras.adicionarPalavra("Teste D");
        palavras.adicionarPalavra("Teste D"); // Não deve adicionar.

        assertTrue(palavras.exibirPalavrasUnicas().size() == 4);
    }

    @Test
    public void temQueRemoverPalavras() {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        palavras.adicionarPalavra("Teste A");
        palavras.adicionarPalavra("Teste B");
        palavras.adicionarPalavra("Teste C");
        palavras.adicionarPalavra("Teste D");

        assertTrue(palavras.exibirPalavrasUnicas().size() == 4);

        palavras.removerPalavra("Teste A");
        palavras.removerPalavra("Teste C");

        assertTrue(palavras.exibirPalavrasUnicas().size() == 2);
    }

    @Test
    public void temQueAcharPalavra() {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        palavras.adicionarPalavra("Teste A");
        palavras.adicionarPalavra("Teste B");
        palavras.adicionarPalavra("Teste C");
        palavras.adicionarPalavra("Teste D");

        assertTrue(palavras.verificarPalavra("Teste A"));
        assertTrue(palavras.verificarPalavra("Teste B"));
        assertTrue(palavras.verificarPalavra("Teste C"));
        assertTrue(palavras.verificarPalavra("Teste D"));
    }
}
