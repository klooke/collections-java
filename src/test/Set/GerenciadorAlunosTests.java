package test.Set;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import main.Set.Ordenacao.Aluno;
import main.Set.Ordenacao.GerenciadorAlunos;

@Testable
public class GerenciadorAlunosTests {
    @Test
    public void temQueAdicionarAlunos() {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        assertTrue(alunos.exibirAlunos().size() == 0);

        alunos.adicionarAluno("Teste A", 100000, 5.0);
        alunos.adicionarAluno("Teste A", 100000, 7.0); // Não pode adicionar

        assertTrue(alunos.exibirAlunos().size() == 1);

        alunos.adicionarAluno("Teste B", 100001, 5.7);
        alunos.adicionarAluno("Teste C", 100002, 8.0);
        alunos.adicionarAluno("Teste D", 100003, 3.5);
        alunos.adicionarAluno("Teste D", 100003, 10.0); // Não pode adicionar

        assertTrue(alunos.exibirAlunos().size() == 4);
    }

    @Test
    public void temQueRemoverAlunos() {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("Teste A", 100000, 5.0);
        alunos.adicionarAluno("Teste B", 100001, 5.7);
        alunos.adicionarAluno("Teste C", 100002, 8.0);
        alunos.adicionarAluno("Teste D", 100003, 3.5);

        assertTrue(alunos.exibirAlunos().size() == 4);

        alunos.removerAluno(100001);
        alunos.removerAluno(100002);

        assertTrue(alunos.exibirAlunos().size() == 2);
    }

    @Test
    public void temQueOrdenarAlunosPorNome() {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("Teste D", 100003, 5.0);
        alunos.adicionarAluno("Teste B", 100002, 5.7);
        alunos.adicionarAluno("Teste A", 100001, 8.0);
        alunos.adicionarAluno("Teste C", 100000, 3.5);

        Set<Aluno> alunosOrdenadosPorNome = new LinkedHashSet<>();

        alunosOrdenadosPorNome.add(new Aluno("Teste A", 100001, 5.0));
        alunosOrdenadosPorNome.add(new Aluno("Teste B", 100002, 5.7));
        alunosOrdenadosPorNome.add(new Aluno("Teste C", 100000, 8.0));
        alunosOrdenadosPorNome.add(new Aluno("Teste D", 100003, 3.5));

        assertFalse(Arrays.equals(alunos.exibirAlunos().toArray(), alunosOrdenadosPorNome.toArray()));

        assertArrayEquals(alunos.exibirAlunosPorNome().toArray(), alunosOrdenadosPorNome.toArray());
    }

    @Test
    public void temQueOrdenarAlunosPorNota() {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("Teste D", 100003, 5.0);
        alunos.adicionarAluno("Teste B", 100002, 5.7);
        alunos.adicionarAluno("Teste A", 100001, 8.0);
        alunos.adicionarAluno("Teste C", 100000, 3.5);

        Set<Aluno> alunosOrdenadosPorNota = new LinkedHashSet<>();

        alunosOrdenadosPorNota.add(new Aluno("Teste A", 100001, 8.0));
        alunosOrdenadosPorNota.add(new Aluno("Teste B", 100002, 5.7));
        alunosOrdenadosPorNota.add(new Aluno("Teste D", 100003, 5.0));
        alunosOrdenadosPorNota.add(new Aluno("Teste C", 100000, 3.5));

        assertFalse(Arrays.equals(alunos.exibirAlunos().toArray(), alunosOrdenadosPorNota.toArray()));

        assertArrayEquals(alunos.exibirAlunosPorNota().toArray(), alunosOrdenadosPorNota.toArray());
    }
}
