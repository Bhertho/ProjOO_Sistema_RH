package controller;

import model.Colaborador;
import service.IPromocaoService;
import model.Cargo;

public class PromocaoController {
    private IPromocaoService servico;

    public String promover (
        Colaborador colab,
        Cargo cargo
    ) {
        return servico.promoverColab(colab, cargo);
    }

    public PromocaoController(IPromocaoService servico){
        this.servico = servico;
    }

}
