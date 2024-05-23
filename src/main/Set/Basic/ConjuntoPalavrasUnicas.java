package main.Set.Basic;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras = new HashSet<>();

    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        return palavras.contains(palavra);
    }

    public Set<String> exibirPalavrasUnicas() {
        System.out.println("Palavras unicas:");
        palavras.forEach(palavra -> System.out.println(palavra));
        return palavras;
    }
}
