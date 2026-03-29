package model;

public class LogSistema {
    private String dataHora, entidadeAlterada, operacao, valorAnterior, valorNovo;
    private Usuario usuario;

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getEntidadeAlterada() {
        return entidadeAlterada;
    }

    public void setEntidadeAlterada(String entidadeAlterada) {
        this.entidadeAlterada = entidadeAlterada;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getValorAnterior() {
        return valorAnterior;
    }

    public void setValorAnterior(String valorAnterior) {
        this.valorAnterior = valorAnterior;
    }

    public String getValorNovo() {
        return valorNovo;
    }

    public void setValorNovo(String valorNovo) {
        this.valorNovo = valorNovo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LogSistema(
        String dataHora, 
        String entidadeAlterada, 
        String operacao, 
        String valorAnterior,
        String valorNovo,
        Usuario usuario
    ) {
        this.dataHora = dataHora;
        this.entidadeAlterada = entidadeAlterada;
        this.operacao = operacao;
        this.valorAnterior = valorAnterior;
        this.valorNovo = valorNovo;
        this.usuario = usuario;
    }


    public String registrarLog(){
        return
            "REGISTRO DE LOG DO SISTEMA \n" + 
            this.dataHora + "\n" + 
            this.entidadeAlterada + "\n" + 
            this.operacao + "\n" + 
            this.valorAnterior + "\n" + 
            this.valorNovo ;
    }


}
