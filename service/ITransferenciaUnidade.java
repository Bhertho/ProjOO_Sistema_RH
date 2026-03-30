package service;

import model.Colaborador;
import model.UnidadeNegocio;

public interface ITransferenciaUnidade {

    public String transferirColab(
        Colaborador colab,
        UnidadeNegocio uniNeg
    );
}
