package main.Set.Basic;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados = new HashSet<Convidado>();

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        convidados.removeIf(convidado -> convidado.getConvite() == codigoConvite);
    }

    public int contarConvidados() {
        int size = convidados.size();
        System.out.println("Existem " + size + " convidados!");
        return size;
    }

    public Set<Convidado> exibirConvidados() {
        System.out.println("Lista de convidados: ");
        convidados.forEach(convidado -> System.out.println(convidado));
        return convidados;
    }
}
