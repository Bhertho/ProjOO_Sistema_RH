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

    public Lider(
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
        String nivelLideranca,
        Setor setorResponsavel
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
        this.nivelLideranca = nivelLideranca;
        this.setorResponsavel = setorResponsavel;
    }

}
