package model;

public class RHBuilder extends ColabBuilder {
    private String areaAtuacao;

    public RHBuilder(String nome, String cpf, int situacao) {
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
}