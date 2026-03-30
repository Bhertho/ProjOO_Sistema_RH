package service;

import model.Colaborador;
import model.UnidadeNegocio;

public interface IUnidadeService {

    public String transferirColab(
        Colaborador colab,
        UnidadeNegocio uniNeg
    );
}
