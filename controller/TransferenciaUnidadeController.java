package controller;

import model.Colaborador;
import model.UnidadeNegocio;
import service.ITransferenciaUnidade;

public class TransferenciaUnidadeController {
    
    private ITransferenciaUnidade servico;

    public TransferenciaUnidadeController(ITransferenciaUnidade servico){
        this.servico = servico;
    }

    public String transferir(
        Colaborador colab,
        UnidadeNegocio unidade
    ) {
        return servico.transferirColab(colab, unidade);
    }

}
