package main.Map.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> produtos;

    public EstoqueProdutos() {
        produtos = new HashMap<Long, Produto>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtos.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        for (long cod : produtos.keySet()) {
            System.out.println(cod + " - " + produtos.get(cod));
        }
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;

        for (Produto produto : produtos.values()) {
            valorTotal += produto.obterValorTotal();
        }

        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        List<Produto> produtoDoMaisCaro = new ArrayList<>(produtos.values());

        Collections.sort(produtoDoMaisCaro, Collections.reverseOrder());

        return produtoDoMaisCaro.get(0);
    }

    public Produto obterProdutoMaisBarato() {
        List<Produto> produtoDoMaisCaro = new ArrayList<>(produtos.values());

        Collections.sort(produtoDoMaisCaro);

        return produtoDoMaisCaro.get(0);
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        List<Produto> produtoDoMaisCaro = new ArrayList<>(produtos.values());

        Collections.sort(produtoDoMaisCaro, Collections.reverseOrder(new CompararProdutosPorValorTotal()));        

        return produtoDoMaisCaro.get(0);
    }

    public int obterNumeroProdutos() {
        return produtos.size();
    }
}
