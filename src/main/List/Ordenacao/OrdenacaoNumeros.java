package main.List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        numeros = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosOrdenadosAsc = numeros;

        Collections.sort(numerosOrdenadosAsc);
        
        return numerosOrdenadosAsc;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosOrdenadosDesc = numeros;

        Collections.sort(numerosOrdenadosDesc, Comparator.reverseOrder());
        
        return numerosOrdenadosDesc;
    }

    public int obterQuantidadeNumeros() {
        return numeros.size();
    }
}
