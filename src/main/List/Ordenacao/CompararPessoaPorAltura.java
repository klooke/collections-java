package main.List.Ordenacao;

import java.util.Comparator;

public class CompararPessoaPorAltura implements Comparator<Pessoa> {
    public int compare(Pessoa o1, Pessoa o2) {
        if (o1.getAltura() < o2.getAltura()) return -1;
        else if (o2.getAltura() > o2.getAltura()) return 1;
        return 0;
    }    
}
