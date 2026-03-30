package service;

import model.Colaborador;
import model.Setor;

public class MudancaSetor implements IMudancaSetor{
    
    public String mudarSetor(
        Colaborador colab,
        Setor setor
    ) {
        Setor setorAnterior = colab.getSetor();
        setor.getColaboradores().excColab(colab);
        colab.setSetor(setor);
        colab.getSetor().getColaboradores().addColab(colab);
        return "O Colaborador " + colab.getNome() + " mudou de setor!\n" +
            "De: " + setorAnterior.getNomeSetor() + " ,Para: " + colab.getSetor().getNomeSetor();
    }

}
