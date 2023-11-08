package test.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import main.List.Ordenacao.OrdenacaoNumeros;

@Testable
public class OrdenacaoNumerosTests {
    @Test
    public void temQueAdicionarNumeros() {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        assertTrue(ordenacaoNumeros.obterQuantidadeNumeros() == 0);

        ordenacaoNumeros.adicionarNumero(0);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(100);
        ordenacaoNumeros.adicionarNumero(-1);
        ordenacaoNumeros.adicionarNumero(-10);
        ordenacaoNumeros.adicionarNumero(-100);

        assertTrue(ordenacaoNumeros.obterQuantidadeNumeros() == 7);
    }

    @Test
    public void temQueOrdenarNumerosAscendente() {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(0);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(100);
        ordenacaoNumeros.adicionarNumero(-1);
        ordenacaoNumeros.adicionarNumero(-10);
        ordenacaoNumeros.adicionarNumero(-100);

        List<Integer> expectedOrdenacao = List.of(-100, -10, -1, 0, 1, 10, 100);

        assertEquals(expectedOrdenacao, ordenacaoNumeros.ordenarAscendente());
    }

    @Test
    public void temQueOrdenarNumerosDescendente() {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(0);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(100);
        ordenacaoNumeros.adicionarNumero(-1);
        ordenacaoNumeros.adicionarNumero(-10);
        ordenacaoNumeros.adicionarNumero(-100);

        List<Integer> expectedOrdenacao = List.of(100, 10, 1, 0, -1, -10, -100);

        assertEquals(expectedOrdenacao, ordenacaoNumeros.ordenarDescendente());
    }
}
