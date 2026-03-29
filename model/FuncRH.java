package model;

public class FuncRH extends Colaborador{
    private String areaAtuacao;

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    FuncRH (RHBuilder builder){

        super(builder);
        this.areaAtuacao = builder.getAreaAtuacao();
    }



}
