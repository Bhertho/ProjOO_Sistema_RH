package model;

import service.ListaColab;

public class UnidadeNegocio {
    private String nome, cnpj, razaoSocial, endereco;
    private ListaColab colaboradores;

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

    public ListaColab getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(ListaColab colaboradores) {
        this.colaboradores = colaboradores;
    }

}
