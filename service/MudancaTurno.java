package service;

import model.Colaborador;
import model.Turno;

public class MudancaTurno implements IMudancaTurno{
    
    public String mudarTurno(
        Colaborador colab,
        Turno turno
    ) {
        Turno turnoAnterior = colab.getTurno();
        colab.getTurno().getColaboradores().excColab(colab);
        colab.setTurno(turno);
        colab.getTurno().getColaboradores().addColab(colab);
        return "O Colaborador " + colab.getNome() + " mudou de turno!\n" +
            "De: " + turnoAnterior.getNome() + " ,Para: " + colab.getTurno().getNome();
    }

}
