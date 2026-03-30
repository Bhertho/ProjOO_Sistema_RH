package controller;

import model.Colaborador;
import model.UnidadeNegocio;
import service.ITransferenciaUnidadeService;

public class TransferenciaUnidadeController {
    
    private ITransferenciaUnidadeService servico;

    public TransferenciaUnidadeController(ITransferenciaUnidadeService servico){
        this.servico = servico;
    }

    public String transferir(
        Colaborador colab,
        UnidadeNegocio unidade
    ) {
        return servico.transferirColab(colab, unidade);
    }

}
