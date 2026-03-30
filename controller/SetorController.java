package controller;

import model.Colaborador;
import model.Setor;
import service.IListaColabService;
import service.ListaColabService;
import service.ISetorService;

public class SetorController {
    private ISetorService servico;
    
    public String mudarSetor(
        Colaborador colab,
        Setor setor
    ) {
        return servico.mudarSetor(colab, setor);
    }

    public SetorController(ISetorService servico){
        this.servico = servico;
    }

    public Setor novoSetor(String nome){
        IListaColabService lista = new ListaColabService();
        Setor setor = new Setor(nome, lista);
        return setor;
    }

}
