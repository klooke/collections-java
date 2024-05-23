package main.Set.Ordenacao;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos = new TreeSet<>();

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtos.add(new Produto(cod, nome, preco, quantidade));
    }

    public int obterQuantidadeProdutos() {
        return produtos.size();
    }

    public Set<Produto> obterProdutos() {
        return produtos;
    }

    public Set<Produto> exibirProdutosPorNome() {
        System.out.println("Produtos ordenado por nome:");
        Set<Produto> produtosOrdenadoPorNome = new TreeSet<>(new Comparator<Produto>() {

            @Override
            public int compare(Produto o1, Produto o2) {
                return o1.getNome().compareTo(o2.getNome());
            }

        });
        produtosOrdenadoPorNome.addAll(produtos);
        produtosOrdenadoPorNome.forEach(produto -> System.out.println(produto));
        return produtosOrdenadoPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        System.out.println("Produtos ordenado por preco:");
        Set<Produto> produtosOrdenadoPorPreco = new TreeSet<>(new Comparator<Produto>() {

            @Override
            public int compare(Produto o1, Produto o2) {
                return o1.getPreco().compareTo(o2.getPreco());
            }

        });
        produtosOrdenadoPorPreco.addAll(produtos);
        produtosOrdenadoPorPreco.forEach(produto -> System.out.println(produto));
        return produtosOrdenadoPorPreco;
    }
}
