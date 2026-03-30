package controller;

import model.Colaborador;
import model.Turno;
import service.IMudancaTurno;

public class MudancaTurnoController {
    private IMudancaTurno servico;
    
    public String mudarTurno(
        Colaborador colab,
        Turno turno
    ) {
        return servico.mudarTurno(colab, turno);
    }

    public MudancaTurnoController(IMudancaTurno servico){
        this.servico = servico;
    }

}