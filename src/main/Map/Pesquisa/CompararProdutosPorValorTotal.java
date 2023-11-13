package main.Map.Pesquisa;

import java.util.Comparator;

public class CompararProdutosPorValorTotal implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        if (p1.obterValorTotal() > p2.obterValorTotal()) return 1;
        else if (p1.obterValorTotal() < p2.obterValorTotal()) return -1;

        return 0;
    }
    
}