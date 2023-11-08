package main.List.Basico;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas;

    public ListaTarefas() {
        tarefas = new ArrayList<Tarefa>();
    }
    
    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }
    
    public void removerTarefa(String descricao) {
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getDescricao().equalsIgnoreCase(descricao)) {
                tarefas.remove(i);
                break;
            }
        }
    }
    
    public int obterNumeroTotalTarefas() {
        return tarefas.size();
    }
    
    public List<String> obterDescricoesTarefas() {
        List<String> descricoes = new ArrayList<String>();

        for (Tarefa tarefa : tarefas) {
            descricoes.add(tarefa.getDescricao());
        }

        return descricoes;
    }
}
