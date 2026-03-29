package model;

public class Lider extends Colaborador {
    private String nivelLideranca;
    private Setor setorResponsavel;

    public String getNivelLideranca() {
        return nivelLideranca;
    }

    public void setNivelLideranca(String nivelLideranca) {
        this.nivelLideranca = nivelLideranca;
    }

    public Setor getSetorResponsavel() {
        return setorResponsavel;
    }

    public void setSetorResponsavel(Setor setorResponsavel) {
        this.setorResponsavel = setorResponsavel;
    }

    Lider (LiderBuilder builder){

        super(builder);
        this.nivelLideranca = builder.getNivelLideranca();
        this.setorResponsavel = builder.getSetorResponsavel();
    }

}
