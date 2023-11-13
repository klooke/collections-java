package main.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        palavras = new HashMap<String, Integer>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }

    public void exibirContagemPalavras() {
        for (String palavra : palavras.keySet()) {
            System.out.println(palavra + " - " + palavras.get(palavra));
        }
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;

        for (String palavra : palavras.keySet()) {
            if (palavraMaisFrequente == null || palavras.get(palavra) > palavras.get(palavraMaisFrequente)) {
                palavraMaisFrequente = palavra;
            }
        }

        return palavraMaisFrequente;
    }

    public int obterNumeroPalavras() {
        return palavras.size();
    }
}
