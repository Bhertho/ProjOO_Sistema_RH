package model;

public class LiderBuilder extends ColabBuilder {
    private String nivelLideranca;
    private Setor setorResponsavel;

    public LiderBuilder(String nome, String cpf, int situacao) {
        super(nome, cpf);
    }

    public LiderBuilder nivelLideranca(String nivelLideranca) {
        this.nivelLideranca = nivelLideranca;
        return this;
    }

    public LiderBuilder setorResponsavel(Setor setorResponsavel) {
        this.setorResponsavel = setorResponsavel;
        return this;
    }

    @Override
    public Lider build() {
        return new Lider(this);
    }

    public String getNivelLideranca() {
        return nivelLideranca;
    }

    public Setor getSetorResponsavel() {
        return setorResponsavel;
    }
}