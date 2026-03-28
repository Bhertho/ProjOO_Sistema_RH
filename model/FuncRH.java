package model;

public class FuncRH extends Colaborador{
    private String areaAtuacao;

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public FuncRH(
        String nome, 
        String cpf, 
        String dtNasc, 
        String dtInicio, 
        int matricula, 
        int situacao, 
        double salario,
        Setor setor, 
        Turno turno, 
        Cargo cargo, 
        UnidadeNegocio unidadeNegocio, 
        String areaAtuacao
    ) {
        super(
            nome, 
            cpf, 
            dtNasc, 
            dtInicio, 
            matricula, 
            situacao, 
            salario, 
            setor, 
            turno, 
            cargo, 
            unidadeNegocio
        );
        this.areaAtuacao = areaAtuacao;
    }



}
