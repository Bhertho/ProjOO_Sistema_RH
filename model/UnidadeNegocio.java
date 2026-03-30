package model;

import service.ListaColabService;

public class UnidadeNegocio {
    private String nome, cnpj, razaoSocial, endereco;
    private ListaColabService colaboradores;

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
        String endereco
    ) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
    }

    public ListaColabService getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(ListaColabService colaboradores) {
        this.colaboradores = colaboradores;
    }

}
