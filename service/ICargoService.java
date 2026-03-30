package service;

import model.Cargo;
import model.Colaborador;

public interface ICargoService {

    public String promoverColab(
        Colaborador colab,
        Cargo cargo
    );

}
