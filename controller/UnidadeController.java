package controller;

import model.Colaborador;
import model.UnidadeNegocio;
import service.IListaColabService;
import service.IUnidadeService;
import service.ListaColabService;

public class UnidadeController {
    
    private IUnidadeService servico;

    public UnidadeController(IUnidadeService servico){
        this.servico = servico;
    }

    public String transferir(
        Colaborador colab,
        UnidadeNegocio unidade
    ) {
        return servico.transferirColab(colab, unidade);
    }

    public UnidadeNegocio novoUnidadeNegocio(
        String nome, 
        String cnpj, 
        String razaoSocial, 
        String endereco
    ) {
        IListaColabService lista = new ListaColabService();
        UnidadeNegocio unidade = new UnidadeNegocio(nome, cnpj, razaoSocial, endereco, lista);
        return unidade;
    }

}
