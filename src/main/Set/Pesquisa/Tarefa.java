package main.Set.Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean foiConcluida = false;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean getConclusao() {
        return foiConcluida;
    }

    public void setConclusao(boolean foiConcluida) {
        this.foiConcluida = foiConcluida;
    }

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + ", foiConcluida=" + foiConcluida + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarefa other = (Tarefa) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        return true;
    }
}
