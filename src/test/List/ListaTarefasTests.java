package test.List;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import main.List.Basico.ListaTarefas;

@Testable
public class ListaTarefasTests {
    @Test
    public void temQueAdicionarTarefa() {
        ListaTarefas lista = new ListaTarefas();
        
        assertTrue(lista.obterNumeroTotalTarefas() == 0);

        lista.adicionarTarefa("Adicionar 1");
        lista.adicionarTarefa("Adicionar 2");
        
        assertTrue(lista.obterNumeroTotalTarefas() == 2);
    }

    @Test
    public void temQueRemoverTarefa() {
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Remover 1");        
        lista.adicionarTarefa("Remover 2");

        assertTrue(lista.obterNumeroTotalTarefas() == 2);

        lista.removerTarefa("Não existe");

        assertTrue(lista.obterNumeroTotalTarefas() == 2);

        lista.removerTarefa("Remover 1");        
        lista.removerTarefa("Remover 2");
        
        assertTrue(lista.obterNumeroTotalTarefas() == 0);
    }

    @Test
    public void temQueRetornarListaDescricoes() {
        String descricao1 = "Descrição de uma tarefa 1";
        String descricao2 = "Descrição de uma tarefa 2";

        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa(descricao1);
        lista.adicionarTarefa(descricao2);

        assertEquals(lista.obterDescricoesTarefas().get(0), descricao1);
        assertEquals(lista.obterDescricoesTarefas().get(1), descricao2);
    }
}
