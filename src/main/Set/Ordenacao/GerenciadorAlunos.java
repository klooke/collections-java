package main.Set.Ordenacao;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos = new TreeSet<>();

    public void adicionarAluno(String nome, long matricula, double media) {
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        alunos.removeIf(aluno -> aluno.getMatricula() == matricula);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        System.out.println("Alunos ordenado por nome:");
        Set<Aluno> alunosOrdenadosPorNome = new TreeSet<>(new Comparator<Aluno>() {

            @Override
            public int compare(Aluno o1, Aluno o2) {
                return o1.getNome().compareTo(o2.getNome());
            }

        });
        alunosOrdenadosPorNome.addAll(alunos);
        alunosOrdenadosPorNome.forEach(aluno -> System.out.println(aluno));
        return alunosOrdenadosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        System.out.println("Alunos ordenado por nota:");
        Set<Aluno> alunosOrdenadosPorNota = new TreeSet<>(new Comparator<Aluno>() {

            // Descrecente
            @Override
            public int compare(Aluno o1, Aluno o2) {
                return o2.getMedia().compareTo(o1.getMedia());
            }

        });
        alunosOrdenadosPorNota.addAll(alunos);
        alunosOrdenadosPorNota.forEach(aluno -> System.out.println(aluno));
        return alunosOrdenadosPorNota;
    }

    public Set<Aluno> exibirAlunos() {
        System.out.println("Alunos:");
        alunos.forEach(aluno -> System.out.println(aluno));
        return alunos;
    }
}
