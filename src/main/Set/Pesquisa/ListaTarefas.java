package main.Set.Pesquisa;

import java.util.LinkedHashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas = new LinkedHashSet<>();

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        tarefas.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
    }

    public Set<Tarefa> exibirTarefas() {
        System.out.println("Tarefas:");
        tarefas.forEach(tarefa -> System.out.println(tarefa));
        return tarefas;
    }

    public int contarTarefas() {
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new LinkedHashSet<>();

        for (Tarefa tarefa : tarefas) {
            if (tarefa.getConclusao())
                tarefasConcluidas.add(tarefa);
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new LinkedHashSet<>();

        for (Tarefa tarefa : tarefas) {
            if (!tarefa.getConclusao())
                tarefasPendentes.add(tarefa);
        }

        return tarefasPendentes;
    }

    public Tarefa marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.setConclusao(true);
                return tarefa;
            }
        }

        return null;
    }

    public Tarefa marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.setConclusao(false);
                return tarefa;
            }
        }

        return null;
    }

    public Set<Tarefa> limparListaTarefas() {
        Set<Tarefa> tarefas = this.tarefas;
        this.tarefas.clear();
        return tarefas;
    }
}
