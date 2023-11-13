package main.Map.Ordenacao;

public class Evento {
    private String nome, atracao;

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result += ((atracao == null) ? 0 : atracao.hashCode());
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

        Evento other = (Evento) obj;

        if (nome == null || other.nome == null)
            return false;
        else if (!nome.equals(other.nome))
            return false;

        if (atracao == null || other.atracao == null)
            return false;
        else if (!atracao.equalsIgnoreCase(other.atracao))
            return false;

        return true;
    }
}
