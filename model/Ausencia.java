package model;

public class Ausencia {
    private String dtInicio, dtFim;
    private int tipo;
    private Colaborador colab;

    public String getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public String getDtFim() {
        return dtFim;
    }

    public void setDtFim(String dtFim) {
        this.dtFim = dtFim;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Colaborador getColab() {
        return colab;
    }
    
    public void setColab(Colaborador colab) {
        this.colab = colab;
    }

    public Ausencia(
        String dtInicio, 
        String dtFim, 
        int tipo, 
        Colaborador colab
    ) {
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.tipo = tipo;
        this.colab = colab;
    }

    

}
