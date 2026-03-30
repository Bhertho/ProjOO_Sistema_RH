package controller;

import java.time.LocalTime;

import model.Colaborador;
import model.Turno;
import service.ITurnoService;
import service.ListaColabService;
import service.IListaColabService;
import service.TurnoService;

public class TurnoController {
    private ITurnoService servico;
    
    public String mudarTurno(
        Colaborador colab,
        Turno turno
    ) {
        return servico.mudarTurno(colab, turno);
    }

    public TurnoController(
        ITurnoService servico
    ){
        this.servico = servico;
    }

    public Turno novoTurno(
        String nome,
        LocalTime hrInicio,
        LocalTime hrTermino
    ) {
        IListaColabService lista = new ListaColabService();
        return new Turno(nome, hrInicio, hrTermino, lista);
    }
}