package test.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import main.List.Pesquisa.SomaNumeros;

@Testable
public class SomaNumerosTests {
    @Test
    public void temQueAdicionarNumero() {
        SomaNumeros somaNumeros = new SomaNumeros();
        assertTrue(somaNumeros.exibirNumeros().size() == 0);

        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
                
        assertTrue(somaNumeros.exibirNumeros().size() == 3);
    }

    @Test
    public void temQueSomarOsNumeros() {
        SomaNumeros somaNumeros = new SomaNumeros();
        assertTrue(somaNumeros.calcularSoma() == 0);

        somaNumeros.adicionarNumero(1);
        assertTrue(somaNumeros.calcularSoma() == 1);
        
        somaNumeros.adicionarNumero(10);
        assertTrue(somaNumeros.calcularSoma() == 11);

        somaNumeros.adicionarNumero(-10);
        assertTrue(somaNumeros.calcularSoma() == 1);

        somaNumeros.adicionarNumero(1000);
        assertTrue(somaNumeros.calcularSoma() == 1001);
    }

    @Test
    public void temQueRetornarMaiorNumero() {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(100);
        somaNumeros.adicionarNumero(-1);
        somaNumeros.adicionarNumero(-100);

        assertTrue(somaNumeros.encontrarMaiorNumero() == 100);
    }

    @Test
    public void temQueRetornarMenorNumero() {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(100);
        somaNumeros.adicionarNumero(-1);
        somaNumeros.adicionarNumero(-100);

        assertTrue(somaNumeros.encontrarMenorNumero() == -100);
    }

    @Test
    public void temQueRetornarListaNumeros() {
        SomaNumeros somaNumeros = new SomaNumeros();
        List<Integer> expectedNum = List.of(1, 10, 100, -1, -10, -100);

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(100);
        somaNumeros.adicionarNumero(-1);
        somaNumeros.adicionarNumero(-10);
        somaNumeros.adicionarNumero(-100);

        assertEquals(expectedNum, somaNumeros.exibirNumeros());
    }
}
