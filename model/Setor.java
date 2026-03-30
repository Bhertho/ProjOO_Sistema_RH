package model;

import service.IListaColabService;

public class Setor {
    private String nomeSetor;
    private IListaColabService colaboradores;

    public void setNomeSetor(String nomeSetor){
        this.nomeSetor = nomeSetor;
    }

    public String getNomeSetor(){
        return nomeSetor;
    }

    public Setor(String nomeSetor, IListaColabService lista){
        this.nomeSetor = nomeSetor;
        this.colaboradores = lista;
    }

    public IListaColabService getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(IListaColabService colaboradores) {
        this.colaboradores = colaboradores;
    }
    
}
