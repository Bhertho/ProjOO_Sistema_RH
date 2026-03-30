package model;

import java.time.LocalDate;

public class RHBuilder extends ColabBuilder {
    private String areaAtuacao;

    public RHBuilder(String nome, String cpf) {
        super(nome, cpf);
    }

    public RHBuilder areaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
        return this;
    }

    @Override
    public FuncRH build() {
        return new FuncRH(this);
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

      @Override
    public RHBuilder salario(double salario) {
        super.salario(salario);
        return this;
    }

    @Override
    public RHBuilder matricula(String matricula) {
        super.matricula(matricula);
        return this;
    }

    @Override
    public RHBuilder turno(Turno turno) {
        super.turno(turno);
        return this;
    }

    @Override
    public RHBuilder cargo(Cargo cargo) {
        super.cargo(cargo);
        return this;
    }

    @Override
    public RHBuilder dtInicio(LocalDate dtInicio) {
        super.dtInicio(dtInicio);
        return this;
    }

    @Override
    public RHBuilder dtNasc(LocalDate dtNasc) {
        super.dtNasc(dtNasc);
        return this;
    }

    @Override
    public RHBuilder unidadeNegocio(UnidadeNegocio unidade) {
        super.unidadeNegocio(unidade);
        return this;
    }

    @Override
    public RHBuilder setor(Setor setor) {
        super.setor(setor);
        return this;
    }

}