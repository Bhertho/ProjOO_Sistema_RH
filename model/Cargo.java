package model;

import java.util.ArrayList;
import java.util.List;

public class Cargo {
    private String nome, responsabilidades;
    private double baseSalarial;
    private List<Colaborador> colaboradores = new ArrayList<>();

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

    public void addColab(Colaborador colab){
        colaboradores.add(colab);
    }

    public void excColab(Colaborador colab){
        colaboradores.remove(colab);
    }

    public int getQuantColab(){
        return this.colaboradores.size();
    }

    
}
