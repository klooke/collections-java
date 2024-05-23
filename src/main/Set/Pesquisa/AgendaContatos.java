package main.Set.Pesquisa;

import java.util.LinkedHashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos = new LinkedHashSet<>();

    public void adionarContato(String nome, int numero) {
        contatos.add(new Contato(nome, numero));
    }

    public Set<Contato> exibirContatos() {
        System.out.println("Contatos:");
        contatos.forEach(contato -> System.out.println(contato));
        return contatos;
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosEncontrados = new LinkedHashSet<>();

        for (Contato contato : contatos) {
            if (contato.getNome().contains(nome))
                contatosEncontrados.add(contato);
        }

        return contatosEncontrados;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                contato.setNumero(novoNumero);

                return contato;
            }

        }

        return null;
    }
}
