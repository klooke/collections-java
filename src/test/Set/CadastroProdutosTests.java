package test.Set;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import main.Set.Ordenacao.CadastroProdutos;
import main.Set.Ordenacao.Produto;

@Testable
public class CadastroProdutosTests {
    @Test
    public void temQueAdicionarProdutos() {
        CadastroProdutos produtos = new CadastroProdutos();

        assertTrue(produtos.obterQuantidadeProdutos() == 0);

        produtos.adicionarProduto(0, "AAAAA", 100, 40);
        produtos.adicionarProduto(0, "AAAAA", 100, 40); // Não pode adicionar

        assertTrue(produtos.obterQuantidadeProdutos() == 1);

        produtos.adicionarProduto(1, "DDDDD", 200, 30);
        produtos.adicionarProduto(2, "AAABB", 300, 20);
        produtos.adicionarProduto(3, "CCCAA", 400, 10);
        produtos.adicionarProduto(3, "CCCAA", 400, 10); // Não pode adicionar.

        assertTrue(produtos.obterQuantidadeProdutos() == 4);
    }

    @Test
    public void temQueOrdenarProdutosPorNome() {
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto(1000000, "AAAAA", 100, 40);
        produtos.adicionarProduto(1000001, "DDDDD", 200, 30);
        produtos.adicionarProduto(1000002, "AAABB", 300, 20);
        produtos.adicionarProduto(1000003, "CCCAA", 400, 10);

        Set<Produto> produtosOrdenadoPorNome = new LinkedHashSet<>();

        produtosOrdenadoPorNome.add(new Produto(1000000, "AAAAA", 100, 40));
        produtosOrdenadoPorNome.add(new Produto(1000002, "AAABB", 300, 20));
        produtosOrdenadoPorNome.add(new Produto(1000003, "CCCAA", 400, 10));
        produtosOrdenadoPorNome.add(new Produto(1000001, "DDDDD", 200, 30));

        assertFalse(Arrays.equals(produtos.obterProdutos().toArray(), produtosOrdenadoPorNome.toArray()));

        assertArrayEquals(produtos.exibirProdutosPorNome().toArray(), produtosOrdenadoPorNome.toArray());
    }

    @Test
    public void temQueOrdenarProdutosPorPreco() {
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto(1000000, "AAAAA", 400, 40);
        produtos.adicionarProduto(1000001, "DDDDD", 300, 30);
        produtos.adicionarProduto(1000002, "AAABB", 200, 20);
        produtos.adicionarProduto(1000003, "CCCAA", 100, 10);

        Set<Produto> produtosOrdenadoPorPreco = new LinkedHashSet<>();

        produtosOrdenadoPorPreco.add(new Produto(1000003, "CCCAA", 100, 10));
        produtosOrdenadoPorPreco.add(new Produto(1000002, "AAABB", 200, 20));
        produtosOrdenadoPorPreco.add(new Produto(1000001, "DDDDD", 300, 30));
        produtosOrdenadoPorPreco.add(new Produto(1000000, "AAAAA", 400, 40));

        assertFalse(Arrays.equals(produtos.obterProdutos().toArray(), produtosOrdenadoPorPreco.toArray()));

        assertArrayEquals(produtos.exibirProdutosPorPreco().toArray(), produtosOrdenadoPorPreco.toArray());
    }
}
