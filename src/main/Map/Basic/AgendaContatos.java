package main.Map.Basic;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;

    public AgendaContatos() {
        contatos = new HashMap<String, Integer>();
    }

    public void adicionarContato(String nome, int telefone){
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        contatos.remove(nome);
    }

    public void exibirContatos() {
        for (String nome : contatos.keySet()) {
            System.out.println(nome + " - " + contatos.get(nome));
        }
    }

    public int pesquisarPorNome(String nome) {
        return contatos.get(nome);
    }

    public int obterNumeroContatos() {
        return contatos.size();
    }
}
