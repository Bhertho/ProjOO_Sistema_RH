package model;

public class Cargo {
    private String nome, responsabilidades;
    private double baseSalarial;
    private ListaColab colaboradores;

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
        double baseSalarial
    ) {
        this.nome = nome;
        this.responsabilidades = responsabilidades;
        this.baseSalarial = baseSalarial;
    }
    
    public ListaColab getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(ListaColab colaboradores) {
        this.colaboradores = colaboradores;
    }


}
