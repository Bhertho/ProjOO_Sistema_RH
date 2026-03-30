package service;


import model.Colaborador;
import model.Turno;

public interface ITurnoService {

    public String mudarTurno(
        Colaborador colab,
        Turno turno
    );

}