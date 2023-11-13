package test.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import main.Map.Ordenacao.AgendaEventos;
import main.Map.Ordenacao.Evento;

@Testable
public class AgendaEventosTests {
    @Test
    public void temQueAdicionarEvento() {
        AgendaEventos eventos = new AgendaEventos();

        assertTrue(eventos.obterNumeroEventos() == 0);

        eventos.adicionarEvento(LocalDate.of(2022, 12, 21), "Evento A", "AAAAAAA");
        eventos.adicionarEvento(LocalDate.of(2023, 1, 21), "Evento B", "BBBBBBB");
        eventos.adicionarEvento(LocalDate.of(2023, 6, 21), "Evento C", "CCCCCCC");
        eventos.adicionarEvento(LocalDate.now(), "Evento D", "DDDDDDD");

        assertTrue(eventos.obterNumeroEventos() == 4);
    }

    @Test
    public void temQueRetornarProximoEvento() {
        AgendaEventos eventos = new AgendaEventos();
        
        eventos.adicionarEvento(LocalDate.of(2022, 12, 21), "Evento A", "AAAAAAA");
        eventos.adicionarEvento(LocalDate.of(2023, 1, 21), "Evento B", "BBBBBBB");
        eventos.adicionarEvento(LocalDate.of(2023, 6, 21), "Evento C", "CCCCCCC");
        eventos.adicionarEvento(LocalDate.ofYearDay(9999, 31), "Evento D", "DDDDDDD");

        assertEquals(new Evento("Evento D", "DDDDDDD"), eventos.obterProximoEvento());
    }

    @Test
    public void temQueRetornarNullQuandoNaoTiverProximoEvento() {
        AgendaEventos eventos = new AgendaEventos();
        
        eventos.adicionarEvento(LocalDate.of(2022, 12, 21), "Evento A", "AAAAAAA");
        
        assertNull(eventos.obterProximoEvento());
    }
}
