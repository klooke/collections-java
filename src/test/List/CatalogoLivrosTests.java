package test.List;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import main.List.Pesquisa.CatalogoLivros;

@Testable
public class CatalogoLivrosTests {
    @Test
    public void temQueAdicionarLivro() {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        assertTrue(catalogoLivros.obterNumeroLivros() == 0);
        
        catalogoLivros.adicionarLivro("Livro A", "Autor A", 2020);
        catalogoLivros.adicionarLivro("Livro B", "Autor A", 1990);
        catalogoLivros.adicionarLivro("Livro C", "Autor B", 2010);
        catalogoLivros.adicionarLivro("Livro D", "Autor C", 1999);

        assertTrue(catalogoLivros.obterNumeroLivros() == 4);
    }

    @Test
    public void temQueRetornarLivrosPorAutor() {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        
        catalogoLivros.adicionarLivro("Livro A", "Autor A", 2020);
        catalogoLivros.adicionarLivro("Livro B", "Autor A", 1990);
        catalogoLivros.adicionarLivro("Livro C", "Autor B", 2010);
        catalogoLivros.adicionarLivro("Livro D", "Autor C", 1999);

        var livrosPorAutor = catalogoLivros.pesquisarPorAutor("Autor A");
        assertTrue(livrosPorAutor.size() == 2);

        livrosPorAutor = catalogoLivros.pesquisarPorAutor("Autor B");
        assertTrue(livrosPorAutor.size() == 1);

        livrosPorAutor = catalogoLivros.pesquisarPorAutor("Autor C");
        assertTrue(livrosPorAutor.size() == 1);
    }

    @Test
    public void temQueRetornarLivrosPorAno() {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        
        catalogoLivros.adicionarLivro("Livro A", "Autor A", 2020);
        catalogoLivros.adicionarLivro("Livro B", "Autor A", 1990);
        catalogoLivros.adicionarLivro("Livro C", "Autor B", 2010);
        catalogoLivros.adicionarLivro("Livro D", "Autor C", 1999);

        var livrosPorAno = catalogoLivros.pesquisarPorIntervaloAnos(1900, 2000);
        assertTrue(livrosPorAno.size() == 2);

        livrosPorAno = catalogoLivros.pesquisarPorIntervaloAnos(2000, 3000);
        assertTrue(livrosPorAno.size() == 2);
        
        livrosPorAno = catalogoLivros.pesquisarPorIntervaloAnos(1800, 1900);
        assertTrue(livrosPorAno.size() == 0);
    }

    @Test
    public void temQueRetornarLivroPorTitulo() {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        
        catalogoLivros.adicionarLivro("Livro A", "Autor A", 2020);
        catalogoLivros.adicionarLivro("Livro B", "Autor A", 1990);
        catalogoLivros.adicionarLivro("Livro C", "Autor B", 2010);
        catalogoLivros.adicionarLivro("Livro D", "Autor C", 1999);

        var livroPorTitulo = catalogoLivros.pesquisarPorTitulo("Livro A");
        assertTrue(livroPorTitulo.getTitulo().equalsIgnoreCase("Livro A"));

        livroPorTitulo = catalogoLivros.pesquisarPorTitulo("Livro E");
        assertNull(livroPorTitulo);
    }
}
