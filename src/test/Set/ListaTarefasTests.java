package test.Set;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import main.Set.Pesquisa.ListaTarefas;

@Testable
public class ListaTarefasTests {
    @Test
    public void temQueAdicionarTarefa() {
        ListaTarefas tarefas = new ListaTarefas();

        assertTrue(tarefas.contarTarefas() == 0);

        tarefas.adicionarTarefa("Teste A");
        tarefas.adicionarTarefa("Teste A"); // Não pode adicionar.

        assertTrue(tarefas.contarTarefas() == 1);

        tarefas.adicionarTarefa("Teste B");
        tarefas.adicionarTarefa("Teste C");
        tarefas.adicionarTarefa("Teste D");
        tarefas.adicionarTarefa("Teste D"); // Não pode adicionar.

        assertTrue(tarefas.contarTarefas() == 4);
    }

    @Test
    public void temQueRemoverTarefa() {
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("Teste A");
        tarefas.adicionarTarefa("Teste B");
        tarefas.adicionarTarefa("Teste C");
        tarefas.adicionarTarefa("Teste D");

        assertTrue(tarefas.contarTarefas() == 4);

        tarefas.removerTarefa("Teste A");
        tarefas.removerTarefa("Teste D");

        assertTrue(tarefas.contarTarefas() == 2);
    }

    @Test
    public void temQueObterTarefasConcluidas() {
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("Teste A");
        tarefas.adicionarTarefa("Teste B");
        tarefas.adicionarTarefa("Teste C");
        tarefas.adicionarTarefa("Teste D");

        assertTrue(tarefas.obterTarefasConcluidas().size() == 0);

        tarefas.marcarTarefaConcluida("Teste A");
        tarefas.marcarTarefaConcluida("Teste B");

        assertTrue(tarefas.obterTarefasConcluidas().size() == 2);
    }

    @Test
    public void temQueObterTarefasPendentes() {
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("Teste A");
        tarefas.adicionarTarefa("Teste B");
        tarefas.adicionarTarefa("Teste C");
        tarefas.adicionarTarefa("Teste D");

        tarefas.marcarTarefaConcluida("Teste A");
        tarefas.marcarTarefaConcluida("Teste B");

        assertTrue(tarefas.obterTarefasPendentes().size() == 2);
        
        tarefas.marcarTarefaPendente("Teste A");
        tarefas.marcarTarefaPendente("Teste B");

        assertTrue(tarefas.obterTarefasPendentes().size() == 4);
    }

    @Test
    public void temQueLimparListaTarefas() {
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("Teste A");
        tarefas.adicionarTarefa("Teste B");
        tarefas.adicionarTarefa("Teste C");
        tarefas.adicionarTarefa("Teste D");

        assertTrue(tarefas.contarTarefas() == 4);

        tarefas.limparListaTarefas();

        assertTrue(tarefas.contarTarefas() == 0);
    }
}
