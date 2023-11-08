package main.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        numeros = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int resultado = 0;

        for (int numero : numeros) {
            resultado += numero;
        }

        return resultado;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;

        for (int numero : numeros) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;

        for (int numero : numeros) {
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }

        return menorNumero;
    }

    public List<Integer> exibirNumeros() {
        return numeros;
    }
}
