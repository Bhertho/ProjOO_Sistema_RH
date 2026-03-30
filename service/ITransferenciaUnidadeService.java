package service;

import model.Colaborador;
import model.UnidadeNegocio;

public interface ITransferenciaUnidadeService {

    public String transferirColab(
        Colaborador colab,
        UnidadeNegocio uniNeg
    );
}
