package main.Map.Basic;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> definicoes;

    public Dicionario() {
        definicoes = new HashMap<String, String>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        definicoes.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        definicoes.remove(palavra);
    }

    public void exibirPalavras() {
        for (String palavra : definicoes.keySet()) {
            System.out.println(palavra + " - " + definicoes.get(palavra));
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        return definicoes.get(palavra);
    }

    public int obterNumeroDefinicoes() {
        return definicoes.size();
    }
}
