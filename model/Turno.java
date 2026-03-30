package model;

import service.IListaColab;
import java.time.LocalTime;

public class Turno {
    private String nome;
    private LocalTime hrInicio, hrTermino;
    private IListaColab colaboradores;

    public String getNome() {
        return this.nome;
    }

    public void setTurno(String nome) {
        this.nome = nome;
    }

    public LocalTime getHrInicio() {
        return hrInicio;
    }

    public void setHrInicio(LocalTime hrInicio) {
        this.hrInicio = hrInicio;
    }

    public LocalTime getHrTermino() {
        return hrTermino;
    }

    public void setHrTermino(LocalTime hrTermino) {
        this.hrTermino = hrTermino;
    }

    public Turno(
        String nome,
        LocalTime hrInicio,
        LocalTime hrTermino
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
