package main.Map.Ordenacao;

public class Livro implements Comparable<Livro> {
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result += ((autor == null) ? 0 : autor.hashCode());
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

        Livro other = (Livro) obj;

        if (titulo == null || other.titulo == null)
            return false;
        else if (!titulo.equalsIgnoreCase(other.titulo))
            return false;

        if (autor == null || other.autor == null)
            return false;
        else if (!autor.equalsIgnoreCase(other.autor))
            return false;

        return true;
    }

    private String titulo, autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;    
    }

    public String obterTitulo() {
        return titulo;
    }

    public String obterAutor() {
        return autor;
    }

    public double obterPreco() {
        return preco;
    }

    @Override
    public int compareTo(Livro l) {
        if (this.preco > l.obterPreco()) return 1;
        else if (this.preco < l.obterPreco()) return -1;

        return 0;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + "]";
    }
}
