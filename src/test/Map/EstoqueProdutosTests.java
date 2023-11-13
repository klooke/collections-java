package test.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import main.Map.Pesquisa.EstoqueProdutos;
import main.Map.Pesquisa.Produto;

@Testable
public class EstoqueProdutosTests {
    @Test
    public void temQueAdicionarProduto() {
        EstoqueProdutos estoque = new EstoqueProdutos();

        assertTrue(estoque.obterNumeroProdutos() == 0);

        estoque.adicionarProduto(0, "Produto A", 1, 1000);
        estoque.adicionarProduto(1, "Produto B", 10, 100);
        estoque.adicionarProduto(2, "Produto C", 100, 10);
        estoque.adicionarProduto(3, "Produto D", 1000, 1);

        assertTrue(estoque.obterNumeroProdutos() == 4);
    }

    @Test
    public void temQueRetornarValorTotalDoEstoque() {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(0, "Produto A", 1, 1000);
        estoque.adicionarProduto(1, "Produto B", 10, 100);
        estoque.adicionarProduto(2, "Produto C", 100, 10);
        estoque.adicionarProduto(3, "Produto D", 1000, 1);

        assertTrue(estoque.calcularValorTotalEstoque() == 4000);
    }

    @Test
    public void temQueRetornarProdutoMaisCaro() {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(0, "Produto A", 1, 1000);
        estoque.adicionarProduto(1, "Produto B", 10, 100);
        estoque.adicionarProduto(2, "Produto C", 100, 10);
        estoque.adicionarProduto(3, "Produto D", 1000, 1);

        assertEquals(new Produto("Produto A", 1, 1000), estoque.obterProdutoMaisCaro());
    }

    @Test
    public void temQueRetornarProdutoMaisBarato() {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(0, "Produto A", 1, 1000);
        estoque.adicionarProduto(1, "Produto B", 10, 100);
        estoque.adicionarProduto(2, "Produto C", 100, 10);
        estoque.adicionarProduto(3, "Produto D", 1000, 1);

        assertEquals(new Produto("Produto D", 1000, 1), estoque.obterProdutoMaisBarato());
    }

    @Test
    public void temQueRetornarProdutoComMaiorValorTotalDoEstoque() {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(0, "Produto A", 1, 1000);
        estoque.adicionarProduto(1, "Produto B", 1, 100);
        estoque.adicionarProduto(2, "Produto C", 1, 10);
        estoque.adicionarProduto(3, "Produto D", 10000, 1);

        assertEquals(            
            new Produto("Produto D", 10000, 1),
            estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque()
        );
    }
}
