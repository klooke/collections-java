package test.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import main.Set.Basic.ConjuntoConvidados;
import main.Set.Basic.Convidado;

@Testable
public class ConjuntoConvidadosTests {
    @Test
    public void temQueAdicionarConvidado() {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        assertTrue(convidados.contarConvidados() == 0);

        convidados.adicionarConvidado("Teste A", 1);
        convidados.adicionarConvidado("Teste E", 1); // Não pode adicionar.

        assertTrue(convidados.contarConvidados() == 1);

        convidados.adicionarConvidado("Teste B", 2);
        convidados.adicionarConvidado("Teste C", 3);
        convidados.adicionarConvidado("Teste D", 4);
        convidados.adicionarConvidado("Teste C", 3); // Não pode adicionar.

        assertTrue(convidados.contarConvidados() == 4);
    }

    @Test
    public void temQueRemoverConvidadoPeloConvite() {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Teste A", 1);
        convidados.adicionarConvidado("Teste B", 2);
        convidados.adicionarConvidado("Teste C", 3);
        convidados.adicionarConvidado("Teste D", 4);

        Convidado convidadoRemovido = new Convidado("Teste C", 3);

        assertTrue(convidados.contarConvidados() == 4);
        assertTrue(convidados.exibirConvidados().contains(convidadoRemovido));

        convidados.removerConvidadoPorCodigoConvite(3); // Tem que remover o Teste C.

        assertTrue(convidados.contarConvidados() == 3);
        assertFalse(convidados.exibirConvidados().contains(convidadoRemovido));
    }
}
