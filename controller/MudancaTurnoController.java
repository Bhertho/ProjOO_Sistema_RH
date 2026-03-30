package controller;

import model.Colaborador;
import model.Turno;
import service.IMudancaTurnoService;

public class MudancaTurnoController {
    private IMudancaTurnoService servico;
    
    public String mudarTurno(
        Colaborador colab,
        Turno turno
    ) {
        return servico.mudarTurno(colab, turno);
    }

    public MudancaTurnoController(IMudancaTurnoService servico){
        this.servico = servico;
    }

}