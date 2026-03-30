package service;

import model.Cargo;
import model.Colaborador;

public interface IPromocaoService {

    public String promoverColab(
        Colaborador colab,
        Cargo cargo
    );

}
