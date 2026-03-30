package model;

import service.IListaColabService;
import java.time.LocalTime;

public class Turno {
    private String nome;
    private LocalTime hrInicio, hrTermino;
    private IListaColabService colaboradores;

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
        LocalTime hrTermino,
        IListaColabService lista
    ){
        this.nome = nome;
        this.hrInicio = hrInicio;
        this.hrTermino = hrTermino;
        this.colaboradores = lista;
    }

    public IListaColabService getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(IListaColabService colaboradores) {
        this.colaboradores = colaboradores;
    }


}
