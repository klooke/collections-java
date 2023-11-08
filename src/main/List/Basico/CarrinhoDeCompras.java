package main.List.Basico;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<Item>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getNome().equalsIgnoreCase(nome)) {
                itens.remove(i);
                break;
            }
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;

        for (Item item : itens) {
            valorTotal += item.getValorTotal();
        }

        return valorTotal;
    }

    public double obterQuantidadeDeItens() {
        return itens.size();
    }

    public void exibirItens() {
        System.out.println(itens);
    }
}
