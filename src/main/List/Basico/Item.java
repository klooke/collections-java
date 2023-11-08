package main.List.Basico;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getValorTotal() {
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return "Item [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }
}
