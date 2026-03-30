package service;

import model.Colaborador;
import model.Turno;

public interface IMudancaTurno {
        public String mudarTurno(
        Colaborador colab,
        Turno turno
    );
}