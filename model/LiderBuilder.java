package model;

import java.time.LocalDate;

public class LiderBuilder extends ColabBuilder {
    private String nivelLideranca;
    private Setor setorResponsavel;

    public LiderBuilder(String nome, String cpf) {
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
    public LiderBuilder salario(double salario) {
        super.salario(salario);
        return this;
    }

    @Override
    public LiderBuilder matricula(String matricula) {
        super.matricula(matricula);
        return this;
    }

    @Override
    public LiderBuilder turno(Turno turno) {
        super.turno(turno);
        return this;
    }

    @Override
    public LiderBuilder cargo(Cargo cargo) {
        super.cargo(cargo);
        return this;
    }

    @Override
    public LiderBuilder dtInicio(LocalDate dtInicio) {
        super.dtInicio(dtInicio);
        return this;
    }

    @Override
    public LiderBuilder dtNasc(LocalDate dtNasc) {
        super.dtNasc(dtNasc);
        return this;
    }

    @Override
    public LiderBuilder unidadeNegocio(UnidadeNegocio unidade) {
        super.unidadeNegocio(unidade);
        return this;
    }

    @Override
    public LiderBuilder setor(Setor setor) {
        super.setor(setor);
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