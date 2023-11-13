package main.Map.Pesquisa;

public class Produto implements Comparable<Produto> {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double obterPreco() {
        return preco;
    }

    public double obterValorTotal() {
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }

    @Override
    public int compareTo(Produto p) {
        if (this.preco > p.obterPreco()) return 1;
        else if (this.preco < p.obterPreco()) return -1;

        return 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Produto other = (Produto) obj;

        if (nome == null || other.nome == null)
            return false;
        else if (!nome.equalsIgnoreCase(other.nome))
            return false;
            
        return true;
    }
}
