package model;

import service.IListaColab;

public class Turno {
    private String nome, hrInicio, hrTermino;
    private IListaColab colaboradores;

    public String getNome() {
        return this.nome;
    }

    public void setTurno(String nome) {
        this.nome = nome;
    }

    public String getHrInicio() {
        return hrInicio;
    }

    public void setHrInicio(String hrInicio) {
        this.hrInicio = hrInicio;
    }

    public String getHrTermino() {
        return hrTermino;
    }

    public void setHrTermino(String hrTermino) {
        this.hrTermino = hrTermino;
    }

    public Turno(
        String nome,
        String hrInicio,
        String hrTermino
    ){
        this.nome = nome;
        this.hrInicio = hrInicio;
        this.hrTermino = hrTermino;
    }

    public IListaColab getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(IListaColab colaboradores) {
        this.colaboradores = colaboradores;
    }


}
