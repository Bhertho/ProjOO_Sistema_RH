package model;

import service.IListaColab;

public class Setor {
    private String nomeSetor;
    private IListaColab colaboradores;

    public void setNomeSetor(String nomeSetor){
        this.nomeSetor = nomeSetor;
    }

    public String getNomeSetor(){
        return nomeSetor;
    }

    public Setor(String nomeSetor){
        this.nomeSetor = nomeSetor;
    }

    public IListaColab getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(IListaColab colaboradores) {
        this.colaboradores = colaboradores;
    }
    
}
