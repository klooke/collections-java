package test.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import main.List.Ordenacao.OrdenacaoPessoas;
import main.List.Ordenacao.Pessoa;

@Testable
public class OrdenacaoPessoasTests {
    @Test
    public void temQueAdicionarPessoas() {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        assertTrue(ordenacaoPessoas.obterNumeroPessoas() == 0);

        ordenacaoPessoas.adicionarPessoa("Pessoa 1", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Pessoa 2", 26, 1.85);
        ordenacaoPessoas.adicionarPessoa("Pessoa 3", 54, 1.62);
        ordenacaoPessoas.adicionarPessoa("Pessoa 4", 34, 1.90);

        assertTrue(ordenacaoPessoas.obterNumeroPessoas() == 4);
    }

    @Test
    public void temQueOrdenarPorIdade() {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Pessoa 1", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Pessoa 2", 26, 1.85);
        ordenacaoPessoas.adicionarPessoa("Pessoa 3", 54, 1.62);
        ordenacaoPessoas.adicionarPessoa("Pessoa 4", 34, 1.90);

        List<Pessoa> expectedOrdenacao = List.of(
            new Pessoa("Pessoa 1", 20, 1.56),
            new Pessoa("Pessoa 2", 26, 1.85),
            new Pessoa("Pessoa 4", 34, 1.90),
            new Pessoa("Pessoa 3", 54, 1.62)
        );

        assertEquals(expectedOrdenacao, ordenacaoPessoas.ordenarPorIdade());
    }

    @Test
    public void temQueOrdenarPorAltura() {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Pessoa 1", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Pessoa 2", 26, 1.85);
        ordenacaoPessoas.adicionarPessoa("Pessoa 3", 54, 1.62);
        ordenacaoPessoas.adicionarPessoa("Pessoa 4", 34, 1.90);

        List<Pessoa> expectedOrdenacao = List.of(
            new Pessoa("Pessoa 1", 20, 1.56),
            new Pessoa("Pessoa 3", 54, 1.62),
            new Pessoa("Pessoa 2", 26, 1.85),
            new Pessoa("Pessoa 4", 34, 1.90)
        );

        assertEquals(expectedOrdenacao, ordenacaoPessoas.ordernarPorAltura());
    }
}
