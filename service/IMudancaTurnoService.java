package service;

import model.Colaborador;
import model.Turno;

public interface IMudancaTurnoService {
        public String mudarTurno(
        Colaborador colab,
        Turno turno
    );
}