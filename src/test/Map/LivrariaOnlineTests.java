package test.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import main.Map.Ordenacao.LivrariaOnline;
import main.Map.Ordenacao.Livro;

@Testable
public class LivrariaOnlineTests {
    @Test
    public void temQueAdicionarLivro() {
        LivrariaOnline livraria = new LivrariaOnline();

        assertTrue(livraria.obterNumeroLivros() == 0);

        livraria.adicionarLivro("A.com", "Titulo A", "Autor A", 1);
        livraria.adicionarLivro("B.com", "Titulo B", "Autor A", 10);
        livraria.adicionarLivro("C.com", "Titulo C", "Autor B", 100);
        livraria.adicionarLivro("D.com", "Titulo D", "Autor C", 1000);

        assertTrue(livraria.obterNumeroLivros() == 4);
    }

    @Test
    public void temQueRemoverLivro() {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("A.com", "Titulo A", "Autor A", 1);
        livraria.adicionarLivro("B.com", "Titulo B", "Autor A", 10);
        livraria.adicionarLivro("C.com", "Titulo C", "Autor B", 100);
        livraria.adicionarLivro("D.com", "Titulo D", "Autor C", 1000);

        assertTrue(livraria.obterNumeroLivros() == 4);

        livraria.removerLivro("Titulo A");
        livraria.removerLivro("Titulo B");

        assertTrue(livraria.obterNumeroLivros() == 2);
    }

    @Test
    public void temQueRetornarLivrosPorAutor() {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("A.com", "Titulo A", "Autor A", 1);
        livraria.adicionarLivro("B.com", "Titulo B", "Autor A", 10);
        livraria.adicionarLivro("C.com", "Titulo C", "Autor B", 100);
        livraria.adicionarLivro("D.com", "Titulo D", "Autor C", 1000);

        assertTrue(livraria.pesquisarLivrosPorAutor("Autor A").size() == 2);
        assertTrue(livraria.pesquisarLivrosPorAutor("Autor B").size() == 1);
        assertTrue(livraria.pesquisarLivrosPorAutor("Autor C").size() == 1);
    }

    @Test
    public void temQueRetornarLivroMaisCaro() {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("A.com", "Titulo A", "Autor A", 1);
        livraria.adicionarLivro("B.com", "Titulo B", "Autor A", 10);
        livraria.adicionarLivro("C.com", "Titulo C", "Autor B", 100);
        livraria.adicionarLivro("D.com", "Titulo D", "Autor C", 1000);

        assertEquals(new Livro("Titulo D", "Autor C", 1000), livraria.obterLivroMaisCaro());
    }

    @Test
    public void temQueRetornarLivroMaisBarato() {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("A.com", "Titulo A", "Autor A", 1);
        livraria.adicionarLivro("B.com", "Titulo B", "Autor A", 10);
        livraria.adicionarLivro("C.com", "Titulo C", "Autor B", 100);
        livraria.adicionarLivro("D.com", "Titulo D", "Autor C", 1000);

        assertEquals(new Livro("Titulo A", "Autor A", 1), livraria.obterLivroMaisBarato());
    }
}
