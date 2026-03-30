package controller;

import model.Colaborador;
import model.Setor;
import service.IMudancaSetor;

public class MudancaSetorController {
    private IMudancaSetor servico;
    
    public String mudarSetor(
        Colaborador colab,
        Setor setor
    ) {
        return servico.mudarSetor(colab, setor);
    }

    public MudancaSetorController(IMudancaSetor servico){
        this.servico = servico;
    }

}
