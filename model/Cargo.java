package model;

import service.IListaColabService;
import service.ListaColabService;

public class Cargo {
    private String nome, responsabilidades;
    private double baseSalarial;
    private IListaColabService colaboradores;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(String responsabilidades) {
        this.responsabilidades = responsabilidades;
    }

    public double getBaseSalarial() {
        return baseSalarial;
    }

    public void setBaseSalarial(double baseSalarial) {
        this.baseSalarial = baseSalarial;
    }

    public Cargo(
        String nome, 
        String responsabilidades, 
        double baseSalarial,
        IListaColabService lista
    ) {
        this.nome = nome;
        this.responsabilidades = responsabilidades;
        this.baseSalarial = baseSalarial;
        this.colaboradores = lista;
    }
    
    public IListaColabService getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(IListaColabService colaboradores) {
        this.colaboradores = colaboradores;
    }

}
