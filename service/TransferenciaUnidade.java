package service;

import model.Colaborador;
import model.UnidadeNegocio;

public class TransferenciaUnidade implements ITransferenciaUnidade{
    
    public String transferirColab(
        Colaborador colab,
        UnidadeNegocio uniNeg
    ) {
        UnidadeNegocio unidadeAnterior = colab.getUnidadeNegocio();
        uniNeg.getColaboradores().excColab(colab);
        colab.setUnidadeNegocio(uniNeg);
        colab.getUnidadeNegocio().getColaboradores().addColab(colab);
        return "O Colaborador " + colab.getNome() + " foi transferido de unidade!\n" +
            "De: " + unidadeAnterior.getNome() + " ,Para: " + colab.getUnidadeNegocio().getNome();
    }

}
