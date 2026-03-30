package model;

import service.IListaColabService;
import service.ListaColabService;

public class UnidadeNegocio {
    private String nome, cnpj, razaoSocial, endereco;
    private IListaColabService colaboradores;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public UnidadeNegocio(
        String nome, 
        String cnpj, 
        String razaoSocial, 
        String endereco,
        IListaColabService lista
    ) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.colaboradores = lista;
    }

    public IListaColabService getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(IListaColabService colaboradores) {
        this.colaboradores = colaboradores;
    }

}
