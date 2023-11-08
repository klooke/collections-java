package test.List;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import main.List.Basico.CarrinhoDeCompras;

@Testable
public class CarrinhoDeComprasTests {
    @Test
    public void temQueAdicionarItens() {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        assertTrue(carrinhoDeCompras.obterQuantidadeDeItens() == 0);

        carrinhoDeCompras.adicionarItem("Item 1", 2.50, 10);
        carrinhoDeCompras.adicionarItem("Item 2", 100, 1);

        assertTrue(carrinhoDeCompras.obterQuantidadeDeItens() == 2);
    }

    @Test
    public void temQueRemoverItem() {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Item 1", 2.50, 10);
        carrinhoDeCompras.adicionarItem("Item 2", 100, 1);

        assertTrue(carrinhoDeCompras.obterQuantidadeDeItens() == 2);

        carrinhoDeCompras.removerItem("Item 1");
        carrinhoDeCompras.removerItem("item 2");
        
        assertTrue(carrinhoDeCompras.obterQuantidadeDeItens() == 0);
    }

    @Test
    public void temQueRetornarValorTotal() {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        assertTrue(carrinhoDeCompras.calcularValorTotal() == 0);

        carrinhoDeCompras.adicionarItem("Item 1", 2.50, 10);
        carrinhoDeCompras.adicionarItem("Item 2", 100, 1);
        
        assertTrue(carrinhoDeCompras.calcularValorTotal() == (2.50 * 10) + (100 * 1));
    }
}
