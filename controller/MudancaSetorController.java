package controller;

import model.Colaborador;
import model.Setor;
import service.IMudancaSetorService;

public class MudancaSetorController {
    private IMudancaSetorService servico;
    
    public String mudarSetor(
        Colaborador colab,
        Setor setor
    ) {
        return servico.mudarSetor(colab, setor);
    }

    public MudancaSetorController(IMudancaSetorService servico){
        this.servico = servico;
    }

}
