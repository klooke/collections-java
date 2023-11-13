package main.Map.Ordenacao;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        eventos = new TreeMap<LocalDate, Evento>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        for (LocalDate data : eventos.keySet()) {
            System.out.println(data + " - " + eventos.get(data));
        }
    }

    public Evento obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataProximo = LocalDate.MAX;

        for (LocalDate data : eventos.keySet()) {
            if (data.compareTo(dataAtual) >= 0 && data.compareTo(dataProximo) <= 0) {
                dataProximo = data;
            }
        }

        return eventos.get(dataProximo);
    }

    public int obterNumeroEventos() {
        return eventos.size();
    }
}
