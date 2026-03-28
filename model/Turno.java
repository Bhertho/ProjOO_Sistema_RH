package model;

import java.util.ArrayList;
import java.util.List;

public class Turno {
    private String turno, hrInicio, hrTermino;
    private List<Colaborador> colaboradores = new ArrayList<>();

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
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
        String turno,
        String hrInicio,
        String hrTermino
    ){
        this.turno = turno;
        this.hrInicio = hrInicio;
        this.hrTermino = hrTermino;
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
