package model;

public class Ferias {
    private String dtInicio, dtFim, status, tipo, codigoFerias;
    private int periodoAquisitivo, quatidadeDias, saldoDisponivel;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigoFerias() {
        return codigoFerias;
    }

    public void setCodigoFerias(String codigoFerias) {
        this.codigoFerias = codigoFerias;
    }
    
    public int getPeriodoAquisitivo() {
        return periodoAquisitivo;
    }

    public void setPeriodoAquisitivo(int periodoAquisitivo) {
        this.periodoAquisitivo = periodoAquisitivo;
    }

    public int getQuatidadeDias() {
        return quatidadeDias;
    }

    public void setQuatidadeDias(int quatidadeDias) {
        this.quatidadeDias = quatidadeDias;
    }

    public int getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(int saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    public Colaborador getColab() {
        return colab;
    }

    public void setColab(Colaborador colab) {
        this.colab = colab;
    }

    public Ferias(
        String dtInicio, 
        String dtFim, 
        String status, 
        String tipo, 
        String codigoFerias, 
        int periodoAquisitivo,
        int quatidadeDias, 
        int saldoDisponivel, 
        Colaborador colab
    ) {
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.status = status;
        this.tipo = tipo;
        this.codigoFerias = codigoFerias;
        this.periodoAquisitivo = periodoAquisitivo;
        this.quatidadeDias = quatidadeDias;
        this.saldoDisponivel = saldoDisponivel;
        this.colab = colab;
    }
    
    
}
