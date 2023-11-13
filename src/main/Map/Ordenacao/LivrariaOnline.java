package main.Map.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline() {
        livros = new HashMap<String, Livro>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        for (Entry<String, Livro> entry : livros.entrySet()) {
            String link = entry.getKey();
            Livro livro = entry.getValue();

            if (livro.obterTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(link);
                break;
            }
        }
    }

    public void exibirLivrosOrdenadosPorPreco() {
        List<Livro> livrosOrdenados = new ArrayList<>(livros.values());

        Collections.sort(livrosOrdenados);

        System.out.println("Livros ordenados por preço (crescente):");
        for (Livro livro : livrosOrdenados) {
            System.out.println(livro);
        }
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<Livro>();

        for (Livro livro : livros.values()) {
            if (livro.obterAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(livro);
            }
        }

        return livrosPorAutor;
    }

    public Livro obterLivroMaisCaro() {
        List<Livro> livrosOrdenados = new ArrayList<>(livros.values());

        Collections.sort(livrosOrdenados, Collections.reverseOrder());
        
        return livrosOrdenados.get(0);
    }

    public Livro obterLivroMaisBarato() {
        List<Livro> livrosOrdenados = new ArrayList<>(livros.values());

        Collections.sort(livrosOrdenados);
        
        return livrosOrdenados.get(0);
    }

    public int obterNumeroLivros() {
        return livros.size();
    }
}
